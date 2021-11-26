
package Lab7;


public class Accesorios {
    private int ID;
    private String nombre;
    private int precio;
    private int cantidad;

    public Accesorios(int ID, String nombre, int precio, int cantidad) {
        this.ID = ID;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Accesorios() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Accesorios{" + "ID=" + ID + ", nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + '}';
    }
    
    
}
