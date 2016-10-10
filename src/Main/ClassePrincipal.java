package Main;


import ClassesAuxiliares.SplashScreem;
import Views.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ClassePrincipal {
    
    public static void main(String[] args){
        
        //SplashScreem splash = new SplashScreem();
       // splash.mostraSplash();                   
       
       new PrincipalView().setVisible(true);
       //new LoginView().setVisible(true);
        
    }    
}
