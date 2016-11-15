
package Views;

import Models.ClienteModel;
import Models.PedidoModel;
import Models.ProdutoModel;


public class FechaVendaView extends javax.swing.JFrame {

   public static PedidoModel pedidoModel; 
   public static ClienteModel clienteModel;
   private ProdutoModel produtoModel;
    
    public FechaVendaView() {
        initComponents();
        this.clienteModel = PrincipalView.clienteModel;
        this.pedidoModel = PrincipalView.pedidoModel;
        
        
        
        txtNomeCliente.setText(clienteModel.getNome());
        txtEndereco.setText(clienteModel.getLogradouro());
        txtFone.setText(clienteModel.getTelefone());
        txtTotal.setText("R$ " + String.valueOf(pedidoModel.getValorTotal()));
        
        
         for (int x = 0 ; x < pedidoModel.getProdutos().size(); x++){

                    produtoModel = pedidoModel.getProdutos().get(x);                                       
                    jtProdutos.setValueAt(produtoModel.getDetalheProduto(), x, 0);
                    jtProdutos.setValueAt(produtoModel.getQuantidadeProduto(), x, 1);            
                    jtProdutos.setValueAt(produtoModel.getValorUnitario(), x, 2);
            }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtEnderecoLabe = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProdutos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rbSim = new javax.swing.JRadioButton();
        rbNao = new javax.swing.JRadioButton();
        txtEndereco = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JLabel();
        cbPagamento = new javax.swing.JComboBox<>();
        txtFone = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Encerrar Venda");
        setBackground(new java.awt.Color(0, 108, 81));

        jPanel1.setBackground(new java.awt.Color(0, 108, 81));

        jPanel2.setBackground(new java.awt.Color(95, 211, 134));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Encerrar Venda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Narrow", 1, 20))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Cliente:");

        txtEnderecoLabe.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtEnderecoLabe.setText("Endereço:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Delivery:");

        jtProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Produo", "Quantidade", "Preço Unitario"
            }
        ));
        jScrollPane1.setViewportView(jtProdutos);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Metodo de Pagamento:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Fone:");

        rbSim.setBackground(new java.awt.Color(95, 211, 134));
        buttonGroup2.add(rbSim);
        rbSim.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbSim.setText("Sim");

        rbNao.setBackground(new java.awt.Color(95, 211, 134));
        buttonGroup2.add(rbNao);
        rbNao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbNao.setText("Não");

        txtEndereco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtEndereco.setText("jLabel6");

        txtNomeCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNomeCliente.setText("jLabel7");

        cbPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtFone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtFone.setText("jLabel8");

        txtTotal.setBackground(new java.awt.Color(255, 255, 255));
        txtTotal.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtTotal.setText("jLabel2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtEnderecoLabe)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFone)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNomeCliente)
                                .addComponent(txtEndereco)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(rbSim)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(rbNao))
                                .addComponent(cbPagamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNomeCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtEnderecoLabe)
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbSim)
                            .addComponent(rbNao)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtFone)))
                    .addComponent(txtEndereco))
                .addGap(62, 62, 62)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        txtEnderecoLabe.getAccessibleContext().setAccessibleName("Endereço");
        jLabel5.getAccessibleContext().setAccessibleName("fone");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

 
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FechaVendaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbPagamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtProdutos;
    private javax.swing.JRadioButton rbNao;
    private javax.swing.JRadioButton rbSim;
    private javax.swing.JLabel txtEndereco;
    private javax.swing.JLabel txtEnderecoLabe;
    private javax.swing.JLabel txtFone;
    private javax.swing.JLabel txtNomeCliente;
    private javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables
}
