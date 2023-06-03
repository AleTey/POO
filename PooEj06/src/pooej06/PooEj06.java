/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pooej06;

import CafeteraService.CafeteraService;
import Entidad.Cafetera;
import java.util.Scanner;


public class PooEj06 {


    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        CafeteraService cs = new CafeteraService();
        Cafetera cafetera1 = new Cafetera();
        
        cs.menuPrincipal(cafetera1);
        
    }

}
