# Metropolitan_materijali_KI105
Ovde se nalaze materijali vazni za predmet KI105 GUI programiranje

********************************************************************************************************************************
Linkovi za prvu lekciju:

https://www.youtube.com/watch?v=uXitpup0l-s&feature=youtu.be

https://www.youtube.com/watch?v=mgnWYBaJuUk&feature=youtu.be

https://www.youtube.com/watch?v=gpCVpbyXALQ&feature=youtu.be

https://www.youtube.com/watch?v=pFYOZNc5Jt8&feature=youtu.be

https://www.youtube.com/watch?v=052U-bWEXrk&feature=youtu.be

https://www.youtube.com/watch?v=_jJf-RF6dZY&feature=youtu.be

https://www.youtube.com/watch?v=mN9NFwPHzYk&feature=youtu.be

https://www.youtube.com/watch?v=Yqs-zOLSNDQ&feature=youtu.be

https://www.youtube.com/watch?v=HYzRte8bYQ8&feature=youtu.be

https://www.youtube.com/watch?v=FdQX8sUNO-s&feature=youtu.be

https://www.youtube.com/watch?v=NWhkCZZumAE&feature=youtu.be

https://www.youtube.com/watch?v=3sZiH6Sej38&feature=youtu.be

https://www.youtube.com/watch?v=sajGQVz5njA&feature=youtu.be

https://www.youtube.com/watch?v=NWhkCZZumAE&feature=youtu.be

https://www.youtube.com/watch?v=_Se_q3L2JwQ&feature=youtu.be

https://www.youtube.com/watch?v=3cdAO4BiTFs&feature=youtu.be

********************************************************************************************************************************
Linkovi za drugu lekciju:

https://www.youtube.com/watch?v=2l5-5PMUc5Y&feature=youtu.be

https://www.youtube.com/watch?v=2l5-5PMUc5Y&feature=youtu.be

https://www.youtube.com/watch?v=OWOeE90ET6w&feature=youtu.be

https://www.youtube.com/watch?v=ydQWhluoBXM&feature=youtu.be

https://www.youtube.com/watch?v=Aqdke42l0KI&feature=youtu.be

https://www.youtube.com/watch?v=FdQX8sUNO-s&feature=youtu.be

https://www.youtube.com/watch?v=hF8h9rhotME&feature=youtu.be

**************************************************************************************************************************************
Linkovi za trecu lekciju:

https://www.youtube.com/watch?v=7LxWQIDOzyE&feature=youtu.be

https://www.youtube.com/watch?v=SpL3EToqaXA&feature=youtu.be

https://www.youtube.com/watch?v=HFAsMWkiLvg&feature=youtu.be

https://www.youtube.com/watch?v=BY-4ONH0DFE&feature=youtu.be

https://www.youtube.com/watch?v=s8GomyEOA8w&feature=youtu.be

https://www.youtube.com/watch?v=6Zi2L0kHSx4&feature=youtu.be

**************************************************************************************************************************************
Link za sajt sa dobrim kodovima:

https://www.thecrazyprogrammer.com/2014/06/program-to-create-calculator-using-java-swing.html

Kod za kalkulator:


import javax.swing.*;
import java.awt.event.*;
 
 
class Calc implements ActionListener
{
    JFrame f;
    JTextField t;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,bsub,badd,bdec,beq,bdel,bclr;
 
    static double a=0,b=0,result=0;
    static int operator=0;
 
    Calc()
    {
        f=new JFrame("Calculator");
        t=new JTextField();
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        b0=new JButton("0");
        bdiv=new JButton("/");
        bmul=new JButton("*");
        bsub=new JButton("-");
        badd=new JButton("+");
        bdec=new JButton(".");
        beq=new JButton("=");
        bdel=new JButton("Delete");
        bclr=new JButton("Clear");
        
        t.setBounds(30,40,280,30);
        b7.setBounds(40,100,50,40);
        b8.setBounds(110,100,50,40);
        b9.setBounds(180,100,50,40);
        bdiv.setBounds(250,100,50,40);
        
        b4.setBounds(40,170,50,40);
        b5.setBounds(110,170,50,40);
        b6.setBounds(180,170,50,40);
        bmul.setBounds(250,170,50,40);
        
        b1.setBounds(40,240,50,40);
        b2.setBounds(110,240,50,40);
        b3.setBounds(180,240,50,40);
        bsub.setBounds(250,240,50,40);
        
        bdec.setBounds(40,310,50,40);
        b0.setBounds(110,310,50,40);
        beq.setBounds(180,310,50,40);
        badd.setBounds(250,310,50,40);
        
        bdel.setBounds(60,380,100,40);
        bclr.setBounds(180,380,100,40);
        
        f.add(t);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(bdiv);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(bmul);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(bsub);
        f.add(bdec);
        f.add(b0);
        f.add(beq);
        f.add(badd);
        f.add(bdel);
        f.add(bclr);
        
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(350,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        badd.addActionListener(this);
        bdiv.addActionListener(this);
        bmul.addActionListener(this);
        bsub.addActionListener(this);
        bdec.addActionListener(this);
        beq.addActionListener(this);
        bdel.addActionListener(this);
        bclr.addActionListener(this);
    }
 
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
            t.setText(t.getText().concat("1"));
        
        if(e.getSource()==b2)
            t.setText(t.getText().concat("2"));
        
        if(e.getSource()==b3)
            t.setText(t.getText().concat("3"));
        
        if(e.getSource()==b4)
            t.setText(t.getText().concat("4"));
        
        if(e.getSource()==b5)
            t.setText(t.getText().concat("5"));
        
        if(e.getSource()==b6)
            t.setText(t.getText().concat("6"));
        
        if(e.getSource()==b7)
            t.setText(t.getText().concat("7"));
        
        if(e.getSource()==b8)
            t.setText(t.getText().concat("8"));
        
        if(e.getSource()==b9)
            t.setText(t.getText().concat("9"));
        
        if(e.getSource()==b0)
            t.setText(t.getText().concat("0"));
        
        if(e.getSource()==bdec)
            t.setText(t.getText().concat("."));
        
        if(e.getSource()==badd)
        {
            a=Double.parseDouble(t.getText());
            operator=1;
            t.setText("");
        } 
        
        if(e.getSource()==bsub)
        {
            a=Double.parseDouble(t.getText());
            operator=2;
            t.setText("");
        }
        
        if(e.getSource()==bmul)
        {
            a=Double.parseDouble(t.getText());
            operator=3;
            t.setText("");
        }
        
        if(e.getSource()==bdiv)
        {
            a=Double.parseDouble(t.getText());
            operator=4;
            t.setText("");
        }
        
        if(e.getSource()==beq)
        {
            b=Double.parseDouble(t.getText());
        
            switch(operator)
            {
                case 1: result=a+b;
                    break;
        
                case 2: result=a-b;
                    break;
        
                case 3: result=a*b;
                    break;
        
                case 4: result=a/b;
                    break;
        
                default: result=0;
            }
        
            t.setText(""+result);
        }
        
        if(e.getSource()==bclr)
            t.setText("");
        
        if(e.getSource()==bdel)
        {
            String s=t.getText();
            t.setText("");
            for(int i=0;i<s.length()-1;i++)
            t.setText(t.getText()+s.charAt(i));
        }        
    }
 
    public static void main(String...s)
    {
        new Calc();
    }
}
