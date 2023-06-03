/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

public class Cadena {
    private String cadena;
    private int Longitud;

    public Cadena() {
    }

    public Cadena(String cadena, int Longitud) {
        this.cadena = cadena;
        this.Longitud = Longitud;
    }

    public String getCadena() {
        return cadena;
    }

    public int getLongitud() {
        return Longitud;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public void setLongitud(int Longitud) {
        this.Longitud = Longitud;
    }

    @Override
    public String toString() {
        return "Cadena{" + "cadena=" + cadena + ", Longitud=" + Longitud + '}';
    }
    
    
    
}
