
package Identidad;

public class AdivinarMes {
    private String[] meses;
    private String mesSecreto;

    public AdivinarMes() {
        meses = new String []{"enero","febrero","marzi","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
        mesSecreto = meses[0];
    }

    public AdivinarMes(String[] meses, String mesSecreto) {
        this.meses = meses;
        this.mesSecreto = mesSecreto;
    }

    public String[] getMeses() {
        return meses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    @Override
    public String toString() {
        return "AdivinarMesService{" + "meses=" + meses + ", mesSecreto=" + mesSecreto + '}';
    }
}
