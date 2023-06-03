/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pooej02;

import Entidad.Circunferencia;
import Service.CircunferenciaService;


public class PooEj02 {


    public static void main(String[] args) {

        CircunferenciaService sv = new CircunferenciaService();
        Circunferencia circunferencia1 = sv.crearCircunferencia();
        //sv.crearCircunferencia();
        System.out.println(sv.area(circunferencia1));
        System.out.println(sv.perimetro(circunferencia1));
        System.out.println(circunferencia1.toString());
    }

}
