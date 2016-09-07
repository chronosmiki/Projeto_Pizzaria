package ClassesAuxiliares;


import javax.swing.JFrame;

//Classe que desabilita a Form Pai ao Chamar o Form filho
public class Modal {
    
    
    public static JFrame object;
    
    
    public Modal (JFrame object){    
    Modal.object = object;
    }
    
        
    public static  void setEnable(){
      object.setEnabled(true);    
    }
    
    public static void setDisable(){
    object.setEnabled(false);    
    }    
    
}
