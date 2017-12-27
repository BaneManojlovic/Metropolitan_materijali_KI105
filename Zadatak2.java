/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak2;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

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
        setSize(360, 230);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setupGUI();
        setResizable(false);
        setVisible(true);
    }
 
    public void setupGUI() {

        JPanel centerPanel = new JPanel(new FlowLayout());
        centerPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 1, 1));
        centerPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        centerPanel.add(new JLabel("Enter rainfall measurement separated by spaces"));
        add(centerPanel, BorderLayout.NORTH);

        JPanel centerPanel1 = new JPanel(new GridLayout(3, 1, 5, 5));
        //centerPanel1.setBorder(new EmptyBorder(5, 5, 5, 5));
        centerPanel1.add(new JTextArea("1 0 0 0 4 7 1 \n 0 0 1 0 1 1 2 8"));
    //    add(centerPanel1, BorderLayout.WEST);
        
    //    JPanel centerPanel3 = new JPanel(new GridLayout(3, 1, 5, 5));
        centerPanel1.setBorder(new EmptyBorder(5, 5, 5, 50));
        centerPanel1.add(new Button("Calculate statistic"));
        add(centerPanel1, BorderLayout.CENTER);

        JPanel centerPanel2 = new JPanel(new GridLayout(3, 2, 5, 5));
        centerPanel2.add(new JLabel("Total"));
        centerPanel2.add(new JTextField(1));
        centerPanel2.add(new JLabel("Number"));
        centerPanel2.add(new JTextField(1));
        centerPanel2.add(new JLabel("Average"));
        centerPanel2.add(new JTextField(1));
        centerPanel2.setBorder(new EmptyBorder(5, 5, 5, 200));
        add(centerPanel2, BorderLayout.SOUTH);

    }
}
