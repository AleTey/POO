/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RectanguloService;

import Entidad.Rectangulo;
import java.util.Scanner;


public class RectanguloService {
    private Scanner sc = new Scanner(System.in);
    
    public Rectangulo crearRectangulo() {
        System.out.println("Ingrese base del rectangulo");
        int base = sc.nextInt();
        System.out.println("Ingrese algura del rectangulo");
        int altura = sc.nextInt();
        
        return new Rectangulo(base, altura);
    }

    public int calcularSup(Rectangulo rectangulo) {
       int sup = rectangulo.getBase() * rectangulo.getAltura();
       return sup;
    }
    
    public int calcularPerimetro(Rectangulo rectangulo) {
        int perimetro = (rectangulo.getBase() + rectangulo.getAltura()) * 2;
        return perimetro;
    }
    
    public void dibujarRectangulo(Rectangulo rectangulo) {
        
        for (int i = 0; i < rectangulo.getAltura(); i++) {
            for (int j = 0; j < rectangulo.getBase(); j++) {
                if (i == 0 || j == 0 || i == rectangulo.getAltura() - 1 || j == rectangulo.getBase() - 1) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
    
    
    
    
    @Override
    public String toString() {
        return "RectanguloService{" + "sc=" + sc + '}';
    }
    
}
