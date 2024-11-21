/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2.Taller8.Ejercicio3;

/**
 *
 * @author juana
 */
public class Main {
    
    public static void main(String[] args) {

        Empleado empleado = new Empleado("Angel Noya", 1800000);
        Gerente gerente = new Gerente("Marta Diaz", 4500000, "Operaciones");

        System.out.println("Ejercicio 3");
        System.out.println("");
        empleado.mostrarInformacion();
        System.out.println("");
        gerente.mostrarInformacion();
    }
}
