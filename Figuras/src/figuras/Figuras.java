package figuras;

import figuras.entidades.Rectangulo;
import java.util.Scanner;

public class Figuras {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rCreator = 0;
        int option;
        boolean exit = false;
        while (exit == false) {
            System.out.println("Ingresar una opcion");
            System.out.println("1. Nuevo rectangulo");
            System.out.println("2. Circulo");
            System.out.println("5. Salir");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Ingrese Alto y Ancho del rectangulo");
                    Rectangulo rectanculo = new Rectangulo(sc.nextDouble(), sc.nextDouble());
                case 2:
                case 5:
                    System.out.println("Seguro que desea salir S/N");
                    String rta = sc.nextLine();
                    if (rta.equalsIgnoreCase("s")){
                        exit = true;
                    }
            }
        }
//        System.out.println("Ingrese largo y ancho del rectangulo");
//        Rectangulo rectangulo = new Rectangulo(sc.nextInt(), sc.nextInt());

        //System.out.println("El area del rectangulo es: " + rectangulo.getAncho() * rectangulo.getLargo());
//        System.out.println(rectangulo.calcularArea());
//        System.out.println(rectangulo.calcularPerimetro());
        rectangulo.calcularArea();
    }
    public static Rectangulo objectCreator(int rCreator) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 1; i++) {
            Rectangulo rectangulo[i] = new Rectangulo(sc.nextInt(), sc.nextInt());
        }
        objeto = 
                
        return objeto;
    }
}

