/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author hayat
 */
@ManagedBean
public class NewClass {
    
     private String items;
    private String no;

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    
     public List<userrigs> getUsers() 
            throws SQLException, ClassNotFoundException {
         List<userrigs> userss=new ArrayList<>();
         // databescon con = new databescon();
          //Statement st;
         try {
              //Connection con=null;
           databescon db = new databescon();
           Connection con = db.connMethod();  
              //st= con.connMethod().createStatement();
              ResultSet rs = con.createStatement().executeQuery("select * from USERDETAL");
              while (rs.next()) {
                userrigs so = new userrigs();
                so.setFname(rs.getString("FNAME"));
                so.setLname(rs.getString("LNAME"));
                so.setAddress(rs.getString("ADDRES"));
                so.setPhon_no(rs.getString("PHON_NO"));
                so.setPassworde(rs.getString("PASSWORDE"));
                
                userss.add(so);
         }
    } 
         catch (ClassNotFoundException | SQLException e) {
             
         }
         return userss;

    
}
     
public  void updateitem() throws ClassNotFoundException, SQLException{
         try {


    databescon db = new databescon();
            Connection con = db.connMethod();
             PreparedStatement pst = con.prepareStatement("update ITEMSS set NO=? where ITEMS=? ");
             
           pst.setString(1,no);
            pst.setString(2,items);
  pst.executeUpdate();

      }
      catch(SQLException | ClassNotFoundException e)
      {
      
      System.out.print(e);
      }

}
    
}
