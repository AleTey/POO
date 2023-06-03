/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonaService;

import Identidad.Persona;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PersonaService {

    private Scanner sc = new Scanner(System.in);

    public Persona crearPersona() {

        System.out.println("Ingrese Nombre");
        String nombre = sc.nextLine();
        System.out.println("Ingrese fecha de nacimiento");
        System.out.println("Ingrese anio");
        int anio = sc.nextInt();
        System.out.println("Ingrese mes");
        int mes = sc.nextInt();
        System.out.println("Ingrese dia");
        int dia = sc.nextInt();
        Date fechaN = new Date(anio - 1900, mes - 1, dia);

        return new Persona(nombre, fechaN);
    }

    public void calcularEdad(Persona persona) {
        Date hoy = new Date();
        int edad = hoy.getYear() - persona.getFechaN().getYear();
        System.out.println("Edad :" + edad);
    }

    public boolean menorQue(Persona persona) {
        Date hoy = new Date();
        boolean menorQue;
        System.out.println("Ingrese edad");
        int edad = sc.nextInt();
        if (edad < (hoy.getYear() - persona.getFechaN().getYear())) {
            menorQue = true;
        } else {
            menorQue = false;
        }
        return menorQue;
    }
    
    public void mostrarPersona(Persona persona) {
        Date hoy = new Date();
        System.out.println(persona.getNombre());
        System.out.println(persona.getFechaN());
        System.out.println("Edad: " + (hoy.getYear() - persona.getFechaN().getYear()));
    }

}

