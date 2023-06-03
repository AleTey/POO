/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CafeteraService;

import Entidad.Cafetera;
import java.util.Scanner;

public class CafeteraService {

    private Scanner sc = new Scanner(System.in);

//    Cafetera cafetera1 = new Cafetera();
    public void llenarCafetera(Cafetera cafetera) throws InterruptedException {

        String rta;
        if (cafetera.getCantidadActual() == cafetera.getCapacidadMax()) {
            System.out.println("El cafe ya se encuentra en el maximo");
        } else if (cafetera.getCantidadActual() == 0) {
            System.out.println("Ya no hay cafe en la maquina, ingrese una opcion para continuar");
            System.out.println("1. Llenar cafetera");
            System.out.println("2. Elegir cuanto cafe agregar");
            int rta1 = sc.nextInt();
//            System.out.println("La cafetera se encuentra vacia, desea llenarla? S/N");
//            rta = sc.nextLine();
            if (rta1 == 1) {
                System.out.println("Agregando " + cafetera.getCapacidadMax() + "g de cafe, por favor espere");
                for (int i = 0; i < 4; i++) {
                    //System.out.print("\r" + "\r" + " " + i);
                    Thread.sleep(1000);
                    System.out.print("\r" + i);
                }
                cafetera.setCantidadActual(cafetera.getCapacidadMax());
                System.out.println("");
                System.out.println("Cafetera llena!");
            } else {
                System.out.println("Cuanto cafe desea agreagar? Maximo " + cafetera.getCapacidadMax() + " g");
                double xCafe = sc.nextDouble();
                // if (xCafe < 0 || xCafe > cafetera.getCapacidadMax()) {
                while (xCafe < 0 || xCafe > 70) {
                    System.out.println("Ingrese un valor mayor a 0 y menor a 70 g");
                    xCafe = sc.nextDouble();
                }
                System.out.println("Agregando " + xCafe + "g de cafe");
                for (int i = 0; i < 4; i++) {
                    //System.out.print("\r" + "\r" + " " + i);
                    Thread.sleep(1000);
                    System.out.print("\r" + i);
                }
                System.out.println("");
                cafetera.setCantidadActual(cafetera.getCantidadActual() + xCafe);
                System.out.println("Se agrego " + xCafe + "Ahora la cafetera tiene " + cafetera.getCantidadActual());
            }
            //cafetera.setCantidadActual(cafetera.getCapacidadMax());
        } else {
            System.out.println("A la cafetera le resta " + cafetera.getCantidadActual());
            System.out.println("1. Llenar cafetera");
            System.out.println("2. Elegir cuanto cafe agregar");
            int rta1 = sc.nextInt();
//            System.out.println("La cafetera se encuentra vacia, desea llenarla? S/N");
//            rta = sc.nextLine();
            if (rta1 == 1) {
                System.out.println("Agregando " + cafetera.getCapacidadMax() + "g de cafe, por favor espere");
                for (int i = 0; i < 4; i++) {
                    //System.out.print("\r" + "\r" + " " + i);
                    Thread.sleep(1000);
                    System.out.print("\r" + i);
                }
                cafetera.setCantidadActual(cafetera.getCapacidadMax());
                System.out.println("");
                System.out.println("Cafetera llena!");
            } else {
                double maxCafe = cafetera.getCapacidadMax() - cafetera.getCantidadActual();
                System.out.println("Cuanto cafe desea agreagar? Maximo " + (cafetera.getCapacidadMax() - cafetera.getCantidadActual()) + " g");
                double xCafe = sc.nextDouble();
                // if (xCafe < 0 || xCafe > cafetera.getCapacidadMax()) {
                while (xCafe <= 0 || xCafe > maxCafe) {
                    if (xCafe > maxCafe) {
                        System.out.println("El maximo que puede agregar es " + maxCafe + ". Intente nuevamente");
                        xCafe = sc.nextDouble();
                    }else {
                    System.out.println("Ingrese un valor mayor a 0");
                    xCafe = sc.nextDouble();
                    }
                }
                System.out.println("Agregando " + xCafe + "g de cafe");
                for (int i = 0; i < 4; i++) {
                    //System.out.print("\r" + "\r" + " " + i);
                    Thread.sleep(1000);
                    System.out.print("\r" + i);
                }
                System.out.println("");
                cafetera.setCantidadActual(cafetera.getCantidadActual() + xCafe);
                System.out.println("Se agrego " + xCafe + "Ahora la cafetera tiene " + cafetera.getCantidadActual());
            }
//            rta = sc.nextLine();
//            if (rta.equalsIgnoreCase("s")) {
//                double faltante = cafetera.getCapacidadMax() - cafetera.getCantidadActual();
//                for (int i = 3; i <= 0; i--) {
//                    System.out.println("Agregando " + faltante + "g de cafe, por favor espere");
//                    Thread.sleep(1000);
//                    System.out.println("\r" + i);
//                }
//                cafetera.setCantidadActual(cafetera.getCapacidadMax());
//            }
        }

    }

