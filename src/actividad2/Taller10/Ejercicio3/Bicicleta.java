/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2.Taller10.Ejercicio3;

/**
 *
 * @author juana
 */
public class Bicicleta extends Vehiculo {
    
    protected String modelo;
    
    public Bicicleta(String marca, int velocidadMaxima, String modelo) {
        super(marca, velocidadMaxima);
        this.modelo = modelo;
    }
    
    // @Override
    public void moverse() {
        System.out.println("La bicicleta se mueve.");
    }
}
