/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobasecaliza;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jorge García
 */
public class VPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VPrincipal
     */
    public VPrincipal() {
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
        btnCrearProducto = new javax.swing.JButton();
        btnConsultarProducto = new javax.swing.JButton();
        btnModificarProducto = new javax.swing.JButton();
        btnEliminarProducto = new javax.swing.JButton();
        lbProducto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnCrearRetencion = new javax.swing.JButton();
        btnConsultarRetencion = new javax.swing.JButton();
        btnModificarRetencion = new javax.swing.JButton();
        btnEliminarRetencion = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmArchivo = new javax.swing.JMenu();
        jmiLogOut = new javax.swing.JMenuItem();
        jmCliente = new javax.swing.JMenu();
        jmiCrearCliente = new javax.swing.JMenuItem();
        jmiConsultarCliente = new javax.swing.JMenuItem();
        jmiModificarCliente = new javax.swing.JMenuItem();
        jmiEliminarCliente = new javax.swing.JMenuItem();
        jmFactura = new javax.swing.JMenu();
        jmiCrearFactura = new javax.swing.JMenuItem();
        jmiConsultarFactura = new javax.swing.JMenuItem();
        jmiModificarFactura = new javax.swing.JMenuItem();
        jmiEliminarFactura = new javax.swing.JMenuItem();
        jmRetencion = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jmPago = new javax.swing.JMenu();
        jmCrear = new javax.swing.JMenu();
        jmiPagoCheque = new javax.swing.JMenuItem();
        jmiPagoDeposito = new javax.swing.JMenuItem();
        jmiConsultar = new javax.swing.JMenuItem();
        jmiModificar = new javax.swing.JMenuItem();
        jmiEliminar = new javax.swing.JMenuItem();
        jmProducto = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jmAyuda = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCrearProducto.setText("Crear Producto");
        btnCrearProducto.setMaximumSize(new java.awt.Dimension(150, 30));
        btnCrearProducto.setMinimumSize(new java.awt.Dimension(150, 30));
        btnCrearProducto.setPreferredSize(new java.awt.Dimension(150, 30));
        btnCrearProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearProductoActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrearProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        btnConsultarProducto.setText("Consultar Producto");
        btnConsultarProducto.setMaximumSize(new java.awt.Dimension(150, 30));
        btnConsultarProducto.setMinimumSize(new java.awt.Dimension(150, 30));
        btnConsultarProducto.setPreferredSize(new java.awt.Dimension(150, 30));
        btnConsultarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarProductoActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));

        btnModificarProducto.setText("Modificar Producto");
        btnModificarProducto.setMaximumSize(new java.awt.Dimension(150, 30));
        btnModificarProducto.setMinimumSize(new java.awt.Dimension(150, 30));
        btnModificarProducto.setPreferredSize(new java.awt.Dimension(150, 30));
        btnModificarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarProductoActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, -1, -1));

        btnEliminarProducto.setText("Eliminar producto");
        btnEliminarProducto.setMaximumSize(new java.awt.Dimension(150, 30));
        btnEliminarProducto.setMinimumSize(new java.awt.Dimension(150, 30));
        btnEliminarProducto.setPreferredSize(new java.awt.Dimension(150, 30));
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, -1, -1));

        lbProducto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbProducto.setText("Producto");
        jPanel1.add(lbProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Retencion");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        btnCrearRetencion.setText("Crear Retención");
        btnCrearRetencion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearRetencionActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrearRetencion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 150, -1));

        btnConsultarRetencion.setText("Consultar Retención");
        btnConsultarRetencion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarRetencionActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultarRetencion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 150, -1));

        btnModificarRetencion.setText("Modificar Retención");
        btnModificarRetencion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarRetencionActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificarRetencion, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 150, -1));

        btnEliminarRetencion.setText("Eliminar Retención");
        btnEliminarRetencion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarRetencionActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarRetencion, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, 150, -1));

        jmArchivo.setText("Archivo");

        jmiLogOut.setText("Log out");
        jmiLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiLogOutActionPerformed(evt);
            }
        });
        jmArchivo.add(jmiLogOut);

        jMenuBar1.add(jmArchivo);

        jmCliente.setText("Cliente");

        jmiCrearCliente.setText("Crear");
        jmiCrearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCrearClienteActionPerformed(evt);
            }
        });
        jmCliente.add(jmiCrearCliente);

        jmiConsultarCliente.setText("Consultar");
        jmiConsultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsultarClienteActionPerformed(evt);
            }
        });
        jmCliente.add(jmiConsultarCliente);

        jmiModificarCliente.setText("Modifcar");
        jmiModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiModificarClienteActionPerformed(evt);
            }
        });
        jmCliente.add(jmiModificarCliente);

        jmiEliminarCliente.setText("Eliminar");
        jmiEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEliminarClienteActionPerformed(evt);
            }
        });
        jmCliente.add(jmiEliminarCliente);

        jMenuBar1.add(jmCliente);

        jmFactura.setText("Factura");

        jmiCrearFactura.setText("Crear");
        jmiCrearFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCrearFacturaActionPerformed(evt);
            }
        });
        jmFactura.add(jmiCrearFactura);

        jmiConsultarFactura.setText("Consultar");
        jmiConsultarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsultarFacturaActionPerformed(evt);
            }
        });
        jmFactura.add(jmiConsultarFactura);

        jmiModificarFactura.setText("Modificar");
        jmiModificarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiModificarFacturaActionPerformed(evt);
            }
        });
        jmFactura.add(jmiModificarFactura);

        jmiEliminarFactura.setText("Eliminar");
        jmiEliminarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEliminarFacturaActionPerformed(evt);
            }
        });
        jmFactura.add(jmiEliminarFactura);

        jMenuBar1.add(jmFactura);

        jmRetencion.setText("Retencion");

        jMenuItem1.setText("jMenuItem1");
        jmRetencion.add(jMenuItem1);

        jMenuItem2.setText("jMenuItem2");
        jmRetencion.add(jMenuItem2);

        jMenuItem3.setText("jMenuItem3");
        jmRetencion.add(jMenuItem3);

        jMenuItem4.setText("jMenuItem4");
        jmRetencion.add(jMenuItem4);

        jMenuBar1.add(jmRetencion);

        jmPago.setText("Pago");

        jmCrear.setText("Crear...");

        jmiPagoCheque.setText("Pago con cheque");
        jmiPagoCheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPagoChequeActionPerformed(evt);
            }
        });
        jmCrear.add(jmiPagoCheque);

        jmiPagoDeposito.setText("Pago con deposito");
        jmiPagoDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPagoDepositoActionPerformed(evt);
            }
        });
        jmCrear.add(jmiPagoDeposito);

        jmPago.add(jmCrear);

        jmiConsultar.setText("Consultar");
        jmiConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsultarActionPerformed(evt);
            }
        });
        jmPago.add(jmiConsultar);

        jmiModificar.setText("Modificar");
        jmiModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiModificarActionPerformed(evt);
            }
        });
        jmPago.add(jmiModificar);

        jmiEliminar.setText("Eliminar");
        jmiEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEliminarActionPerformed(evt);
            }
        });
        jmPago.add(jmiEliminar);

        jMenuBar1.add(jmPago);

        jmProducto.setText("Producto");

        jMenuItem5.setText("jMenuItem5");
        jmProducto.add(jMenuItem5);

        jMenuItem6.setText("jMenuItem6");
        jmProducto.add(jMenuItem6);

        jMenuItem7.setText("jMenuItem7");
        jmProducto.add(jMenuItem7);

        jMenuItem8.setText("jMenuItem8");
        jmProducto.add(jMenuItem8);

        jMenuBar1.add(jmProducto);

        jmAyuda.setText("Ayuda");

        jMenuItem9.setText("jMenuItem9");
        jmAyuda.add(jMenuItem9);

        jMenuBar1.add(jmAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
        );

        setBounds(0, 0, 816, 489);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearProductoActionPerformed
        VCrearProducto ventana =new VCrearProducto();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_btnCrearProductoActionPerformed

    private void btnConsultarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarProductoActionPerformed
        VConsultarProducto ventana =new VConsultarProducto();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_btnConsultarProductoActionPerformed

    private void btnModificarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarProductoActionPerformed
        VModificarProducto ventana =new VModificarProducto();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_btnModificarProductoActionPerformed

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        VEliminarProducto ventana =new VEliminarProducto();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void btnCrearRetencionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearRetencionActionPerformed
        VCrearRetencion ventana =new VCrearRetencion();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_btnCrearRetencionActionPerformed

    private void btnConsultarRetencionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarRetencionActionPerformed
        VConsultarRetencion ventana =new VConsultarRetencion();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_btnConsultarRetencionActionPerformed

    private void btnModificarRetencionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarRetencionActionPerformed
        VModificarRetencion ventana =new VModificarRetencion();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_btnModificarRetencionActionPerformed

    private void btnEliminarRetencionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarRetencionActionPerformed
        VEliminarRetencion ventana =new VEliminarRetencion();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_btnEliminarRetencionActionPerformed

    private void jmiConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsultarActionPerformed
        VConsultarPago ventana =new VConsultarPago();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_jmiConsultarActionPerformed

    private void jmiModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiModificarActionPerformed
        VModificarPago ventana =new VModificarPago();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_jmiModificarActionPerformed

    private void jmiPagoDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPagoDepositoActionPerformed
        VCrearPagoDeposito ventana = new VCrearPagoDeposito();
        ventana.setLocationRelativeTo(null);
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_jmiPagoDepositoActionPerformed

    private void jmiEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEliminarActionPerformed
        VEliminarPago ventana =new VEliminarPago();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_jmiEliminarActionPerformed

    private void jmiLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiLogOutActionPerformed
        VLogin ventana= new VLogin();
        ventana.setLocationRelativeTo(null);
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_jmiLogOutActionPerformed

    private void jmiPagoChequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPagoChequeActionPerformed
        VCrearPagoCheque ventana = new VCrearPagoCheque();
        ventana.setLocationRelativeTo(null);
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_jmiPagoChequeActionPerformed

    private void jmiCrearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCrearClienteActionPerformed
        VCrearCliente ventana =new VCrearCliente();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_jmiCrearClienteActionPerformed

    private void jmiConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsultarClienteActionPerformed
        VConsultarCliente ventana = null;
        try {
            ventana = new VConsultarCliente();
        } catch (SQLException ex) {
            Logger.getLogger(VPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_jmiConsultarClienteActionPerformed

    private void jmiModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiModificarClienteActionPerformed
        VModificarCliente ventana =new VModificarCliente();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_jmiModificarClienteActionPerformed

    private void jmiEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEliminarClienteActionPerformed
        VEliminarCliente ventana =new VEliminarCliente();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_jmiEliminarClienteActionPerformed

    private void jmiCrearFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCrearFacturaActionPerformed
        VCrearFactura ventana =new VCrearFactura();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_jmiCrearFacturaActionPerformed

    private void jmiConsultarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsultarFacturaActionPerformed
        VConsultarFactura ventana =new VConsultarFactura();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_jmiConsultarFacturaActionPerformed

    private void jmiModificarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiModificarFacturaActionPerformed
        VModificarFactura ventana =new VModificarFactura();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_jmiModificarFacturaActionPerformed

    private void jmiEliminarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEliminarFacturaActionPerformed
        VModificarFactura ventana =new VModificarFactura();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_jmiEliminarFacturaActionPerformed
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {                                   
        Sistema.cerrar();
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
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarProducto;
    private javax.swing.JButton btnConsultarRetencion;
    private javax.swing.JButton btnCrearProducto;
    private javax.swing.JButton btnCrearRetencion;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnEliminarRetencion;
    private javax.swing.JButton btnModificarProducto;
    private javax.swing.JButton btnModificarRetencion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu jmArchivo;
    private javax.swing.JMenu jmAyuda;
    private javax.swing.JMenu jmCliente;
    private javax.swing.JMenu jmCrear;
    private javax.swing.JMenu jmFactura;
    private javax.swing.JMenu jmPago;
    private javax.swing.JMenu jmProducto;
    private javax.swing.JMenu jmRetencion;
    private javax.swing.JMenuItem jmiConsultar;
    private javax.swing.JMenuItem jmiConsultarCliente;
    private javax.swing.JMenuItem jmiConsultarFactura;
    private javax.swing.JMenuItem jmiCrearCliente;
    private javax.swing.JMenuItem jmiCrearFactura;
    private javax.swing.JMenuItem jmiEliminar;
    private javax.swing.JMenuItem jmiEliminarCliente;
    private javax.swing.JMenuItem jmiEliminarFactura;
    private javax.swing.JMenuItem jmiLogOut;
    private javax.swing.JMenuItem jmiModificar;
    private javax.swing.JMenuItem jmiModificarCliente;
    private javax.swing.JMenuItem jmiModificarFactura;
    private javax.swing.JMenuItem jmiPagoCheque;
    private javax.swing.JMenuItem jmiPagoDeposito;
    private javax.swing.JLabel lbProducto;
    // End of variables declaration//GEN-END:variables
}
