/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Identidad.Raices;
import java.util.Random;
public class RaicesService {
    
    public Raices crearRaiz() {
        Raices rz = new Raices();
        Random rn = new Random();
        rz.setA(rn.nextInt(10-1+1)+1);
        rz.setB( rn.nextInt(10) + 1);
        rz.setC((int) (Math.random() * 10 + 1));
        double fd = Math.random();
        Math.random();
        System.out.println(fd);
        System.out.println(rz.getA());
        
        return rz;
    }
    
    public Double getDiscriminante(Raices rz) {
        
        double dis = (Math.pow(rz.getB(), 2)) - 4 * rz.getA() * rz.getC();
        
        return dis;
    }
    
    public boolean tieneRaices(Raices rz) {
        boolean tieneRaices;
        tieneRaices = getDiscriminante(rz) > 0;
        
        return tieneRaices;
    }
    
    public boolean tieneRaiz(Raices rz) {
        boolean tieneRaiz;
        tieneRaiz = getDiscriminante(rz) == 0;
        
        return tieneRaiz;
    }
    
    public void obtenerRaices(Raices r) {
        
        int a = r.getA();
        int b = r.getB();
        int c = r.getC();
        
        if (tieneRaices(r)) {
            
            double x1 = (-b + Math.sqrt((Math.pow(b, 2) - (4 * a * c)))) / (2 * a) ;
            double x2 = (-b - Math.sqrt((Math.pow(b, 2) - (4 * a * c)))) / (2 * a) ;
            
            System.out.println(x1);
            System.out.println(x2);
        }
    }
    
    public double obtenerRaiz(Raices r) {
    
        double resultadoUnico;
        
        resultadoUnico = -r.getB() / (2 * r.getA());
        
        return resultadoUnico;
    }
   
    public void obtenerSolucion(Raices r) {
        
        if (tieneRaices(r)) {
            obtenerRaices(r);
        } else if (tieneRaiz(r)) {
            obtenerRaiz(r);
        }else {
            System.out.println("No tiene raiz");
        }
    }
 
    
}
