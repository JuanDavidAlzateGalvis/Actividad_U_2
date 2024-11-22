/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2.Taller10.Ejercicio3;

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
    
    public void moverse(int velocidadMaxima) {
        System.out.println("El vehículo se mueve a una velocidad máxima de " + velocidadMaxima); }
}
