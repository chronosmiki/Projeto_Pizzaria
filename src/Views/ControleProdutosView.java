/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import ClassesAuxiliares.*;
import Controls.*;
import Models.*;
import java.util.ArrayList;
import javax.swing.JFrame;


public class ControleProdutosView extends javax.swing.JFrame {

   private final Tabela tabela = new Tabela();
   private OperadorControl operadorControl;
   private ProdutoModel produtoModel;
   private ArrayList <ProdutoModel> array = new ArrayList<>();
   private static AtualizadorDeHorario ah;
    
    public ControleProdutosView() {
        initComponents();
          
        txtTipoProduto.setEnabled(false);
        txtDetalheProduto.setEnabled(false);
        txtValorUnitario.setEnabled(false);
        txtQuant.setEnabled(false);
        txtUltimaCompra.setEnabled(false); 
        
        ah = new AtualizadorDeHorario(lbDate); 
        iniciaAtualizadorDeData();
        maximize();
        tabela.preencherTabela("produto", jtProdutos);  
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        painelPesquisaProdutos = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtProdutos = new javax.swing.JTable();
        txtPesq = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        txtValorUnitario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTipoProduto = new javax.swing.JTextField();
        txtQuant = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtUltimaCompra = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDetalheProduto = new javax.swing.JTextField();
        btnNovo = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        btnAtualizarLista = new javax.swing.JToggleButton();
        jLabel8 = new javax.swing.JLabel();
        lbDate = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setSize(new java.awt.Dimension(1024, 768));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        painelPrincipal.setBackground(new java.awt.Color(0, 108, 81));
        painelPrincipal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        painelPrincipal.setPreferredSize(new java.awt.Dimension(1024, 768));

        painelPesquisaProdutos.setBackground(new java.awt.Color(95, 211, 134));
        painelPesquisaProdutos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Controle de Produtos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Narrow", 1, 20))); // NOI18N
        painelPesquisaProdutos.setForeground(new java.awt.Color(255, 255, 255));

        jtProdutos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cod", "Tipo do Produto", "Detalhe do Produto", "Valor Unit"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtProdutos.setGridColor(new java.awt.Color(204, 204, 204));
        jtProdutos.setRowHeight(20);
        jtProdutos.setSelectionBackground(new java.awt.Color(255, 255, 0));
        jtProdutos.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jtProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtProdutosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtProdutos);
        if (jtProdutos.getColumnModel().getColumnCount() > 0) {
            jtProdutos.getColumnModel().getColumn(0).setMinWidth(5);
            jtProdutos.getColumnModel().getColumn(0).setPreferredWidth(10);
            jtProdutos.getColumnModel().getColumn(2).setMinWidth(200);
            jtProdutos.getColumnModel().getColumn(2).setPreferredWidth(200);
        }

