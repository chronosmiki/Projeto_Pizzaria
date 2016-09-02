/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesAuxiliares;

import Views.LoginView;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ShowDate extends LoginView{
    
   private Date date = new Date();
   private final Thread t;
    
   public ShowDate(){
            t = new Thread (() -> {
            lbDate.setText("São Paulo, " + String.valueOf(date.getDate() + " de " + date.getMonth() + " de " + date.getYear() + " - " + date.getHours() + " : " + date.getMinutes() + " : " + date.getSeconds()));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
            }             
        });     
   }
     
        public Thread getDate (){
         return this.t;
        }
    }    

