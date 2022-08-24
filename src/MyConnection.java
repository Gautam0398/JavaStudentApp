import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MyConnection {
       public static Connection getConnection()
       {
           Connection con=null;
           try {
               Class.forName("com.mysql.jdbc.Driver");
               con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stdmgdb","root","gautam@khushi12");
           } catch (ClassNotFoundException | SQLException ex){ 
               System.out.println(ex.getMessage());
               System.out.println(con);
               
               
           }
           return con;
       }
               
 public static void main(String[] args){
        MyConnection obj=new MyConnection();
       Connection con2=obj.getConnection();
       System.out.print(con2);
     
 }   
}
