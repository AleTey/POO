/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotaapp;

import java.util.Scanner;
import mascotaapp.entidades.Mascota;

public class MascotaAPP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Mascota m1 = new Mascota("pipo", "pipo", "perro", "negro", 3, true, "border collie");
        Mascota m2 = new Mascota("Merlina", "Merlina", "perro", "blue", 1, true, "border");
//        m1.nombre = "cartucho";
        m1.setNombre("cartucho");
        m1.setEdad(10);
        m1.setRaza("PitBull");
        System.out.println(m1.getNombre());
    }

}
