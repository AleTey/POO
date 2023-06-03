/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Persona;

public class PersonaService {
    
    public void getPersona(Persona persona) {
   
        System.out.println(persona.getNombre());
        System.out.println(persona.getDni());
        System.out.println(persona.geteMail());
    }
}
