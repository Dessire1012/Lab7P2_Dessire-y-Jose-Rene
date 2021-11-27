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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author jrgir
 */
public class AdminFactura {

    double total;
    double subtototal;

    private ArrayList<Factura> listaFac = new ArrayList();
    private File archivo = null;

    public AdminFactura(String path) {
        archivo = new File(path);
    }

    public double getTotal() {
        return total;
    }

    public double setTotal() {

        double totale = 0;
        totale = setImpuesto() + setSubtototal();
        return totale;
    }

    public double getImpuesto() {
        return setImpuesto();
    }

    public double setImpuesto() {

        double total = 0;

        for (Factura factura : listaFac) {

            total = total + factura.getPrecio();

        }

        double impuestos = total * 0.15;

        return impuestos;

    }

    public double getSubtototal() {
        return setSubtototal();
    }

    public double setSubtototal() {
        double total = 0;

        for (Factura factura : listaFac) {

            total = total + factura.getPrecio();

        }

        double Subtotal = total;

        return Subtotal;
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

                bw.write(A.getJuego() + "\n");
                bw.write(String.valueOf(A.getPrecio()) + "\n");
                bw.write(String.valueOf(A.getCantidad()) + "\n");
                bw.write("Subtotal:" + String.valueOf(setSubtototal()) + "\n");
                bw.write("Impuesto:" + String.valueOf(setImpuesto()) + "\n");
                bw.write("Total:" + String.valueOf(setTotal()) + "\n");

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
        listaFac = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(",");
                while (sc.hasNext()) {
                    listaFac.add(new Factura(sc.next(), sc.nextInt(), sc.nextInt())
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
        listaFac.add(new Factura(nombre, cantidad, precio));
        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            bw.write("Accesorios Nintendo\n");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

            String fechaComoCadena = sdf.format(new Date());
            bw.write("Factura\t" + fechaComoCadena + "\n");

            bw.write(nombre + "\t");
            bw.write(String.valueOf(precio) + "\t");
            bw.write(String.valueOf(cantidad) + "\n");
            bw.write("Subtotal:" + String.valueOf(setSubtototal()) + "\n");
            bw.write("Impuesto:" + String.valueOf(setImpuesto()) + "\n");
            bw.write("Total:" + String.valueOf(setTotal()) + "\n");
            bw.newLine();

            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

}
