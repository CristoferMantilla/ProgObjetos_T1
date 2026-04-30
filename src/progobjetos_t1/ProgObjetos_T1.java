/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package progobjetos_t1;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class ProgObjetos_T1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Controlador controlador = new Controlador();
        int opcion = 0;
        
        while (opcion != 3) 
        {
            System.out.println("1. Agregar Trabajador");
            System.out.println("2. Listar Trabajadores");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
        }
    }
    
}
