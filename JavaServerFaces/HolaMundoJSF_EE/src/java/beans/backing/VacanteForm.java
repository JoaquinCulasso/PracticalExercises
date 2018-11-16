package beans.backing;

import beans.model.Candidato;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

@RequestScoped
@Named
public class VacanteForm {

    @Inject
    private Candidato candidato;

    /**
     * @return the candidato
     */
    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public String enviar() {
        if (this.getCandidato().getNombre().equals("Juan")) {
            return "exito";//exito.xhtml
        } else {
            return "fallo";//fallo.xhtml
        }
    }
}
