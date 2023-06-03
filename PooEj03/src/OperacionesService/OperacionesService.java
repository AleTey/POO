package OperacionesService;

import Entidad.Operaciones;
import java.util.Scanner;


public class OperacionesService {
    Scanner sc = new Scanner(System.in);
    
    public Operaciones crearOperaciones() {
        
        Operaciones o1 = new Operaciones();
        System.out.println("Ingrese el primer numero");
        o1.setNum1(sc.nextInt());
        System.out.println("Ingrese el segundo numero");
        o1.setNum2(sc.nextInt());
        return o1;
    }
    public int resta(Operaciones operacion) {
    
        int resta = operacion.getNum1() - operacion.getNum2();
        return resta;
    }
    
    public int suma(Operaciones operacion) {
    
        int suma = operacion.getNum1() + operacion.getNum2();
        return suma;
    }
    
    public int multiplicar(Operaciones operacion) {
    
        if (operacion.getNum1() == 0 || operacion.getNum2() == 0) {
            System.out.println("Error");
            return 0; 
        } else {
        int multiplicar = operacion.getNum1() * operacion.getNum2();
        return multiplicar;
        }
    }
    public double dividir(Operaciones operacion) {
        
        if (operacion.getNum1() == 0 || operacion.getNum2() == 0) {
            System.out.println("Error");
            return 0;
        }else {
            double dividir = operacion.getNum1() / operacion.getNum2();
            return dividir;
        }
    }
}
