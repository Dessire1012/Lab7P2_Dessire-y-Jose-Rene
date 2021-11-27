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
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Gui extends javax.swing.JFrame {

    /**
     * Creates new form Gui
     */
    public Gui() throws IOException {
        initComponents();
        int dinero;
        dinero = (int) (Math.random() * (8000 - 1000) + 1000);

        usuarios.add(new Admin("Luisillo", "No", 20));
        usuarios.add(new Compradores(dinero, "Latesito", "Sheesh", 20));

        adminU.setListaU(usuarios);
        adminU.escribirArchivo();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegistroFrame = new javax.swing.JFrame();
        RegisterFrame = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        nombreTxtResgister = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        EdadFormatedTxtRegister = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        UsernametxtRegister = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        PasswordtxtRegister = new javax.swing.JTextField();
        BotonREgistrarseRegistrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        BotonRegistrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TextoUsername = new javax.swing.JTextField();
        TextoPassWord = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel5.setText("Registrarse");

        nombreTxtResgister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTxtResgisterActionPerformed(evt);
            }
        });

        jLabel6.setText("Nombre");

        EdadFormatedTxtRegister.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        jLabel7.setText("Edad");

        jLabel8.setText("Username:");

        jLabel9.setText("Password");

        BotonREgistrarseRegistrar.setText("Registrarse");
        BotonREgistrarseRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonREgistrarseRegistrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(PasswordtxtRegister))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(27, 27, 27)
                                .addComponent(nombreTxtResgister)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel7)
                                .addGap(32, 32, 32))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(EdadFormatedTxtRegister, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(UsernametxtRegister)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 137, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(BotonREgistrarseRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nombreTxtResgister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(UsernametxtRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EdadFormatedTxtRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(PasswordtxtRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(BotonREgistrarseRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout RegisterFrameLayout = new javax.swing.GroupLayout(RegisterFrame);
        RegisterFrame.setLayout(RegisterFrameLayout);
        RegisterFrameLayout.setHorizontalGroup(
            RegisterFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        RegisterFrameLayout.setVerticalGroup(
            RegisterFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout RegistroFrameLayout = new javax.swing.GroupLayout(RegistroFrame.getContentPane());
        RegistroFrame.getContentPane().setLayout(RegistroFrameLayout);
        RegistroFrameLayout.setHorizontalGroup(
            RegistroFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 464, Short.MAX_VALUE)
            .addGroup(RegistroFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(RegistroFrameLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(RegisterFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        RegistroFrameLayout.setVerticalGroup(
            RegistroFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 405, Short.MAX_VALUE)
            .addGroup(RegistroFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(RegistroFrameLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(RegisterFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setText("Login");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("¿No tienes una cuenta?");

        BotonRegistrar.setText("¡Registrate Aqui!");
        BotonRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRegistrarMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setText("Login");

        TextoUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoUsernameActionPerformed(evt);
            }
        });

        TextoPassWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoPassWordActionPerformed(evt);
            }
        });

        jLabel2.setText("Username:");

        jLabel3.setText("Password:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonRegistrar)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TextoUsername)
                                .addComponent(TextoPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonRegistrar)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        String username = TextoUsername.getText();
        String pass = TextoPassWord.getText();

        for (Usuarios u : adminU.getListaU()) {
            if (username.equals(u.getUsuario()) && pass.equals(u.getContraseña())) {
                JOptionPane.showMessageDialog(this, "Usuario encontrado");

                if (u instanceof Compradores) {
                    ing.add(u);
                    Ingreso.escribirArchivo(ing);
                    CompradorGui Cg = new CompradorGui();
                    Cg.pack();// aparece con el tamano de los botones
                    Cg.setLocationRelativeTo(this);//es para centrar la ventana emergente con la anterior
                    Cg.setVisible(true);
                }

                if (u instanceof Admin) {
                    Ag.pack();// aparece con el tamano de los botones
                    Ag.setLocationRelativeTo(this);//es para centrar la ventana emergente con la anterior
                    Ag.setVisible(true);
                    
                }
            }
        }

    }//GEN-LAST:event_jButton1MouseClicked

    private void BotonRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegistrarMouseClicked
        RegistroFrame.pack();
        RegistroFrame.setLocationRelativeTo(this);
        RegistroFrame.setVisible(true);

    }//GEN-LAST:event_BotonRegistrarMouseClicked

    private void TextoUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoUsernameActionPerformed

    private void TextoPassWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoPassWordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoPassWordActionPerformed

    private void nombreTxtResgisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTxtResgisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTxtResgisterActionPerformed

    private void NombreTxtModificarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreTxtModificarAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreTxtModificarAdminActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        File acce = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            acce = new File("./Accesorios.txt");
            fw = new FileWriter(acce, true);
            bw = new BufferedWriter(fw);
            int ID = 0;
            String nombre = "";
            int precio = 0;
            int cantidad = 0;

            bw.flush();
        } catch (Exception ex) {
        }
        try {
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3MouseClicked


    private void BotonREgistrarseRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonREgistrarseRegistrarMouseClicked
        String pass = PasswordtxtRegister.getText();
        String Username = UsernametxtRegister.getText();
        int edad = Integer.parseInt(EdadFormatedTxtRegister.getText());
        boolean Encontrado = false;
        int dinero;
        dinero = (int) (Math.random() * (8000 - 1000) + 1000);

        for (Usuarios u : adminU.getListaU()) {
            if ((!Username.equals(u.getUsuario())) && (!pass.equals(u.getContraseña()))) {
                Encontrado = true;
            }
        }

        if (Encontrado == false) {
            JOptionPane.showMessageDialog(this, "El Usuario");
        } else {
            try {
                adminU.escribirArchivoR(dinero,Username, pass, edad);
            } catch (IOException ex) {
                Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this, "Usuario creado");

            RegistroFrame.setVisible(false);
            CompradorGui Cg = new CompradorGui();
            Cg.pack();// aparece con el tamano de los botones
            Cg.setLocationRelativeTo(this);//es para centrar la ventana emergente con la anterior
            Cg.setVisible(true);
        }
    }//GEN-LAST:event_BotonREgistrarseRegistrarMouseClicked

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
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Gui().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonREgistrarseRegistrar;
    private javax.swing.JButton BotonRegistrar;
    private javax.swing.JFormattedTextField EdadFormatedTxtRegister;
    private javax.swing.JTextField PasswordtxtRegister;
    private javax.swing.JPanel RegisterFrame;
    private javax.swing.JFrame RegistroFrame;
    private javax.swing.JTextField TextoPassWord;
    private javax.swing.JTextField TextoUsername;
    private javax.swing.JTextField UsernametxtRegister;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nombreTxtResgister;
    // End of variables declaration//GEN-END:variables
  ArrayList<Usuarios> usuarios = new ArrayList();
    AdminUsuarios adminU = new AdminUsuarios("./Usuarios.txt");
    AdminGui Ag = new AdminGui();
    ArrayList<Usuarios> ing = new ArrayList();
    AdminUsuarios Ingreso = new AdminUsuarios("./Ingreso");
}
