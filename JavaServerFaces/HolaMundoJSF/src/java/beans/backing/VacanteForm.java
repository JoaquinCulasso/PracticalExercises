package beans.backing;

import beans.model.Candidato;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class VacanteForm {

    /**
     * Creates a new instance of VacanteForm
     */
    public VacanteForm() {
    }

    @ManagedProperty(value = "#{candidato}")
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
