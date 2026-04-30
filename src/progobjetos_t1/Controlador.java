/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progobjetos_t1;

import java.util.ArrayList;

/**
 *
 * @author crist
 */
public class Controlador 
{
    ArrayList<Trabajador>listaTrabajadores;
    public void agregarTrabajador(Trabajador t) {
        listaTrabajadores.add(t);
        System.out.println("Trabajador se agrego con exito");
    }

    public void listarTrabajadores() 
    {
        if (listaTrabajadores==null) 
        {
            System.out.println("No hay trabajadores registrados en el sistema.");
            return;
        }
        System.out.println("LISTA DE TRABAJADORES:");
        for (Trabajador t : listaTrabajadores) {
            System.out.println(t.toString());
        }
    }
    
}
