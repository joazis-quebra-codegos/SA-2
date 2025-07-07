package JovemAprendiz;

import java.util.ArrayList;

public abstract class vagas {
    int media;
    protected ArrayList<String> competencias = new ArrayList<String>();

    public vagas(int media, ArrayList<String> competencias) {
        this.media = media;
        this.competencias = competencias;
    }

    public abstract void verificar();
}
