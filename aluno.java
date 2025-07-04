package JovemAprendiz;

import java.util.*;
import javax.swing.JOptionPane;

public class aluno {
    protected String nome;
    protected double[] notas = new double[6];
    protected String competencia;
    protected aluno[] alunos = new aluno[5];
    
    public aluno(String nome, double notas, String competencia) {
        this.nome = nome;
        this.notas = new double[6]; 
        this.competencia = competencia;
    }

    int i = 0;
    public void cadastro(){
        aluno a = new aluno("João", 0.0, "");
        alunos[i] = a;
        i++;
    }

    public void adicionarNota(Scanner scan) {
        String nome = (String) JOptionPane.showInputDialog(null, "Selecione um aluno", "Escolha", 0, null, alunos, alunos[0].nome);

        String[] materias = {"Matematica", "Português", "História", "Geografia", "Inglês", "Ciências"};
        String op = (String) JOptionPane.showInputDialog(
            null, 
            "Escolha a matéria", 
            "Menu", 
            JOptionPane.PLAIN_MESSAGE, 
            null, 
            materias, 
            materias[0]
        );

        switch (op) {
            case "Matematica":
                for (int i = 0; i < notas.length; i++) {
                    String input = JOptionPane.showInputDialog("Nota " + (i + 1) + ": ");
                    double nota = Double.parseDouble(input);
                    notas[i] = nota;
                }
                break;

            case "Português":
                for (int i = 0; i < notas.length; i++) {
                    String input = JOptionPane.showInputDialog("Nota " + (i + 1) + ": ");
                    double nota = Double.parseDouble(input);
                    notas[i] = nota;
                }
                break;

            case "História":
                for (int i = 0; i < notas.length; i++) {
                    String input = JOptionPane.showInputDialog("Nota " + (i + 1) + ": ");
                    double nota = Double.parseDouble(input);
                    notas[i] = nota;
                }
                break;

            case "Geografia":
                for (int i = 0; i < notas.length; i++) {
                    String input = JOptionPane.showInputDialog("Nota " + (i + 1) + ": ");
                    double nota = Double.parseDouble(input);
                    notas[i] = nota;
                }
                break;

            case "Inglês":
                for (int i = 0; i < notas.length; i++) {
                    String input = JOptionPane.showInputDialog("Nota " + (i + 1) + ": ");
                    double nota = Double.parseDouble(input);
                    notas[i] = nota;
                }
                break;

            case "Ciências":
                for (int i = 0; i < notas.length; i++) {
                    String input = JOptionPane.showInputDialog("Nota " + (i + 1) + ": ");
                    double nota = Double.parseDouble(input);
                    notas[i] = nota;
                }
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opção Inválida");
                break;
        }
    }

    public void mostrarNotas(){
        for ()
        
        JOptionPane.showInputDialog();
    }

        public String getNome() {
        return nome;
    }
}
