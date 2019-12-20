import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class MyConnection {
    public static Connection getConnection(){
        Connection cn=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn= DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant","root","");
            Statement st=cn.createStatement();
        }
         catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
        return cn;
    }
}
