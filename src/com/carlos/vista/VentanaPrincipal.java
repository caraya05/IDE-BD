/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.vista;

import com.carlos.controlador.*;
import com.formdev.flatlaf.FlatIntelliJLaf;

import javax.swing.*;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author carli
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form Ventana_Principal
     *
     *
     */
    public VentanaPrincipal() {
        initComponents();

//        Navegacion_Jtree.setModel(new javax.swing.tree.DefaultTreeModel(CargueVentanaPrincipal.cargue_navegacion()));
//        Navegacion_Jscroll.setViewportView(Navegacion_Jtree);
        Correr_Jboton.setIcon(setIcono("/com/carlos/imagenes/correr.png", Correr_Jboton));
        Limpiar_Jboton.setIcon(setIcono("/com/carlos/imagenes/limpiar.png", Limpiar_Jboton));
        Guardar_Jboton.setIcon(setIcono("/com/carlos/imagenes/guardar.png", Guardar_Jboton));
        Abrir_Jboton.setIcon(setIcono("/com/carlos/imagenes/carpeta.png", Abrir_Jboton));
        Copiar_Jboton.setIcon(setIcono("/com/carlos/imagenes/copiar.png", Copiar_Jboton));
        Refrescar_Jboton.setIcon(setIcono("/com/carlos/imagenes/actualizar.png", Refrescar_Jboton));
        Crear_Jboton.setIcon(setIcono("/com/carlos/imagenes/crear.png", Crear_Jboton));
        Cambiar_Jboton.setIcon(setIcono("/com/carlos/imagenes/cambio.png", Cambiar_Jboton));
        setIconImage(new ImageIcon(getClass().getResource("/com/carlos/imagenes/sql.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public static String abrir_archivo() {

        String aux = "";
        String texto = "";
        try {
            JFileChooser archivo = new JFileChooser();
            archivo.setDialogTitle("Abrir");
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo SQL (.sql)", "sql");
            archivo.setFileFilter(filtro);
            archivo.showOpenDialog(archivo);
            File abre = archivo.getSelectedFile();
            if (abre != null) {
                FileReader archivos = new FileReader(abre);
                BufferedReader lee = new BufferedReader(archivos);
                while ((aux = lee.readLine()) != null) {
                    texto += aux + "\n";
                }
                lee.close();
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex + "" + "\nNo se ha encontrado el archivo", "ADVERTENCIA", 0);
        }
        return texto;
    }

    public static void guardar_archivo(JTextArea Jarea) {
        try {
            String nombre = "";
            JFileChooser archivo = new JFileChooser();
            archivo.setDialogTitle("Guardar");
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo SQL (.sql)", "sql");
            archivo.setFileFilter(filtro);
            archivo.showSaveDialog(archivo);
            File guarda = archivo.getSelectedFile();
            String guardar = null;
            try {
                guardar = "" + guarda.exists();
            } catch (Exception e) {
            }
            if (guardar != null) {
                if (JOptionPane.OK_OPTION == JOptionPane.showConfirmDialog(null, "El archivo existe, deseas reemplazarlo?", "SOBRESCRIBIR", JOptionPane.YES_NO_OPTION)) //Has aceptado...has lo kieras......
                {
                    try (FileWriter save = new FileWriter(guarda)) {
                        save.write(Jarea.getText());
                    }
                    JOptionPane.showMessageDialog(null, " Guardado Exitosamente", "INFORMACION", 1);
                } else {
                }
            } else if (guarda != null) {
                try (FileWriter save = new FileWriter(guarda + ".sql")) {
                    save.write(Jarea.getText());
                }
                JOptionPane.showMessageDialog(null, guarda + " guardado Exitosamente", "INFORMACION", 1);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "No se puedo guardar", "ADVERTENCIA", 0);
        }
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Crear_Jboton = new javax.swing.JButton();
        Cambiar_Jboton = new javax.swing.JButton();
        Codigo_Jpanel = new javax.swing.JPanel();
        Codigo_Jtabbed = new javax.swing.JTabbedPane();
        Sql_Jpanel = new javax.swing.JPanel();
        Sql_Jscroll = new javax.swing.JScrollPane();
        Sql_Jarea = new javax.swing.JTextArea();
        Procedimental_Jpanel = new javax.swing.JPanel();
        Procedimental_Jscroll = new javax.swing.JScrollPane();
        Procedimental_Jarea = new javax.swing.JTextArea();
        DDL_Jpanel = new javax.swing.JPanel();
        DDL_Jscroll = new javax.swing.JScrollPane();
        DDL_Jarea = new javax.swing.JTextArea();
        Guardar_Jboton = new javax.swing.JButton();
        Abrir_Jboton = new javax.swing.JButton();
        Correr_Jboton = new javax.swing.JButton();
        Limpiar_Jboton = new javax.swing.JButton();
        Copiar_Jboton = new javax.swing.JButton();
        Navegacion_Jboton = new javax.swing.JPanel();
        Navegacion_Jscroll = new javax.swing.JScrollPane();
        Navegacion_Jtree = new javax.swing.JTree();
        Refrescar_Jboton = new javax.swing.JButton();
        Resultado_Jpanel = new javax.swing.JPanel();
        Resultado_Jscroll = new javax.swing.JScrollPane();
        Resultado_Jtable = new javax.swing.JTable();
        Consola_Jpanel = new javax.swing.JPanel();
        Consola_Jscroll = new javax.swing.JScrollPane();
        Consola_Jarea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(//"[ Motor :"+com.carlos.vista.LoginUsuarios.Motores_Jbox.getSelectedItem()+
            //" - Usuario: "+com.carlos.vista.LoginUsuarios.Usuario_Jtext.getText()+
            //" - IP: "+com.carlos.vista.LoginUsuarios.IP_Jtext.getText()+
            //" - Sesion y/o DataBase: "+com.carlos.vista.LoginUsuarios.Instancia_Jtext.getText()+" - "+
            //com.carlos.vista.LoginUsuarios.Base_datos_Jtext.getText()+" ]");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N

        Crear_Jboton.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        Crear_Jboton.setText("Crear Usuario");
        Crear_Jboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Crear_JbotonActionPerformed(evt);
            }
        });

        Cambiar_Jboton.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        Cambiar_Jboton.setText("Cambiar Usuario");
        Cambiar_Jboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cambiar_JbotonActionPerformed(evt);
            }
        });

        Codigo_Jpanel.setBackground(new java.awt.Color(255, 255, 255));
        Codigo_Jpanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Codigo_Jtabbed.setBackground(new java.awt.Color(255, 255, 255));
        Codigo_Jtabbed.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        Codigo_Jtabbed.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Codigo_Jtabbed.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N

        Sql_Jpanel.setLayout(new javax.swing.OverlayLayout(Sql_Jpanel));

        Sql_Jarea.setColumns(20);
        Sql_Jarea.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        Sql_Jarea.setRows(5);
        Sql_Jscroll.setViewportView(Sql_Jarea);

        Sql_Jpanel.add(Sql_Jscroll);

        Codigo_Jtabbed.addTab("SQL", Sql_Jpanel);

        Procedimental_Jpanel.setLayout(new javax.swing.OverlayLayout(Procedimental_Jpanel));

        Procedimental_Jarea.setColumns(20);
        Procedimental_Jarea.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        Procedimental_Jarea.setRows(5);
        Procedimental_Jscroll.setViewportView(Procedimental_Jarea);

        Procedimental_Jpanel.add(Procedimental_Jscroll);

        Codigo_Jtabbed.addTab("PLSQL - TSQL - PGSQL ", Procedimental_Jpanel);

        DDL_Jpanel.setPreferredSize(new java.awt.Dimension(254, 96));
        DDL_Jpanel.setLayout(new javax.swing.OverlayLayout(DDL_Jpanel));

        DDL_Jscroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        DDL_Jscroll.setPreferredSize(new java.awt.Dimension(254, 96));
        DDL_Jscroll.setRowHeaderView(null);

        DDL_Jarea.setColumns(20);
        DDL_Jarea.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        DDL_Jarea.setRows(5);
        DDL_Jscroll.setViewportView(DDL_Jarea);

        DDL_Jpanel.add(DDL_Jscroll);

        Codigo_Jtabbed.addTab("DDL", DDL_Jpanel);

        Guardar_Jboton.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        Guardar_Jboton.setText("Guardar");
        Guardar_Jboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Guardar_JbotonActionPerformed(evt);
            }
        });

        Abrir_Jboton.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        Abrir_Jboton.setText("Abrir");
        Abrir_Jboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Abrir_JbotonActionPerformed(evt);
            }
        });

        Correr_Jboton.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        Correr_Jboton.setText("Correr");
        Correr_Jboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Correr_JbotonActionPerformed(evt);
            }
        });

        Limpiar_Jboton.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        Limpiar_Jboton.setText("Limpiar");
        Limpiar_Jboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Limpiar_JbotonActionPerformed(evt);
            }
        });

        Copiar_Jboton.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        Copiar_Jboton.setText("Copiar BD");
        Copiar_Jboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Copiar_JbotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Codigo_JpanelLayout = new javax.swing.GroupLayout(Codigo_Jpanel);
        Codigo_Jpanel.setLayout(Codigo_JpanelLayout);
        Codigo_JpanelLayout.setHorizontalGroup(
            Codigo_JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Codigo_Jtabbed)
            .addGroup(Codigo_JpanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(Guardar_Jboton)
                .addGap(35, 35, 35)
                .addComponent(Abrir_Jboton)
                .addGap(35, 35, 35)
                .addComponent(Correr_Jboton)
                .addGap(35, 35, 35)
                .addComponent(Limpiar_Jboton)
                .addGap(35, 35, 35)
                .addComponent(Copiar_Jboton)
                .addContainerGap(157, Short.MAX_VALUE))
        );
        Codigo_JpanelLayout.setVerticalGroup(
            Codigo_JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Codigo_JpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Codigo_JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Codigo_JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Correr_Jboton)
                        .addComponent(Limpiar_Jboton)
                        .addComponent(Copiar_Jboton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Codigo_JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Guardar_Jboton)
                        .addComponent(Abrir_Jboton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Codigo_Jtabbed, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE))
        );

        Navegacion_Jboton.setBackground(new java.awt.Color(255, 255, 255));
        Navegacion_Jboton.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        Navegacion_Jboton.setAutoscrolls(true);

        Navegacion_Jtree.setBorder(null);
        Navegacion_Jtree.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Base de datos");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Tablas");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("1");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Funciones");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("1");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Paquetes");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("1");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Procedimientos");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("1");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Triggers");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("1");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Vistas");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("1");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Roles");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("1");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Usuarios");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("1");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Indices");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("1");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        Navegacion_Jtree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        Navegacion_Jtree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Navegacion_JtreeMouseClicked(evt);
            }
        });
        Navegacion_Jtree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                Navegacion_JtreeValueChanged(evt);
            }
        });
        Navegacion_Jscroll.setViewportView(Navegacion_Jtree);

        Refrescar_Jboton.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        Refrescar_Jboton.setText("Refrescar");
        Refrescar_Jboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Refrescar_JbotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Navegacion_JbotonLayout = new javax.swing.GroupLayout(Navegacion_Jboton);
        Navegacion_Jboton.setLayout(Navegacion_JbotonLayout);
        Navegacion_JbotonLayout.setHorizontalGroup(
            Navegacion_JbotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Navegacion_JbotonLayout.createSequentialGroup()
                .addContainerGap(221, Short.MAX_VALUE)
                .addComponent(Refrescar_Jboton)
                .addContainerGap())
            .addComponent(Navegacion_Jscroll)
        );
        Navegacion_JbotonLayout.setVerticalGroup(
            Navegacion_JbotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Navegacion_JbotonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Refrescar_Jboton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Navegacion_Jscroll))
        );

        Resultado_Jpanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        Resultado_Jpanel.setLayout(new javax.swing.OverlayLayout(Resultado_Jpanel));

        Resultado_Jscroll.setAutoscrolls(true);

        Resultado_Jtable.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        Resultado_Jtable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        Resultado_Jtable.setCellSelectionEnabled(true);
        Resultado_Jtable.setEnabled(false);
        Resultado_Jtable.setFocusable(false);
        Resultado_Jtable.setGridColor(new java.awt.Color(238, 238, 238));
        Resultado_Jtable.setName(""); // NOI18N
        Resultado_Jtable.setShowHorizontalLines(true);
        Resultado_Jscroll.setViewportView(Resultado_Jtable);

        Resultado_Jpanel.add(Resultado_Jscroll);

        Consola_Jpanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        Consola_Jpanel.setForeground(java.awt.Color.orange);
        Consola_Jpanel.setLayout(new javax.swing.OverlayLayout(Consola_Jpanel));

        Consola_Jarea.setEditable(false);
        Consola_Jarea.setColumns(20);
        Consola_Jarea.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        Consola_Jarea.setForeground(new java.awt.Color(255, 255, 255));
        Consola_Jarea.setRows(5);
        Consola_Jarea.setDisabledTextColor(new java.awt.Color(35, 35, 42));
        Consola_Jarea.setEnabled(false);
        Consola_Jscroll.setViewportView(Consola_Jarea);

        Consola_Jpanel.add(Consola_Jscroll);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Navegacion_Jboton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Crear_Jboton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cambiar_Jboton)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Codigo_Jpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Resultado_Jpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Consola_Jpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1056, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Crear_Jboton)
                            .addComponent(Cambiar_Jboton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Navegacion_Jboton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Codigo_Jpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Resultado_Jpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(114, 114, 114))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(587, 587, 587)
                    .addComponent(Consola_Jpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(10, 10, 10)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Refrescar_JbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Refrescar_JbotonActionPerformed
        Navegacion_Jtree.setModel(new javax.swing.tree.DefaultTreeModel(CargueVentanaPrincipal.cargue_navegacion()));
        Navegacion_Jscroll.setViewportView(Navegacion_Jtree);
    }//GEN-LAST:event_Refrescar_JbotonActionPerformed

    private void Cambiar_JbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cambiar_JbotonActionPerformed
        String[] botones = {"Aceptar", "Cancelar"};
        int ventana = JOptionPane.showOptionDialog(rootPane, "Desea abandonar " + LoginUsuarios.Motores_Jbox.getSelectedItem(), "ADVERTENCIA", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);
        if (ventana == 0) {
            CargueVentanaPrincipal.cerrar();
            JOptionPane.showMessageDialog(rootPane, "Conexion cerrada con " + LoginUsuarios.Motores_Jbox.getSelectedItem() + " - " + LoginUsuarios.Usuario_Jtext.getText(), "ADVERTENCIA", 2);
            new LoginUsuarios().setVisible(true);
            dispose();
        } else if (ventana == 1) {
        }
    }//GEN-LAST:event_Cambiar_JbotonActionPerformed

    private void Navegacion_JtreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Navegacion_JtreeMouseClicked
        try {
            if (evt.getClickCount() == 2) {
                DefaultMutableTreeNode selec = (DefaultMutableTreeNode) Navegacion_Jtree.getSelectionPath().getLastPathComponent();
                Resultado_Jtable.setModel(Consultar.consulTableModel(selec.getUserObject().toString(), 0));
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Navegacion_JtreeMouseClicked

    private void Navegacion_JtreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_Navegacion_JtreeValueChanged

    }//GEN-LAST:event_Navegacion_JtreeValueChanged

    private void Correr_JbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Correr_JbotonActionPerformed
        // TODO add your handling code here:
        switch (Codigo_Jtabbed.getSelectedIndex()) {
            case 0 -> {
                String consulta = String.valueOf("" + Sql_Jarea.getSelectedText());
                if (consulta.equals("null")) {
                    try {
                        Resultado_Jtable.setModel(Consultar.consulTableModel(Sql_Jarea.getText(), 1));
                    } catch (Exception e) {
                    }
                    Consola_Jarea.setText(Consultar.Error());

                } else if (!consulta.equals("null")) {
                    try {
                        Resultado_Jtable.setModel(Consultar.consulTableModel(Sql_Jarea.getSelectedText(), 1));
                    } catch (Exception e) {
                    }
                    Consola_Jarea.setText(Consultar.Error());
                }

            }
            case 1 -> {
                String resul = "";
                resul = Procedimental.Procedimental(Procedimental_Jarea.getText());
                if (resul.equals("true")) {
                    Consola_Jarea.setText("LLamado terminado");
                } else {
                    Consola_Jarea.setText(resul);
                }
//                try {
//                    Procedimental.consulta(Procedimental_Jarea.getText());
//                } catch (SQLException ex) {
//                    Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
//                }
            }
            case 2 -> {
                String consulta = String.valueOf(DDL_Jarea.getSelectedText());
                String resul = "";
                if (consulta.equals("null")) {
                    try {
                        resul = Insertar.Consulta_CUD(DDL_Jarea.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if (resul.equals("true")) {
                        Consola_Jarea.setText(" fila(s) ejecutada(s)");
                    } else {
                        Consola_Jarea.setText(resul);
                    }
                } else if (!consulta.equals("null")) {
                    try {
                        resul = Insertar.Consulta_CUD(DDL_Jarea.getSelectedText());
                    } catch (SQLException ex) {
                        Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if (resul.equals("true")) {
                        Consola_Jarea.setText(" fila(s) ejecutada(s)");
                    } else {
                        Consola_Jarea.setText(resul);
                    }
                }
            }
        }
    }//GEN-LAST:event_Correr_JbotonActionPerformed

    private void Limpiar_JbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Limpiar_JbotonActionPerformed
        // TODO add your handling code here:
        TableColumnModel modCol = Resultado_Jtable.getColumnModel();
        DefaultTableModel modelo = (DefaultTableModel) Resultado_Jtable.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        while (modCol.getColumnCount() > 0) {
            modCol.removeColumn(modCol.getColumn(0));
        }
        Consola_Jarea.setText("");
        switch (Codigo_Jtabbed.getSelectedIndex()) {
            case 0 -> {
                Sql_Jarea.setText("");
            }
            case 1 -> {
                Procedimental_Jarea.setText("");
            }
            case 2 -> {
                DDL_Jarea.setText("");
            }
        }
    }//GEN-LAST:event_Limpiar_JbotonActionPerformed

    private void Abrir_JbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Abrir_JbotonActionPerformed
        // TODO add your handling code here:
        switch (Codigo_Jtabbed.getSelectedIndex()) {
            case 0 -> {
                Sql_Jarea.setText(abrir_archivo());
            }
            case 1 -> {
                Procedimental_Jarea.setText(abrir_archivo());
            }
            case 2 -> {
                DDL_Jarea.setText(abrir_archivo());
            }
        }
    }//GEN-LAST:event_Abrir_JbotonActionPerformed

    private void Guardar_JbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Guardar_JbotonActionPerformed
        // TODO add your handling code here:
        switch (Codigo_Jtabbed.getSelectedIndex()) {
            case 0 -> {
                guardar_archivo(Sql_Jarea);
            }
            case 1 -> {
                guardar_archivo(Procedimental_Jarea);
            }
            case 2 -> {
                guardar_archivo(DDL_Jarea);
            }
        }
    }//GEN-LAST:event_Guardar_JbotonActionPerformed

    private void Copiar_JbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Copiar_JbotonActionPerformed
        //Sql_Jarea.setText(CargueCopiaDeSeguridad.Script());
