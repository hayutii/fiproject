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
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 *
 * @author hayat
 */
@ManagedBean
public class validben {
    private String username;
    private String passworde;
    private String lname;
    private String fname;
    private String address;
    private String phon_no;

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
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassworde() {
        return passworde;
    }
// ADDMIN VALIDATION
    
    
    public void setPassworde(String passworde) {
        this.passworde = passworde;
    }
      public String validate(){
         
         if(username.equals("HAMUZ")&&(passworde.equals("hamuz123"))){
             
             
             return "userpag";
         }
     
     else {
            FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                            "Incorrect Username and Passowrd",
                            ""));
            return "oner";
        }
      }
      
      //USRE VALIDATION
       public String uservalidation(){
           
                  try{
             databescon db = new databescon();
            Connection con =db.connMethod();
                
            PreparedStatement ps=con.prepareStatement("select FNAME,PASSWORDE from USERDETAL where FNAME=? and PASSWORDE=?");
         
            ps.setString(1, fname);
            ps.setString(2, passworde);
             ResultSet rs=ps.executeQuery();
        if(rs.next()){
              return "custom"; 
        } else 
            return "rigster";
           
          } catch (ClassNotFoundException | SQLException ex) {
              System.out.println("error");
          }
            
         
                    
      
      return "custom";
           
        
           
       }
      
}
  

