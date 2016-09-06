
package Models;

import ClassesAuxiliares.Msg;

public class OperadorModel{
    
    private int idUsuario;
    private String nome;
    private String sobrenome;
    private String login;
    private String password;
    private int nivel;
    private Boolean success;
    
    
    Object dao;
    
    public OperadorModel (Object object){
      this.dao = object;
    }
    
    public OperadorModel (){    
    }
    

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

     //Métodos relacionados ao Cliente 

      pública Boolean inserirCliente(){
          success=inserir(ClienteModel model);
          Return success;
         }

    
    
    
    
    //Metodos
    public void cadastrarCliente(Object model) {
           dao = (ClienteDao) dao;
           if((dao.inserir(model)){
           Msg.confirm(Msg.confimaCadastro);    
        }      
    }

    
    
    @Override
    public void alterarBd() {
            if(alterar(this.model)){
                Msg.confirm(Msg.confimaCadastro);    
            }  
    }
    
    
    @Override
    public void excluirBd() {
            if(excluir(this.model)){
               Msg.confirm(Msg.confimaCadastro);    
        }     
    }
    
    

    @Override
    public Object pesquisarBd() {
          return pesquisar(this.model); 
    }
    
}
