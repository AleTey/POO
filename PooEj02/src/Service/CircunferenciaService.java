/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class CircunferenciaService {
    
    Scanner sc = new Scanner(System.in);
    
    public Circunferencia crearCircunferencia() {
        Circunferencia circunferencia1 = new Circunferencia();
        System.out.println("Ingrese radio");
        circunferencia1.setRadio(sc.nextDouble());
        return circunferencia1;
    }
    
//    public void crearCircunferencia() {
//        System.out.println("Ingrese radio");
//        
//        circunferencia1.setRadio(sc.nextDouble());
//        
//    }
    
    public double area(Circunferencia c) {
    
        double area = Math.PI * Math.pow(c.getRadio(), 2);
        return area;
    }
    
    public double perimetro(Circunferencia c) {
        
        double perimetro = 2 * Math.PI * c.getRadio();
        return perimetro;
    }
}
