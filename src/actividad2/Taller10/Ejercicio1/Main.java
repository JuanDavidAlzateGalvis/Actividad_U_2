/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2.Taller10.Ejercicio1;

/**
 *
 * @author juana
 */
public class Main {
    
    public static void main(String[] args) {

        System.out.println("Ejercicio 1");
        System.out.println("");
        
        Persona persona = new Persona("Juan Alzate", 20);
        Estudiante estudiante = new Estudiante("Valentina zuniga", 24, "B4089");
        Profesor profesor = new Profesor("Jhon Arrieta", 66, "Programacion Orientada a Objetos");

        persona.presentarse();
        System.out.println("");
        estudiante.presentarse();
        System.out.println("");
        profesor.presentarse();
    }
}
