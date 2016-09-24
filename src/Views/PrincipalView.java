package Views;

import ClassesAuxiliares.*;
import Controls.*;
import Models.*;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class PrincipalView extends javax.swing.JFrame {

   private static Double subTotal = 0.0;
   private static Double total = 0.0;
   private static Double desc = 0.0;
   private Double valorUnitario;
   
   private int linha = 0;
   private int quant; 
       
  // private ControleProdutosControl produtoControl;
   private final OperadorControl operadorControl = new OperadorControl();
   private ProdutoModel produtoPesquisado;
   
   private final Tabela tabela = new Tabela();
 
   private ArrayList <ProdutoModel> array = new ArrayList<>();
   private static AtualizadorDeHorario ah;

   private final FormataDouble formatarDouble = new FormataDouble();
    
    
   public PrincipalView() {
        initComponents();
         ah = new AtualizadorDeHorario(lbDate); 
         iniciaAtualizadorDeData();
         maximize();
         
         PesquisaClienteView pesquisa =  new PesquisaClienteView();
         pesquisa.setVisible(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jMenuItem1 = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        painelPrincipal = new javax.swing.JPanel();
        painelDetalhesVenda = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtProdutos = new javax.swing.JTable();
        txtPesq = new javax.swing.JTextField();
        painelPesquisaProdutos = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        btnCancelarVenda = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDetalhesVenda = new javax.swing.JTable();
        painelCalculo = new javax.swing.JPanel();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblSubtotal = new javax.swing.JLabel();
        txtDesc = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbDate = new javax.swing.JLabel();
        painelDeFerramentas = new javax.swing.JPanel();
        btnCadastrarProduto = new javax.swing.JButton();
        btnCadastrarCliente = new javax.swing.JButton();
        btnLocalizarCliente = new javax.swing.JButton();
        sep1 = new javax.swing.JSeparator();
        sep2 = new javax.swing.JSeparator();
        sep3 = new javax.swing.JSeparator();
        btnLocalizarCliente1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jmenuPrincipal = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        btnSair = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setSize(new java.awt.Dimension(1024, 768));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        painelPrincipal.setBackground(new java.awt.Color(166, 88, 0));
        painelPrincipal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        painelPrincipal.setPreferredSize(new java.awt.Dimension(1024, 768));

        painelDetalhesVenda.setBackground(new java.awt.Color(255, 208, 115));
        painelDetalhesVenda.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes da Venda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Narrow", 1, 20))); // NOI18N
        painelDetalhesVenda.setForeground(new java.awt.Color(102, 0, 0));

        jtProdutos.setBackground(new java.awt.Color(255, 165, 64));
        jtProdutos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtProdutos.setForeground(new java.awt.Color(166, 88, 0));
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
                "Cod", "Produto", "Detalhe", "Valor Unit"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtProdutos.setGridColor(new java.awt.Color(204, 204, 204));
        jtProdutos.setRowHeight(20);
        jtProdutos.setSelectionBackground(new java.awt.Color(255, 208, 115));
        jtProdutos.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jtProdutos.getTableHeader().setReorderingAllowed(false);
        jtProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtProdutosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtProdutos);
        if (jtProdutos.getColumnModel().getColumnCount() > 0) {
            jtProdutos.getColumnModel().getColumn(0).setMinWidth(40);
            jtProdutos.getColumnModel().getColumn(0).setPreferredWidth(40);
            jtProdutos.getColumnModel().getColumn(0).setMaxWidth(40);
            jtProdutos.getColumnModel().getColumn(1).setMinWidth(150);
            jtProdutos.getColumnModel().getColumn(1).setPreferredWidth(150);
            jtProdutos.getColumnModel().getColumn(1).setMaxWidth(150);
            jtProdutos.getColumnModel().getColumn(3).setMinWidth(90);
            jtProdutos.getColumnModel().getColumn(3).setPreferredWidth(90);
            jtProdutos.getColumnModel().getColumn(3).setMaxWidth(90);
        }

        txtPesq.setBackground(new java.awt.Color(166, 88, 0));
        txtPesq.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtPesq.setForeground(new java.awt.Color(255, 255, 255));
        txtPesq.setToolTipText("Pesquisa");
        txtPesq.setCaretColor(new java.awt.Color(204, 204, 204));
        txtPesq.setMargin(new java.awt.Insets(10, 2, 2, 2));
        txtPesq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesqKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout painelDetalhesVendaLayout = new javax.swing.GroupLayout(painelDetalhesVenda);
        painelDetalhesVenda.setLayout(painelDetalhesVendaLayout);
        painelDetalhesVendaLayout.setHorizontalGroup(
            painelDetalhesVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDetalhesVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDetalhesVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPesq)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelDetalhesVendaLayout.setVerticalGroup(
            painelDetalhesVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDetalhesVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addContainerGap())
        );

        painelPesquisaProdutos.setBackground(new java.awt.Color(255, 208, 115));
        painelPesquisaProdutos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes da Venda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Narrow", 1, 20))); // NOI18N
        painelPesquisaProdutos.setForeground(new java.awt.Color(255, 255, 255));

        jButton6.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(51, 102, 0));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/finaliza_venda.png"))); // NOI18N
        jButton6.setText("Finalizar Venda");
        jButton6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnCancelarVenda.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        btnCancelarVenda.setForeground(new java.awt.Color(204, 0, 0));
        btnCancelarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cancela_venda.png"))); // NOI18N
        btnCancelarVenda.setText("Cancelar Venda");
        btnCancelarVenda.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancelarVenda.setEnabled(false);
        btnCancelarVenda.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnCancelarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarVendaActionPerformed(evt);
            }
        });

        jtDetalhesVenda.setBackground(new java.awt.Color(255, 165, 64));
        jtDetalhesVenda.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtDetalhesVenda.setForeground(new java.awt.Color(166, 88, 0));
        jtDetalhesVenda.setModel(new javax.swing.table.DefaultTableModel(
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
                "Cód", "Produto", "Quant", "Preço Unitario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtDetalhesVenda.setGridColor(new java.awt.Color(204, 204, 204));
        jtDetalhesVenda.setRowHeight(20);
        jtDetalhesVenda.setSelectionBackground(new java.awt.Color(255, 208, 115));
        jtDetalhesVenda.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jtDetalhesVenda.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jtDetalhesVenda);
        if (jtDetalhesVenda.getColumnModel().getColumnCount() > 0) {
            jtDetalhesVenda.getColumnModel().getColumn(0).setMinWidth(35);
            jtDetalhesVenda.getColumnModel().getColumn(0).setPreferredWidth(50);
            jtDetalhesVenda.getColumnModel().getColumn(1).setMinWidth(200);
            jtDetalhesVenda.getColumnModel().getColumn(1).setPreferredWidth(200);
            jtDetalhesVenda.getColumnModel().getColumn(2).setMinWidth(40);
            jtDetalhesVenda.getColumnModel().getColumn(2).setPreferredWidth(40);
            jtDetalhesVenda.getColumnModel().getColumn(3).setResizable(false);
        }

        painelCalculo.setBackground(new java.awt.Color(166, 88, 0));
        painelCalculo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Calculo de venda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Narrow", 1, 20), new java.awt.Color(255, 255, 255))); // NOI18N
        painelCalculo.setForeground(new java.awt.Color(255, 255, 0));

        lb1.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        lb1.setForeground(new java.awt.Color(255, 255, 255));
        lb1.setText("Subtotal");

        lb2.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        lb2.setForeground(new java.awt.Color(255, 255, 255));
        lb2.setText("Desconto");

        lb3.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        lb3.setForeground(new java.awt.Color(255, 255, 255));
        lb3.setText("TOTAL");

        lblTotal.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 208, 115));
        lblTotal.setText("00,00");
        lblTotal.setToolTipText("");

        lblSubtotal.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        lblSubtotal.setForeground(new java.awt.Color(255, 208, 115));
        lblSubtotal.setText("00,00");
        lblSubtotal.setToolTipText("");

        txtDesc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));
        txtDesc.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N

        javax.swing.GroupLayout painelCalculoLayout = new javax.swing.GroupLayout(painelCalculo);
        painelCalculo.setLayout(painelCalculoLayout);
        painelCalculoLayout.setHorizontalGroup(
            painelCalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCalculoLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(painelCalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb2)
                    .addComponent(lb3)
                    .addComponent(lb1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelCalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDesc))
                .addGap(50, 50, 50))
        );
        painelCalculoLayout.setVerticalGroup(
            painelCalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCalculoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelCalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb1)
                    .addComponent(lblSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelCalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(painelCalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        lb3.getAccessibleContext().setAccessibleName("TOTAL R$");

        javax.swing.GroupLayout painelPesquisaProdutosLayout = new javax.swing.GroupLayout(painelPesquisaProdutos);
        painelPesquisaProdutos.setLayout(painelPesquisaProdutosLayout);
        painelPesquisaProdutosLayout.setHorizontalGroup(
            painelPesquisaProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPesquisaProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPesquisaProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPesquisaProdutosLayout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPesquisaProdutosLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(painelCalculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painelPesquisaProdutosLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(1, 1, 1)))
                .addContainerGap())
        );
        painelPesquisaProdutosLayout.setVerticalGroup(
            painelPesquisaProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPesquisaProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(painelCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelPesquisaProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarVenda))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 208, 115));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Narrow", 1, 20))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(166, 88, 0));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(166, 88, 0));
        jLabel1.setText("Cliente :");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(166, 88, 0));
        jLabel2.setText("Telefone :");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(166, 88, 0));
        jLabel4.setText("Endereço :");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Maria do Rosário");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("(11) 2919-3365");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("Rua dos Trilhos, 22 - Mooca");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelDetalhesVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelPesquisaProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painelPesquisaProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(painelDetalhesVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        lbDate.setBackground(new java.awt.Color(0, 0, 0));
        lbDate.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        lbDate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbDate.setText("Sistema de Gerenciamento de Pizzaria - São Paulo, 07 de setembro de 2016 - 09:59:20");

        painelDeFerramentas.setBackground(new java.awt.Color(255, 208, 115));
        painelDeFerramentas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnCadastrarProduto.setBackground(new java.awt.Color(255, 208, 115));
        btnCadastrarProduto.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        btnCadastrarProduto.setForeground(new java.awt.Color(153, 0, 51));
        btnCadastrarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cadastro_produto.png"))); // NOI18N
        btnCadastrarProduto.setText("Controle de Produtos");
        btnCadastrarProduto.setActionCommand("Produtos");
        btnCadastrarProduto.setBorder(null);
        btnCadastrarProduto.setFocusable(false);
        btnCadastrarProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCadastrarProduto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarProdutoActionPerformed(evt);
            }
        });

        btnCadastrarCliente.setBackground(new java.awt.Color(255, 208, 115));
        btnCadastrarCliente.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        btnCadastrarCliente.setForeground(new java.awt.Color(153, 0, 51));
        btnCadastrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cadastro_cliente.png"))); // NOI18N
        btnCadastrarCliente.setText("Controle de  Clientes");
        btnCadastrarCliente.setBorder(null);
        btnCadastrarCliente.setFocusable(false);
        btnCadastrarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCadastrarCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarClienteActionPerformed(evt);
            }
        });

        btnLocalizarCliente.setBackground(new java.awt.Color(255, 208, 115));
        btnLocalizarCliente.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        btnLocalizarCliente.setForeground(new java.awt.Color(153, 0, 51));
        btnLocalizarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pesquisa_cliente.png"))); // NOI18N
        btnLocalizarCliente.setText("Localizar Cliente");
        btnLocalizarCliente.setActionCommand("Cadastrar Cliente");
        btnLocalizarCliente.setBorder(null);
        btnLocalizarCliente.setFocusable(false);
        btnLocalizarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLocalizarCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        sep1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        sep2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        sep3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnLocalizarCliente1.setBackground(new java.awt.Color(255, 208, 115));
        btnLocalizarCliente1.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        btnLocalizarCliente1.setForeground(new java.awt.Color(153, 0, 51));
        btnLocalizarCliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pizza.png"))); // NOI18N
        btnLocalizarCliente1.setText("Controle de Pedidos");
        btnLocalizarCliente1.setActionCommand("Cadastrar Cliente");
        btnLocalizarCliente1.setBorder(null);
        btnLocalizarCliente1.setFocusable(false);
        btnLocalizarCliente1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLocalizarCliente1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout painelDeFerramentasLayout = new javax.swing.GroupLayout(painelDeFerramentas);
        painelDeFerramentas.setLayout(painelDeFerramentasLayout);
        painelDeFerramentasLayout.setHorizontalGroup(
            painelDeFerramentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDeFerramentasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCadastrarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sep1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sep2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLocalizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sep3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocalizarCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelDeFerramentasLayout.setVerticalGroup(
            painelDeFerramentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDeFerramentasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDeFerramentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sep1)
                    .addComponent(btnCadastrarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCadastrarCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sep2)
                    .addComponent(btnLocalizarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sep3)
                    .addComponent(btnLocalizarCliente1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(166, 88, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Operador : Roberto - Login em : 08/09/2016 - 13:17");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jmenuPrincipal.setBackground(new java.awt.Color(166, 88, 0));
        jmenuPrincipal.setBorder(new javax.swing.border.MatteBorder(null));
        jmenuPrincipal.setForeground(new java.awt.Color(51, 51, 51));
        jmenuPrincipal.setBorderPainted(false);
        jmenuPrincipal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jmenuPrincipal.setMargin(new java.awt.Insets(10, 0, 0, 0));

        jMenu1.setForeground(new java.awt.Color(255, 208, 115));
        jMenu1.setText("Relatórios");
        jMenu1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenuItem2.setText("Financeiro");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jmenuPrincipal.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(255, 208, 115));
        jMenu2.setText("Configurações");
        jMenu2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jmenuPrincipal.add(jMenu2);

        jMenu3.setForeground(new java.awt.Color(255, 208, 115));
        jMenu3.setText("Sobre");
        jMenu3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jmenuPrincipal.add(jMenu3);

        btnSair.setForeground(new java.awt.Color(255, 208, 115));
        btnSair.setText("Fazer Logout");
        btnSair.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSair.setHideActionText(true);
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSairMouseClicked(evt);
            }
        });
        jmenuPrincipal.add(btnSair);

        setJMenuBar(jmenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelDeFerramentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbDate, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1058, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelDeFerramentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3))
                .addGap(5, 5, 5))
        );

        jLabel3.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseClicked
            System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_btnSairMouseClicked

    private void btnCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarProdutoActionPerformed
       
        new ControleProdutosView().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastrarProdutoActionPerformed

    private void txtPesqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesqKeyReleased
        
        //LIMPA O ARRAY
        array.clear();

        //LIMPA A TABELA
        Tabela.limparTabela(jtProdutos);
        
        //SOMENTE REALIZA A PESQUISA E A CAIXA DE PESQUISA TIVER VALOR
        if(!txtPesq.getText().equals("")){
            OperadorControl.pesq = txtPesq.getText();
            array = operadorControl.pesquisarProduto();
        }

        //RECUPERA OS OBJETOS RETORNADOS NA PESQUISA
        for (int x = 0 ; x < array.size(); x++){
            produtoPesquisado = (ProdutoModel) array.get(x);
            jtProdutos.setValueAt(produtoPesquisado.getIdProduto(), x, 0);
            jtProdutos.setValueAt(produtoPesquisado.getTipoProduto(), x, 1);
            jtProdutos.setValueAt(produtoPesquisado.getDetalheProduto(), x, 2);           
            jtProdutos.setValueAt(formatarDouble.format(produtoPesquisado.getValorUnitario()), x, 3);
        }
    }//GEN-LAST:event_txtPesqKeyReleased

    private void jtProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProdutosMouseClicked
                        
       if(!jtProdutos.getValueAt(jtProdutos.getSelectedRow(), 0).equals("")){     
           String aux = String.valueOf(jtProdutos.getValueAt(jtProdutos.getSelectedRow(), 3)).replace(",", ".").replace("R$", "").replace(" ", "");
           valorUnitario = Double.parseDouble(aux);  
            try{
                quant = Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade do Produto"));
                    if(quant < 1){
                             Msg.exclamation("Digite uma quantidade válida !");                          
                    }   
                    else{  
                        btnCancelarVenda.setEnabled(true);
                        String valor = jtProdutos.getValueAt(jtProdutos.getSelectedRow(), 3).toString();

                        jtDetalhesVenda.setValueAt(jtProdutos.getValueAt(jtProdutos.getSelectedRow(), 0),linha, 0);
                        jtDetalhesVenda.setValueAt(jtProdutos.getValueAt(jtProdutos.getSelectedRow(), 1),linha, 1);
                        jtDetalhesVenda.setValueAt(quant,linha, 2);
                        jtDetalhesVenda.setValueAt(valor, linha, 3);  

                        subTotal += valorUnitario;                                                                                                                              
                        
                        total = (subTotal - desc);

                        lblSubtotal.setText(formatarDouble.format(subTotal));
                        lblTotal.setText(formatarDouble.format(total));

                        linha++;
                        txtPesq.requestFocus();
                        jtProdutos.setRowSelectionInterval(0,0);
                    }
            }                
            catch(NumberFormatException ex){
                Msg.exclamation("Digite uma quantidade Válida !");                                                                
            }
        }                         
    }//GEN-LAST:event_jtProdutosMouseClicked

    private void btnCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarClienteActionPerformed
         new PesquisaClienteView().setVisible(true);
    }//GEN-LAST:event_btnCadastrarClienteActionPerformed

    private void btnCancelarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVendaActionPerformed
        cancelarVenda();
    }//GEN-LAST:event_btnCancelarVendaActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
             new Modal(this);
             Modal.setDisable();
             new SobreView().setVisible(true);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
            int x = JOptionPane.showConfirmDialog(null, "Deseja Realmente Sair do Sistema ?", "Sair",JOptionPane.YES_NO_OPTION, -1);
              if(x == JOptionPane.YES_OPTION){
                  System.exit(0);
              }
    }//GEN-LAST:event_formWindowClosing

    
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
           new PrincipalView().setVisible(true);                                 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarCliente;
    private javax.swing.JButton btnCadastrarProduto;
    private javax.swing.JButton btnCancelarVenda;
    private javax.swing.JButton btnLocalizarCliente;
    private javax.swing.JButton btnLocalizarCliente1;
    private javax.swing.JMenu btnSair;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JMenuBar jmenuPrincipal;
    private javax.swing.JTable jtDetalhesVenda;
    private javax.swing.JTable jtProdutos;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lbDate;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel painelCalculo;
    private javax.swing.JPanel painelDeFerramentas;
    private javax.swing.JPanel painelDetalhesVenda;
    private javax.swing.JPanel painelPesquisaProdutos;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JSeparator sep1;
    private javax.swing.JSeparator sep2;
    private javax.swing.JSeparator sep3;
    private javax.swing.JFormattedTextField txtDesc;
    private javax.swing.JTextField txtPesq;
    // End of variables declaration//GEN-END:variables

    
    
  //ATUALIZA A HORA DO LABE 'LBDATA'  
 private void iniciaAtualizadorDeData(){
    ah.start();    
    }    
 
 
 
 //METODO PARA INICIAR O FORM MAXIMIZADO 
 private void maximize( ){
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
 }

 private void cancelarVenda(){
        Boolean retorno = Msg.question("Tem certeza que deseja Cancelar a Venda");
        if(retorno){
        subTotal = 0.0;
        total = 0.0;
        lblSubtotal.setText("0.00");
        txtDesc.setText("0,00"); 
        lblTotal.setText("0.00");       
        txtPesq.setText("");
        tabela.limparTabela(jtProdutos);        
        tabela.limparTabela(jtDetalhesVenda);
        btnCancelarVenda.setEnabled(false);
        Msg.confirm("Venda Cancelada !");  
        //txtPesq.requestFocus();
    }            
 } 
 
}
