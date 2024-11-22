/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2.Taller9.Ejercicio3;

/**
 *
 * @author juana
 */
public class Animal {
    
    protected String especie;
    private String nutricion;

    public Animal(String especie, String nutricion) {
        this.especie = especie;
        this.nutricion = nutricion;
    }

    public void mostrarEspecie() {
        System.out.println("Especie: " + especie);
        System.out.println("Nutrición: " + nutricion);
    }
}
