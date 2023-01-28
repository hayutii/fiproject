/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author hayat
 */
@ManagedBean 
@RequestScoped
public class soldtabl {

    public List<Sold> getSoldss() 
            
            throws SQLException, ClassNotFoundException {
         List<Sold> solds=new ArrayList<>();
         // databescon con = new databescon();
          //Statement st;
         try {
              //Connection con=null;
           databescon db = new databescon();
           Connection con = db.connMethod();  
              //st= con.connMethod().createStatement();
              ResultSet rs = con.createStatement().executeQuery("select * from SOOLD");
              while (rs.next()) {
                Sold so = new Sold();
                so.setName(rs.getString("NAME"));
                so.setAddres(rs.getString("ADDRES"));
                so.setDate(rs.getString("DAT"));
                so.setQuantity(rs.getString("QUANTITY"));
                so.setPaymentway(rs.getString("PAYMENTWAY"));
                so.setItemtayp(rs.getString("ITEMTAYP"));
                so.setBar_code(rs.getString("BAR_CODE"));
                so.setCost(rs.getString("COST"));
                solds.add(so);
         }
    } 
         catch (ClassNotFoundException | SQLException e) {
             
         }
         return solds;

    }
    
public List<Sold> getItems() 
            
            throws SQLException, ClassNotFoundException {
         List<Sold> itemss=new ArrayList<>();
          try {
              //Connection con=null;
           databescon db = new databescon();
           Connection con = db.connMethod();  
            ResultSet rs = con.createStatement().executeQuery("select * from ITEMSS");
                
              while (rs.next()) {
                Sold sol = new Sold();
                  //Sold so = new Sold();
                sol.setNo(rs.getString("NO"));
                sol.setItems(rs.getString("ITEMS"));
                itemss.add(sol);
                 }
    } 
         catch (ClassNotFoundException | SQLException e) {
             
         }
         return itemss;
}

 public List<Sold> getCoco() 
             throws SQLException, ClassNotFoundException {
         List<Sold> itemm=new ArrayList<>();
          try {
              //Connection con=null;
           databescon db = new databescon();
           Connection con = db.connMethod();  
            ResultSet rs = con.createStatement().executeQuery("select *from ITEMSS where no=10");
                
              while (rs.next()) {
                Sold sol = new Sold();
                  //Sold so = new Sold();
                sol.setNo(rs.getString("NO"));
                sol.setItems(rs.getString("ITEMS"));
                itemm.add(sol);
                 }
    } 
         catch (ClassNotFoundException | SQLException e) {
             
         }
         return itemm;

}
 public List<Sold> getCosmo() 
             throws SQLException, ClassNotFoundException {
         List<Sold> item=new ArrayList<>();
          try {
              //Connection con=null;
           databescon db = new databescon();
           Connection con = db.connMethod();  
            ResultSet rs = con.createStatement().executeQuery("select *from ITEMSS where no=11");
                
              while (rs.next()) {
                Sold sol = new Sold();
                  //Sold so = new Sold();
                sol.setNo(rs.getString("NO"));
                sol.setItems(rs.getString("ITEMS"));
                item.add(sol);
                 }
    } 
         catch (ClassNotFoundException | SQLException e) {
             
         }
         return item;

}
 public List<Sold> getVage() 
             throws SQLException, ClassNotFoundException {
         List<Sold> iteml=new ArrayList<>();
          try {
              //Connection con=null;
           databescon db = new databescon();
           Connection con = db.connMethod();  
            ResultSet rs = con.createStatement().executeQuery("select *from ITEMSS where no=12");
                
              while (rs.next()) {
                Sold sol = new Sold();
                  //Sold so = new Sold();
                sol.setNo(rs.getString("NO"));
                sol.setItems(rs.getString("ITEMS"));
                iteml.add(sol);
                 }
    } 
         catch (ClassNotFoundException | SQLException e) {
             
         }
         return iteml;

}
}