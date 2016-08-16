/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobasecaliza;

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
        lbClientes = new javax.swing.JLabel();
        btnCrearProducto = new javax.swing.JButton();
        btnConsultarProducto = new javax.swing.JButton();
        btnModificarProducto = new javax.swing.JButton();
        btnEliminarProducto = new javax.swing.JButton();
        lbFactura = new javax.swing.JLabel();
        lbPago = new javax.swing.JLabel();
        lbProducto = new javax.swing.JLabel();
        btnCrearFactura = new javax.swing.JButton();
        btnConsultarFactura = new javax.swing.JButton();
        btnModificarFactura = new javax.swing.JButton();
        btnEliminarFactura = new javax.swing.JButton();
        btnCrearPago = new javax.swing.JButton();
        btnConsultarPago = new javax.swing.JButton();
        btnModificarPago = new javax.swing.JButton();
        btnEliminarPago = new javax.swing.JButton();
        btnCrearCliente = new javax.swing.JButton();
        btnConsultarCliente = new javax.swing.JButton();
        btnModificarCliente = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbClientes.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbClientes.setText("Cliente");
        jPanel1.add(lbClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        btnCrearProducto.setText("Crear Producto");
        btnCrearProducto.setMaximumSize(new java.awt.Dimension(150, 30));
        btnCrearProducto.setMinimumSize(new java.awt.Dimension(150, 30));
        btnCrearProducto.setPreferredSize(new java.awt.Dimension(150, 30));
        btnCrearProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearProductoActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrearProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, -1, -1));

        btnConsultarProducto.setText("Consultar Producto");
        btnConsultarProducto.setMaximumSize(new java.awt.Dimension(150, 30));
        btnConsultarProducto.setMinimumSize(new java.awt.Dimension(150, 30));
        btnConsultarProducto.setPreferredSize(new java.awt.Dimension(150, 30));
        btnConsultarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarProductoActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, -1, -1));

        btnModificarProducto.setText("Modificar Producto");
        btnModificarProducto.setMaximumSize(new java.awt.Dimension(150, 30));
        btnModificarProducto.setMinimumSize(new java.awt.Dimension(150, 30));
        btnModificarProducto.setPreferredSize(new java.awt.Dimension(150, 30));
        btnModificarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarProductoActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, -1, -1));

        btnEliminarProducto.setText("Eliminar producto");
        btnEliminarProducto.setMaximumSize(new java.awt.Dimension(150, 30));
        btnEliminarProducto.setMinimumSize(new java.awt.Dimension(150, 30));
        btnEliminarProducto.setPreferredSize(new java.awt.Dimension(150, 30));
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 410, -1, -1));

        lbFactura.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbFactura.setText("Factura");
        jPanel1.add(lbFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        lbPago.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbPago.setText("Pago");
        jPanel1.add(lbPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        lbProducto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbProducto.setText("Producto");
        jPanel1.add(lbProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, -1, -1));

        btnCrearFactura.setText("Crear Factura");
        btnCrearFactura.setMaximumSize(new java.awt.Dimension(150, 30));
        btnCrearFactura.setMinimumSize(new java.awt.Dimension(150, 30));
        btnCrearFactura.setPreferredSize(new java.awt.Dimension(150, 30));
        btnCrearFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearFacturaActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrearFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        btnConsultarFactura.setText("Consultar Factura");
        btnConsultarFactura.setMaximumSize(new java.awt.Dimension(150, 30));
        btnConsultarFactura.setMinimumSize(new java.awt.Dimension(150, 30));
        btnConsultarFactura.setPreferredSize(new java.awt.Dimension(150, 30));
        btnConsultarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarFacturaActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultarFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, -1, -1));

        btnModificarFactura.setText("Modificar Factura");
        btnModificarFactura.setMaximumSize(new java.awt.Dimension(150, 30));
        btnModificarFactura.setMinimumSize(new java.awt.Dimension(150, 30));
        btnModificarFactura.setPreferredSize(new java.awt.Dimension(150, 30));
        btnModificarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarFacturaActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificarFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, -1, -1));

        btnEliminarFactura.setText("Eliminar Factura");
        btnEliminarFactura.setMaximumSize(new java.awt.Dimension(150, 30));
        btnEliminarFactura.setMinimumSize(new java.awt.Dimension(150, 30));
        btnEliminarFactura.setPreferredSize(new java.awt.Dimension(150, 30));
        btnEliminarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarFacturaActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 210, -1, -1));

        btnCrearPago.setText("Crear Pago");
        btnCrearPago.setMaximumSize(new java.awt.Dimension(150, 30));
        btnCrearPago.setMinimumSize(new java.awt.Dimension(150, 30));
        btnCrearPago.setPreferredSize(new java.awt.Dimension(150, 30));
        btnCrearPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPagoActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrearPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 150, -1));

        btnConsultarPago.setText("Consultar Pago");
        btnConsultarPago.setMaximumSize(new java.awt.Dimension(150, 30));
        btnConsultarPago.setMinimumSize(new java.awt.Dimension(150, 30));
        btnConsultarPago.setPreferredSize(new java.awt.Dimension(150, 30));
        btnConsultarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarPagoActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultarPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, -1, -1));

        btnModificarPago.setText("Modificar Pago");
        btnModificarPago.setMaximumSize(new java.awt.Dimension(150, 30));
        btnModificarPago.setMinimumSize(new java.awt.Dimension(150, 30));
        btnModificarPago.setPreferredSize(new java.awt.Dimension(150, 30));
        btnModificarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarPagoActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificarPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, -1, -1));

        btnEliminarPago.setText("Eliminar Pago");
        btnEliminarPago.setMaximumSize(new java.awt.Dimension(150, 30));
        btnEliminarPago.setMinimumSize(new java.awt.Dimension(150, 30));
        btnEliminarPago.setPreferredSize(new java.awt.Dimension(150, 30));
        btnEliminarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPagoActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 310, -1, -1));

        btnCrearCliente.setText("Crear Cliente");
        btnCrearCliente.setMaximumSize(new java.awt.Dimension(150, 30));
        btnCrearCliente.setMinimumSize(new java.awt.Dimension(150, 30));
        btnCrearCliente.setPreferredSize(new java.awt.Dimension(150, 30));
        btnCrearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrearCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        btnConsultarCliente.setText("Consultar Cliente");
        btnConsultarCliente.setMaximumSize(new java.awt.Dimension(150, 30));
        btnConsultarCliente.setMinimumSize(new java.awt.Dimension(150, 30));
        btnConsultarCliente.setPreferredSize(new java.awt.Dimension(150, 30));
        btnConsultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, -1, -1));

        btnModificarCliente.setText("Modificar Cliente");
        btnModificarCliente.setMaximumSize(new java.awt.Dimension(150, 30));
        btnModificarCliente.setMinimumSize(new java.awt.Dimension(150, 30));
        btnModificarCliente.setPreferredSize(new java.awt.Dimension(150, 30));
        btnModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, -1, -1));

        btnEliminarCliente.setText("Eliminar Cliente");
        btnEliminarCliente.setMaximumSize(new java.awt.Dimension(150, 30));
        btnEliminarCliente.setMinimumSize(new java.awt.Dimension(150, 30));
        btnEliminarCliente.setPreferredSize(new java.awt.Dimension(150, 30));
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, -1, -1));

        btnCerrarSesion.setText("Cerrar Sesion");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 460, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1020, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearClienteActionPerformed
        VCrearCliente ventana =new VCrearCliente();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_btnCrearClienteActionPerformed

    private void btnCrearFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearFacturaActionPerformed
        VCrearFactura ventana =new VCrearFactura();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_btnCrearFacturaActionPerformed

    private void btnCrearPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPagoActionPerformed
        VCrearPago ventana =new VCrearPago();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_btnCrearPagoActionPerformed

    private void btnCrearProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearProductoActionPerformed
        VCrearProducto ventana =new VCrearProducto();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_btnCrearProductoActionPerformed

    private void btnConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarClienteActionPerformed
        VConsultarCliente ventana =new VConsultarCliente();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_btnConsultarClienteActionPerformed

    private void btnConsultarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarFacturaActionPerformed
        VConsultarFactura ventana =new VConsultarFactura();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_btnConsultarFacturaActionPerformed

    private void btnConsultarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarPagoActionPerformed
        VConsultarPago ventana =new VConsultarPago();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_btnConsultarPagoActionPerformed

    private void btnConsultarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarProductoActionPerformed
        VConsultarPago ventana =new VConsultarPago();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_btnConsultarProductoActionPerformed

    private void btnModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarClienteActionPerformed
        VModificarCliente ventana =new VModificarCliente();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_btnModificarClienteActionPerformed

    private void btnModificarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarFacturaActionPerformed
        VModificarFactura ventana =new VModificarFactura();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_btnModificarFacturaActionPerformed

    private void btnModificarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarPagoActionPerformed
        VModificarPago ventana =new VModificarPago();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_btnModificarPagoActionPerformed

    private void btnModificarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarProductoActionPerformed
        VModificarProducto ventana =new VModificarProducto();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_btnModificarProductoActionPerformed

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
        VEliminarCliente ventana =new VEliminarCliente();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void btnEliminarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarFacturaActionPerformed
        VEliminarFactura ventana =new VEliminarFactura();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_btnEliminarFacturaActionPerformed

    private void btnEliminarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPagoActionPerformed
        VEliminarPago ventana =new VEliminarPago();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_btnEliminarPagoActionPerformed

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        VEliminarProducto ventana =new VEliminarProducto();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        VLogin ventana= new VLogin();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

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
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnConsultarCliente;
    private javax.swing.JButton btnConsultarFactura;
    private javax.swing.JButton btnConsultarPago;
    private javax.swing.JButton btnConsultarProducto;
    private javax.swing.JButton btnCrearCliente;
    private javax.swing.JButton btnCrearFactura;
    private javax.swing.JButton btnCrearPago;
    private javax.swing.JButton btnCrearProducto;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnEliminarFactura;
    private javax.swing.JButton btnEliminarPago;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnModificarCliente;
    private javax.swing.JButton btnModificarFactura;
    private javax.swing.JButton btnModificarPago;
    private javax.swing.JButton btnModificarProducto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbClientes;
    private javax.swing.JLabel lbFactura;
    private javax.swing.JLabel lbPago;
    private javax.swing.JLabel lbProducto;
    // End of variables declaration//GEN-END:variables
}
