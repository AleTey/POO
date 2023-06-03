package game;

import game.entidades.Cuenta;
import game.entidades.Usuario;
import java.util.Scanner;


public class Game {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int option;
        
        System.out.println("1- Ingresar");
        System.out.println("2- Registrarse");
        option = sc.nextInt();
        
        Usuario AleTei = new Usuario();
        switch (option) {
            case 1:
                
            case 2:
                 
                System.out.println("Ingrese un nombre de usuario");
                String nuevoUsuario = sc.nextLine();
                
                // nuevoUsuario = new Usuario();
                System.out.println("Tu nombre");
                
                System.out.println("Tu apellido ");
                
                System.out.println("Email");
                
                System.out.println("Fecha de nacimiento");
                
                System.out.println("Pais");
        }
    }

}
