/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak3;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
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
    JPanel panel4 = new JPanel();
    
    JLabel labela2 = new JLabel("Amount of Loan");
    JTextField tekstPolje1 = new JTextField();
    JLabel labela3 = new JLabel("Number of Years");
    JTextField tekstPolje11 = new JTextField();
    JLabel labela4 = new JLabel("Interest Rate");
    // element za biranje!!!
    JComboBox<String> kombo = new JComboBox<>();

    JButton dugme1 = new JButton("Calculate");
    JButton dugme2 = new JButton("Clear");
    
    JLabel labela5 = new JLabel("Monthly Payment");
    JTextField tekstPolje2 = new JTextField();
    
    JLabel labela6 = new JLabel("Monthly Payment");
    JTextField tekstPolje3 = new JTextField();  
    
    JButton dugme3 = new JButton("Quit");
    
    public static void main(String[] args) {
        new Zadatak3();
    }

    public Zadatak3() {
        setTitle("Loan Payment Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setupGUI();
        setResizable(false);
        setVisible(true);
    }
    
    
    
    
 
    public void setupGUI() {
        
               
        panel2.setLayout(new GridLayout(8, 1, 10, 10));
        panel3.setLayout(new GridLayout(5, 1, 10, 10));
        panel4.setLayout(new GridLayout(2, 2, 10, 10));
        
       
        panel.setBorder(new EmptyBorder(new Insets(5, 5, 5, 5)));
        // Za levi deo
        panel2.add(labela2);
        panel2.add(tekstPolje1);
       // panel2.add(panel4);
        panel4.add(labela3);
        panel4.add(tekstPolje11);
        panel4.add(labela4);
        panel4.add(kombo);
        panel2.add(dugme1);
        panel2.add(dugme2);
        
        // Za desni deo
        panel3.add(labela5);
        panel3.add(tekstPolje2);
        panel3.add(labela6);
        panel3.add(tekstPolje3);
        panel3.add(dugme3);
        
        panel.add(panel2, BorderLayout.WEST);
        panel.add(panel4);
        panel.add(panel3, BorderLayout.EAST);
        add(panel);
        
    }
}
