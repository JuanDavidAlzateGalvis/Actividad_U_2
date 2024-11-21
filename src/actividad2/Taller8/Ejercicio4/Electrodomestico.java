/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2.Taller8.Ejercicio4;

/**
 *
 * @author juana
 */
public class Electrodomestico {
    
    protected String tipo;
    private int stock;

    public Electrodomestico(String tipo, int stock) {
        this.tipo = tipo;
        this.stock = stock;
    }

    public void mostrarInformacion() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Stock: " + stock);
    }
}
