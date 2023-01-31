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
public class userrigs {
     private String passworde;
    private String lname;
    private String fname;
    private String address;
    private String phon_no;

    public String getPassworde() {
        return passworde;
    }

    public void setPassworde(String passworde) {
        this.passworde = passworde;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhon_no() {
        return phon_no;
    }

    public void setPhon_no(String phon_no) {
        this.phon_no = phon_no;
    }
     public void rigster() throws ClassNotFoundException {
     
     
       try{
           // pstmt = getConnection().prepareStatement("insert into customer_record (customer_name, customer_phone, customer_destination, customer_start, customer_fee) values (?, ?, ?, ?, ?)");         
           //Sold sl=new Sold();
       databescon db = new databescon();
            Connection con = db.connMethod();
           // String sql = "Insert into SOLD (name,addres,dat,quantity,itemtayp,paymentway,cost) values(?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement("Insert into USERDETAL (FNAME,LNAME,ADDRESS,PHON_NO,PASSWORDE) values(?,?,?,?,?)");
           pst.setString(1,fname);
            pst.setString(2,lname);
            pst.setString(3,address);
            pst.setString(4,phon_no);
            pst.setString(5,passworde);
            
            pst.executeUpdate();
      }
      catch(SQLException e)
      {
      
      System.out.print(e);
      }
 }
 
}