    public void cargarAgua(Cafetera cafetera) throws InterruptedException {
        if (cafetera.getCantAguaActual() == cafetera.getCantAguaMax()) {
            System.out.println("El agua esta al maximo");
        } else if (cafetera.getCantAguaActual() == 0) {
            System.out.println("Cargando agua en la cafetera, espere un momento");
            System.out.println("");
            for (int i = 0; i < 4; i++) {
                //System.out.print("\r" + "\r" + " " + i);
                Thread.sleep(1000);
                System.out.print("\r" + i);
            }
            System.out.println("");
            cafetera.setCantAguaActual(cafetera.getCantAguaMax());
            System.out.println("Agua al maximo");
        } else {
            System.out.println("A la cafetera aun le queda " + cafetera.getCantAguaActual() + "ml de agua, desea llenarla?");
            String rta = sc.nextLine();
            while (!rta.equalsIgnoreCase("s") || !rta.equalsIgnoreCase("n")) {
                System.out.println("Ingrese una opcion valida, S/N");
                rta = sc.nextLine();
            }
            if (rta.equalsIgnoreCase("s")) {
                for (int i = 0; i < 4; i++) {
                    //System.out.print("\r" + "\r" + " " + i);
                    Thread.sleep(1000);
                    System.out.print("\r" + i);
                }
                System.out.println("");
                cafetera.setCantAguaActual(cafetera.getCantAguaMax());
                System.out.println("Agual al maximo");
            }
            double aguaFaltante = cafetera.getCantAguaMax() - cafetera.getCantAguaActual();

        }
        System.out.println("");
    }

    public void menuPrincipal(Cafetera cafetera) throws InterruptedException {
        boolean turnOff = false;
        int option;

        while (turnOff == false) {
            System.out.println("1. Prepara cafe");
            System.out.println("2. Cargar cafe en la maquina");
            System.out.println("3. Cargar agua en la maquina");
            System.out.println("4. Sacar cafe de la maquina");
            System.out.println("5. Sacar agua de la maquina");
            System.out.println("6. Apagar cafetera");
            option = sc.nextInt();
            while (option > 6 || option < 0) {
                System.out.println("Ingrese una opcion valida");
                option = sc.nextInt();
            }
            switch (option) {
                case 1:
                    menuCafe(cafetera);
                    break;
                case 2:
                    llenarCafetera(cafetera);
                    break;
                case 3:
                    cargarAgua(cafetera);
                    break;
                case 4:
                    sacarCafe(cafetera);
                    break;
                case 5:
                    sacarAgua(cafetera);
                    break;
                case 6:
                    turnOff = true;
                    break;
            }
        }
    }

    public void menuCafe(Cafetera cafetera) throws InterruptedException {
        boolean menuPrincipal = false;
        while (menuPrincipal == false) {
            System.out.println("Eliga una opcion");
            System.out.println("1. Ristretto");
            System.out.println("2. Expresso");
            System.out.println("3. Doppio");
            System.out.println("4. Salir al menu principal");
            int option = sc.nextInt();

            while (option != 1 && option != 2 && option != 3 && option != 4) {
                System.out.println("Ingrese una opcion valida");
                option = sc.nextInt();
            }
            switch (option) {
                case 1:
                    prepararRistretto(cafetera);
                    break;
                case 2:
                    prepararExpresso(cafetera);
                    break;
                case 3:
                    prepararDoppio(cafetera);
                    break;
                case 4:
                    menuPrincipal = true;
            }
        }
    }

    public void prepararRistretto(Cafetera cafetera) throws InterruptedException {
        int aguaMinima = 20;
        int cafeMinimo = 7;
        String rta;
        if (cafetera.getCantidadActual() < cafeMinimo) {
            System.out.println("No hay suficiente cafe en la maquina. Desea cargar?");
            rta = sc.nextLine();
            while (!rta.equalsIgnoreCase("s") && !rta.equalsIgnoreCase("n")) {
                System.out.println("Ingrese una opcion valida, S/N");
                rta = sc.nextLine();
            }
            if (rta.equalsIgnoreCase("s")) {
                llenarCafetera(cafetera);
            } else {
                return;
            }
        }
        if (cafetera.getCantAguaActual() < aguaMinima) {
            System.out.println("No hay suficiente agua en la maquina. Desea cargar?");
            rta = sc.nextLine();
            while (!rta.equalsIgnoreCase("s") && !rta.equalsIgnoreCase("n")) {
                System.out.println("Ingrese una opcion valida, S/N");
                rta = sc.nextLine();
            }
            if (rta.equalsIgnoreCase("s")) {
                cargarAgua(cafetera);
            } else {
                return;
            }
        }
        System.out.println("Preparando ristretto");
        for (int i = 0; i < 4; i++) {
            //System.out.print("\r" + "\r" + " " + i);
            Thread.sleep(1000);
            System.out.print("\r" + i);
        }
        System.out.println("");
        cafetera.setCantidadActual(cafetera.getCantidadActual() - cafeMinimo);
        cafetera.setCantAguaActual(cafetera.getCantidadActual() - aguaMinima);
        System.out.println("Ristretto listo, ya puede retirar la taza");
    }

