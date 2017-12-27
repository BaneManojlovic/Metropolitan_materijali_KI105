/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak1;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;

/**
 *
 * @author manojlovic
 */
public class Zadatak1 extends JFrame{
    
    private JButton btn1, btn2, btn3, btn4, 
            btn5, btn6, btn7, btn8, btn9, 
            btn0, btnTacka, btnClear, btnJednako, btnPlus;
    private JTextField textField;
    double rezultat=0, a=0, b=0;
 
    public static void main(String[] args) {
        Zadatak1 frame = new Zadatak1();
        frame.setTitle("Calculator");
        frame.setSize(250, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    public Zadatak1() {
        // Kreiranje panela p1 za dugmad i postavljanje GridLayout menadžera 
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4, 3, 10, 10));      
        
        // Dodavanje dugmadi na panel        
        p1.add(btn1 = new JButton("1")); 
        p1.add(btn2 = new JButton("2")); 
        p1.add(btn3 = new JButton("3")); 
        p1.add(btn4 = new JButton("4")); 
        p1.add(btn5 = new JButton("5")); 
        p1.add(btn6 = new JButton("6")); 
        p1.add(btn7 = new JButton("7")); 
        p1.add(btn8 = new JButton("8")); 
        p1.add(btn9 = new JButton("9"));
        p1.add(btn0 = new JButton("0"));
        p1.add(btnTacka = new JButton("."));

        // Kreiranje panela p2 za smeštaj tekstualnih polja  i panela p1 
        JPanel p2 = new JPanel(new BorderLayout(10, 10));
        p2.add(textField = new JTextField(), BorderLayout.NORTH);
        Border empty = BorderFactory.createEmptyBorder(15,15,5,5);
        p2.setBorder(empty);
        p2.add(p1, BorderLayout.CENTER);
        // Dodavanje sadržaja u okvir 
        add(p2, BorderLayout.WEST);
        
        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(3, 1, 10, 10));
        Border empty2 = BorderFactory.createEmptyBorder(45,15,35,5);
        p3.setBorder(empty2);
        p3.add(btnPlus = new JButton("+")); 
        p3.add(btnJednako = new JButton("=")); 
        p3.add(btnClear = new JButton("Clear")); 
        add(p3, BorderLayout.EAST);
        
        // Aktivnost za svako dugme
        btn1.addActionListener(new MyListener(this)); 
        btn2.addActionListener(new MyListener(this)); 
        btn3.addActionListener(new MyListener(this)); 
        btn4.addActionListener(new MyListener(this)); 
        btn5.addActionListener(new MyListener(this)); 
        btn6.addActionListener(new MyListener(this));
        btn7.addActionListener(new MyListener(this)); 
        btn8.addActionListener(new MyListener(this)); 
        btn9.addActionListener(new MyListener(this)); 
        btn0.addActionListener(new MyListener(this)); 
        btn0.addActionListener(new MyListener(this)); 
        btnTacka.addActionListener(new MyListener(this));
        btnPlus.addActionListener(new MyListener(this));
        btnJednako.addActionListener(new MyListener(this));
        btnClear.addActionListener(new MyListener(this));
     
    }

    private class MyListener implements ActionListener {

        public MyListener() {
        }

        private MyListener(Zadatak1 aThis) {
 //           throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            // Primamo korisnikov unos sa dugmadi
            if(e.getSource()==btn1)
            textField.setText(textField.getText().concat("1"));
            
            if(e.getSource()==btn2)
            textField.setText(textField.getText().concat("2"));
            
            if(e.getSource()==btnPlus)
            {
               a=Double.parseDouble(textField.getText());
               b=Double.parseDouble(textField.getText());
               rezultat=a+b;
               textField.setText(""+rezultat);
             } 
            
            String data = e.getActionCommand();
            textField.setText(data);
            System.out.println(textField.getText());
        }
    }

}
