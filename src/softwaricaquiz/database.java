
package softwaricaquiz;
import java.sql.*;


public class database {
    public static void main(String[] args){
        
        try{
            Connection myConn = DriverManager.getConnection("jdbc;mysql://localhost:3306/softwarica_quiz","root","Samyam2896");
            Statement myState = myConn.createStatement();
            ResultSet myRs = myState.executeQuery("SELECT * FROM softwarica_quiz.username");
            
            while(myRs.next()){
                
                System.out.println(myRs.getString("user"));
            }
            myConn.close();
        }
        
        catch(Exception exc){
            exc.printStackTrace();
        }
    }
    
    
    
    
    
}
    

    

