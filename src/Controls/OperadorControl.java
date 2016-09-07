
package Controls;

import Dao.*;
import Models.*;

public class OperadorControl {
    
   //INSTANCIAS DAS CLASSES PARA ACESSO AO BANCO DE DADOS 
   private ClienteDao clienteDao = new ClienteDao();
   private ProdutoDao produtoDao = new ProdutoDao();
   private UsuarioDao usuarioDao = new UsuarioDao();
   private PedidoDao pedidoDao = new PedidoDao();
   
   private ClienteModel clienteModel;  
   private ProdutoModel produtoModel; 
   private UsuarioModel usuarioModel;
   
   
   //RECEBE A INSTANCIA DO OBJETO A SER TRATADO NO CONSTRUTOR
   public OperadorControl(Object object){  
    
    if(object.equals(this.clienteModel)){
        clienteModel = (ClienteModel) object;        
    }
    else if(object.equals(this.produtoModel)){
        produtoModel = (ProdutoModel) object;          
    } 
    else if(object.equals(this.usuarioModel)){
        usuarioModel = (UsuarioModel) object;          
   }
    else if(object.equals(this.pedidoDao)){
        pedidoDao = (PedidoDao) object;          
   }
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
    public Object pesquisarCliente() {
           return clienteDao.pesquisar(clienteModel);                           
    }
    
    
       
    
    //METODOS DE MANIPULACAO DOS PRODUTOS
    public Boolean inserirProduto(){
          return clienteDao.inserir(produtoModel);
    }        
    public Boolean alterarProduto() {
          return produtoDao.alterar(produtoModel);                          
    } 
    public Boolean excluirProduto() {
         return produtoDao.excluir(produtoModel);                 
    }      
    public Object pesquisarProduto() {
         return produtoDao.pesquisar(produtoModel);                           
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
    public Object pesquisarUsuario() {
         return usuarioDao.pesquisar(usuarioModel);                           
    }
                  
    
}
