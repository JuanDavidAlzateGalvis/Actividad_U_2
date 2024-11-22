/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2.Taller9.Ejercicio2;

/**
 *
 * @author juana
 */
public class Main {
    
    public static void main(String[] args) {

        System.out.println("Ejercicio 2");
        System.out.println("");
        
        Animal pezbetta = new Animal("Pez globo");
        Pez pez = new Pez("Pez globo", "Agua dulce");
        
        pezbetta.mostrarEspecie();
        System.out.println("");
        pez.mostrarEspecie();
    }
}
