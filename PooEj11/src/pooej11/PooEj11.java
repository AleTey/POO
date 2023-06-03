/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pooej11;

import Identidad.Date;
import java.util.Scanner;


public class PooEj11 {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int anio = 0, mes = 0, dia = 0;
        Date date = new Date();
        
        System.out.println("ingrese a;o");
        anio = sc.nextInt();
        System.out.println("Ingrese mes");
        mes = sc.nextInt();
        System.out.println("Ingrese dia");
        dia = sc.nextInt();
        date.setAnio(anio);
        date.setMes(mes);
        date.setDia(dia);
        Date fechaHoy = new Date(2023, 06, 29);
        System.out.println(fechaHoy.getAnio());
        Date dif = new Date();
        
        dif.setAnio(fechaHoy.getAnio() - date.getAnio());
        System.out.println(dif.getAnio());
    }

}
