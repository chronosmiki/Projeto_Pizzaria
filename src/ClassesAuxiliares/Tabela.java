
package ClassesAuxiliares;

import Dao.ProdutoDao;
import Dao.UsuarioDao;
import java.util.ArrayList;


public class Tabela {
    
    private ProdutoDao produtos;
    private UsuarioDao usuarios;
    
    ArrayList<Object> retorno = new ArrayList<>();
    
    
    public ArrayList<Object> preencherTabela(String tipo){
        
        
        switch(tipo){
            case "produto":
            produtos = new ProdutoDao(); 
            retorno = produtos.retornaProdutos();
            break;
            
            case "Usuarios":
            produtos = new ProdutoDao(); 
            retorno = usuarios.retornaUsuarios();
            break;          
        }
            
        return retorno;
    }  
    
           
    
}
