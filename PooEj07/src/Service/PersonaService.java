/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Identidad.Persona;
import java.util.Date;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class PersonaService {

    private Map<String, String> atributos;
    private final Scanner sc = new Scanner(System.in);

    public Persona crearPersona() {
        atributos = new HashMap<>();
        System.out.println("Ingrese nombre");
        String nombre = sc.nextLine();
        System.out.println("Ingrese año de nacimiento");
        int anio = sc.nextInt();
        System.out.println("Ingrese mes en el que nacio");
        int mes = sc.nextInt();
        System.out.println("Ingrese dia en el que nacio");
        int dia = sc.nextInt();
        sc.nextLine();
        Date fechaN = new Date(anio - 1900, mes - 1, dia);
        System.out.println("Ingrese sexo: M, F");
        String sexo = sc.nextLine();
        while (!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f")) {
            System.out.println("Ingrese una opcion valida, M: masculino F: femenino");
            sexo = sc.nextLine();
        }
        boolean alturaValida = false;
        double altura = 0;
        while (!alturaValida) {
            try {
                System.out.println("Ingrese altura");
                altura = sc.nextDouble();
                alturaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Ingrese valor valido, recuerde que ingresar decimales despues de una coma y no un punto");
                sc.nextLine();
            }
        }
        double peso = 0;
        boolean pesoValido = false;
        while (!pesoValido) {
            try {
                System.out.println("Ingrese peso");
                peso = sc.nextDouble();
                pesoValido = true;
            } catch (InputMismatchException e){
                System.out.println("Ingrese un valor valido, recuerde que en caso de uso de decimales debe ingresar una coma y no un punto");
                sc.nextLine();
            }
        }
        System.out.println("Desea agregar informacion? S/N");
        boolean agregarAtributo = false;
        String rta = sc.nextLine();
        while (!rta.equalsIgnoreCase("s") && !rta.equalsIgnoreCase("n")) {
            System.out.println("Ingrese una opcion valida S/N");
            rta = sc.nextLine();
            if (rta.equalsIgnoreCase("s")) {
                agregarAtributo = true;
            }
        }
        if (agregarAtributo) {
            System.out.println("Ingrese el tipo de dato que desea agregar");
            String tipo = sc.nextLine();
            System.out.println("Ingrese informacion para el dato agregado");
            String dato = sc.nextLine();
            atributos.put(tipo, dato);
        }

        return new Persona(nombre, fechaN, sexo, peso, altura, atributos);
    }
    
    public int calcularIMC(Persona persona) {
        double resultado = persona.getPeso() / (Math.pow(persona.getAltura(), 2));
        if (resultado < 20) {
            return -1;
        }else if (resultado >= 20 && resultado <= 25) {
            return 0;
        }else {
            return 1;
        }
    }
    
    public boolean esMayorDeEdad(Persona persona) {
        Date hoy = new Date();
        int edad = hoy.getYear() - persona.getFechaN().getYear();
        boolean mayor = false;
        if (edad >= 18) {
            mayor = true;
        }
        return mayor;
    }
}
