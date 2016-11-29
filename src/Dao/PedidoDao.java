
package Dao;

import ClassesAuxiliares.Msg;
import static Dao.ConexaoMysql.close;
import static Dao.ConexaoMysql.open;
import Interfaces.interfaceDao;
import Models.PedidoModel;
import Models.ProdutoModel;
import Views.PrincipalView;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class PedidoDao implements interfaceDao{
    
    
    
    private PedidoModel pedidoModel;
    private ProdutoModel produto;
    private ResultSet resultado= null;
    private PreparedStatement pstm;
    private Statement stmt;
    private boolean success = false;
    private String sql;
    private ArrayList <PedidoModel> pedidos = new ArrayList<>();
    
    

    public Boolean inserirPedido(PedidoModel pedido) {
        pedidoModel = (PedidoModel) pedido;               
                try {             
                       stmt = open().createStatement();   
                       System.out.println(pedidoModel.getMetodoPagamento());
                       sql = "INSERT INTO pedidos (id_cliente, metod_pag, delivery)"
                        + "VALUES ("+
                        PrincipalView.clienteModel.getIdCliente()
                        + ",'" 
                        + pedidoModel.getMetodoPagamento()
                        +"'," + pedidoModel.getDelivery() + ");";      
                        stmt.execute(sql);      
                        
                        for(int x = 0; x < pedidoModel.getProdutos().size(); x++){
                        produto = pedidoModel.getProdutos().get(x);                     
                        System.out.println("idProduto" + produto.getIdProduto() + " -  quantidade " + produto.getQuantidadeProduto());
                        String sql1 = "INSERT INTO itens_pedido(id_pedido, id_Produto, quantidade)"
                        + "VALUES(16,"
                        + produto.getIdProduto() 
                        + "," + produto.getQuantidadeProduto() + ");";
                        stmt.execute(sql1);                         
                        }                        
                        success = true;
                } catch (Exception ex) {
                    Logger.getLogger(PedidoDao.class.getName()).log(Level.SEVERE, null, ex);
                    Msg.exclamation(Msg.erroConexao + ex.getMessage());                                       
               }   
                close();       
        return success;
    }

    @Override
    public Boolean alterar(Object object) {
        pedidoModel = (PedidoModel) object;
        
        sql = "update pedidos set idCliente = ?, metod_pag = ?, delivery = ? where num_pedido = ?";
        
        try{            
            try {
                pstm = open().prepareStatement(sql);
            } catch (Exception ex) {
                Logger.getLogger(PedidoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            pstm.setString(1, PrincipalView.clienteModel.getIdCliente());
            pstm.setString(2, pedidoModel.getMetodoPagamento());
            pstm.setInt(3, pedidoModel.getDelivery());            
            pstm.setInt(4, pedidoModel.getNumPedido());
            pstm.execute();
            success = true;
        }catch(SQLException ex)
        {
            Logger.getLogger(PedidoDao.class.getName()).log(Level.SEVERE, null, ex);
            Msg.exclamation(Msg.erroConexao + ex.getMessage());
        }        
        return success;
    }

    @Override
    public Boolean excluir(Object object) {
        pedidoModel = (PedidoModel) object;
                
        sql = "delete from pedidos where num_pedido = ?;";
        
        try{            
            try {
                pstm = open().prepareStatement(sql);
            } catch (Exception ex) {
                Logger.getLogger(PedidoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            pstm.setInt(1,pedidoModel.getNumPedido());            
            pstm.execute();
            success = true;
        }catch(SQLException ex)
        {
            Logger.getLogger(PedidoDao.class.getName()).log(Level.SEVERE, null, ex);
            Msg.exclamation(Msg.erroConexao + ex.getMessage());
        }        
        return success;        
    }

    @Override
    public ArrayList pesquisar(String pesq) {
        sql = "select * from pedidos where num_pedido like '" + pesq + "%';";
            
        try{
            try {
                pstm = open().prepareStatement(sql);
            } catch (Exception ex) {
                Logger.getLogger(PedidoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            resultado = pstm.executeQuery(sql);
            pedidos.clear();
            while(resultado.next())
            {
                pedidoModel = new PedidoModel();  
                pedidoModel.setNumPedido(resultado.getInt("num_pedido"));
                pedidoModel.setMetodoPagamento(resultado.getString("metod_pag"));
                pedidoModel.setDelivery(resultado.getInt("delivery"));
                pedidoModel.setIdDetalhe(resultado.getInt("id_detalhe"));
               
                pedidos.add(pedidoModel);
            }           
        }catch(SQLException ex)
        {
            Logger.getLogger(PedidoDao.class.getName()).log(Level.SEVERE, null, ex);
            Msg.exclamation(Msg.erroConexao + ex.getMessage());
        }
        close();        
        return pedidos;
    }

    @Override
    public Boolean inserir(Object object) {   
        return false;
    }   
}
      