        txtPesq.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtPesq.setToolTipText("Pesquisa");
        txtPesq.setCaretColor(new java.awt.Color(204, 204, 204));
        txtPesq.setMargin(new java.awt.Insets(10, 2, 2, 2));
        txtPesq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesqKeyReleased(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(95, 211, 134));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtValorUnitario.setToolTipText("");
        jPanel1.add(txtValorUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 760, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Tipo do Produto:");
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Detalhe do Produto:");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Valor Unitário:");
        jLabel5.setToolTipText("");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 90, -1));

        txtTipoProduto.setToolTipText("");
        txtTipoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoProdutoActionPerformed(evt);
            }
        });
        jPanel1.add(txtTipoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 760, -1));

        txtQuant.setToolTipText("");
        txtQuant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantActionPerformed(evt);
            }
        });
        jPanel1.add(txtQuant, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 760, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Quantidade em Estoque:");
        jLabel6.setToolTipText("");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        txtUltimaCompra.setForeground(new java.awt.Color(255, 255, 255));
        txtUltimaCompra.setToolTipText("");
        txtUltimaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUltimaCompraActionPerformed(evt);
            }
        });
        jPanel1.add(txtUltimaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 760, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Data da Ultima Compra:");
        jLabel7.setToolTipText("");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 152, -1));

        txtDetalheProduto.setToolTipText("");
        txtDetalheProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDetalheProdutoActionPerformed(evt);
            }
        });
        jPanel1.add(txtDetalheProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 760, -1));

        btnNovo.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        btnNovo.setMnemonic('C');
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 140, -1));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel1.setText("Pesquisar");
        jLabel1.setToolTipText("");

        btnAtualizarLista.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        btnAtualizarLista.setMnemonic('C');
        btnAtualizarLista.setText("Atualizar Lista");
        btnAtualizarLista.setToolTipText("");
        btnAtualizarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarListaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel8.setText("* Clique na linha desejada para realizar uma alteração");
        jLabel8.setToolTipText("");

        javax.swing.GroupLayout painelPesquisaProdutosLayout = new javax.swing.GroupLayout(painelPesquisaProdutos);
        painelPesquisaProdutos.setLayout(painelPesquisaProdutosLayout);
        painelPesquisaProdutosLayout.setHorizontalGroup(
            painelPesquisaProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 986, Short.MAX_VALUE)
            .addGroup(painelPesquisaProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPesquisaProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(txtPesq)
                    .addGroup(painelPesquisaProdutosLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painelPesquisaProdutosLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAtualizarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        painelPesquisaProdutosLayout.setVerticalGroup(
            painelPesquisaProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPesquisaProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(painelPesquisaProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPesquisaProdutosLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1))
                    .addGroup(painelPesquisaProdutosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnAtualizarLista)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPesquisaProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPesquisaProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        lbDate.setBackground(new java.awt.Color(0, 0, 0));
        lbDate.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        lbDate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbDate.setText("Sistema de Gerenciamento de Pizzaria - São Paulo, 07 de setembro de 2016 - 09:59:20");

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Operador : Roberto - Login em : 08/09/2016 - 13:17");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbDate, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jLabel3.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesqKeyReleased
        operadorControl = new OperadorControl();
        //LIMPA O ARRAY
        array.clear();

        //LIMPA A TABELA
        tabela.limparTabela(jtProdutos);   

        //SOMENTE REALIZA A PESQUISA E A CAIXA DE PESQUISA TIVER VALOR
        if(!txtPesq.getText().equals("")){
            OperadorControl.pesq = txtPesq.getText();
            array = operadorControl.pesquisarProduto();
            
             //RECUPERA OS OBJETOS RETORNADOS NA PESQUISA
            for (int x = 0 ; x < array.size(); x++){
                 produtoModel = (ProdutoModel) array.get(x);
                 jtProdutos.setValueAt(produtoModel.getIdProduto(), x, 0);
                 jtProdutos.setValueAt(produtoModel.getTipoProduto(), x, 1);
                 jtProdutos.setValueAt(produtoModel.getDetalheProduto(), x, 2);
                 jtProdutos.setValueAt(produtoModel.getValorUnitario(), x, 3);
             }
        }else{
              tabela.preencherTabela("produto", jtProdutos);   
        }                  
    }//GEN-LAST:event_txtPesqKeyReleased

    private void btnAtualizarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarListaActionPerformed
            tabela.limparTabela(jtProdutos);
            tabela.preencherTabela("produto", jtProdutos);   
    }//GEN-LAST:event_btnAtualizarListaActionPerformed

    private void txtTipoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoProdutoActionPerformed

    }//GEN-LAST:event_txtTipoProdutoActionPerformed

    private void txtQuantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantActionPerformed

    private void txtUltimaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUltimaCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUltimaCompraActionPerformed

    private void txtDetalheProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDetalheProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDetalheProdutoActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void jtProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProdutosMouseClicked
        Boolean altera;
        altera = Msg.question(Msg.perguntaAlteracao);
        
        if(altera){
        btnNovo.setText("Salvar");
        
        
        txtTipoProduto.setEnabled(true);
        txtDetalheProduto.setEnabled(true);
        txtValorUnitario.setEnabled(true);
        txtQuant.setEnabled(true);
        txtUltimaCompra.setEnabled(true); 
        
        txtTipoProduto.setText(jtProdutos.getValueAt(jtProdutos.getSelectedRow(), 1).toString());
        txtDetalheProduto.setText(jtProdutos.getValueAt(jtProdutos.getSelectedRow(), 2).toString());
        txtValorUnitario.setText(jtProdutos.getValueAt(jtProdutos.getSelectedRow(), 3).toString());
        txtQuant.setText("");
        txtUltimaCompra.setText("");   
        }
    }//GEN-LAST:event_jtProdutosMouseClicked

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        if(btnNovo.getText().equals("Novo")){
           new Modal(this);
           Modal.setDisable();        
           new CadastroProdutoView().setVisible(true);
        }
        else{
            Msg.confirm(Msg.confirmaAlteracao);
            
            txtTipoProduto.setEnabled(false);
            txtDetalheProduto.setEnabled(false);
            txtValorUnitario.setEnabled(false);
            txtQuant.setEnabled(false);
            txtUltimaCompra.setEnabled(false); 
            
            txtTipoProduto.setText("");
            txtDetalheProduto.setText("");
            txtValorUnitario.setText("");
            txtQuant.setText("");
            txtUltimaCompra.setText("");       
            
            btnNovo.setText("Novo");
        }
    }//GEN-LAST:event_btnNovoActionPerformed

    
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
           new ControleProdutosView().setVisible(true);                                 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAtualizarLista;
    private javax.swing.JToggleButton btnNovo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtProdutos;
    private javax.swing.JLabel lbDate;
    private javax.swing.JPanel painelPesquisaProdutos;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JTextField txtDetalheProduto;
    private javax.swing.JTextField txtPesq;
    private javax.swing.JTextField txtQuant;
    private javax.swing.JTextField txtTipoProduto;
    private javax.swing.JTextField txtUltimaCompra;
    private javax.swing.JTextField txtValorUnitario;
    // End of variables declaration//GEN-END:variables

    
    
  //ATUALIZA A HORA DO LABE 'LBDATA'  
 private void iniciaAtualizadorDeData(){
    ah.start();    
 }    
 
 
 
 
 //METODO PARA INICIAR O FORM MAXIMIZADO 
 private void maximize( ){
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
 }
 

}
