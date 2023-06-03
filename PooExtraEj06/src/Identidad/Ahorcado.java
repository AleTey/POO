
package Identidad;

public class Ahorcado {
    
    private String[] palabraSecreta;
    private int cantLetrasEncontradas;
    private int cantIntentosMaximos;
    private String[] letrasEncontradas;
    public Ahorcado() {

        
    }

    public Ahorcado(String[] palabraSecreta, int cantLetrasEncontradas, int cantIntentosMaximos, String[] letrasEncontradas) {
        this.palabraSecreta = palabraSecreta;
        this.cantLetrasEncontradas = cantLetrasEncontradas;
        this.cantIntentosMaximos = cantIntentosMaximos;
        this.letrasEncontradas = letrasEncontradas;
    }

    public String[] getPalabraSecreta() {
        return palabraSecreta;
    }
    
    /**
     *
     * @param i
     * @return
     */
    public String getPalabraSecreta(int i) {
        return palabraSecreta[i];
    }

    public int getCantLetrasEncontradas() {
        return cantLetrasEncontradas;
    }

    public int getCantIntentosMaximos() {
        return cantIntentosMaximos;
    }

    public void setPalabraSecreta(String[] palabraSecreta) {
        this.palabraSecreta = palabraSecreta;
    }
    
    public void setPalabraSecreta(int i, String palabraSecreta) {
        this.palabraSecreta[i] = palabraSecreta;
    }

    public void setCantLetrasEncontradas(int cantLetrasEncontradas) {
        this.cantLetrasEncontradas = cantLetrasEncontradas;
    }

    public void setCantIntentosMaximos(int cantIntentosMaximos) {
        this.cantIntentosMaximos = cantIntentosMaximos;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabraSecreta=" + palabraSecreta + ", cantLetrasEncontradas=" + cantLetrasEncontradas + ", cantIntentosMaximos=" + cantIntentosMaximos + '}';
    }

    
}
