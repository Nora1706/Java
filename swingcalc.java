import javax.swing.*;
import java.awt.*;
public class swingcalc extends JFrame{
  swingcalc(){
    JButton bt1=new JButton("+");
    JButton bt2=new JButton("-");
    JButton bt3=new JButton("*");
    JButton bt4=new JButton("/");
    JButton bt5=new JButton("1");
    JButton bt6=new JButton("2");
    JButton bt7=new JButton("3");
    JButton bt8=new JButton("4");
    JButton bt9=new JButton("5");
    JButton bt10=new JButton("6");
    JButton bt11=new JButton("7");
    JButton bt12=new JButton("8");
    JButton bt13=new JButton("9");
    JButton bt14=new JButton("10");
    JButton bt15=new JButton("=");
    JButton bt16=new JButton("AC");

     setLayout(null);
     setSize(1000,1000);
     bt1.setBounds(200,150,50,50);
     bt2.setBounds(250,150,50,50);
     bt3.setBounds(300,150,50,50);
     bt4.setBounds(350,150,50,50);
     bt5.setBounds(400,150,50,50);
     bt6.setBounds(200,200,50,50);
     bt7.setBounds(250,200,50,50);
     bt8.setBounds(300,200,50,50);
     bt9.setBounds(350,200,50,50);     
     bt10.setBounds(400,200,50,50);
     bt11.setBounds(200,250,50,50);
     bt12.setBounds(250,250,50,50);
     bt13.setBounds(300,250,50,50);
     bt14.setBounds(350,250,50,50);
     bt15.setBounds(400,250,50,50);
     bt16.setBounds(200,300,100,100);
     



     add(bt1);
     add(bt2);
     add(bt3);
     add(bt4);
     add(bt5);
     add(bt6);
     add(bt7);
     add(bt8);
     add(bt9);
     add(bt10);
     add(bt11);
     add(bt12);
     add(bt13);
     add(bt14);
     add(bt15);
     add(bt16);
    


     setVisible(true);

  
}
public static void main(String[] args){
new swingcalc();
}




}

