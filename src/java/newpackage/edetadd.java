/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import com.sun.xml.rpc.processor.modeler.j2ee.xml.string;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class edetadd {
     private String items;
    private String no;
private String bar_code;

    public String getBar_code() {
        return bar_code;
    }

    public void setBar_code(String bar_code) {
        this.bar_code = bar_code;
    }

 
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
public static String delete(int bar_code) throws ClassNotFoundException, SQLException{
     try {
            
           
             databescon db = new databescon();
            Connection con = db.connMethod();
             Sold sol = new Sold();
            String sql = "DELETE FROM SOOLD WHERE BAR_CODE =?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, bar_code);
              ps.executeUpdate();
     }
     catch(ClassNotFoundException | SQLException e){
     
     }
           System.out.println("some problem is found");
        return "/edetpag.xhtml?faces-redirect=true";
  
}
  public  String deleteitem(String items ) throws ClassNotFoundException, SQLException{
     try {
            
           
            databescon db = new databescon();
            Connection con = db.connMethod();
            String sql = "DELETE FROM ITEMSS WHERE ITEMS=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, items);  
              ps.executeUpdate();
     }
     catch(ClassNotFoundException | SQLException e){
       System.out.println("some problem is found");
     }
      return "/databes.xhtml?faces-redirect=true";
  }
    
}
