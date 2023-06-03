/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;
    
import Identidad.Matematica;

public class MatematicaService {
        
    public double devolverMayor(Matematica mat) {
        double mayor;
        mayor = Double.max(mat.getNum1(), mat.getNum2());
        return mayor;
    }
    
    public int devolverPotencia(Matematica mat) {
               
//        int pot = (int) Math.pow((int) Math.floor(Double.max(mat.getNum1(), mat.getNum2())), (int) Math.floor(Double.min(mat.getNum1(), mat.getNum2()))));
        int pot = (int) Math.pow(Math.floor(Double.max(mat.getNum1(), mat.getNum2())), Math.floor(Double.min(mat.getNum1(), mat.getNum2())));
        return pot;
    }
    
    public int devolverRaiz(Matematica mat) {
        
        int raiz = (int) Math.sqrt(Math.abs(Math.min(mat.getNum1(), mat.getNum2())));
        
        return raiz;
    }
}
