package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConexaoMysql {
    
        private static  Connection conn;
             
                
                  static Connection open(){
                        try {
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(ConexaoMysql.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            if(conn.isClosed()){
                            conn = DriverManager.getConnection("localhost:3306/mysql?zeroDateTimeBehavior=convertToNull/projeto_pizzaria","root","@#$ucesso#@");
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(ConexaoMysql.class.getName()).log(Level.SEVERE, null, ex);
                        }     
                        return conn;
                  }
                  
                  
                  
                  static void close(){
                        try {
                            if(!conn.isClosed()){
                            conn.close();
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(ConexaoMysql.class.getName()).log(Level.SEVERE, null, ex);
                        }                                   
                  }
}


                                                                                                                      
      
    

