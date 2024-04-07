/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelreview;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class HotelReview {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Review r = new Review();
        r.setVisible(true);
        r.updateDB();
        JOptionPane.showMessageDialog(null, "All rattings are out of 10");
    }
    
}
