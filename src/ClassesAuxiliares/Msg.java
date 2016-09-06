
package ClassesAuxiliares;

import javax.swing.JOptionPane;


public class Msg {
    
    //Mensagens
    public static String confimaCadastro = "Cadastro realizado com Sucesso !";
    
        
    //Métodos
    public static void confirm(String txt){
        JOptionPane.showMessageDialog(null,txt, "Confirmação", 1);
    }     
    
    
    
    public static void question(String txt){
        JOptionPane.showMessageDialog(null,txt, "Confirmação", 1);
    }  
    
    
     public static void exclamation(String txt){
        JOptionPane.showMessageDialog(null,txt, "Confirmação", 1);
    }  
}
