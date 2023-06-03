
package Identidad;

public class Ahorcado {
    
    private String[] palabraSecreta;
    private String[] letrasEncontradas;
    private int maxIntentos;
    private int cantLetrasEncontradas;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabraSecreta, String[] letrasEncontradas, int maxIntentos, int cantLetrasEncontradas) {
        this.palabraSecreta = palabraSecreta;
        this.letrasEncontradas = letrasEncontradas;
        this.maxIntentos = maxIntentos;
        this.cantLetrasEncontradas = cantLetrasEncontradas;
    }

    public Ahorcado(int maxIntentos, int cantLetrasEncontradas) {
        this.maxIntentos = maxIntentos;
        this.cantLetrasEncontradas = cantLetrasEncontradas;
    }

    public String[] getPalabraSecreta() {
        return palabraSecreta;
    }
    
    public String getPalabraSecreta(int i) {
        return palabraSecreta[i];
    }
    
    public String[] getLetrasEncontradas() {
        return letrasEncontradas;
    }
    
    public String getLetrasEncontradas (int i) {
        return letrasEncontradas[i];
    }

    public int getMaxIntentos() {
        return maxIntentos;
    }

    public int getCantLetrasEncontradas() {
        return cantLetrasEncontradas;
    }

    public void setPalabraSecreta(String[] palabraSecreta) {
        this.palabraSecreta = palabraSecreta;
    }
    
    public void setPalabraSecreta(int i, String palabraSecreta) {
        this.palabraSecreta[i] = palabraSecreta;
    }

    public void setLetrasEncontradas(String[] letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }
    
    public void setLetrasEncontradas (int i, String letrasEncontradas) {
        this.letrasEncontradas[i] = letrasEncontradas;
    }

    public void setMaxIntentos(int maxIntentos) {
        this.maxIntentos = maxIntentos;
    }

    public void setCantLetrasEncontradas(int cantLetrasEncontradas) {
        this.cantLetrasEncontradas = cantLetrasEncontradas;
    }

  
    
    
}
