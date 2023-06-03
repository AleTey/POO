/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextraej02;

import Identidad.Puntos;
import Service.PuntosService;

public class PooExtraEj02 {

    public static void main(String[] args) {

        PuntosService ps = new PuntosService();

        Puntos p = ps.crearPuntos();

        System.out.println(p.toString());
        
        System.out.println(ps.calcular(p));
        
        
    }

}
