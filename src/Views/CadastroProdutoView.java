
package Views;

import ClassesAuxiliares.Modal;
import Controls.ControleProdutosControl;
import Models.ProdutoModel;


public class CadastroProdutoView extends javax.swing.JFrame {

    
    
    ControleProdutosControl produtoControl;
    ProdutoModel produtoModel = new ProdutoModel();
    
   
    public CadastroProdutoView() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtTipoProduto = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        txtValorUnitario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        btnFechar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Produtos");
        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(460, 300));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 108, 81));

        jPanel2.setBackground(new java.awt.Color(95, 211, 134));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Narrow", 1, 20))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        txtTipoProduto.setBackground(new java.awt.Color(95, 211, 182));
        txtTipoProduto.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        txtTipoProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pizza Salgada", "Pizza Doce", "Esfiha Salgada", "Esfiha Doce", "Bebida" }));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Detalhe do Produto:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Valor Unitário:");

        txtNomeProduto.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        txtNomeProduto.setToolTipText("");
        txtNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeProdutoActionPerformed(evt);
            }
        });

        txtValorUnitario.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        txtValorUnitario.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Tipo do Produto:");

        jToggleButton1.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jToggleButton1.setMnemonic('C');
        jToggleButton1.setText("Cadastrar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        btnFechar.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        btnFechar.setMnemonic('S');
        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTipoProduto, 0, 235, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jToggleButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNomeProduto)
                            .addComponent(txtValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1)
                    .addComponent(btnFechar))
                .addGap(29, 29, 29))
        );

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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        Modal.setEnable();
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed

        produtoModel.setTipoProduto(txtTipoProduto.getSelectedItem().toString());
        produtoModel.setDetalheProduto(txtNomeProduto.getText());
        produtoModel.setValorUnitario(txtValorUnitario.getText());
        produtoControl = new ControleProdutosControl(produtoModel);
        produtoControl.inserirBd();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void txtNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeProdutoActionPerformed

    }//GEN-LAST:event_txtNomeProdutoActionPerformed

  
    public static void main(String args[]) {                         
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProdutoView().setVisible(true);                               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnFechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JComboBox<String> txtTipoProduto;
    private javax.swing.JTextField txtValorUnitario;
    // End of variables declaration//GEN-END:variables

}
