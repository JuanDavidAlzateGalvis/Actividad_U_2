/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2.Taller8.Ejercicio1;

/**
 *
 * @author juana
 */
public class Vehiculo {
    
    protected String marca;
    protected int velocidadMaxima;

    public Vehiculo(String marca, int velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mostrarDetalles() {
        System.out.println("Marca del vehiculo: " + marca);
        System.out.println("Velocidad maxima: " + velocidadMaxima);
    }
}
