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
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jorge García
 */
public class VModificarCliente extends javax.swing.JFrame {

    DefaultTableModel dfm = new DefaultTableModel();
    public VModificarCliente() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCliente = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        lbRUC = new javax.swing.JLabel();
        tfRUC = new javax.swing.JTextField();
        lbNombre = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        lbDirección = new javax.swing.JLabel();
        tfDireccion = new javax.swing.JTextField();
        lbTelefono = new javax.swing.JLabel();
        tfTelefono = new javax.swing.JTextField();
        lbEmail = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        tfFilter = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modificar Cliente");
        setIconImage(getIconImage());
        setResizable(false);
        setSize(new java.awt.Dimension(1020, 500));

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1020, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Modificar Cliente");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccione cliente a modificar:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        ResultSet rs=null;
        try{
            rs=Sistema.getNewAccess().query2("{call allClients ()}");
        }catch(Exception e){

        }
        tbCliente.setModel(dfm);
        dfm.setColumnIdentifiers(new Object[]{"Ruc","Nombre","Dirección","Teléfono","E-mail"});
        try{
            while(rs.next()){
                dfm.addRow(new Object[]{rs.getString("RUC_Cliente"),rs.getString("Nombre"),rs.getString("Direccion"),rs.getString("Telefonos"),rs.getString("Email")});
            }
        }catch(Exception e){

        }
        tbCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbCliente);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 640, 330));

        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 370, -1, -1));

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 370, -1, -1));

        lbRUC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbRUC.setForeground(new java.awt.Color(255, 255, 255));
        lbRUC.setText("RUC:");
        jPanel1.add(lbRUC, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 190, -1, -1));

        tfRUC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfRUCActionPerformed(evt);
            }
        });
        jPanel1.add(tfRUC, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 190, 190, -1));

        lbNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbNombre.setForeground(new java.awt.Color(255, 255, 255));
        lbNombre.setText("Nombre:");
        jPanel1.add(lbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 220, -1, -1));

        tfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreActionPerformed(evt);
            }
        });
        jPanel1.add(tfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 220, 190, -1));

        lbDirección.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbDirección.setForeground(new java.awt.Color(255, 255, 255));
        lbDirección.setText("Dirección:");
        jPanel1.add(lbDirección, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 250, -1, -1));
        jPanel1.add(tfDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 250, 190, -1));

        lbTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbTelefono.setForeground(new java.awt.Color(255, 255, 255));
        lbTelefono.setText("Teléfono:");
        jPanel1.add(lbTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 280, -1, -1));
        jPanel1.add(tfTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 280, 190, -1));

        lbEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbEmail.setForeground(new java.awt.Color(255, 255, 255));
        lbEmail.setText("e-mail:");
        jPanel1.add(lbEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 310, -1, -1));
        jPanel1.add(tfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 310, 190, -1));

        tfFilter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfFilterKeyReleased(evt);
            }
        });
        jPanel1.add(tfFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(529, 100, 150, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setBounds(0, 0, 1036, 539);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        VPrincipal ventana= new VPrincipal();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void tfRUCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfRUCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfRUCActionPerformed

    private void tfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNombreActionPerformed

    private void tbClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbClienteMouseClicked
        int fila = tbCliente.rowAtPoint(evt.getPoint());
        tfRUC.setText(tbCliente.getValueAt(fila,0).toString());
        tfRUC.setEnabled(false);
        tfNombre.setText(tbCliente.getValueAt(fila,1).toString()); 
        tfDireccion.setText(tbCliente.getValueAt(fila,2).toString()); 
        tfTelefono.setText(tbCliente.getValueAt(fila,3).toString()); 
        tfEmail.setText(tbCliente.getValueAt(fila,4).toString()); 
    }//GEN-LAST:event_tbClienteMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            Sistema.getNewAccess().write2("{call ModificarCliente('"+tfRUC.getText()+"', '"+tfNombre.getText()+"', '"+tfDireccion.getText()+"', '"+tfTelefono.getText()+"', '"+tfEmail.getText()+"')}");
            JOptionPane notificacion = new JOptionPane();
            notificacion.showMessageDialog(rootPane, "Cliente modificado exitosamente", "Modificar cliente", JOptionPane.INFORMATION_MESSAGE);
            VModificarCliente ventana = new VModificarCliente();
            ventana.setLocation(this.getLocation());
            this.dispose();
            ventana.setVisible(true);
        }catch(Exception e){
            System.out.println("se produjo una excepcion");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfFilterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfFilterKeyReleased
        String query=tfFilter.getText();
        Sistema.filter(query, tbCliente, dfm);
    }//GEN-LAST:event_tfFilterKeyReleased
    
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
            java.util.logging.Logger.getLogger(VModificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VModificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VModificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VModificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VModificarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDirección;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbRUC;
    private javax.swing.JLabel lbTelefono;
    private javax.swing.JTable tbCliente;
    private javax.swing.JTextField tfDireccion;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfFilter;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfRUC;
    private javax.swing.JTextField tfTelefono;
    // End of variables declaration//GEN-END:variables
}
