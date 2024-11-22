/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2.Taller10.Ejercicio2;

/**
 *
 * @author juana
 */
public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("Ejercicio 2");
        System.out.println("");
        
        Vehiculo vehiculo = new Vehiculo("Chevrolet", 140);
        Bicicleta bicicleta = new Bicicleta("Specialized", 50, "Tarmac");

        vehiculo.moverse();
        System.out.println("");
        bicicleta.moverse();
    }
}
