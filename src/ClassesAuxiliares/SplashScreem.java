
package ClassesAuxiliares;

import Main.Main;
import Views.LoginView;
import Views.SplashView;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SplashScreem {   
    
    
    public void mostraSplash (){
    Thread splash = new Thread(new Runnable(){
        @Override
        public void run() {
           SplashView splash =  new SplashView();
           splash.setVisible(true);
     
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                 splash.dispose();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(SplashScreem.class.getName()).log(Level.SEVERE, null, ex);
                }
             LoginView login = new LoginView();
             login.setVisible(true);
        }          
    });    
    splash.start();        
    }        
}
