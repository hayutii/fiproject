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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassworde() {
        return passworde;
    }

    public void setPassworde(String passworde) {
        this.passworde = passworde;
    }
      public String validate(){
         
         if(username.equals("HAMUZ")&&(passworde.equals("hamuz123"))){
             
             
             return "databes";
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
      
      
}
  

