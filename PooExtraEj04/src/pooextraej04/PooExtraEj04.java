
package pooextraej04;

import Identidad.NIF;
import Service.NIFService;


public class PooExtraEj04 {


    public static void main(String[] args) {

        NIFService ns = new NIFService();
        NIF nif = new NIF();
        
        nif = ns.crearNif();
        
        nif.toString();
        System.out.println(nif.toString());
    }

}
