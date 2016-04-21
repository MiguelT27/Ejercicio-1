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
public class Camioneta extends Auto {
        public int Ejes;
        public int Rodadas;
        public int Carga; 
    public Camioneta(int Serial, int Año, String Marca, int Precio,int Ejes,int Rodadas, int capaCarga) {
        super(Serial, Año, Marca, Precio);
        this.Ejes=Ejes;
        this.Rodadas=Rodadas;
        this.Carga = capaCarga;
        
    }

    public int getEjes() {
        return Ejes;
    }

    public void setEjes(int Ejes) {
        this.Ejes = Ejes;
    }

    public int getRodadas() {
        return Rodadas;
    }

    public void setRodadas(int Rodadas) {
        this.Rodadas = Rodadas;
    }
    
    
    @Override
   public String toString (){
       System.out.println ("Camioneta \n");
       return super.toString().concat("Ejes: "+Ejes+".\nRodadas: "+Rodadas+".\nCapacidad de Carga: "+Carga+".\n");
   }
}
