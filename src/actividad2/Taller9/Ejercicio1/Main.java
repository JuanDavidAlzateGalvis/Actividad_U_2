/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2.Taller9.Ejercicio1;

/**
 *
 * @author juana
 */
public class Main {
    
    public static void main(String[] args) {

        System.out.println("Ejercicio 1");
        System.out.println("");
        
        Persona sergio = new Persona("Uriel Alzate", 34);
        Empleado gerson = new Empleado("Juan Alzate", 30, "Logistica");

        sergio.mostrarDetalles();
        System.out.println("");
        gerson.mostrarDetalles();
        System.out.println("");
    }
}
