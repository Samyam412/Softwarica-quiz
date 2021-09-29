
package softwaricaquiz;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Score extends JFrame implements ActionListener{

    private static int score;
    
    Score(String username,int score ){
        setBounds(600,150,750,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("softwaricaQuiz/images/score.png"));
        Image i2 = i1.getImage().getScaledInstance(500, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(230,10,300,250);
        add(l1);
        
        String user = SoftwaricaQuiz.t1.getText();
        JLabel l2 = new JLabel("Thank you "+ user + " for playing Softwarica Quiz  "   );
        l2.setBounds(45,30,600,30);
        l2.setFont(new Font("RALEWAY",Font.PLAIN, 26));
        
        add(l2);
        
        JLabel l3 = new JLabel("Your Score is  " + score   );
        l3.setBounds(40,400,600,30);
        l3.setFont(new Font("ARIAL",Font.BOLD, 26));
        
        add(l3);
        
        JButton b1 = new JButton("Play Again");
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        b1.setBounds(400,270,120,30);
        
    }
    

//    Score(String username, int score) {
//        throw new UnsupportedOperationException("Not supported yet.");
//        this.score = score;
//    }
    
    
    
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
        new SoftwaricaQuiz().setVisible(true);
        insertDB();
    }
    
    public void insertDB(){
        new Score("",0).setVisible(true);
        Connection connection = null;
        Statement stmt = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/softwarica_quiz", "root", "Samyam2896");
            System.out.println("hello"); 
            stmt = connection.createStatement();
            stmt.execute("INSERT INTO softwarica_quiz.username (user,score) " + "VALUES('" + SoftwaricaQuiz.username + "', '" + score + ")");
        } 
        catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                stmt.close();
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

