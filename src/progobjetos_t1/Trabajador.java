/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progobjetos_t1;

/**
 *
 * @author crist
 */
public class Trabajador 
{
    private String codigo;
    private String nombre;
    private String tipoDocumento;
    private String numeroDocumento;
    private String regimenLaboral;
    private String fondoPension;
    private double sueldoBase;
    private int cantidadHijos;
    private String turno;
    
    private void validarDocumento(String tipo, String numero) {
        if (tipo.equalsIgnoreCase("DNI") && numero.length() != 8) {
            System.out.println("El DNI debe tener 8 dígitos.");
        }
        if (tipo.equalsIgnoreCase("Carnet de Extranjeria") && numero.length() != 9) {
            System.out.println("El Carnet de Extranjeria debe tener 9 dígitos.");
        }
    }
    public void VerDatos(){
        System.out.println("Cod: "+this.codigo+" Nombre: "+this.nombre+" TipoDoc: "
                +this.tipoDocumento+" NroDoc:"+this.numeroDocumento+
                " Régimen: "+this.regimenLaboral+"FondoPension: "+this.fondoPension
                +" SueldoBase: S/"+this.sueldoBase+"CantHijos: "+this.cantidadHijos
                +" Turno: "+this.turno);
    }
}