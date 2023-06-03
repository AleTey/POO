/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Identidad.Curso;
import java.util.Scanner;

public class CursoService {
   private final Scanner sc = new Scanner(System.in);
    
    public void cargarAlumnos(Curso curso) {
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese nombre del alumno n " + i);
            curso.setAlumnos(i, sc.next());
        }
    }
    
    public Curso crearCurso(Curso curso) {
        System.out.println("Ingrese nombre del curso");
        String nombre = sc.nextLine();
        System.out.println("Ingrese cantidad de horas por dia");
        int horas = sc.nextInt();
        System.out.println("Ingrese cantidad de dias por semana");
        int dias = sc.nextInt();
        System.out.println("Ingrese turno. M/N");
        String turno = sc.nextLine();
        while (!turno.equalsIgnoreCase("n") && !turno.equalsIgnoreCase("m")) {
            System.out.println("Ingrese opcion valida");
            turno = sc.nextLine();
        }
        System.out.println("Ingrese precio por hora");
        int precio = sc.nextInt();
       cargarAlumnos(curso);
        return new Curso(nombre, horas, dias,turno, precio);
    }
    
    public int calcularGanancias(Curso curso) {
        int ganancias = curso.getCantidadHorasPorDia() * curso.getPrecioPorHora() * 5 * curso.getCantidadDiasPorSemana();
        
        return ganancias;
    }
}
