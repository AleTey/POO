/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pooej05;

import CuentaService.CuentaService;
import Entidad.Cuenta;
import java.util.Scanner;


public class PooEj05 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CuentaService cs = new CuentaService();
        
        Cuenta cuenta1 = cs.crearCuenta();
        cs.ingresoSaldo(cuenta1);
        System.out.println("");
//        System.out.println("Ingrese nombre de la cuenta que desea ver");
//        String nroCuenta = sc.nextLine();
        System.out.println(cuenta1.toString());
        System.out.println(cuenta1.getSaldoActual());
        cs.retirarDinero(cuenta1);
        System.out.println("Su saldo actual es de: " + cs.consultarSaldo(cuenta1));
        cs.extraccionRapida(cuenta1);
        System.out.println(cs.consultarSaldo(cuenta1));
        System.out.println(cuenta1.toString());
        cs.consultarDatosCueta(cuenta1);
        
    }

}
