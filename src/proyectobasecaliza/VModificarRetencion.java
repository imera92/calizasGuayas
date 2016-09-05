/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobasecaliza;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jorge García
 */
public class VModificarRetencion extends javax.swing.JFrame {

    DefaultTableModel dfm = new DefaultTableModel();
    public VModificarRetencion() {
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

        jPanel1 = new javax.swing.JPanel();
        lbTituloModificar = new javax.swing.JLabel();
        lbIdRetencion = new javax.swing.JLabel();
        Porcentaje = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfIdRetencion = new javax.swing.JTextField();
        tfPorcentaje = new javax.swing.JTextField();
        tfValorRetenido = new javax.swing.JTextField();
        tfIdFactura = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jpRetencion = new javax.swing.JScrollPane();
        tbRetencion = new javax.swing.JTable();
        tfFilter = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTituloModificar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbTituloModificar.setForeground(new java.awt.Color(255, 255, 255));
        lbTituloModificar.setText("Modificar Retención");
        jPanel1.add(lbTituloModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 220, 50));

        lbIdRetencion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbIdRetencion.setForeground(new java.awt.Color(255, 255, 255));
        lbIdRetencion.setText("Id Retención:");
        jPanel1.add(lbIdRetencion, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, -1, -1));

        Porcentaje.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Porcentaje.setForeground(new java.awt.Color(255, 255, 255));
        Porcentaje.setText("Porcentaje:");
        jPanel1.add(Porcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Valor Retenido:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Id. Factura:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, -1, -1));

        tfIdRetencion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIdRetencionActionPerformed(evt);
            }
        });
        jPanel1.add(tfIdRetencion, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 160, 190, -1));

        tfPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPorcentajeActionPerformed(evt);
            }
        });
        jPanel1.add(tfPorcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 190, 190, -1));
        jPanel1.add(tfValorRetenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 220, 190, -1));
        jPanel1.add(tfIdFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 250, 190, -1));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 300, -1, -1));

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 300, -1, -1));

        ResultSet rs=null;
        try{
            rs=Sistema.getNewAccess().query2("{call allReten ()}");
        }catch(Exception e){

        }
        tbRetencion.setModel(dfm);
        dfm.setColumnIdentifiers(new Object[]{"Id Retencion","Porcentaje","Valor Retenido","Id Factura"});
        try{
            while(rs.next()){
                dfm.addRow(new Object[]{rs.getString(1),rs.getFloat(2),rs.getFloat(3),rs.getString(4)});
            }
        }catch(Exception e){

        }
        tbRetencion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbRetencionMouseClicked(evt);
            }
        });
        jpRetencion.setViewportView(tbRetencion);

        jPanel1.add(jpRetencion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 540, 360));

        tfFilter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfFilterKeyReleased(evt);
            }
        });
        jPanel1.add(tfFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 80, 170, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setBounds(0, 0, 986, 539);
    }// </editor-fold>//GEN-END:initComponents

    private void tfIdRetencionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIdRetencionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIdRetencionActionPerformed

    private void tfPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPorcentajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPorcentajeActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
         try {
            Sistema.getNewAccess().write2("{call ModificarRetencion('"+tfIdRetencion.getText()+"', "+tfPorcentaje.getText()+", "+tfValorRetenido.getText()+", '"+tfIdFactura.getText()+"')}");
            JOptionPane notificacion = new JOptionPane();
            notificacion.showMessageDialog(rootPane, "Retencion modificada exitosamente", "Modificar Retencion", JOptionPane.INFORMATION_MESSAGE);
            VModificarRetencion ventana = new VModificarRetencion();
            ventana.setLocation(this.getLocation());
            this.dispose();
            ventana.setVisible(true);
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        VPrincipal ventana= new VPrincipal();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void tbRetencionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRetencionMouseClicked
        int fila = tbRetencion.rowAtPoint(evt.getPoint());
        tfIdRetencion.setText(tbRetencion.getValueAt(fila,0).toString());
        tfIdRetencion.setEnabled(false);
        tfPorcentaje.setText(tbRetencion.getValueAt(fila,1).toString());
        tfValorRetenido.setText(tbRetencion.getValueAt(fila,2).toString());
        tfIdFactura.setText(tbRetencion.getValueAt(fila,3).toString());        
    }//GEN-LAST:event_tbRetencionMouseClicked

    private void tfFilterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfFilterKeyReleased
        String query=tfFilter.getText();
        Sistema.filter(query, tbRetencion, dfm);
    }//GEN-LAST:event_tfFilterKeyReleased

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
            java.util.logging.Logger.getLogger(VModificarRetencion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VModificarRetencion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VModificarRetencion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VModificarRetencion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VModificarRetencion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Porcentaje;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jpRetencion;
    private javax.swing.JLabel lbIdRetencion;
    private javax.swing.JLabel lbTituloModificar;
    private javax.swing.JTable tbRetencion;
    private javax.swing.JTextField tfFilter;
    private javax.swing.JTextField tfIdFactura;
    private javax.swing.JTextField tfIdRetencion;
    private javax.swing.JTextField tfPorcentaje;
    private javax.swing.JTextField tfValorRetenido;
    // End of variables declaration//GEN-END:variables
}
