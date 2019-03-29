/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pert4;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Murni K
 */
public class Pert4 {
    
    


    public static void main(String[] args) {
         JFrame frame = new JFrame("Halo");
        frame.setSize(300, 200);
        
        frame.setLayout(new BorderLayout());
        
        JLabel lblNama = new JLabel();
        lblNama.setText("Murni Kurniasari"
                        + " 4D/17090013");
        frame.add(lblNama, BorderLayout.WEST);
        
        JButton btnSimpan = new JButton("Simpan");
        frame.add(btnSimpan, BorderLayout.EAST);
        
        frame.setVisible(true);
       
    }
    
}
