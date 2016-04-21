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
public class Lujo extends Auto {
    public int Pasajeros;
    public Lujo(int Serial, int Año, String Marca, int Precio,int Pasajeros) {
        super(Serial, Año, Marca, Precio);
        this.Pasajeros=Pasajeros;
        
    }

    public int getPasajeros() {
        return Pasajeros;
    }

    public void setPasajeros(int Pasajeros) {
        this.Pasajeros = Pasajeros;
    }
    @Override
   public String toString (){
       System.out.println ("Auto de lujo \n");
       return super.toString().concat("Numero de pasajeros "+Pasajeros+".\n");
   }
}
