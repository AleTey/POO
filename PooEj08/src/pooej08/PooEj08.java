/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pooej08;

import Entidad.Cadena;
import Service.CadenaService;
import java.util.Scanner;


public class PooEj08 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CadenaService cs = new CadenaService();
        Cadena cadena = new Cadena();
        
        
        System.out.println("Ingrese una cadena");
        cadena.setCadena(sc.nextLine());
        cadena.setLongitud(cadena.getCadena().length());
//        System.out.println(cs.cantVocales(cadena));
//        System.out.println(cs.invertirFrase(cadena));
//        System.out.println("El caracter se encuentra repetido " + cs.vecesRepetido(cadena) + " veces.");
//        cs.compararLongitud(cadena);
//        cs.unirFrase(cadena);
//        cs.reemplazar(cadena);
        System.out.println(cs.contiene(cadena));
        System.out.println(cadena.toString());
    }
    

}
