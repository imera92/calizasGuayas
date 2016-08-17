/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Interfacez.Principal;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import org.jvnet.substance.SubstanceLookAndFeel;

/**
 *
 * @author Tottus
 */
public class Main {
    
    public static void main(String args[]){
        JFrame.setDefaultLookAndFeelDecorated(true);
        JDialog.setDefaultLookAndFeelDecorated(true);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    SubstanceLookAndFeel.setSkin(new org.jvnet.substance.skin.OfficeSilver2007Skin());
                }
                catch (Exception e) {
                }
                new Principal().setVisible(true);
            }
        });

    }
    
}
