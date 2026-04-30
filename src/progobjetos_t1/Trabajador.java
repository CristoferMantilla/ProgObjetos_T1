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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) 
    {
        if(tipoDocumento.equalsIgnoreCase("dni") || tipoDocumento.equalsIgnoreCase("ce"))
        {
            this.tipoDocumento=tipoDocumento;
            System.out.println("valor correcto");
        }else{
            System.out.println("Error tipo docuemnto inválido");
        }
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) 
    {
        if(this.tipoDocumento.equalsIgnoreCase("dni")){
            if(numeroDocumento.length()==8){
                this.numeroDocumento = numeroDocumento;
            }
            else{
                System.out.println("Error cantidad de digitos debe ser 8");
            }
        }else if(this.tipoDocumento.equalsIgnoreCase("Residencia Temporal")){
            if(numeroDocumento.length()==11){
                this.numeroDocumento = numeroDocumento;
            }else{
                System.out.println("Error cantidad de digitos debe ser 11");
            }
        }
    }

    public String getRegimenLaboral() {
        return regimenLaboral;
    }

    public void setRegimenLaboral(String regimenLaboral) {
        this.regimenLaboral = regimenLaboral;
    }

    public String getFondoPension() {
        return fondoPension;
    }

    public void setFondoPension(String fondoPension) {
        this.fondoPension = fondoPension;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getCantidadHijos() {
        return cantidadHijos;
    }

    public void setCantidadHijos(int cantidadHijos) {
        this.cantidadHijos = cantidadHijos;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    private String codigo;
    private String nombre;
    private String tipoDocumento;
    private String numeroDocumento;
    private String regimenLaboral;
    private String fondoPension;
    private double sueldoBase;
    private int cantidadHijos;
    private String turno;
    
    public void VerDatos(){
        System.out.println("Cod: "+this.codigo+" Nombre: "+this.nombre+" TipoDoc: "
                +this.tipoDocumento+" NroDoc:"+this.numeroDocumento+
                " Régimen: "+this.regimenLaboral+"FondoPension: "+this.fondoPension
                +" SueldoBase: S/"+this.sueldoBase+"CantHijos: "+this.cantidadHijos
                +" Turno: "+this.turno);
    }
    public double calcularRetencionPension() 
    {
        if (regimenLaboral.equalsIgnoreCase("Locacion")) 
        {
        return 0.0;
        }
    
        double porcentaje = 0.0;
    
        if (fondoPension.equalsIgnoreCase("INTEGRA")) 
        {
        porcentaje = 0.121;
        }
        else if (fondoPension.equalsIgnoreCase("PRIMA")) 
        {
        porcentaje = 0.125;
        } 
        else if (fondoPension.equalsIgnoreCase("HABITAT")) 
        {
        porcentaje = 0.127;
        } 
        else if (fondoPension.equalsIgnoreCase("ONP")) 
        {
        porcentaje = 0.13;
        }
        return sueldoBase * porcentaje;
    }
    public double calcularBonificaciones() {
        if (regimenLaboral.equalsIgnoreCase("Locacion")) {
            return 0.0;
        }

        double bonos = 0.0;
        if (cantidadHijos > 0) {
            bonos += 102.5; 
        }
        if (turno.equalsIgnoreCase("Noche")) {
            bonos += (sueldoBase * 0.35);
        }
        return bonos;
    }
    public double calcularSueldoNeto() {
        return sueldoBase + calcularBonificaciones() - calcularRetencionPension();
    }
}