    public void prepararExpresso(Cafetera cafetera) throws InterruptedException {
        int aguaMinima = 30;
        int cafeMinimo = 7;
        String rta;
        if (cafetera.getCantidadActual() < cafeMinimo) {
            System.out.println("No hay suficiente cafe en la maquina. Desea cargar?");
            rta = sc.nextLine();
            while (!rta.equalsIgnoreCase("s") && !rta.equalsIgnoreCase("n")) {
                System.out.println("Ingrese una opcion valida, S/N");
                rta = sc.nextLine();
            }
            if (rta.equalsIgnoreCase("s")) {
                llenarCafetera(cafetera);
            } else {
                return;
            }
        }
        if (cafetera.getCantAguaActual() < aguaMinima) {
            System.out.println("No hay suficiente agua en la maquina. Desea cargar?");
            rta = sc.nextLine();
            while (!rta.equalsIgnoreCase("s") && !rta.equalsIgnoreCase("n")) {
                System.out.println("Ingrese una opcion valida, S/N");
                rta = sc.nextLine();
            }
            if (rta.equalsIgnoreCase("s")) {
                cargarAgua(cafetera);
            } else {
                return;
            }
        }
        System.out.println("Preparando expresso");
        for (int i = 0; i < 4; i++) {
            //System.out.print("\r" + "\r" + " " + i);
            Thread.sleep(1000);
            System.out.print("\r" + i);
        }
        System.out.println("");
        cafetera.setCantidadActual(cafetera.getCantidadActual() - cafeMinimo);
        cafetera.setCantAguaActual(cafetera.getCantidadActual() - aguaMinima);
        System.out.println("Expresso listo, ya puede retirar la taza");
    }

    public void prepararDoppio(Cafetera cafetera) throws InterruptedException {
        int aguaMinima = 30;
        int cafeMinimo = 14;
        String rta;
        if (cafetera.getCantidadActual() < cafeMinimo) {
            System.out.println("No hay suficiente cafe en la maquina. Desea cargar?");
            rta = sc.nextLine();
            while (!rta.equalsIgnoreCase("s") && !rta.equalsIgnoreCase("n")) {
                System.out.println("Ingrese una opcion valida, S/N");
                rta = sc.nextLine();
            }
            if (rta.equalsIgnoreCase("s")) {
                llenarCafetera(cafetera);
            } else {
                return;
            }
        }
        if (cafetera.getCantAguaActual() < aguaMinima) {
            System.out.println("No hay suficiente agua en la maquina. Desea cargar?");
            rta = sc.nextLine();
            while (!rta.equalsIgnoreCase("s") && !rta.equalsIgnoreCase("n")) {
                System.out.println("Ingrese una opcion valida, S/N");
                rta = sc.nextLine();
            }
            if (rta.equalsIgnoreCase("s")) {
                cargarAgua(cafetera);
            } else {
                return;
            }
        }
        System.out.println("Preparando Doppio");
        for (int i = 0; i < 4; i++) {
            //System.out.print("\r" + "\r" + " " + i);
            Thread.sleep(1000);
            System.out.print("\r" + i);
        }
        System.out.println("");
        cafetera.setCantidadActual(cafetera.getCantidadActual() - cafeMinimo);
        cafetera.setCantAguaActual(cafetera.getCantidadActual() - aguaMinima);
        System.out.println("Doppio listo, ya puede retirar la taza");
    }

    public void sacarCafe(Cafetera cafetera) throws InterruptedException {
        System.out.println("Seguro que desea sacar el cafe de la maquina? S/N");
        String rta = sc.nextLine();
        while (!rta.equalsIgnoreCase("s") || !rta.equalsIgnoreCase("n")) {
            System.out.println("Ingrese una opcion valida, S/N");
            rta = sc.nextLine();
        }
        if (rta.equalsIgnoreCase("s")) {
            for (int i = 0; i < 4; i++) {
                //System.out.print("\r" + "\r" + " " + i);
                Thread.sleep(1000);
                System.out.print("\r" + i);
            }
            System.out.println("");
            cafetera.setCantidadActual(0);
            System.out.println("Ahora la cafetera se encuentra sin cafe");
        }
    }

    public void sacarAgua(Cafetera cafetera) throws InterruptedException {
        System.out.println("Seguro que desea sacar el agua de la maquina? S/N");
        String rta = sc.nextLine();
        while (!rta.equalsIgnoreCase("s") || !rta.equalsIgnoreCase("n")) {
            System.out.println("Ingrese una opcion valida, S/N");
            rta = sc.nextLine();
        }
        if (rta.equalsIgnoreCase("s")) {
            for (int i = 0; i < 4; i++) {
                //System.out.print("\r" + "\r" + " " + i);
                Thread.sleep(1000);
                System.out.print("\r" + i);
            }
            System.out.println("");
            cafetera.setCantAguaActual(0);
            System.out.println("Ahora la cafetera se encuentra sin agua");
        }
    }

    public void cafeRestante(Cafetera cafetera) {
        System.out.println(cafetera.getCantidadActual() + "g");
    }

    public void aguaRestante(Cafetera cafetera) {
        System.out.println(cafetera.getCantAguaActual() + "ml");
    }
}
