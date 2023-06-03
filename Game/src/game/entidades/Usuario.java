package game.entidades;

import java.util.Date;

public class Usuario {
    //Atributo
    private String nombre;
    private String apellido;
    private String eMail;
    private Date nacimiento;
    private String pais;
    
    public Usuario() {
        System.out.println("");
    }
    public Usuario(String nombre, String apellido, String eMail, Date nacimiento, String pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.eMail = eMail;
        this.nacimiento = nacimiento;
        this.pais = pais;
    }

 
    
    
}
