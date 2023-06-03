/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pooej13;

import Identidad.Curso;
import Service.CursoService;


public class PooEj13 {


    public static void main(String[] args) {

        CursoService cs = new CursoService();
        Curso curso = new Curso();
        
        cs.crearCurso(curso);
//        cs.cargarAlumnos(curso);
        for (int i = 0; i < 5; i++) {
            System.out.println(curso.getAlumnos()[i]);
        }
        
        System.out.println(cs.calcularGanancias(curso));
    }

}
