/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sys;

import javax.swing.JDialog;

/**
 *
 * @author saleem
 */
public class Bespoke {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JDialog jd = new JDialog();
        jd = new sys.LoginDialog(new java.awt.Frame(), true);        
        jd.setSize(400, 150);
        jd.setVisible(true);
    }
    
}
