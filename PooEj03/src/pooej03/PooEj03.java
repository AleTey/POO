/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pooej03;

import Entidad.Operaciones;
import OperacionesService.OperacionesService;


public class PooEj03 {


    public static void main(String[] args) {

        OperacionesService os = new OperacionesService();
        Operaciones o = new Operaciones();
        
        Operaciones o1 = os.crearOperaciones();
        System.out.println(os.resta(o1));
        System.out.println(os.suma(o1));
        System.out.println(os.multiplicar(o1));
        System.out.println(os.dividir(o1));
        System.out.println(os.toString());
    }

}
