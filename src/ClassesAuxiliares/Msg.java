
package ClassesAuxiliares;

import javax.swing.JOptionPane;


public class Msg {
    
    
    
    //Confirmações
    public static String confimaCadastro = "Cadastro realizado com Sucesso !";
    public static String confirmaAlteracao = "Alteração realizada com Sucesso !";
    public static String confirmaExcluisao = "Excluido com Sucesso !";
    
    //Perguntas
    public static String perguntaAlteracao = "Tem certeza que deseja realizar estas alterações ?";
    public static String perguntaExclusao = "Tem certeza que deseja realizar esta exclusão ?";
   
    //Exclamações
    public static String erroConexao = "Não foi possível realizar a operação no banco de Dados\nDetalhes do erro:\n\n";

        
    //Métodos
    public static void confirm(String txt){
       JOptionPane.showMessageDialog(null,txt, "Confirmação", 1);
    }     
    
    
    
    public static Boolean question(String txt){
       Boolean retorno = false; 
       int result = 0;
       result = JOptionPane.showConfirmDialog(null, txt ,"Confirmação", JOptionPane.YES_NO_OPTION);
       if(result == JOptionPane.YES_OPTION){
         retorno = true;       
       }
       return retorno;
    }  
    
    
     public static void exclamation(String txt){
        JOptionPane.showMessageDialog(null,txt, "Confirmação", 1);
    }  
}
