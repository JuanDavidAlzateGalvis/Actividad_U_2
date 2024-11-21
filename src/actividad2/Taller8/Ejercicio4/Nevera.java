/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2.Taller8.Ejercicio4;

/**
 *
 * @author juana
 */
public class Nevera extends Electrodomestico {

    protected String modelo;

    public Nevera(String tipo, int stock, String modelo) {
        super(tipo, stock);
        this.modelo = modelo;
    }
    
    @Override
    public void mostrarInformacion() { 
        super.mostrarInformacion();
        System.out.println("Modelo: " + modelo);
    }
}
