/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author manojlovic
 */
public class Zadatak3 extends JFrame{
    
    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JLabel labela1 = new JLabel("Enter rainfall measurement separated by spaces");
    JTextArea textPovrsina = new JTextArea("1 0 0 0 4 7 1 \n 0 0 1 0 1 1 2 8");
    JButton dugme = new JButton("Calculate statistic");
    JLabel labela2 = new JLabel("Total");
    JLabel labela3 = new JLabel("Number");
    JLabel labela4 = new JLabel("Average");
    JTextField tekstPolje1 = new JTextField();
    JTextField tekstPolje2 = new JTextField();
    JTextField tekstPolje3 = new JTextField();  
    
    public static void main(String[] args) {
        new Zadatak3();
    }

    public Zadatak3() {
        
        setTitle("Rain Statistic");
        setSize(360, 230);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setupGUI();
        setResizable(false);
        setVisible(true);
        
    }
    
    public void setupGUI() {
        
        panel.setBorder(new EmptyBorder(new Insets(5, 5, 5, 5)));
        panel.add(labela1);
        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 1, 1));
        
        panel2.setLayout(new GridLayout(2,1, 5, 5));
        panel2.setBorder(new EmptyBorder(5, 5, 5, 100));
        panel2.add(textPovrsina);
        panel2.add(dugme);
      
        
        panel3.setLayout(new GridLayout(3, 2, 5, 5));
        panel3.setBorder(new EmptyBorder(5, 5, 5, 220));
        panel3.add(labela2);
        panel3.add(tekstPolje1);
        panel3.add(labela3);
        panel3.add(tekstPolje2);
        panel3.add(labela4);
        panel3.add(tekstPolje3);
        
        
        add(panel, BorderLayout.NORTH);
        add(panel2, BorderLayout.CENTER);
        add(panel3, BorderLayout.SOUTH);
    }
}
