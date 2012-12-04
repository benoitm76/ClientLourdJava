package clientlourdjava;

import javax.swing.UIManager;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Benoît
 */
public class ClientLourdJava {
     public static void main(String args[]) {
         try
         {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); 
         }
         catch(Exception ex)
         {
             
         }
         new ConnexionForm().setVisible(true);
     }
    
}
