/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author inteldemo
 */
public class Auto {
    public int Serial;
    public int Año;
    public String Marca;
    public int Precio;

    public Auto(int Serial, int Año, String Marca, int Precio) {
        this.Serial = Serial;
        this.Año = Año;
        this.Marca = Marca;
        this.Precio = Precio;
    }

    public int getSerial() {
        return Serial;
    }

    public void setSerial(int Serial) {
        this.Serial = Serial;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }
    @Override
    public String toString (){
        String mensaje="Serial: "+Serial+". \nAño: "+Año+".\nMarca: "+Marca+". \nPrecio(en millones): "+Precio+".\n";
        return mensaje;
    }
}
