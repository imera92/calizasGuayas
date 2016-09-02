/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobasecaliza;

import java.sql.CallableStatement;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge García
 */
public class VCrearCliente extends javax.swing.JFrame {

    /**
     * Creates new form VCrearCliente
     */
    public VCrearCliente() {
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

        lbTituloCrear = new javax.swing.JLabel();
        lbRUC = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        tfRUC = new javax.swing.JTextField();
        tfNombre = new javax.swing.JTextField();
        btnCrear = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        tfDireccion = new javax.swing.JTextField();
        lbDirección = new javax.swing.JLabel();
        lbTelefono = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        tfTelefono = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        lbFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crear Cliente");
        setIconImage(getIconImage());
        setResizable(false);
        setSize(new java.awt.Dimension(1020, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTituloCrear.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbTituloCrear.setForeground(new java.awt.Color(255, 255, 255));
        lbTituloCrear.setText("Crear Cliente");
        getContentPane().add(lbTituloCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 220, 50));

        lbRUC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbRUC.setForeground(new java.awt.Color(255, 255, 255));
        lbRUC.setText("RUC:");
        getContentPane().add(lbRUC, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        lbNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbNombre.setForeground(new java.awt.Color(255, 255, 255));
        lbNombre.setText("Nombre:");
        getContentPane().add(lbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        tfRUC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfRUCActionPerformed(evt);
            }
        });
        getContentPane().add(tfRUC, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 190, -1));

        tfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreActionPerformed(evt);
            }
        });
        getContentPane().add(tfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 190, -1));

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, -1, -1));

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 450, -1, -1));
        getContentPane().add(tfDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 190, -1));

        lbDirección.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbDirección.setForeground(new java.awt.Color(255, 255, 255));
        lbDirección.setText("Dirección:");
        getContentPane().add(lbDirección, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        lbTelefono.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbTelefono.setForeground(new java.awt.Color(255, 255, 255));
        lbTelefono.setText("Teléfono:");
        getContentPane().add(lbTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        lbEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbEmail.setForeground(new java.awt.Color(255, 255, 255));
        lbEmail.setText("e-mail:");
        getContentPane().add(lbEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));
        getContentPane().add(tfTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 190, -1));
        getContentPane().add(tfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 190, -1));

        lbFondo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbFondo.setForeground(new java.awt.Color(255, 255, 255));
        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasecaliza/Fondo 1.jpg"))); // NOI18N
        lbFondo.setText("jLabel1");
        getContentPane().add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNombreActionPerformed

    private void tfRUCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfRUCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfRUCActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        Connection cn= Sistema.getNewAccess().getConn();
        CallableStatement mycall;
        
        try{
            mycall =cn.prepareCall("{call insertClient('"+tfRUC.getText()+"', '"+tfNombre.getText()+"', '"+tfDireccion.getText()+"', '"+tfTelefono.getText()+"', '"+tfEmail.getText()+"')}");
            mycall.execute();
//            Sistema.insertCliente(this.tfRUC, this.tfNombre, this.tfDireccion, this.tfTelefono, this.tfEmail);
            JOptionPane notificacion = new JOptionPane();
            this.tfRUC.setText("");
            this.tfNombre.setText("");
            this.tfDireccion.setText("");
            this.tfTelefono.setText("");
            this.tfEmail.setText("");
            notificacion.showMessageDialog(rootPane, "Cliente creado exitosamente", "Crear cliente", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            System.out.println("se produjo una excepcion");
//            se.printStackTrace();
        }
        
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
         VPrincipal ventana= new VPrincipal();
         ventana.setLocation(this.getLocation());
         this.dispose();
         ventana.setVisible(true);  
    }//GEN-LAST:event_btnAtrasActionPerformed
    
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
            java.util.logging.Logger.getLogger(VCrearCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VCrearCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VCrearCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VCrearCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VCrearCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCrear;
    private javax.swing.JLabel lbDirección;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbFondo;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbRUC;
    private javax.swing.JLabel lbTelefono;
    private javax.swing.JLabel lbTituloCrear;
    private javax.swing.JTextField tfDireccion;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfRUC;
    private javax.swing.JTextField tfTelefono;
    // End of variables declaration//GEN-END:variables
}
