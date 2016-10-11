
package Controls;

import Dao.*;
import Models.*;
import java.util.ArrayList;

public class OperadorControl {
    
   //INSTANCIAS DAS CLASSES PARA ACESSO AO BANCO DE DADOS 
   private ClienteDao clienteDao = new ClienteDao();
   private ProdutoDao produtoDao = new ProdutoDao();
   private UsuarioDao usuarioDao = new UsuarioDao();
   private PedidoDao pedidoDao = new PedidoDao();
   
   private ClienteModel clienteModel;  
   private ProdutoModel produtoModel; 
   private UsuarioModel usuarioModel;
   private PedidoModel pedidoModel;
   
   public static String pesq;
   
   
   //RECEBE A INSTANCIA DO OBJETO A SER TRATADO NO CONSTRUTOR
   public OperadorControl(Object object){  
          
    if(object instanceof ClienteModel){
        clienteModel = (ClienteModel) object;        
    }
    if(object instanceof ProdutoModel) {        
        produtoModel = (ProdutoModel) object;          
    } 
    else if(object instanceof UsuarioModel){
        usuarioModel = (UsuarioModel) object;          
   }
    else if(object instanceof PedidoModel){
        pedidoModel = (PedidoModel) object;          
   }
 }
   
    public OperadorControl(){            
    
   }
   
   
   
     
   
    //METODOS DE MANIPULAÇÃO DO CLIENTE
    public Boolean inserirCliente(){
             return clienteDao.inserir(clienteModel);
    }        
    public Boolean alterarCliente() {
            return clienteDao.alterar(clienteModel);                          
    } 
    public Boolean excluirCliente() {
           return clienteDao.excluir(clienteModel);                 
    }     
    public ArrayList pesquisarCliente() {
           return clienteDao.pesquisar(pesq);
    }
    
    
       
    
    
    //METODOS DE MANIPULACAO DOS PRODUTOS
    public Boolean inserirProduto(){           
        return produtoDao.inserir(produtoModel);
    }        
    public Boolean alterarProduto() {
          return produtoDao.alterar(produtoModel);                          
    } 
    public Boolean excluirProduto() {
         return produtoDao.excluir(produtoModel);                 
    }      
    public ArrayList pesquisarProduto() {
         return produtoDao.pesquisar(pesq);  
        
    }
    
   
    
    
    
    //METODOS DE MANIPULACAO DOS USUARIOS
    public Boolean inserirUsuario(){
          return usuarioDao.inserir(usuarioModel);
    }        
    public Boolean alterarUsuario() {
          return usuarioDao.alterar(usuarioModel);                          
    } 
    public Boolean excluirUsuario() {
         return usuarioDao.excluir(usuarioModel);                 
    }      
    public ArrayList pesquisarUsuario() {
         return usuarioDao.pesquisar(pesq);                           
    }
                  
    
}
