/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2.Taller8.Ejercicio1;

/**
 *
 * @author juana
 */
public class Coche extends Vehiculo {

    protected int numeroDePuertas;

    public Coche(String marca, int velocidadMaxima, int numeroDePuertas) {
        super(marca, velocidadMaxima);
        this.numeroDePuertas = numeroDePuertas;
    }
    
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Numero de puertas: " + numeroDePuertas);
    }
}
