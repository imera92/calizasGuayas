/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Grafica.java
 *
 * Created on 24-jun-2012, 21:41:36
 */
package Interfacez;

import javax.swing.ImageIcon;

/**
 *
 * @author Tottus
 */
public  class Grafica extends javax.swing.JDialog {

    Principal principal;
    
    
    public Grafica(Principal parent, boolean modal) {
        super(parent, modal);
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/titulo.png")).getImage());
        principal=parent;
        initComponents();
        this.setLocationRelativeTo(parent);
    }  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(".: Analisis de Algoritmos :.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 531, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
