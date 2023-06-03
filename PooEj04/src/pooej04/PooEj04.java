/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pooej04;

import Entidad.Rectangulo;
import RectanguloService.RectanguloService;


public class PooEj04 {


    public static void main(String[] args) {

        RectanguloService rs = new RectanguloService();
        
        Rectangulo r1 = rs.crearRectangulo();
        
        System.out.println(rs.toString());
        System.out.println(rs.calcularSup(r1));
        System.out.println(rs.calcularPerimetro(r1));
        rs.dibujarRectangulo(r1);
    }

}
