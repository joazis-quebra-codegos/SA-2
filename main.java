package JovemAprendiz;
import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        aluno a = new aluno(null, 0.0, null);
        a.cadastro();
        a.adicionarNota(scan);
    }
}
