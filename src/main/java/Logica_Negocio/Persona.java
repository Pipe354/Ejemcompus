
package Logica_Negocio;


public class Persona {
    
    public String nombre, apellido, cedula, direccion;
    public Computador objComputador; // asociacion!!!! ojo

    public Persona() {
    }

    public Persona(String nombre, String apellido, String cedula, String direccion, Computador objComputador) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        this.objComputador = objComputador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Computador getObjComputador() {
        return objComputador;
    }

    public void setObjComputador(Computador objComputador) {
        this.objComputador = objComputador;
    }
    
    
    
}
