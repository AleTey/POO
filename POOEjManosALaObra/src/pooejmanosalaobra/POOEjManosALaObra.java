/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pooejmanosalaobra;

import Entidad.Persona;
import Service.PersonaService;
import java.util.Scanner;

public class POOEjManosALaObra {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersonaService sv = new PersonaService();
        
        Persona primeraPersona = new Persona();
        Persona segundaPersona = new Persona();
        Persona persona = new Persona();
        System.out.println("Ingrese nombre del objeto");
        String nombreObjeto = sc.nextLine();
        persona.s
        //primeraPersona.setNombre("Ale");
        primeraPersona.seteMail("alecastagnaro@gmail.com");
        primeraPersona.setDni(33480841);
        segundaPersona.setNombre("Anto");
        segundaPersona.setDni(39000000);
        
        System.out.println(primeraPersona.geteMail());
        System.out.println(segundaPersona.getNombre());
        System.out.println(segundaPersona.getDni());
        System.out.println(primeraPersona.getNombre());
        primeraPersona.getDni();
        
        sv.getPersona(primeraPersona);
    }

}

