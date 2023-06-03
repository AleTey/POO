/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pooej01;

import Entidad.Libro;
import Service.LibroService;
import java.util.Scanner;


public class PooEj01 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibroService lv = new LibroService();
        Libro libro1 = new Libro();
        lv.cargarLibro(libro1);
        
        System.out.println("Desea ver los datos del libro cargado? S/N");
        String rta = sc.nextLine();
        
        if (rta.equalsIgnoreCase("s")) {
            lv.showBook(libro1);
//            rta = null;
        }
//        System.out.println("Desea buscar un libro en especifico? S/N");
//        rta = sc.nextLine();
        
//        if (rta.equalsIgnoreCase("s")) {
//            System.out.println("Buscar por:");
//            System.out.println("1. ISBN");
//            System.out.println("2. Titulo");
//            int busquedaSegun = sc.nextInt();
//            
//            switch (busquedaSegun) {
//                case 1:
//                    System.out.println("");
//            }
//        }
    }

}
