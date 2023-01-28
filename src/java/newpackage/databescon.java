/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


class databescon {
     static final String JDBC_DRIVER="oracle.jdbc.driver.OracleDriver";
    static final String DB_URL="jdbc:oracle:thin:@localhost:1521:xe";
    static final String USERNAME="ORACLE";
    static final String PASSWORD="1234";
    Connection con=null;
    public Connection connMethod() throws ClassNotFoundException, SQLException{
        Class.forName(JDBC_DRIVER);
        con=DriverManager.getConnection(DB_URL, USERNAME,PASSWORD);
        if(con!= null)
        {
            System.out.println("Connected to database succefully");
        }else{
            System.out.println("Faild to connect to Orale DB");
        }
        return con;
    }
          public static void main( String[] args) throws ClassNotFoundException, SQLException{ 
              databescon db=new databescon();
              System.out.print(db.connMethod());
              
          }
            
}

    

