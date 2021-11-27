/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jrgir
 */
public class AdminFactura {

    double total;
    double impuesto;
    double subtototal;

    private ArrayList<Factura> listaFac = new ArrayList();
    private File archivo = null;

    public AdminFactura(String path) {
        archivo = new File(path);
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto() {

        double total = 0;

        for (Factura factura : listaFac) {

            total = total + factura.getPrecio();

        }

        double impuestos = total * 0.15;

        this.impuesto = impuestos;

    }

    public double getSubtototal() {
        return subtototal;
    }

    public void setSubtototal(double subtototal) {
        this.subtototal = subtototal;
    }

    public ArrayList<Factura> getListaFac() {
        return listaFac;
    }

    public void setListaFac(ArrayList<Factura> listaFac) {
        this.listaFac = listaFac;
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
            for (Factura A : listaFac) {
               
                bw.write(A.getJuego() + "/");
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
                
            }
            sc.close();
        }//FIN IF
    }

    public void escribirArchivoR(String nombre, int precio, int cantidad) throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        listaFac.add(new Factura(nombre,cantidad, precio));
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
