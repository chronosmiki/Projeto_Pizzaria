
package Dao;

import ClassesAuxiliares.Msg;
import static Dao.ConexaoMysql.close;
import static Dao.ConexaoMysql.open;
import Interfaces.interfaceDao;
import Models.PedidoModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PedidoDao implements interfaceDao{
    
    private PedidoModel pedidoModel;
    private ResultSet resultado= null;
    private PreparedStatement pstm;
    private Statement stmt;
    private boolean success;
    private String sql;
    private ArrayList <PedidoModel> pedidos = new ArrayList<>();

    @Override
    public Boolean inserir(Object object) {
        pedidoModel = (PedidoModel) object;
        
         try {             
                   stmt = open().createStatement();
              } catch (Exception ex) {
                    Logger.getLogger(PedidoDao.class.getName()).log(Level.SEVERE, null, ex);
                    Msg.exclamation(Msg.erroConexao + ex.getMessage());
              }
                    sql = "INSERT INTO pedidos (valor_total, data, metod_pag, delivery)"
                    + "VALUES ("
                    + pedidoModel.getValorTotal()
                    + "," 
                    + pedidoModel.getDataPedido()
                    + ","
                    + pedidoModel.getMetodoPagamento()
                    +"," + pedidoModel.getDelivery() + ");";
                    
               try {                   
                        stmt.execute(sql);
                        success = true;
               } catch (SQLException ex) {
                        Logger.getLogger(PedidoDao.class.getName()).log(Level.SEVERE, null, ex);
                        Msg.exclamation(Msg.erroConexao + ex.getMessage());
               }   
                close();       
        return success;
    }

    @Override
    public Boolean alterar(Object object) {
        pedidoModel = (PedidoModel) object;
        
        sql = "update pedidos set valor_total = ?, data = ?, metod_pag = ?, delivery = ? where num_pedido = ?";
        
        try{            
            try {
                pstm = open().prepareStatement(sql);
            } catch (Exception ex) {
                Logger.getLogger(PedidoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            pstm.setDouble(1, pedidoModel.getValorTotal());
            pstm.setDate(2, pedidoModel.getDataPedido());
            pstm.setString(3, pedidoModel.getMetodoPagamento());
            pstm.setBoolean(4, pedidoModel.getDelivery());
            
            pstm.setInt(5, pedidoModel.getNumPedido());
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
                pedidoModel.setValorTotal(resultado.getDouble("valor_total"));
                pedidoModel.setDataPedido(resultado.getDate("data"));
                pedidoModel.setMetodoPagamento(resultado.getString("metod_pag"));
                pedidoModel.setDelivery(resultado.getBoolean("delivery"));
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
    
}
