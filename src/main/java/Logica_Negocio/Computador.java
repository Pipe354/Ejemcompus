
package Logica_Negocio;


public class Computador {
    
    public String marca,serial,tamaño, color;

    public Computador() {
    }

    public Computador(String marca, String serial, String tamaño, String color) {
        this.marca = marca;
        this.serial = serial;
        this.tamaño = tamaño;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
    
    
}
