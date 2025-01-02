package exerciciocarro;

public class Carro {
    public String portaPiloto;
    public String portaPassageiro1;
    public String portaPassageiro2;
    public String portaPassageiro3;

    public String getPortaPiloto() {
        return portaPiloto;
    }
    public void setPortaPiloto(String portaPiloto) {
        this.portaPiloto = portaPiloto;
    }

    public void abrirPortaPiloto(String portaPiloto) {
        this.portaPiloto = "abrindo porta do piloto...";
    }


}


