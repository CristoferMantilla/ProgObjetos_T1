/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package progobjetos_t1;

import java.util.InputMismatchException;
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
        
        while (opcion != 3) {
        System.out.println("1. Agregar Trabajador");
        System.out.println("2. Listar Trabajadores");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
    
        try 
        {
        opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer
        
        if(opcion == 1) 
        {
            try {
                System.out.print("Código: ");
                String cod = scanner.nextLine();
                System.out.print("Nombre completo: ");
                String nom = scanner.nextLine();
                System.out.print("Tipo Documento (DNI/Residencia): ");
                String tipoDoc = scanner.nextLine();
                System.out.print("Número Documento: ");
                String numDoc = scanner.nextLine();
                System.out.print("Régimen (728/Locacion): ");
                String regimen = scanner.nextLine();
                System.out.print("Fondo Pensión (Integra/Prima/Habitat/ONP): ");
                String fondo = scanner.nextLine();
                System.out.print("Sueldo Base: ");
                double sueldo = scanner.nextDouble();
                System.out.print("Cantidad de hijos: ");
                int hijos = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer
                System.out.print("Turno (Dia/Noche): ");
                String turno = scanner.nextLine();

                // 1. Se crea la instancia usando el constructor vacío
                Trabajador nuevoTrabajador = new Trabajador();

                // 2. Se inyecta la información capturada usando los métodos "set"
                nuevoTrabajador.setCodigo(cod);
                nuevoTrabajador.setNombre(nom);
                nuevoTrabajador.setTipoDocumento(tipoDoc);
                nuevoTrabajador.setNumeroDocumento(numDoc);
                nuevoTrabajador.setRegimenLaboral(regimen);
                nuevoTrabajador.setFondoPension(fondo);
                nuevoTrabajador.setSueldoBase(sueldo);
                nuevoTrabajador.setCantidadHijos(hijos);
                nuevoTrabajador.setTurno(turno);

                // 3. Se envía el objeto ya armado al controlador
                controlador.agregarTrabajador(nuevoTrabajador);

                } catch (IllegalArgumentException e) {
                System.out.println("ERROR DE VALIDACIÓN: " + e.getMessage());
                } catch (InputMismatchException e) {
                System.out.println("ERROR: Ingrese un tipo de dato numérico válido para sueldo o hijos.");
                scanner.nextLine(); // Limpiar el error del buffer
            }
            
            } else if (opcion == 2) {

                
                controlador.listarTrabajadores();
            
            } else if (opcion == 3) {
            System.out.println("Cerrando sistema...");
            
            } else 
            {
            System.out.println("Opción no válida.");
            }
        
        } catch (InputMismatchException e) 
        {
        System.out.println("ERROR: Ingrese un número para la opción del menú.");
        scanner.nextLine(); // Limpiar buffer general
        }
    }
    }
    
}
