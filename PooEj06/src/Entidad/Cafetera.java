/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;


public class Cafetera {
    private double capacidadMax = 70;
    private double cantidadActual = 0;
    private double cantAguaMax = 2000;
    private double cantAguaActual = 0;

    public Cafetera() {
    }

    public Cafetera(double capacidadMax, double cantidadActual) {
        this.capacidadMax = capacidadMax;
        this.cantidadActual = cantidadActual;
    }

    public double getCapacidadMax() {
        return capacidadMax;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public double getCantAguaMax() {
        return cantAguaMax;
    }

    public double getCantAguaActual() {
        return cantAguaActual;
    }

    public void setCapacidadMax(double capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public void setCantAguaMax(double cantAguaMax) {
        this.cantAguaMax = cantAguaMax;
    }

    public void setCantAguaActual(double cantAguaActual) {
        this.cantAguaActual = cantAguaActual;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMax=" + capacidadMax + ", cantidadActual=" + cantidadActual + ", cantAguaMax=" + cantAguaMax + ", cantAguaActual=" + cantAguaActual + '}';
    }
    
    
    
    
}
