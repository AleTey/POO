/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pooej14;

import Identidad.Movil;
import Service.MovilService;
import java.util.Arrays;


public class PooEj14 {


    public static void main(String[] args) {

        MovilService ms = new MovilService();
        
        Movil movil = new Movil();
        
        ms.cargarMovil(movil);
        
        System.out.println(movil.toString());
        
        System.out.println("--------------");
        
        System.out.println("Array to String" + Arrays.toString(movil.getCodigo()));
    }

}
