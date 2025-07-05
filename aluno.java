package JovemAprendiz;

import java.util.*;
import javax.swing.JOptionPane;

public class aluno {
    protected String nome;
    protected double[][] notas;
    protected String[] MATERIAS = {"Matemática","Português","História","Geografia","Inglês","Ciências"};
    protected ArrayList<aluno> alunos = new ArrayList<>();

    public aluno(String nome, String[] materias) {
        this.nome = nome;
        this.notas = new double[6][5];
    }
    public String getNome() {
        return nome;
    }
    public double[][] getNotas() {
        return notas;
    }
    @Override
    public String toString() {
        return nome;
    }

    public void cadastrar() {
        String nome = JOptionPane.showInputDialog("Nome do aluno:");
        if (nome != null && !nome.trim().isEmpty()) {
            aluno novo = new aluno(nome, MATERIAS);
            alunos.add(novo);
            JOptionPane.showMessageDialog(null, "Aluno cadastrado: " + nome);
        }
    }

    public void adicionarNotas() {
        if (alunos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum aluno cadastrado.");
            return;
        }
        aluno selecionado = (aluno) JOptionPane.showInputDialog(
            null, "Selecione um aluno", "Escolha",
            JOptionPane.PLAIN_MESSAGE, null,
            alunos.toArray(), alunos.get(0)
        );
        if (selecionado == null) return;

        String materia = (String) JOptionPane.showInputDialog(
            null, "Selecione a disciplina", "Disciplina",
            JOptionPane.PLAIN_MESSAGE, null, MATERIAS, MATERIAS[0]
        );
        if (materia == null) return;

        int mat = -1;
        for (int i = 0; i < MATERIAS.length; i++) {
            if (MATERIAS[i].equals(materia)) {
                mat = i;
                break;
            }
        }
        if (mat < 0) return;

        double[] notasMat = selecionado.getNotas()[mat];
        for (int j = 0; j < notasMat.length; j++) {
            String nota = JOptionPane.showInputDialog(
            materia + " - Nota " + (j + 1) + " de 5:");
            if (nota == null) {break;}
            if (Double.parseDouble(nota) > 10 || Double.parseDouble(nota) < 0){
                j--;
                continue;
            }
            notasMat[j] = Double.parseDouble(nota);
        }
    }

    public void mostrarNotas() {
        if (alunos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum aluno cadastrado.");
            return;
        }
        aluno selecionado = (aluno) JOptionPane.showInputDialog(
            null, "Selecione um aluno", "Notas",
            JOptionPane.PLAIN_MESSAGE, null,
            alunos.toArray(), alunos.get(0)
        );
        if (selecionado == null) return;

        String mensagem = "Notas de " + selecionado.getNome() + ":\n";
        double somaTotal = 0;
        int contTotal = 0;

        for (int i = 0; i < MATERIAS.length; i++) {
            mensagem += MATERIAS[i] + ":\n";
            double soma = 0;
            double[] notas = selecionado.getNotas()[i];
            for (int j = 0; j < notas.length; j++) {
                mensagem += "  Nota " + (j+1) + ": " + notas[j] + "\n";
                soma += notas[j];
            }
            double media = soma / notas.length;
            mensagem += "  Média de " + MATERIAS[i] + ": " + String.format("%.2f", media) + "\n\n";
            somaTotal += soma;
            contTotal += notas.length;
        }

        double mediaGeral = somaTotal / contTotal;
        mensagem += "Média geral: " + String.format("%.2f", mediaGeral);

        JOptionPane.showMessageDialog(null, mensagem);
    }
}
