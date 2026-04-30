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
    ArrayList<Trabajador> listaTrabajadores = new ArrayList();

    // Constructor
    public Controlador() {
        // ¡Esta es la línea que te falta para que deje de ser null!
        listaTrabajadores = new ArrayList<>(); 
    }

    public void agregarTrabajador(Trabajador t) {
        // Ahora esto ya no dará error en la línea 17
        listaTrabajadores.add(t); 
    }
    void listarTrabajadores() 
    {
        System.out.println("La lista contiene los siguientes objetos");
        for (Trabajador aux :listaTrabajadores)
        {
            aux.VerDatos();
        }
    }
    
}
