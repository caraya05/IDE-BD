/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.vista;

import com.carlos.controlador.CargueCrearUsuario;
import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Carlos A. Amaya C.
 */
public class CrearUsuarioOracle extends javax.swing.JFrame {

    /**
     * Creates new form CrearUsuario
     */
    public CrearUsuarioOracle() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/com/carlos/imagenes/sql.png")).getImage());
        Crear_Jboton.setIcon(setIcono("/com/carlos/imagenes/mas.png", Crear_Jboton));
        Eliminar_Jboton.setIcon(setIcono("/com/carlos/imagenes/menos.png", Eliminar_Jboton));
    }

    public boolean ContraseñaVerificada() {
        if (Contraseña_Jtext.getText().equals(CContraseña_Jtext.getText())) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<String> roles() {
        ArrayList<String> checkbox = new ArrayList<>();
        if (Connect_Jcheck.isSelected() == true) {
            checkbox.add(Connect_Jcheck.getText());
        }
        if (Resource_Jcheck.isSelected() == true) {
            checkbox.add(Resource_Jcheck.getText());
        }
        if (Dba_Jcheck.isSelected() == true) {
            checkbox.add(Dba_Jcheck.getText());
        }
        return checkbox;
    }

    public void limpiar() {
        Usuario_Jtext.setText("");
        Contraseña_Jtext.setText("");
        CContraseña_Jtext.setText("");
        Connect_Jcheck.setSelected(false);
        Resource_Jcheck.setSelected(false);
        Dba_Jcheck.setSelected(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Usuario_Jtext = new javax.swing.JTextField();
        Usuario_Jlabel = new javax.swing.JLabel();
        Constraseña_Jlabel = new javax.swing.JLabel();
        ROracle_Jpanel = new javax.swing.JPanel();
        Connect_Jcheck = new javax.swing.JCheckBox();
        Resource_Jcheck = new javax.swing.JCheckBox();
        Dba_Jcheck = new javax.swing.JCheckBox();
        Crear_Jboton = new javax.swing.JButton();
        Eliminar_Jboton = new javax.swing.JButton();
        CConstraseña_Jlabel = new javax.swing.JLabel();
        Contraseña_Jtext = new javax.swing.JPasswordField();
        CContraseña_Jtext = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Crear Usuario");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);
        setName("CrearUsuario"); // NOI18N
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        Usuario_Jtext.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N

        Usuario_Jlabel.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        Usuario_Jlabel.setText("Usuario");

        Constraseña_Jlabel.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        Constraseña_Jlabel.setText("Contraseña");

        ROracle_Jpanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Roles", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Microsoft Tai Le", 0, 14))); // NOI18N

        Connect_Jcheck.setFont(new java.awt.Font("Microsoft Tai Le", 0, 12)); // NOI18N
        Connect_Jcheck.setText("CONNECT");
        Connect_Jcheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Connect_JcheckActionPerformed(evt);
            }
        });

        Resource_Jcheck.setFont(new java.awt.Font("Microsoft Tai Le", 0, 12)); // NOI18N
        Resource_Jcheck.setText("RESOURCE");
        Resource_Jcheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Resource_JcheckActionPerformed(evt);
            }
        });

        Dba_Jcheck.setFont(new java.awt.Font("Microsoft Tai Le", 0, 12)); // NOI18N
        Dba_Jcheck.setText("DBA  ");

        javax.swing.GroupLayout ROracle_JpanelLayout = new javax.swing.GroupLayout(ROracle_Jpanel);
        ROracle_Jpanel.setLayout(ROracle_JpanelLayout);
        ROracle_JpanelLayout.setHorizontalGroup(
            ROracle_JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ROracle_JpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ROracle_JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Dba_Jcheck)
                    .addComponent(Resource_Jcheck)
                    .addComponent(Connect_Jcheck))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ROracle_JpanelLayout.setVerticalGroup(
            ROracle_JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ROracle_JpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Connect_Jcheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Resource_Jcheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Dba_Jcheck)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        Crear_Jboton.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        Crear_Jboton.setText("Crear");
        Crear_Jboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Crear_JbotonActionPerformed(evt);
            }
        });

        Eliminar_Jboton.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        Eliminar_Jboton.setText("Eliminar");
        Eliminar_Jboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar_JbotonActionPerformed(evt);
            }
        });

        CConstraseña_Jlabel.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        CConstraseña_Jlabel.setText("Confirmar Contraseña");

        Contraseña_Jtext.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Constraseña_Jlabel)
                                    .addComponent(Usuario_Jlabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Usuario_Jtext, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(Contraseña_Jtext))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Crear_Jboton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Eliminar_Jboton)
                                .addGap(40, 40, 40))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CConstraseña_Jlabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CContraseña_Jtext, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)))
                .addComponent(ROracle_Jpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Usuario_Jlabel)
                            .addComponent(Usuario_Jtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Constraseña_Jlabel)
                            .addComponent(Contraseña_Jtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CConstraseña_Jlabel)
                            .addComponent(CContraseña_Jtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Crear_Jboton)
                            .addComponent(Eliminar_Jboton)))
                    .addComponent(ROracle_Jpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Resource_JcheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Resource_JcheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Resource_JcheckActionPerformed

    private void Connect_JcheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Connect_JcheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Connect_JcheckActionPerformed

    private void Crear_JbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Crear_JbotonActionPerformed
        // TODO add your handling code here:7
        String resul = null;
        if (ContraseñaVerificada() == true) {
            resul = CargueCrearUsuario.crearOracle(Usuario_Jtext.getText(), CContraseña_Jtext.getText(), roles());
        } else {
            JOptionPane.showMessageDialog(rootPane, "No coinciden las contraseñas", "ERROR", 2);
        }
        try {
            if (resul.equals("true")) {
                JOptionPane.showMessageDialog(rootPane, " Creado Exitosamente " + Usuario_Jtext.getText(), "INFORMACION", 1);
                limpiar();
            } else {
                JOptionPane.showMessageDialog(rootPane, resul, "ERROR", 2);
            }
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_Crear_JbotonActionPerformed

    private void Eliminar_JbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar_JbotonActionPerformed
        // TODO add your handling code here:
        String resul = CargueCrearUsuario.eliminarOracle(Usuario_Jtext.getText());
        if (resul.equals("true")) {
            JOptionPane.showMessageDialog(rootPane, " Borrado Exitosamente " + Usuario_Jtext.getText(), "INFORMACION", 1);
            limpiar();
        } else {
            JOptionPane.showMessageDialog(rootPane, resul, "ERROR", 2);
        }
    }//GEN-LAST:event_Eliminar_JbotonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(CrearUsuarioOracle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CrearUsuarioOracle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CrearUsuarioOracle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CrearUsuarioOracle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch (UnsupportedLookAndFeelException e) {

        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearUsuarioOracle().setVisible(true);
            }
        });
    }

    public Icon setIcono(String url, JButton boton) {
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING));
        return icono;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CConstraseña_Jlabel;
    private javax.swing.JPasswordField CContraseña_Jtext;
    private javax.swing.JCheckBox Connect_Jcheck;
    private javax.swing.JLabel Constraseña_Jlabel;
    private javax.swing.JPasswordField Contraseña_Jtext;
    private javax.swing.JButton Crear_Jboton;
    private javax.swing.JCheckBox Dba_Jcheck;
    private javax.swing.JButton Eliminar_Jboton;
    private javax.swing.JPanel ROracle_Jpanel;
    private javax.swing.JCheckBox Resource_Jcheck;
    private javax.swing.JLabel Usuario_Jlabel;
    private javax.swing.JTextField Usuario_Jtext;
    // End of variables declaration//GEN-END:variables
}