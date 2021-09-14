
package softwaricaquiz;
import java.awt.Color;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Quiz extends JFrame implements ActionListener{
    
    JButton next,submit,quit,lifeline;
    public static int count = 0;
    JLabel qno,question;
    JRadioButton opt1, opt2, opt3, opt4;
    String q[][] = new String[10][5];
    ButtonGroup options;
    Quiz(){
        
        setBounds(250,50,1200, 800);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("softwaricaQuiz/images/quiz.jpg"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0,0,1200,500 );
        add(l1);
        
        qno = new JLabel("");
        qno.setFont(new Font("Tahome",Font.PLAIN,24));
        qno.setBounds(100,450,40,30);
        add(qno);
        
        question = new JLabel("What is your name?");
        question.setFont(new Font("Tahome",Font.PLAIN,24));
        question.setBounds(120,450,700,30);
        add(question);
        
        
        q[0][0] = "Which University is Softwarica partnered with?";
        q[0][1] = "Coventry University";
        q[0][2] = "London Metro University";
        q[0][3] = "Tribhuvan University";
        q[0][4] = "Harvard University";

        q[1][0] = "What is the name of Softwarica's chairman?";
        q[1][1] = "Samyam Katwal";
        q[1][2] = "Bigyan Shrestha";
        q[1][3] = "Mahabir Pun";
        q[1][4] = "Elon Musk";

        q[2][0] = "How many Courses are there in Softwarica?";
        q[2][1] = "1";
        q[2][2] = "2";
        q[2][3] = "3";
        q[2][4] = "4";

        q[3][0] = "Where is Softwarica located?";
        q[3][1] = "DilliBazar";
        q[3][2] = "Banepa";
        q[3][3] = "Jhapa";
        q[3][4] = "Chabel";

        q[4][0] = "How many canteens are there in Softwarica?";
        q[4][1] = "1";
        q[4][2] = "2";
        q[4][3] = "3";
        q[4][4] = "0";

        q[5][0] = "How long are the courses?";
        q[5][1] = "2 years";
        q[5][2] = "3 years";
        q[5][3] = "5 years";
        q[5][4] = "7 years";

        q[6][0] = "How many modules are there in the course?";
        q[6][1] = "40";
        q[6][2] = "81";
        q[6][3] = "63";
        q[6][4] = "47";

        q[7][0] = "What is the total credits of all modules?";
        q[7][1] = "180";
        q[7][2] = "90";
        q[7][3] = "360";
        q[7][4] = "720";

        q[8][0] = "Who teaches Programming and Algorithms?";
        q[8][1] = "Manoj Shrestha";
        q[8][2] = "Bikash Ghimirey";
        q[8][3] = "Shyam Sundar Khatiwada";
        q[8][4] = "Palisha Bajracharya";

        q[9][0] = "Which of the following is taught at first semester in Softwarica?";
        q[9][1] = "Object Oriented Programming";
        q[9][2] = "Mathematics for Computer Science";
        q[9][3] = "Database System";
        q[9][4] = "Software design";
        
        
        opt1 = new JRadioButton("");
        opt1.setFont(new Font("Dialog",Font.PLAIN,20));
        opt1.setBackground(Color.WHITE);
        opt1.setBounds(170,500,700,30);
        add(opt1);
        
        opt2 = new JRadioButton("");
        opt2.setFont(new Font("Dialog",Font.PLAIN,20));
        opt2.setBackground(Color.WHITE);
        opt2.setBounds(170,550,700,30);
        add(opt2);
        
        opt3 = new JRadioButton("");
        opt3.setFont(new Font("Dialog",Font.PLAIN,20));
        opt3.setBackground(Color.WHITE);
        opt3.setBounds(170,600,700,30);
        add(opt3);
        
        opt4 = new JRadioButton("");
        opt4.setFont(new Font("Dialog",Font.PLAIN,20));
        opt4.setBackground(Color.WHITE);
        opt4.setBounds(170,650,700,30);
        add(opt4);
        
        
        options = new ButtonGroup();
        options.add(opt1);
        options.add(opt2);
        options.add(opt3);
        options.add(opt4);
        
        next = new JButton("Next");
        next.setFont(new Font("Tahoma",Font.PLAIN,20));
        next.setBackground(new Color(30,144,255));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        
        next.setBounds(700,680,200,40);
        add(next);
        
        lifeline = new JButton("50/50");
        lifeline.setFont(new Font("Tahoma",Font.PLAIN,20));
        lifeline.setBackground(new Color(30,144,255));
        lifeline.setForeground(Color.WHITE);
        lifeline.addActionListener(this);
        lifeline.setBounds(905,680,200,40);
        add(lifeline);
        
        submit = new JButton("Submit");
        submit.setEnabled(false);
        submit.setFont(new Font("Tahoma",Font.PLAIN,20));
        submit.setBackground(new Color(30,144,255));
        submit.setForeground(Color.WHITE);
        submit.setBounds(700,722,200,40);
        submit.addActionListener(this);
        add(submit);
        
        quit = new JButton("Quit");
        quit.setFont(new Font("Tahoma",Font.PLAIN,20));
        quit.setBackground(new Color(30,144,255));
        quit.setForeground(Color.WHITE);
        quit.setBounds(905,722,200,40);
        quit.addActionListener(this);
        add(quit);
        
        start(0);
        
        
    }
    
     public void actionPerformed(ActionEvent ae){
         if(ae.getSource() == next){
             
         }else if(ae.getSource() == submit){
             
         }else if(ae.getSource() == lifeline){
             
         }else if(ae.getSource() == quit){
             
         }
         
         
         
     }
    
    public void start(int count){
        qno.setText("" + (count + 1) + ". ");
        question.setText(q[count][0]);
        opt1.setLabel(q[count][1]);
        opt2.setLabel(q[count][2]);
        opt3.setLabel(q[count][3]);
        opt4.setLabel(q[count][4]);
        options.clearSelection();
          
        
    
    }
    public static void main(String[] args){
        
        new Quiz().setVisible(true);
    }
}
