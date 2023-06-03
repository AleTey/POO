/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Libro;
import java.util.Scanner;

public class LibroService {

//    Libro libro1 = new Libro();
    
    public void cargarLibro(Libro libro) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese isbn del libro");
        libro.isbn = sc.nextInt();
        System.out.println("Ingrese nombre del libro");
        libro.titulo = sc.nextLine();
        libro.titulo = sc.nextLine();
        System.out.println("Ingrese autor del libro");
        libro.autor = sc.nextLine();
        System.out.println("Ingrese numero de paginas");
        libro.paginas = sc.nextInt();

    }
    
    public void showBook(Libro libro) {
        System.out.println(libro.isbn);
        System.out.println(libro.titulo);
        System.out.println(libro.paginas);
        System.out.println(libro.autor);
    }
    
    public void showLibro() {
        System.out.println("Libro1: " + libro1.toString());
    }
    
//    public void busquedaIsbn (Libro isbn) {
//        return 
//    }
}
