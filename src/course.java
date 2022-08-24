
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class course {
    
     public void insertUpdateDeleteStudent(char operation,Integer id,String label,Integer hours) throws SQLException
    {
        Connection con=MyConnection.getConnection();
        PreparedStatement ps;
        
        if(operation=='i')
        {
            ps=con.prepareStatement("INSERT INTO `course`(`label`, `hours_number`) VALUES (?,?)");
            ps.setString(1,label);
            ps.setInt(2,hours);
              
            if(ps.executeUpdate()>0)
            {
                JOptionPane.showMessageDialog(null,"New Course Added");
            }
           
            }
         if(operation=='u')
        {
            ps=con.prepareStatement("UPDATE `course` SET `label`=?,`hours_number`=? WHERE `Id` =?");
            
            ps.setString(1,label);
            ps.setInt(2,hours);
            ps.setInt(3,id);
            
            
              
            if(ps.executeUpdate()>0)
            {
                JOptionPane.showMessageDialog(null," Course Data Updated");
            }
           
            }
         
         if(operation=='d')
        {
            int YesOrNo= JOptionPane.showConfirmDialog(null,"The Score Will  be Also Deleted","Delete Score",JOptionPane.CANCEL_OPTION);
            
            if(YesOrNo == JOptionPane.OK_CANCEL_OPTION)
            {
             ps=con.prepareStatement("DELETE FROM `course` WHERE `id`=?");
            ps.setInt(1,id);
           
            
            if(ps.executeUpdate()>0)
            {
                JOptionPane.showMessageDialog(null," Course Deleted");
            }
            }   
           
           
            }
   
}
     public boolean isCourseExist(String courseName)
     {
         boolean isExist=false;
         
         Connection con=MyConnection.getConnection();
         PreparedStatement ps;
        try {
            ps=con.prepareStatement("SELECT * FROM `course` WHERE `label` = ?");
            ps.setString(1,courseName);
            
            ResultSet rs=ps.executeQuery();
           
            
            if(rs.next())
            {
               isExist=true; 
            }
            else
            {
                
            }   
            
            
        } catch (SQLException ex) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        }
           return isExist;
     }
      

    void fillCourseJtable(JTable jTable1) {
        Connection con=MyConnection.getConnection();
         PreparedStatement ps;
        try {
            ps=con.prepareStatement("SELECT * FROM `course`");
            
            
            ResultSet rs=ps.executeQuery();
            DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
            Object[] row;
            
            while(rs.next())
            {
                row=new Object[3];
                row[0]=rs.getInt(1);
                row[1]=rs.getString(2);
                row[2]=rs.getInt(3);
               
                model.addRow(row);
                
                
                
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        } //To change body of generated methods, choose Tools | Templates.
    }
    
  public int  getCourseId(String courseLabel)
    {
        int courseId=0;
         Connection con=MyConnection.getConnection();
         PreparedStatement ps;
        try {
            ps=con.prepareStatement("SELECT * FROM `course` WHERE `label` = ?");
            ps.setString(1,courseLabel);
            
            ResultSet rs=ps.executeQuery();
           
            
            if(rs.next())
            {
                courseId=rs.getInt("Id");
            }
            else
            {
                
            }   
            
            
        } catch (SQLException ex) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return courseId;
    }
    
    void fillCourseCombo(JComboBox combo) {
        Connection con=MyConnection.getConnection();
         PreparedStatement ps;
        try {
            ps=con.prepareStatement("SELECT * FROM `course`");
            
            
            ResultSet rs=ps.executeQuery();
           
            while(rs.next())
            {
               combo.addItem(rs.getString(2));
             }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        } //To change body of generated methods, choose Tools | Templates.
    }
      
         
}
