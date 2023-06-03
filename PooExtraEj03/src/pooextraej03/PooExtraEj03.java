/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pooextraej03;

import Identidad.Raices;
import Service.RaicesService;


public class PooExtraEj03 {


    public static void main(String[] args) {

        RaicesService rs = new RaicesService();
        Raices r = rs.crearRaiz();
        System.out.println(r.toString());
        System.out.println("Discriminante: " + rs.getDiscriminante(r));
        System.out.println("Tiene raices / mas de una solucion :" + rs.tieneRaices(r));
        System.out.println("Tiene raiz / una sola solucion: " + rs.tieneRaiz(r));
        rs.obtenerRaices(r);
        
        System.out.println("---------------------");
        
        rs.obtenerSolucion(r);
        
        
    }

}
