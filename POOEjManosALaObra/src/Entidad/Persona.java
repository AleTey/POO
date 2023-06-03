/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

public class Persona {
    public String nombre;
    public String eMail;
    public int dni;

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public String geteMail() {
        return eMail;
    }

    public int getDni() {
        return dni;
    }
   
//    public void setNombre(String Nombre) {
//        this.nombre = nombre;
//    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
