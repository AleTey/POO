/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Identidad;

import java.util.Date;
import java.util.Map;

public class Persona {
    
    private String nombre;
    private Date FechaN;
    private String sexo;
    private double peso;
    private double altura;
    private Map<String, String> atributos;

    public Persona() {
    }

    public Persona(String nombre, Date FechaN, String sexo, double peso, double altura, Map<String, String> atributos) {
        this.nombre = nombre;
        this.FechaN = FechaN;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.atributos = atributos;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public Date getFechaN() {
        return FechaN;
    }

    public String getSexo() {
        return sexo;
    }
    
    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public Map<String, String> getAtributos() {
        return atributos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaN(Date FechaN) {
        this.FechaN = FechaN;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setAtributos(Map<String, String> atributos) {
        this.atributos = atributos;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Identidad{" + "nombre=" + nombre + ", FechaN=" + FechaN + ", peso=" + peso + ", altura=" + altura + ", atributos=" + atributos + '}';
    }
    
    
    
    
    
}
