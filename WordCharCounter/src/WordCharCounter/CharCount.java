package WordCharCounter;

import java.awt.*;  
import javax.swing.*;  
import java.awt.event.*;  
public class CharCount extends JFrame implements ActionListener{  
    JLabel lb1,lb2;  
    JTextArea ta;  
    JButton b;  
    JButton pad,text;  
    CharCount(){  
        super("Char Word Count Tool - JTP");  
        //show char amount section
        lb1=new JLabel("Characters: ");  
        lb1.setBounds(50,50,100,20);
        //show words amount section
        lb2=new JLabel("Words: ");  
        lb2.setBounds(50,80,100,20);  
        //Typing area  
        ta=new JTextArea();  
        ta.setBounds(50,110,300,200);  
        //count button
        b=new JButton("count");  
        b.setBounds(50,320, 80,30);
        b.addActionListener(this);  
        //adjust pad color button
        pad=new JButton("Pad Color");  
        pad.setBounds(140,320, 110,30);  
        pad.addActionListener(this);  
        //adjust text color button
        text=new JButton("Text Color");  
        text.setBounds(260,320, 110,30);  
        text.addActionListener(this);  
  
        add(lb1);add(lb2);add(ta);add(b);add(pad);add(text);  
        //pad area  
        setSize(400,400);  
        setLayout(null);//using no layout manager  
        setVisible(true);  
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }  
    
    public void actionPerformed(ActionEvent e){  
        if(e.getSource()==b){  
        String text=ta.getText();  
        lb1.setText("Characters: "+text.length());  
        String words[]=text.split("\\s");  
        lb2.setText("Words: "+words.length);  
        }else if(e.getSource()==pad){  
            Color c=JColorChooser.showDialog(this,"Choose Color",Color.BLACK);  
            ta.setBackground(c);  
        }else if(e.getSource()==text){  
            Color c=JColorChooser.showDialog(this,"Choose Color",Color.BLACK);  
            ta.setForeground(c);  
        }  
    }  
}  
  
