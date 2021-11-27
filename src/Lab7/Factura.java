/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab7;

/**
 *
 * @author jrgir
 */
public class Factura {
    
    String Juego;
    int cantidad;
    double precio;

    public Factura(String Juego, int cantidad, double precio) {
        this.Juego = Juego;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getJuego() {
        return Juego;
    }

    public void setJuego(String Juego) {
        this.Juego = Juego;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
}
