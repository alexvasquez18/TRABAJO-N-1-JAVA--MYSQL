/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.view;

import com.demo.controller.Conexion;
import java.io.File;
import java.util.Formatter;
import javax.swing.JOptionPane;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alexandro Vásquez
 */
public class VistaUp extends javax.swing.JFrame {

    /**
     * Creates new form VistaUp
     */
    public VistaUp() {
        initComponents();
    }

    private void Registrar() {
    
        Conexion con = new Conexion();
        Connection reg = con.conexion();
        String id, nom, apellido_p, apellido_m, usuario, clave;

        String sql;
        id = txtid.getText();
        nom = txtnom.getText();
        apellido_p = txtapepa.getText();
        apellido_m = txtapema.getText();
        usuario = jtxtUsuario.getText();
        clave = jTxtClave.getText();
        sql = "INSERT INTO cliente (Id,Nombre,Apellido_Paterno,Apellido_Materno,Usuario,Clave)VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement pst = reg.prepareStatement(sql);
            pst.setString(1, id);
            pst.setString(2, nom);
            pst.setString(3, apellido_p);
            pst.setString(4, apellido_m);
            pst.setString(5, usuario);
            pst.setString(6, clave);

            int n = pst.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "registrado con exito");

            }
        } catch (SQLException ex) {
            Logger.getLogger(VistaUp.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtnom = new javax.swing.JTextField();
        txtapepa = new javax.swing.JTextField();
        txtapema = new javax.swing.JTextField();
        jtxtUsuario = new javax.swing.JTextField();
        jTxtClave = new javax.swing.JPasswordField();
        REGISTRAR = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Subheading", 3, 18)); // NOI18N
        jLabel1.setText("Registrar Usuario:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel2.setText("Id");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 46, -1, -1));

        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 84, -1, -1));

        jLabel4.setText("Apellido Paterno ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 122, -1, -1));

        jLabel5.setText("Apellido Materno");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel6.setText("Usuario");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 198, -1, -1));

        jLabel7.setText("Clave");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 238, -1, -1));

        txtid.setBackground(new java.awt.Color(102, 255, 204));
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 43, 125, -1));

        txtnom.setBackground(new java.awt.Color(102, 255, 204));
        getContentPane().add(txtnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 81, 125, -1));

        txtapepa.setBackground(new java.awt.Color(102, 255, 204));
        getContentPane().add(txtapepa, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 119, 125, -1));

        txtapema.setBackground(new java.awt.Color(102, 255, 204));
        getContentPane().add(txtapema, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 157, 125, -1));

        jtxtUsuario.setBackground(new java.awt.Color(102, 255, 204));
        getContentPane().add(jtxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 195, 125, -1));

        jTxtClave.setBackground(new java.awt.Color(102, 255, 204));
        getContentPane().add(jTxtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 235, 125, -1));

        REGISTRAR.setText("REGISTRAR");
        REGISTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGISTRARActionPerformed(evt);
            }
        });
        getContentPane().add(REGISTRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 273, -1, -1));

        jButton2.setText("ATRAS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 273, -1, -1));

        jButton1.setText("NUEVO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 273, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registro.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void REGISTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGISTRARActionPerformed
        Registrar();
        // TODO add your handling code here:
    }//GEN-LAST:event_REGISTRARActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        VistaLogin VL = new VistaLogin();
        VL.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtid.setText("");
        txtnom.setText("");
        txtapepa.setText("");
        txtapema.setText("");
        jtxtUsuario.setText("");
        jTxtClave.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(VistaUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton REGISTRAR;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField jTxtClave;
    private javax.swing.JTextField jtxtUsuario;
    private javax.swing.JTextField txtapema;
    private javax.swing.JTextField txtapepa;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnom;
    // End of variables declaration//GEN-END:variables
}
