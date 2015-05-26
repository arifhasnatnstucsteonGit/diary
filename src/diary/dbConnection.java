
package diary;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class dbConnection {
    
    Connection conn=null;
    public static Connection con(){
        
        
        
        try {
            Class.forName("org.sqlite.JDBC");
            
            //for mysql
            // Class.forName("com.mysql.jdbc.Driver");
            
        } catch (Exception e) {
            e.printStackTrace();
             JOptionPane.showMessageDialog(null, " haler bolod !! bismillai golod!??? ");
            
        }
        
        Connection conn=null;
        
        try {
            
            conn=  DriverManager.getConnection("jdbc:sqlite:DiaryDB.sqlite");
            //for mysql
            // conn= (Connection) DriverManager.getConnection("jdbc:mysql://localhost/One","root","");
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, " sdfsdfsd? ");
        }
        
        return conn;
    
    
    };
    
    
}
