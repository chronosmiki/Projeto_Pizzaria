
package Interfaces;

import java.util.ArrayList;


public interface interfaceDao {
    
    
    Boolean inserir (Object object);
    
    Boolean alterar (Object object);
    
    Boolean excluir (Object object);
    
    ArrayList pesquisar (String pesq);
}
