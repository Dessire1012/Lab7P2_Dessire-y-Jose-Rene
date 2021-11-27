package Lab7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AdminAccesorios {

    private ArrayList<Accesorios> listaAcc = new ArrayList();
    private File archivo = null;

    public AdminAccesorios(String path) {
        archivo = new File(path);
    }

    public ArrayList<Accesorios> getListaAcc() {
        return listaAcc;
    }

    public void setListaAcc(ArrayList<Accesorios> listaAcc) {
        this.listaAcc = listaAcc;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            for (Accesorios A : listaAcc) {
                bw.write(String.valueOf(A.getID()) + "/");
                bw.write(A.getNombre() + "/");
                bw.write(String.valueOf(A.getPrecio()) + "/");
                bw.write(String.valueOf(A.getCantidad()));
                bw.newLine();
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    //Leer
    public void leerArchivo() {
        Scanner sc = null;
        listaAcc = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(",");
                while (sc.hasNext()) {
                    listaAcc.add(new Accesorios(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt())
                );
                }
            } catch (Exception ex) {
                 ex.printStackTrace();
            }
            sc.close();
        }//FIN IF
    }

    public void escribirArchivoR(int ID, String nombre, int precio, int cantidad) throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        listaAcc.add(new Accesorios(ID, nombre, precio, cantidad));
        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
           
            bw.write(String.valueOf(ID) + ",");
            bw.write(nombre + ",");
            bw.write(String.valueOf(precio) + ",");
            bw.write(String.valueOf(cantidad)+ ",");
            bw.newLine(); 
            

            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

}
