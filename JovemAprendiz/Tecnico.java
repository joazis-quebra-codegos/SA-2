package JovemAprendiz;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Tecnico extends vagas{
    String[] competenciasNessec = {"Programação", "Comunicação"};
    ArrayList <String> verificarCompetencias = new ArrayList<String>();

    public Tecnico(int media, ArrayList<String> competencias){
        super(media,  competencias);
    }

    public void verificar() {
        verificarCompetencias.clear();

        for (String cn : competenciasNessec) {
            boolean encontrada = false;
            for (String comp : competencias) {
                if (comp.equalsIgnoreCase(cn)) {
                    encontrada = true;
                    break;
                }
            }
            if (!encontrada) {
                verificarCompetencias.add(cn);
            }
        }

        if (verificarCompetencias.isEmpty()){
            JOptionPane.showMessageDialog(null, "O aluno tem as competências necessárias para a vaga");
        }else {
            JOptionPane.showMessageDialog(null, "O aluno não contem as seguintes competências necessárias:\n " + String.join(", ", verificarCompetencias));
        }
        
    }
}
