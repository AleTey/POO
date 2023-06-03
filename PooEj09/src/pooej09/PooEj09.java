/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pooej09;

import Identidad.Matematica;
import Service.MatematicaService;


public class PooEj09 {


    public static void main(String[] args) {
        
        MatematicaService ms = new MatematicaService();
        Matematica mat = new Matematica();
        
        mat.setNum1(Math.random() * 10 + 1);
        mat.setNum2(Math.random() * 10 + 1 );
        
        System.out.println(ms.devolverMayor(mat));
        
        System.out.println(ms.devolverPotencia(mat));
        
        System.out.println(ms.devolverRaiz(mat));
        System.out.println(mat.toString());
        
    }

}