//        switch (LoginUsuarios.Motores_Jbox.getSelectedIndex()) {
//            case 0 -> {
//                Sql_Jarea.setText(CargueCopiaDeSeguridad.ScriptOracle());
//            }
//            case 1 -> {
//                Sql_Jarea.setText(CargueCopiaDeSeguridad.ScriptServer());
//            }
//            
//        }
        
    }//GEN-LAST:event_Copiar_JbotonActionPerformed

    private void Crear_JbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Crear_JbotonActionPerformed
        // TODO add your handling code here:
//        switch (LoginUsuarios.Motores_Jbox.getSelectedIndex()) {
//            case 0 -> {
//                new CrearUsuarioOracle().setVisible(true);
//            }
//            case 1 -> {
//                new CrearUsuarioServer().setVisible(true);
//            }
//        }
    }//GEN-LAST:event_Crear_JbotonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch (UnsupportedLookAndFeelException e) {

        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });

    }

    public Icon setIcono(String url, JButton boton) {
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING));
        return icono;
    }
//String consulta = String.valueOf(DDL_Jarea.getSelectedText());
//                String resul = "";
//                if (consulta.equals("null")) {
//                    int i = 0;
//                    try {
//                        for (i = 0; i < DDL_Jarea.getLineCount(); i++) {
//                            resul = Insertar.Consulta_CUD(String.valueOf(DDL_Jarea.getText(DDL_Jarea.getLineStartOffset(i),
//                                    (DDL_Jarea.getLineEndOffset(i)) - (DDL_Jarea.getLineStartOffset(i)))));
//                        }
//                        if (resul.equals("true")) {
//                            Consola_Jarea.setText(+i + " fila(s) ejecutada(s)");
//                        } else {
//                            Consola_Jarea.setText(resul);
//                        }
//                    } catch ( SQLException ex) {
//                        Consola_Jarea.setText(ex.getMessage());
//                    } catch (BadLocationException ex) {
//                        Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                } else if (!consulta.equals("null")) {
//                    try {
//                        String[] cadena = DDL_Jarea.getSelectedText().split("\n");
//                        int i = 0;
//                        for (i = 0; i < cadena.length; i++) {
//                            resul = Insertar.Consulta_CUD(String.valueOf(cadena[i]));
//                        }
//                        if (resul.equals("true")) {
//                            Consola_Jarea.setText(+i + " fila(s) ejecutada(s)");
//                        } else {
//                            Consola_Jarea.setText(resul);
//                        }
//                    } catch (SQLException ex) {
//                        Consola_Jarea.setText(resul);
//                    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Abrir_Jboton;
    private javax.swing.JButton Cambiar_Jboton;
    private javax.swing.JPanel Codigo_Jpanel;
    private javax.swing.JTabbedPane Codigo_Jtabbed;
    private javax.swing.JTextArea Consola_Jarea;
    private javax.swing.JPanel Consola_Jpanel;
    private javax.swing.JScrollPane Consola_Jscroll;
    private javax.swing.JButton Copiar_Jboton;
    private javax.swing.JButton Correr_Jboton;
    private javax.swing.JButton Crear_Jboton;
    private javax.swing.JTextArea DDL_Jarea;
    private javax.swing.JPanel DDL_Jpanel;
    private javax.swing.JScrollPane DDL_Jscroll;
    private javax.swing.JButton Guardar_Jboton;
    private javax.swing.JButton Limpiar_Jboton;
    private javax.swing.JPanel Navegacion_Jboton;
    private javax.swing.JScrollPane Navegacion_Jscroll;
    public javax.swing.JTree Navegacion_Jtree;
    private static javax.swing.JTextArea Procedimental_Jarea;
    private javax.swing.JPanel Procedimental_Jpanel;
    private javax.swing.JScrollPane Procedimental_Jscroll;
    private javax.swing.JButton Refrescar_Jboton;
    private javax.swing.JPanel Resultado_Jpanel;
    private javax.swing.JScrollPane Resultado_Jscroll;
    private javax.swing.JTable Resultado_Jtable;
    private javax.swing.JTextArea Sql_Jarea;
    private javax.swing.JPanel Sql_Jpanel;
    private javax.swing.JScrollPane Sql_Jscroll;
    // End of variables declaration//GEN-END:variables
}