
package ClassesAuxiliares;

import Dao.ProdutoDao;
import Dao.UsuarioDao;
import Models.ProdutoModel;
import Models.UsuarioModel;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Tabela {
    
    private ProdutoDao produtosDao;
    private UsuarioDao usuariosDao;
    
    private ProdutoModel produtoModel;
    private UsuarioModel usuarioModel;
        
    private ArrayList<Object> retorno = new ArrayList<>();       
    
    
    //Método para preencher a JTable
    public void preencherTabela(String tipo, JTable table){                
        switch(tipo){
            case "produto":
                produtoModel = new ProdutoModel();    
                produtosDao = new ProdutoDao(); 
                retorno = produtosDao.retornaProdutos();
            
                    for(int x = 0; x < retorno.size(); x++){            
                        produtoModel =  (ProdutoModel)retorno.get(x);           
                        table.setValueAt(produtoModel.getIdProduto(), x, 0);
                        table.setValueAt(produtoModel.getTipoProduto(), x, 1);
                        table.setValueAt(produtoModel.getDetalheProduto(), x, 2);
                        table.setValueAt(produtoModel.getValorUnitario(), x, 3);     
                    }     
            break;
            
            case "usuario":
                usuariosDao = new UsuarioDao(); 
                usuarioModel = new UsuarioModel();   
               
                retorno = produtosDao.retornaProdutos();
            
                    for(int x = 0; x < retorno.size(); x++){            
                        usuarioModel =  (UsuarioModel)retorno.get(x);           
                        table.setValueAt(null, x, 0);
                        table.setValueAt(null, x, 1);
                        table.setValueAt(null, x, 2);
                        table.setValueAt(null, x, 3);     
                    }                   
                break;          
        }                   
    }  
    
          
    
    //Metodo Para Limpar  a JTable
    public static void limparTabela(JTable table) { 
         DefaultTableModel model = (DefaultTableModel) table.getModel();
            for (int x = 0; x < model.getRowCount(); x++) {                           
                 model.removeRow(x);                               
            }     
        }                   
    }
