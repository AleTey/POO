
package pooextraej06;

import Identidad.Ahorcado;
import Service.AhorcadoService;


public class PooExtraEj06 {


    public static void main(String[] args) {

       AhorcadoService as = new AhorcadoService();
       Ahorcado a = new Ahorcado();
       as.juego(a);
    }

} 
