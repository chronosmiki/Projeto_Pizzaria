package Dao;

import ClassesAuxiliares.Msg;
import java.sql.Connection;
import java.sql.DriverManager;


public class ConexaoMysql {
    
        private static  Connection conn;
             
                

            static Connection open() throws Exception
            {                                                                                                                                                                                                        
              conn = DriverManager.getConnection("jdbc:mysql://localhost/pizza","root","@#$ucesso#@");                                                                                                                                                
              return conn;
            }


            static void close(){
            try{                
              if(!conn.isClosed()){
              conn.close();
              } 
            }
            catch(Exception ex){
              Msg.exclamation(Msg.erroConexao + ex.getMessage());
            }
            }
                                 
}


                                                                                                                      
      
    

