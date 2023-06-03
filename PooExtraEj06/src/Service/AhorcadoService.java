package Service;

import Identidad.Ahorcado;
import java.util.Scanner;

public class AhorcadoService {

    int cont = 0, contTotal = 0;
    //Ahorcado ahorcado = new Ahorcado();
    private final Scanner sc = new Scanner(System.in);

    String caracter;

    public void crearJuego(Ahorcado a) {

        System.out.println("Ingrese la palabra");
        String palabra = sc.nextLine();
        System.out.println("Elija la cantidad de jugadas maximas");
        int maxJugadas = sc.nextInt();

        String[] vector = new String[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {
            vector[i] = palabra.substring(i, i + 1);
//            System.out.println(vector[i]);
        }

        a.setPalabraSecreta(vector);
        a.setCantIntentosMaximos(maxJugadas);
        a.setCantLetrasEncontradas(0);
         
           
    }

    public int longitud(Ahorcado a) {
        String[] palabraSecreta = a.getPalabraSecreta();

        return palabraSecreta.length;
    }

    /**
     *
     * @return
     */
    public String buscarLetra() {
        String letra;
        System.out.println("Ingrese una letra");
//        letra = sc.nextLine();
        letra = sc.nextLine();
        while (letra.length() < 1) {
            System.out.println("Ingrese solo una letra ");
            // letra = sc.nextLine();
            letra = sc.nextLine();
        }
        caracter = letra;

        return letra;
    }

    public boolean encontradas(Ahorcado a) {

        int faltantes;
        boolean v = false;

        faltantes = longitud(a) - a.getCantLetrasEncontradas();
        for (int i = 0; i < longitud(a); i++) {
            if (a.getPalabraSecreta(i).equalsIgnoreCase(caracter)) {
                cont++;
                a.setCantLetrasEncontradas(+ 1);
                contTotal ++;
            }
//            System.out.println(caracter);
//            System.out.println(ahorcado.getPalabraSecreta()[i]);
        }

        if (cont > 0) {
            System.out.println("La letra fue encontrada " + cont + " veces");
            v = true;
        } else {
            System.out.println("La letra no se encontraba en la palabra secreta");
            a.setCantIntentosMaximos(a.getCantIntentosMaximos() - 1);
        }
        cont = 0;
        return v;

    }

    public void letrasEncontradas(Ahorcado a) {

    }

    public int intentos(Ahorcado a) {
        int faltantes;
        faltantes = longitud(a) - a.getCantLetrasEncontradas();

        return faltantes;
    }

    /**
     *
     * @param a
     */
    public void intentosRestantes(Ahorcado a) {

        if (!encontradas(a)) {
            a.setCantIntentosMaximos(a.getCantIntentosMaximos() - 1);
        }

    }

    public void juego(Ahorcado a) {

        crearJuego(a);
        
        while (a.getCantIntentosMaximos() > 0 || a.getCantLetrasEncontradas() < longitud(a)) {
            System.out.println(a.getCantIntentosMaximos());
            System.out.println(a.getCantLetrasEncontradas());
            buscarLetra();
            System.out.println(encontradas(a));
            encontradas(a);
            intentosRestantes(a);
            System.out.println(a.getCantIntentosMaximos());
        }

        if (contTotal == longitud(a)) {
            System.out.println("GANASTE");
        } else {
            System.out.println("perdiste");
        }
    }
}
