/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobasecaliza;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jorge García
 */
public class VEliminarRetencion extends javax.swing.JFrame {

    String retenId;
    
    public VEliminarRetencion() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbRetencion = new javax.swing.JTable();
        btEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        lbFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Eliminar Retención");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        Connection cn = Sistema.getNewAccess().getConn();
        ResultSet rs=null;
        CallableStatement mycall= null;
        try{
            mycall = cn.prepareCall("{call allReten ()}");
            mycall.execute();
            rs=mycall.getResultSet();
        }catch(Exception e){

        }
        DefaultTableModel dfm = new DefaultTableModel();
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
        jScrollPane1.setViewportView(tbRetencion);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 930, 310));

        btEliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btEliminar.setText("Eliminar");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, 120, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccione retencion a eliminar:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 220, -1));

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 450, -1, -1));

        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasecaliza/Fondo 1.jpg"))); // NOI18N
        lbFondo.setText("jLabel1");
        getContentPane().add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        VPrincipal ventana= new VPrincipal();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void tbRetencionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRetencionMouseClicked
        int fila = tbRetencion.rowAtPoint(evt.getPoint());
        retenId = tbRetencion.getValueAt(fila,0).toString();
    }//GEN-LAST:event_tbRetencionMouseClicked

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        Connection cn= Sistema.getNewAccess().getConn();
        CallableStatement mycall;
        
        try{
            mycall =cn.prepareCall("{call EliminarRetencion('"+retenId+"')}");
            mycall.execute();
            JOptionPane notificacion = new JOptionPane();
            notificacion.showMessageDialog(rootPane, "Retencion eliminada exitosamente", "Eliminar retencion", JOptionPane.INFORMATION_MESSAGE);
            VEliminarRetencion ventana = new VEliminarRetencion();
            ventana.setLocation(this.getLocation());
            this.dispose();
            ventana.setVisible(true);
        }catch(Exception e){
            System.out.println("se produjo una excepcion");
        }
    }//GEN-LAST:event_btEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(VEliminarRetencion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VEliminarRetencion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VEliminarRetencion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VEliminarRetencion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VEliminarRetencion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btnAtras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbFondo;
    private javax.swing.JTable tbRetencion;
    // End of variables declaration//GEN-END:variables
}
