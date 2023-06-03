package Service;

import Identidad.Ahorcado;
import java.util.Scanner;

public class AhorcadoService {

    private final Scanner sc = new Scanner(System.in);

    String letraElegida;
    boolean v;

    public Ahorcado crearJuego() {

        Ahorcado juego = new Ahorcado();

        System.out.println("Ingrese palabra secreta");
        String palabraSecreta = sc.nextLine();
        System.out.println("Ingrese cantidad maxima de intentos erroneos");
//        juego.setMaxIntentos(sc.nextInt());
        int cantIntentos = sc.nextInt();
        sc.nextLine();

//         System.out.println(cantIntentos);
        juego.setPalabraSecreta(new String[palabraSecreta.length()]);
        juego.setMaxIntentos(cantIntentos);
//        System.out.println(juego.getMaxIntentos());
        juego.setCantLetrasEncontradas(0);

        for (int i = 0; i < palabraSecreta.length(); i++) {
            juego.setPalabraSecreta(i, palabraSecreta.substring(i, i + 1));
        }

        for (int i = 0; i < palabraSecreta.length(); i++) {
            juego.setPalabraSecreta(i, palabraSecreta.substring(i, i + 1));
        }

//        Seteo de front - letrasEncontradas
        juego.setLetrasEncontradas(new String[palabraSecreta.length()]);

        String provi = "_";
        for (int i = 0; i < palabraSecreta.length(); i++) {
            juego.setLetrasEncontradas(i, provi);
        }
        return juego;
    }

    public int longitud(Ahorcado a) {

        String[] longitud = a.getPalabraSecreta();

        return longitud.length;
    }

    public void prueba(Ahorcado a) {

//        System.out.println("Longitud = " + longitud(a));
//        for (int i = 0; i < longitud(a); i++) {
//            System.out.print(a.getPalabraSecreta(i) + " ");
//        }
//        for (int i = 0; i < longitud(a); i++) {
//            System.out.print(a.getLetrasEncontradas(i) + " ");
//        }
        System.out.println("");
        System.out.println("Cantidad de intentos restantes: " + a.getMaxIntentos());
        //System.out.println("Letras encontradas: " + a.getCantLetrasEncontradas());
    }

    public void ingresarLetra(Ahorcado a) {
        boolean verificar = false;
        int cont = 0, verificarLetra;

        System.out.println("Ingrese letra");
        letraElegida = sc.nextLine();

        
        for (int i = 0; i < longitud(a); i++) {
            if (letraElegida.equalsIgnoreCase(a.getLetrasEncontradas(i))) {
                verificar = true;
            }
        }
        while (verificar) {
            verificar = false;
            verificarLetra = 0;
            System.out.println("Esa letra ya fue elegida, ingrese otra");
            letraElegida = sc.nextLine();
            for (int i = 0; i < longitud(a); i++) {
                if (letraElegida.equalsIgnoreCase(a.getLetrasEncontradas(i))) {
                    verificarLetra ++;
                }
            }
            System.out.println(verificarLetra);
            if (verificarLetra > 0) {
                verificar = true;
            }
        }
        
        //letraElegida = sc.nextLine();
        for (int i = 0; i < longitud(a); i++) {
            if (letraElegida.equalsIgnoreCase(a.getPalabraSecreta(i))) {
                a.setCantLetrasEncontradas(a.getCantLetrasEncontradas() + 1);
                v = true;
                cont++;
            }
            if (cont == 0) {
                v = false;
            }
//else {
//                int intentosRestantes = a.getMaxIntentos() - 1;
////                System.out.println("Intentos restantes: " + intentosRestantes);
//                a.setMaxIntentos(intentosRestantes);                       
//            }

        }
//        a.setCantLetrasEncontradas(+cont);
    }

    public void intentosRestantes(Ahorcado a) {

        if (!v) {
            a.setMaxIntentos(a.getMaxIntentos() - 1);
            System.out.println("errores restantes " + a.getMaxIntentos());
        }
    }

    public void front(Ahorcado a) {

        for (int i = 0; i < longitud(a); i++) {
            if (a.getPalabraSecreta(i).equalsIgnoreCase(letraElegida)) {
                a.setLetrasEncontradas(i, letraElegida);
            }
        }
        for (int i = 0; i < longitud(a); i++) {
            System.out.print(a.getLetrasEncontradas(i) + " ");
        }
        System.out.println("");
    }

    public void jugarJuego() {

        Ahorcado juego = crearJuego();

        while (juego.getMaxIntentos() > 0 && juego.getCantLetrasEncontradas() < longitud(juego)) {
            longitud(juego);
            ingresarLetra(juego);
            intentosRestantes(juego);
            front(juego);
            prueba(juego);

        }

        if (juego.getMaxIntentos() == 0) {
            System.out.println("Perdiste la partida");
        } else {
            System.out.println("GANASTE!");
        }
    }

}
