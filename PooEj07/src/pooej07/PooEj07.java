/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej07;

import Identidad.Persona;
import Service.PersonaService;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PooEj07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersonaService ps = new PersonaService();
        Persona[] p = new Persona[4];
        int bajoPeso = 0, ideal = 0, sobrePeso = 0, mayorEdad = 0, menorEdad = 0, cantPersonas = 0;
        
        boolean rtaValida = false;
        while (!rtaValida) {
            try {
                System.out.println("Ingrese cantidad de personas");
                cantPersonas = sc.nextInt();
                rtaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("El numero de estar escrito con cifras");
                sc.nextLine();
            }
        }
        
        for (int i = 0; i < cantPersonas; i++) {
            p[i] = ps.crearPersona();
        }

        for (int i = 0; i < cantPersonas; i++) {
            System.out.println(p[i].getNombre() + ": ");

            switch (ps.calcularIMC(p[i])) {
                case -1:
                    bajoPeso ++;
                    System.out.println("Tiene bajo peso");
                    break;
                case 0:
                    System.out.println("Está en su peso ideal");
                    ideal ++;
                    break;
                default:
                    System.out.println("Tiene sobrepeso");
                    sobrePeso ++;
                    break;
            }

            if (ps.esMayorDeEdad(p[i])) {
                System.out.println("Es mayor de edad");
                mayorEdad ++;
            } else {
                System.out.println("Es menor de edad");
                menorEdad ++;
            }
        }

        System.out.println("Cant. personas con bajo peso : " + bajoPeso);
        System.out.println("Cant. personas con peso ideal :" + ideal);
        System.out.println("Cant personas con sobrepeso: " + sobrePeso);
        System.out.println("% de personas con bajo peso: " + (bajoPeso * 100) / cantPersonas);
        System.out.println("% de personas con peso ideal: " + (ideal * 100) / cantPersonas);
        System.out.println("% de personas con sobrepeso: " + (sobrePeso * 100) / cantPersonas);
        System.out.println("");
        System.out.println("Cant personas mayores de edad: " + mayorEdad);
        System.out.println("Cant personas menores de edad: " + menorEdad);


        for (int i = 0; i < cantPersonas; i++) {
            System.out.println(p[i].toString());
        }
    }

}
