/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Ayuda.java
 *
 * Created on 30-jun-2012, 10:33:39
 */
package Interfacez;

import java.net.URL;
import java.util.Locale;
import javax.swing.ImageIcon;
/**
 *
 * @author RyoSuke
 */
public class Ayuda extends javax.swing.JDialog {

    Principal p;
    private int x=20;
    
    URL ruta=getClass().getResource("/Imagenes/21.jpg");
    private ImageIcon ic=new ImageIcon(ruta);
    private String y=ruta.getFile();
    
    int k;
    public Ayuda(Principal parent, boolean modal) {
        super(parent, modal);
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/titulo.png")).getImage());
//        System.out.println(""+ ruta.getFile());
//        System.out.println("LARGO "+ ruta.getFile().length());
//        System.out.println(""+ obten(y));
        k=Integer.parseInt( y.substring(obten(y)+4, ruta.getFile().length()-4));
        
        initComponents();
        fondo.setIcon(ic);
        setLocationRelativeTo(p);
    }

    public void Habilitar(int y){
        if(y==21){
           prev.setEnabled(false);
           prev.setIcon(new ImageIcon(getClass().getResource("/Imagenes/checkout_action.gif")));
        }
        else if(y<=43){
           prev.setEnabled(true);
           prev.setIcon(new ImageIcon(getClass().getResource("/Imagenes/prevact.gif")));
           next.setEnabled(true);
           next.setIcon(new ImageIcon(getClass().getResource("/Imagenes/gotoobj_tsk.gif")));
       }
        else{
             next.setEnabled(false);
             next.setIcon(new ImageIcon(getClass().getResource("/Imagenes/nextdes.gif")));
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JLabel();
        prev = new javax.swing.JButton();
        next = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(".:Analisis, Algoritmos de Ordenacion :. By Luis Paz Rumiche");

        fondo.setBackground(new java.awt.Color(0, 0, 0));

        prev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkout_action.gif"))); // NOI18N
        prev.setEnabled(false);
        prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevActionPerformed(evt);
            }
        });

        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gotoobj_tsk.gif"))); // NOI18N
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(prev, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(263, 263, 263))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prev, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        k++;
        Habilitar(k);
        ic=new ImageIcon(this.getClass().getResource("/Imagenes/"+k+".jpg"));
        fondo.setIcon(ic);
    }//GEN-LAST:event_nextActionPerformed

    private void prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevActionPerformed
        k--;
        Habilitar(k);
        ic=new ImageIcon(this.getClass().getResource("/Imagenes/"+k+".jpg"));
        fondo.setIcon(ic);
    }//GEN-LAST:event_prevActionPerformed
    public int obten(String h){
        return h.indexOf("nes/");
        
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JButton next;
    private javax.swing.JButton prev;
    // End of variables declaration//GEN-END:variables
}
