package softwaricaquiz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
        
public class SoftwaricaQuiz extends JFrame implements ActionListener{
    JButton b1;
    JTextField t1;
    SoftwaricaQuiz(){
        setBounds(300, 200, 1200, 500 ); //frame location,size
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setLayout(null);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("softwaricaQuiz/images/login.jpg"));
        JLabel l1 = new JLabel(i1);
        l1. setBounds(-100 ,0 , 1400, 400 );
        add(l1);
        
        JLabel l2 = new JLabel("Softwarica Quiz");
        l2.setFont(new Font("Times new roman",Font.BOLD, 45));
        l2.setForeground(Color.blue);
        l2.setBounds(100,35,1200,800);
        add(l2);
         
        JLabel l3 = new JLabel("Enter Your Name:");
        l3.setFont(new Font("Times new roman",Font.BOLD, 20));
        l3.setForeground(Color.blue);
        l3.setBounds(500,35,1200,800);
        add(l3);
        
        t1 = new JTextField();
        t1.setFont(new Font("Times new roman",Font.BOLD, 20));
        t1.setBounds(670,420,300,25);
        add(t1);
        
        b1 = new JButton("Enter");
        b1.setBackground(new Color(30,144,254));
        b1.addActionListener(this);
        b1.setBounds(1000,420,150,25);
        add(b1);
        
        
        setVisible(true);//makes the screen visible
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()== b1){
            
            String Username = t1.getText();
            this.setVisible(false);
            new Quiz();
            
        }
    
    }
    
    
    public static void main(String[] args) {
    
    new SoftwaricaQuiz();
    
    }
    
}
