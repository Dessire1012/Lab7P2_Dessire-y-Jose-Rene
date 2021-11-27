
package Lab7;

import java.util.ArrayList;


public class Compradores extends Usuarios{
    private ArrayList <Accesorios> listaComprados = new ArrayList();
    private int cantidadDinero;

    public Compradores() {
    }

    public Compradores(int cantidadDinero, String usuario, String contraseña, int edad) {
        super(usuario, contraseña, edad);
        this.cantidadDinero = cantidadDinero;
    }

    public ArrayList<Accesorios> getListaComprados() {
        return listaComprados;
    }

    public void setListaComprados(ArrayList<Accesorios> listaComprados) {
        this.listaComprados = listaComprados;
    }
    
    public void addListComprados (Accesorios acc){
        listaComprados.add(acc);
    }

    public int getCantidadDinero() {
        return cantidadDinero;
    }

    public void setCantidadDinero(int cantidadDinero) {
        this.cantidadDinero = cantidadDinero;
    }

    @Override
    public String toString() {
        return "Compradores{" + "listaComprados=" + listaComprados + ", cantidadDinero=" + cantidadDinero + '}';
    }
 
}
