package Lab7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AdminUsuarios {

    private ArrayList<Usuarios> listaU = new ArrayList();
    private File archivo = null;

    public AdminUsuarios(String path) {
         archivo = new File(path);
    }

    public ArrayList<Usuarios> getListaU() {
        return listaU;
    }

    public void setListaU(ArrayList<Usuarios> listaU) {
        this.listaU = listaU;
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
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Usuarios u : listaU) {
                bw.write(u.getUsuario() + "/");
                bw.write(u.getContraseña() + "/");
                bw.write(String.valueOf(u.getEdad()));
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
        listaU = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter("/");
                while (sc.hasNext()) {
                    listaU.add(new Usuarios(sc.next(), sc.next(), sc.nextInt())
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }

}
