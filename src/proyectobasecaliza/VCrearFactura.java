/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobasecaliza;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge García
 */
public class VCrearFactura extends javax.swing.JFrame {

    /**
     * Creates new form VFacturaCrear
     */
    public VCrearFactura() {
        initComponents();
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
        lbNumFactura = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfNumFactura = new javax.swing.JTextField();
        tfFechaEmision = new javax.swing.JTextField();
        tfPrecioUnitario = new javax.swing.JTextField();
        tfTotalSacosVendidos = new javax.swing.JTextField();
        tfTotalFactura = new javax.swing.JTextField();
        tfFechaVencimiento = new javax.swing.JTextField();
        tfEstado = new javax.swing.JTextField();
        btnCrear = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfIdProducto = new javax.swing.JTextField();
        tfRucCliente = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tfRucEmple = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lbFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crear Factura");
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(1020, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(1020, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Crear Factura");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        lbNumFactura.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbNumFactura.setForeground(new java.awt.Color(255, 255, 255));
        lbNumFactura.setText("Numero de Factura:");
        getContentPane().add(lbNumFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha Emision:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Precio Unitario:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Total Sacos Vendidos:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Total Factura:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha Vencimiento:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Estado:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));
        getContentPane().add(tfNumFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 110, -1));

        tfFechaEmision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFechaEmisionActionPerformed(evt);
            }
        });
        getContentPane().add(tfFechaEmision, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 110, 20));
        getContentPane().add(tfPrecioUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 110, -1));
        getContentPane().add(tfTotalSacosVendidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 110, -1));

        tfTotalFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTotalFacturaActionPerformed(evt);
            }
        });
        getContentPane().add(tfTotalFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 110, -1));

        tfFechaVencimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFechaVencimientoActionPerformed(evt);
            }
        });
        getContentPane().add(tfFechaVencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 110, -1));
        getContentPane().add(tfEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 110, -1));

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, -1, -1));

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 460, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID Producto");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Ruc Cliente");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));
        getContentPane().add(tfIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 110, -1));

        tfRucCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfRucClienteActionPerformed(evt);
            }
        });
        getContentPane().add(tfRucCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 110, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Ruc Empleado");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));
        getContentPane().add(tfRucEmple, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 110, -1));

        jLabel10.setText("ej: 2017-7-04 (Año-Mes-Dia)");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, -1));

        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasecaliza/Fondo 1.jpg"))); // NOI18N
        lbFondo.setText("jLabel1");
        getContentPane().add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
       Connection cn = Sistema.getNewAccess().getConn();
       CallableStatement mycall;
        try{
           Sistema.getNewAccess().write2("{call insertClient('"+tfNumFactura.getText()+"', '"+tfFechaEmision.getText()+"', '"+tfFechaVencimiento.getText()+"', '"+tfEstado.getText()+"', "+tfTotalSacosVendidos.getText()+", "+tfPrecioUnitario.getText()+", "+tfTotalFactura.getText()+",'"+tfIdProducto.getText()+"', '"+tfRucCliente.getText()+"', '"+tfRucEmple.getText()+"')}");
           JOptionPane notificacion = new JOptionPane();
           notificacion.showMessageDialog(rootPane, "Factura creada exitosamente", "Crear cliente", JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException se){
            se.printStackTrace();
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void tfTotalFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTotalFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTotalFacturaActionPerformed

    private void tfFechaVencimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFechaVencimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFechaVencimientoActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        VPrincipal ventana= new VPrincipal();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void tfRucClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfRucClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfRucClienteActionPerformed

    private void tfFechaEmisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFechaEmisionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFechaEmisionActionPerformed
    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("proyectobasecaliza/icono.png"));
        return retValue;
    }
    
    
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
            java.util.logging.Logger.getLogger(VCrearFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VCrearFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VCrearFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VCrearFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VCrearFactura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCrear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbFondo;
    private javax.swing.JLabel lbNumFactura;
    private javax.swing.JTextField tfEstado;
    private javax.swing.JTextField tfFechaEmision;
    private javax.swing.JTextField tfFechaVencimiento;
    private javax.swing.JTextField tfIdProducto;
    private javax.swing.JTextField tfNumFactura;
    private javax.swing.JTextField tfPrecioUnitario;
    private javax.swing.JTextField tfRucCliente;
    private javax.swing.JTextField tfRucEmple;
    private javax.swing.JTextField tfTotalFactura;
    private javax.swing.JTextField tfTotalSacosVendidos;
    // End of variables declaration//GEN-END:variables
}
