/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jrgir
 */
public class CompradorGui extends javax.swing.JFrame {

    /**
     * Creates new form CompradorGui
     */
    public CompradorGui() {
        initComponents();
        AdminUsuarios Ingreso = new AdminUsuarios("./Ingreso");
        Ingreso.leerArchivo();
        NombrelabelComprador1.setText(Ingreso.getListaU().get(0).getUsuario());
        DineroRestanteComprador.setText(String.valueOf(dinero));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CompradorPanel = new javax.swing.JPanel();
        CompradorLabel = new javax.swing.JLabel();
        NombrelabelComprador1 = new javax.swing.JLabel();
        BotonLogOut1 = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaComprar = new javax.swing.JTable();
        ComprarComprador = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaComprado = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        DineroRestanteComprador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CompradorLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        CompradorLabel.setText("Comprador:");

        NombrelabelComprador1.setText("\"NombreComprador\"");

        BotonLogOut1.setText("Log Out");
        BotonLogOut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLogOut1ActionPerformed(evt);
            }
        });

        jTabbedPane2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTabbedPane2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane2StateChanged(evt);
            }
        });

        TablaComprar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Accesorio", "Precio", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TablaComprar);

        ComprarComprador.setText("Comprar");
        ComprarComprador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComprarCompradorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(ComprarComprador, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ComprarComprador, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Comprar", jPanel7);

        TablaComprado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Accesorio", "Precio", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(TablaComprado);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane2.addTab("Comprado", jPanel8);

        jLabel19.setText("Dinero Restante:");

        DineroRestanteComprador.setText("\"DineroRestante\"");

        javax.swing.GroupLayout CompradorPanelLayout = new javax.swing.GroupLayout(CompradorPanel);
        CompradorPanel.setLayout(CompradorPanelLayout);
        CompradorPanelLayout.setHorizontalGroup(
            CompradorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CompradorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CompradorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(NombrelabelComprador1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonLogOut1)
                .addContainerGap())
            .addComponent(jTabbedPane2)
            .addGroup(CompradorPanelLayout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jLabel19)
                .addGap(130, 130, 130)
                .addComponent(DineroRestanteComprador)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CompradorPanelLayout.setVerticalGroup(
            CompradorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CompradorPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(CompradorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotonLogOut1)
                    .addGroup(CompradorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CompradorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NombrelabelComprador1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(CompradorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(DineroRestanteComprador))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 672, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(CompradorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(CompradorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane2StateChanged
        DefaultTableModel modelo
                = (DefaultTableModel) TablaComprar.getModel();
        modelo.setRowCount(0);

        AdminAcc.leerArchivo();

        for (Accesorios a : AdminAcc.getListaAcc()) {
            Object[] newrow = {a.getID(),
                a.getNombre(),
                a.getPrecio(),
                a.getCantidad()};

            modelo.addRow(newrow);
        }
        DefaultTableModel modelocomprado
                = (DefaultTableModel) TablaComprado.getModel();
        modelocomprado.setRowCount(0);

        for (Accesorios acce : acces) {
            
            Object[] newrow = {acce.getID(),
                acce.getNombre(),
                acce.getPrecio(),
                acce.getCantidad()};
              modelocomprado.addRow(newrow);
        }

    }//GEN-LAST:event_jTabbedPane2StateChanged

    private void ComprarCompradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComprarCompradorMouseClicked
        if (TablaComprar.getSelectedRow() >= 0) {
            DefaultTableModel modelo
                    = (DefaultTableModel) TablaComprar.getModel();

            int Id = (int) (TablaComprar.getValueAt(TablaComprar.getSelectedRow(), 0));
            String juego = (String) (TablaComprar.getValueAt(TablaComprar.getSelectedRow(), 1));
            int precio = (int) (TablaComprar.getValueAt(TablaComprar.getSelectedRow(), 2));
            int cant = (int) (TablaComprar.getValueAt(TablaComprar.getSelectedRow(), 3));

            Accesorios a = new Accesorios(Id, juego, precio, cant);
            
            acces.add(a);
            
            modelo.removeRow(TablaComprar.getSelectedRow());
            TablaComprar.setModel(modelo);

        }
    }//GEN-LAST:event_ComprarCompradorMouseClicked

    private void BotonLogOut1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLogOut1ActionPerformed
        // TODO add your handling code here:
        
        for (Accesorios acce : acces) {
            
            String name= acce.getNombre();
            int price = acce.getPrecio();
            int cant = acce.getCantidad();
            
            try {
                Fac.escribirArchivoR(name, price, cant);
            } catch (IOException ex) {
                Logger.getLogger(CompradorGui.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
   
     
        try {
            Gui gui= new Gui();
            gui.setVisible(true);
               this.setVisible(false);
            
        } catch (IOException ex) {
            Logger.getLogger(CompradorGui.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_BotonLogOut1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CompradorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompradorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompradorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompradorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CompradorGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonLogOut1;
    private javax.swing.JLabel CompradorLabel;
    private javax.swing.JPanel CompradorPanel;
    private javax.swing.JButton ComprarComprador;
    private javax.swing.JLabel DineroRestanteComprador;
    private javax.swing.JLabel NombrelabelComprador1;
    private javax.swing.JTable TablaComprado;
    private javax.swing.JTable TablaComprar;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables
  AdminAccesorios AdminAcc = new AdminAccesorios("./Accesorios.txt");
    ArrayList<Accesorios> acces = new ArrayList();
    double dinero = (int) (Math.random() * (8000 - 1000) + 1000);
    AdminFactura Fac= new AdminFactura("./Factura.txt");

}
