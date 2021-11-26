
package Lab7;


public class Usuarios {
    private String usuario;
    private String contraseña;
    private int edad;

    public Usuarios() {
    }

    public Usuarios(String usuario, String contraseña, int edad) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.edad = edad;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "usuario=" + usuario + ", contraseña=" + contraseña + ", edad=" + edad + '}';
    }

}
