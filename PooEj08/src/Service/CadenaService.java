/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Cadena;
import java.util.Scanner;

public class CadenaService {

    private final Scanner sc = new Scanner(System.in);

    public int cantVocales(Cadena cadena) {
        
        int cont = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            //char caracter = cadena.getCadena().charAt(i);
            if (cadena.getCadena().charAt(i) == 'a' || cadena.getCadena().charAt(i) == 'e' || cadena.getCadena().charAt(i) == 'i' || cadena.getCadena().charAt(i) == 'o' || cadena.getCadena().charAt(i) == 'u') {
                cont++;
            }
        }
        return cont;
    }

    public String invertirFrase(Cadena cadena) {
        
        String cadena2 = "";
        for (int i = cadena.getLongitud() - 1; i >= 0; i--) {
            cadena2 += (cadena.getCadena().substring(i, 1 + i));
        }
        return cadena2;
    }

    public int vecesRepetido(Cadena cadena) {

        int cont = 0;
        System.out.println("Ingrese el caracter que desea saber cuantas veces se repite");
        char caracter = sc.nextLine().charAt(0);
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (cadena.getCadena().charAt(i) == caracter) {
                cont++;
            }
        }
        return cont;
    }

    public void compararLongitud(Cadena cadena) {

        System.out.println("Ingrese una nueva cadena para comparar las longitudes");
        String nuevaCadena = sc.nextLine();
        if (cadena.getLongitud() < nuevaCadena.length()) {
            System.out.println("La ultima cadena ingresada tiene " + (nuevaCadena.length() - cadena.getLongitud()) + " caracteres mas que la primera");
        } else if (cadena.getLongitud() > nuevaCadena.length()) {
            System.out.println("La primer cadena ingresada tiene " + (cadena.getLongitud() - nuevaCadena.length()) + " caracteres mas que las segunda");
        } else if (cadena.getLongitud() == nuevaCadena.length()) {
            System.out.println("Ambas cadenas tienen la misma cantidad de caracteres");
        }
    }

    public void unirFrase(Cadena cadena) {
        
        System.out.println("Ingrese una nueva frase para unirla con la primera ingresada");
        String nuevaCadena = sc.nextLine();
        //nuevaCadena.concat(cadena.getCadena());
        String frases = cadena.getCadena().concat(" ").concat(nuevaCadena);
        System.out.println(frases);
    }
    
    public void reemplazar(Cadena cadena) {
        
        System.out.println("Por que caracter desea reemplazar la a");
        char caracter = sc.nextLine().charAt(0);
        
        String clonCadena = cadena.getCadena();
        String replace = cadena.getCadena().replace('a', caracter);
        cadena.setCadena(replace);
        System.out.println(clonCadena);
        System.out.println(cadena.getCadena());
        System.out.println(replace);
//        for (int i = 0; i < cadena.getLongitud(); i++) {
//            if (cadena.getCadena().charAt(i) == 'a') {
//                cadena.setCadena(cadena.getCadena().charAt(i) = caracter);
//            }
//        }
    }
    
//    public boolean contiene(Cadena cadena) {
//        boolean contiene = false;
//        System.out.println("Ingrese el caracter que desea buscar");
//        //char caracter = sc.next().charAt(0);
//        String caracter = sc.nextLine();
//        for (int i = 0; i < cadena.getLongitud(); i++) {
//            if (cadena.getCadena().substring(i, i + 1).equalsIgnoreCase(caracter)) {
//                contiene = true;
//                return true;
//            }
//        }
//        return contiene;
//    }
    

    
    public boolean contiene(Cadena cadena) {
        boolean contiene = false;
        String caracter = "";
        System.out.println("Ingrese el caracter que desea buscar");
        caracter = sc.nextLine();
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (i == cadena.getLongitud() - 1) {
                
                cadena.getCadena().substring(i).equalsIgnoreCase(caracter);
            }
            if (cadena.getCadena().substring(i, i + 1).equalsIgnoreCase(caracter)) {
                System.out.println(cadena.getCadena().substring(i, i + 1));
                contiene = true;
                return contiene;
            }
        }
        return contiene;
    }
}
