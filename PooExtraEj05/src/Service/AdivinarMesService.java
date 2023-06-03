package Service;

import Identidad.AdivinarMes;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AdivinarMesService {

    public void adivinarMes() {

        AdivinarMes am = new AdivinarMes();
        Scanner sc = new Scanner(System.in);

        String rta = "";

        boolean rtaValida = false;
        do {
            while (!rtaValida) {
                try {
                    System.out.println("Adivine el mes secreto, el mes debe ser ingresado en formato texto");
                    rta = sc.nextLine();
                    rtaValida = true;
                } catch (InputMismatchException e) {
                    System.out.println("Ingrese una respuesta valida");
                    rta = sc.nextLine();
                }
            }
            rtaValida = false;
            if (!rta.equalsIgnoreCase(am.getMesSecreto())) {
                System.out.println("Respuesta equivocada!");
                
            }else {
                System.out.println("Respuesta correcta!");
            }
        } while (!rta.equalsIgnoreCase(am.getMesSecreto()));
    }

}
