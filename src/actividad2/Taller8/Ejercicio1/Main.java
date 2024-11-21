/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2.Taller8.Ejercicio1;

/**
 *
 * @author juana
 */
public class Main {
    
    public static void main(String[] args) {

        Vehiculo vehiculo = new Vehiculo("Mazda", 220);
        Coche coche = new Coche("Chevrolet", 160, 6);

        System.out.println("Ejercicio 1");
        System.out.println("");
        vehiculo.mostrarDetalles();
        System.out.println("");
        coche.mostrarDetalles();
    }
}
