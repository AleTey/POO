/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pooej12;

import Identidad.Persona;
import PersonaService.PersonaService;


public class PooEj12 {


    public static void main(String[] args) {

        PersonaService ps = new PersonaService();
        
        Persona p1 = ps.crearPersona();
        System.out.println(p1.toString());
        ps.calcularEdad(p1);
        System.out.println(ps.menorQue(p1));
    }

}
