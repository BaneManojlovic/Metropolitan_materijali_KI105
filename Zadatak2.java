/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.border.Border;

/**
 *
 * @author manojlovic
 */
public class Zadatak2 extends JFrame{
    
    public static void main(String[] args) {
       new Zadatak2();
    }

    public Zadatak2() {
        setTitle("Rain Statistic");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setupGUI();
        setVisible(true);
    }
    
    
    
    public void setupGUI() {
        
        JPanel labela1 = new JPanel(new FlowLayout());
        labela1.add(new JLabel("Enter rainfall measurement separated by spaces"));
        add(labela1,  BorderLayout.NORTH);
        
        JPanel centerPanel1 = new JPanel(new GridLayout(1, 1));
        add(centerPanel1, BorderLayout.WEST);
        
        JPanel centerPanel = new JPanel(new GridLayout(1, 1));
        JTextArea availableTxt = new JTextArea();
        centerPanel.add(availableTxt);
        Border empty2 = BorderFactory.createEmptyBorder(45,25,85,55);
        centerPanel.setBorder(empty2);
        add(centerPanel, BorderLayout.CENTER);
        
        JPanel centerPanel2 = new JPanel(new GridLayout(2, 2, 10, 10));
        add(centerPanel, BorderLayout.SOUTH);
        centerPanel2.add(new JButton("Calculate Statistic"));
        add(centerPanel2);
    }
}
