/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Identidad.Puntos;
import java.util.Scanner;

public class PuntosService {
    
    private final Scanner sc = new Scanner(System.in);
    public Puntos crearPuntos;
    
    
    public Puntos crearPuntos() {
        System.out.println("Ingrese valor de X1");
        int x1 = sc.nextInt();
        System.out.println("Ingrese valor de Y1");
        int y1 = sc.nextInt();
        System.out.println("Ingrese valor de X2");
        int x2 = sc.nextInt();
        System.out.println("Ingrese valor de Y2");
        int y2 = sc.nextInt();
        
        return new Puntos(x1, y1, x2, y2);
    }
    
    public int calcular(Puntos p) {
    
        int d = (int) Math.sqrt(Math.pow(p.getX2() - p.getX1(), 2) + Math.pow(p.getY2() - p.getY1(), 2));
        
        return d;
    }
}

