package JovemAprendiz;

import javax.swing.JOptionPane;

public class GestorAlunos {
    static public String[] MATERIAS = {"Matemática","Português","História","Geografia","Inglês","Ciências"};
    public static void main(String[] args) {
        aluno al = new aluno(null, null, null);
        String[] opcoes = {"Cadastrar", "Adicionar Notas", "Adicionar competencias", "Visualizar aluno", "Sair"};
        while (true) {
            String escolha = (String) JOptionPane.showInputDialog(
                null, "O que deseja fazer?", "Menu",
                JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]
            );
            if (escolha == null || escolha.equals("Sair")) {
                break;
            }
            if (escolha.equals("Cadastrar")) {
                al.cadastrar();
            } else if (escolha.equals("Adicionar Notas")) {
                al.adicionarNotas();
            } else if (escolha.equals("Adicionar competencias")) {
                al.adicionarCompetencias();
            } else if (escolha.equals("Visualizar aluno")){
                al.mostrarNotas();
            }

        }
    }
}
