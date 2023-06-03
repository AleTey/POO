/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Identidad.Movil;

import java.util.Scanner;

public class MovilService {
    private final Scanner sc = new Scanner(System.in);
    

    public void cargarMovil(Movil movil) {
        
        //int[] codigo = new int[7];
        System.out.println("Ingrese marca del movil");
        movil.setMarca(sc.next());
        
        System.out.println("Ingrese precio del movil");
        movil.setPrecio(sc.nextInt());
        
        System.out.println("Ingrese modelo");
        movil.setModelo(sc.next());
        
        System.out.println("Ingrese memoria ram");
        movil.setMemoriaRam(sc.nextInt());
        
        System.out.println("Ingrese capacidad de almacenamiento");
        movil.setAlmacenamiento(sc.nextInt());
        
        movil.setCodigo(ingresarCodigo(new int[7]));
    }
    
    public int[] ingresarCodigo(int [] codigo) {
        
        System.out.println("Ingrese codigo digito por digito");
        
        for (int i = 0; i < 7; i++) {
            System.out.println("Ingrese el " + i + 1 + "° numero");
            codigo[i] = sc.nextInt();
           
          
      
        }
        return codigo;
    }
}
