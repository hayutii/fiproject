/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;


//import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
import java.util.ArrayList;
//import static java.util.Collections.list;
//import java.util.Arrays;
import java.util.List;
//import java.util.Map;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
//import javax.faces.context.FacesContext;
//import javax.faces.bean.SessionScoped;

/**
 *
 * @author hayat
 */
@ManagedBean 
@RequestScoped
public class Sold {
    private String name;
    private String addres;
    private String dat;
    private String quantity;
    private String paymentway;
  List<String> paymentwayList;
    private String itemtayp;
    private String bar_code;

    public String getBar_code() {
        return bar_code;
    }

    public void setBar_code(String bar_code) {
        this.bar_code = bar_code;
    }
    
    
        
    private String cost;
  
    private String items;
    private String no;
   private String  itemss;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

   

    public String getItemss() {
        return itemss;
    }

    public void setItemss(String itemss) {
        this.itemss = itemss;
    }
  
    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public List<String> getPaymentwayList() {
        return paymentwayList;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getDate() {
        return dat;
    }

    public void setDate(String date) {
        this.dat = date;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPaymentway() {
        return paymentway;
    }

    public void setPaymentway(String paymentway) {
        this.paymentway = paymentway;
    }

    public String getItemtayp() {
        return itemtayp;
    }

    public void setItemtayp(String itemtayp) {
        this.itemtayp = itemtayp;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
    public  Sold(){
       paymentwayList=new ArrayList<>();
        paymentwayList.add("ATM");
        paymentwayList.add("MASTER CARD");
        paymentwayList.add("VISA");
        
      
                
    }


 public void soll() throws ClassNotFoundException {
     
     
       try{
           // pstmt = getConnection().prepareStatement("insert into customer_record (customer_name, customer_phone, customer_destination, customer_start, customer_fee) values (?, ?, ?, ?, ?)");         
           Sold sl=new Sold();
       databescon db = new databescon();
            Connection con = db.connMethod();
           // String sql = "Insert into SOLD (name,addres,dat,quantity,itemtayp,paymentway,cost) values(?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement("Insert into SOOLD (name,addres,dat,quantity,itemtayp,paymentway,bar_code,cost) values(?,?,?,?,?,?,?,?)");
           pst.setString(1,name);
            pst.setString(2,addres);
            pst.setString(3,dat);
            pst.setString(4,quantity);
            pst.setString(5,itemtayp);
            pst.setString(6, paymentway);
            pst.setString(7,bar_code);
            pst.setString(8, cost);
            pst.executeUpdate();
      }
      catch(SQLException e)
      {
      
      System.out.print(e);
      }
 }
 public void adds() throws ClassNotFoundException {
     
     
       try{
            
           Sold sl=new Sold();
       databescon db = new databescon();
            Connection con = db.connMethod();
            PreparedStatement pst = con.prepareStatement("Insert into ITEMSS (no,items) values(?,?)");
                    pst.setString(1,no);
                    pst.setString(2,items);
                     pst.executeUpdate();
                      }
      catch(SQLException e)
      {
      
      System.out.print(e);
      }
 }
 
 public  void update() throws ClassNotFoundException, SQLException{
     try {
            
           
            databescon db = new databescon();
            Connection con = db.connMethod();
            
            PreparedStatement pst = con.prepareStatement("update  SOOLD set name=?, addres=?, dat=?, quantity=?, itemtayp=?, paymentway=?, cost=? where bar_code=? ");
           pst.setString(1,name);
            pst.setString(2,addres);
            pst.setString(3,dat);
            pst.setString(4,quantity);
            pst.setString(5,itemtayp);
            pst.setString(6, paymentway);
            pst.setString(7, cost);
            pst.setString(8,bar_code);
            
            pst.executeUpdate();

      }
      catch(SQLException | ClassNotFoundException e)
      {
      
      System.out.print(e);
      }
       
  }
}