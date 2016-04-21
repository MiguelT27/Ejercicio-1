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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Compacto c1=new Compacto (5901,2006,"Chevrolet",19,5);
        Lujo c2=new Lujo (8076,2015,"Audi",118,5);
        Vagoneta c3=new Vagoneta (5426,2006,"Mercedes",150,15);
        Camioneta c4=new Camioneta (3459,2006,"Toyota",109,2,4, 200);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    }
    
}
