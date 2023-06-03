/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuentaService;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class CuentaService {
    private final Scanner sc = new Scanner(System.in);
   public Cuenta crearCuenta() {
       System.out.println("Ingrese numero de cuenta");
       int numeroCuenta = sc.nextInt();
       System.out.println("Ingrese dni");
       long dni = sc.nextLong();
       System.out.println("Ingrese saldo de cuenta");
       int saldo = sc.nextInt();
       
       return new Cuenta(numeroCuenta, dni, saldo);
   }
   
   public void ingresoSaldo(Cuenta cuenta) {
       System.out.println("Monto a depositar");
       int montoDeposito = sc.nextInt();
       int nuevoSaldo = montoDeposito + cuenta.getSaldoActual();
       cuenta.setSaldoActual(nuevoSaldo);
   }

   public void retirarDinero(Cuenta cuenta) {
       System.out.println("Ingrese monto que desea retirar");
       double montoRetirar = sc.nextDouble();
       if (cuenta.getSaldoActual() < montoRetirar) {
           System.out.println("El saldo de su cuenta es menor que el que desea retirar. El saldo disponible en su cuenta es de " + cuenta.getSaldoActual());
           System.out.println("Desea retirar el total? S/N");
           String rta = sc.nextLine();
           while (! rta.equalsIgnoreCase("s") && ! rta.equalsIgnoreCase("n")) {
               System.out.println("Ingrese S si desea retirar " + cuenta.getSaldoActual() + " , de caso contrario ingrese N");
               rta = sc.nextLine();
           }
           if (rta.equalsIgnoreCase("s")) {
               cuenta.setSaldoActual(0);
               System.out.println("Ya puede retirar el dinero");
           }
       }else {
           System.out.println("Ya puede retirar su dinero");
           double nuevoSaldo = cuenta.getSaldoActual() - montoRetirar;
           cuenta.setSaldoActual((int) (nuevoSaldo));
       }
   }
   
   public void extraccionRapida(Cuenta cuenta) {
       double maxRetiro = cuenta.getSaldoActual() * .2;
       System.out.println("Ingrese monto a retirar, recuerde que no puede retirar mas del 20% del saldo total");
       System.out.println("Su saldo actual es de: " + cuenta.getSaldoActual() + ". Y el maximo que puede retirar con extraccion rapida en este momento es: " + maxRetiro);
       double montoRetirar = sc.nextDouble();
       while (montoRetirar > maxRetiro) {
           System.out.println("No es posible retirar mas de " + maxRetiro);
           System.out.println("Ingrese monto que desea retirar");
           montoRetirar = sc.nextDouble();
       }
       System.out.println("Ya puede retirar su dinero");
       int nuevoSaldo = (int) (cuenta.getSaldoActual() - montoRetirar);
       cuenta.setSaldoActual(nuevoSaldo);
   }   
   
   public void consultarDatosCueta(Cuenta cuenta) {
       System.out.println("numero de cuenta: " + cuenta.getNumeroCuenta());
       System.out.println("DNI: " + cuenta.getDni());
       System.out.println("Saldo actual: " + cuenta.getSaldoActual());
   }
   
   public int consultarSaldo(Cuenta cuenta) {
   
       return cuenta.getSaldoActual();
   }
           
}
