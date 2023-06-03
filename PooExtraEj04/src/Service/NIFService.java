
package Service;

import Identidad.NIF;
import java.util.Scanner;

public class NIFService {
    private final Scanner sc = new Scanner(System.in);
   
    public NIF crearNif() {
        
        String [][] guia = {{"0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22"}, 
                            {"t","r","w","a","g","m","y","f","p","d","x","b","n","j","z","s","q","v","h","l","c","k","e"}};
        System.out.println("Ingrese Nro de DNI");
        long dni = sc.nextLong();
        int nif = (int) (dni % 23);
        char letra = ' ';
        String nifS = String.valueOf(nif);
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 23; j++) {
                if (guia[i][j].equals(nifS)) {
                    letra = guia[1][j].charAt(0);
                    
                }
            }
        }
        return new NIF(dni, letra);
    }
}
