package formularios;

import classes.Dados;
import classes.Produto;
import classes.Ultilidades;
import formularios.sobres.frmSobreProdutos;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmClientes extends javax.swing.JInternalFrame {

    Icon figura = new ImageIcon(getToolkit().createImage(getClass().getResource("/icones/atencao.png")));

    private Dados msDados;
    //Dados msDados = new Dados();

    // para gravar os usuarios
    private int CliAtual = 0;

    //cadastro de novos usuarios
    private boolean novo = false;

    private DefaultTableModel mTabela;

    public void setDados(Dados msDados) {
        this.msDados = msDados;
    }

    public frmClientes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIDCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbIdentificacao = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnAnterior = new javax.swing.JButton();
        btnPrimeiro = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabela = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSNome = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cmbcidade = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        DNascimento = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        cmbEstado = new javax.swing.JComboBox<>();
        DData = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setIconifiable(true);
        setTitle("Clientes");
        setDoubleBuffered(true);
        setMinimumSize(new java.awt.Dimension(128, 40));
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("ID Cliente:");
        jLabel1.setToolTipText("");
        jLabel1.setAlignmentX(0.5F);

        txtIDCliente.setEnabled(false);
        txtIDCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDClienteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Telefone:");
        jLabel2.setAlignmentX(0.5F);

        cmbIdentificacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma identificação", "CNH", "Identidade", "Passaporte", "Chave Pix", " " }));
        cmbIdentificacao.setToolTipText("Selecione o tipo de acesso");
        cmbIdentificacao.setEnabled(false);
        cmbIdentificacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIdentificacaoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Nome:");
        jLabel3.setAlignmentX(0.5F);

        txtNome.setEnabled(false);
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Endereço:");
        jLabel5.setAlignmentX(0.5F);

        txtEndereco.setEnabled(false);
        txtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/clientes2.png"))); // NOI18N
        jLabel4.setAlignmentX(0.5F);

        btnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/usuario-anterior.png"))); // NOI18N
        btnAnterior.setToolTipText("Ir para o Usuário Anterior");
        btnAnterior.setAlignmentX(0.5F);
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnPrimeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/primeiro-usuario.png"))); // NOI18N
        btnPrimeiro.setToolTipText("Ir para o Primeiro Usuário");
        btnPrimeiro.setAlignmentX(0.5F);
        btnPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroActionPerformed(evt);
            }
        });

        btnProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/proximo-usuario.png"))); // NOI18N
        btnProximo.setToolTipText("Ir para o Próximo Usuário");
        btnProximo.setAlignmentX(0.5F);
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        btnUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/ultimo-usuario.png"))); // NOI18N
        btnUltimo.setToolTipText("Ir para o Ultimo Usuário");
        btnUltimo.setAlignmentX(0.5F);
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/adicionar-usuario.png"))); // NOI18N
        btnNovo.setToolTipText("Adicionar um Novo Usuário");
        btnNovo.setAlignmentX(0.5F);
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/editar-usuario.png"))); // NOI18N
        btnEditar.setToolTipText("Editar Usuario");
        btnEditar.setAlignmentX(0.5F);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/apagar-usuario.png"))); // NOI18N
        btnExcluir.setToolTipText("Excluir Usuário");
        btnExcluir.setAlignmentX(0.5F);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/salvar.png"))); // NOI18N
        btnSalvar.setToolTipText("Salvar Alterações");
        btnSalvar.setAlignmentX(0.5F);
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/block-usuario.png"))); // NOI18N
        btnCancelar.setToolTipText("Cancelar Alterações");
        btnCancelar.setAlignmentX(0.5F);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/procurar-usuario.png"))); // NOI18N
        btnPesquisar.setToolTipText("Pesquisar Usuário Cadastrado");
        btnPesquisar.setAlignmentX(0.5F);
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/ajuda-usuario.png"))); // NOI18N
        jButton1.setToolTipText("Ajuda");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tblTabela = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tblTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Preço", "Imposto", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblTabela.setEnabled(false);
        tblTabela.setFocusable(false);
        tblTabela.getTableHeader().setReorderingAllowed(false);
        tblTabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTabelaMouseClicked(evt);
            }
        });
        tblTabela.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblTabelaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblTabelaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblTabela);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Identificação:");
        jLabel8.setAlignmentX(0.5F);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Sobrenome:");
        jLabel6.setAlignmentX(0.5F);

        txtSNome.setEnabled(false);
        txtSNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSNomeActionPerformed(evt);
            }
        });

        txtTelefone.setText("(DDD) _____-____");
        txtTelefone.setToolTipText("");
        txtTelefone.setEnabled(false);
        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Cidade:");
        jLabel9.setAlignmentX(0.5F);

        cmbcidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma cidade", "Teste1", "Teste2" }));
        cmbcidade.setToolTipText("Selecione o tipo de acesso");
        cmbcidade.setEnabled(false);
        cmbcidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbcidadeActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Data Atual:");
        jLabel7.setAlignmentX(0.5F);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Data Nasc:");
        jLabel10.setAlignmentX(0.5F);

        DNascimento.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Estado:");
        jLabel11.setAlignmentX(0.5F);

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UF", "Teste1", "Teste2" }));
        cmbEstado.setToolTipText("Selecione o tipo de acesso");
        cmbEstado.setEnabled(false);
        cmbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEstadoActionPerformed(evt);
            }
        });

        DData.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtNome))
                            .addComponent(txtEndereco)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(cmbIdentificacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSNome, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addGap(23, 23, 23)
                                .addComponent(DNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9))
                                    .addComponent(DData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(cmbcidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel4)
                                .addGap(0, 26, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(btnPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(txtSNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10))
                            .addComponent(DNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbIdentificacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(cmbcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(DData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDClienteActionPerformed

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void cmbIdentificacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIdentificacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbIdentificacaoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        // 1 Desabilitar botões e habilitar o Salvar e Cancelar
        btnPrimeiro.setEnabled(false);
        btnAnterior.setEnabled(false);
        btnProximo.setEnabled(false);
        btnUltimo.setEnabled(false);
        btnNovo.setEnabled(false);
        btnEditar.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnExcluir.setEnabled(false);
        btnCancelar.setEnabled(true);
        btnPesquisar.setEnabled(false); //fim 1

        // 2 Habilitar as caixas de texto
        txtNome.setEnabled(true);
	txtSNome.setEnabled(true);
	DNascimento.setEnabled(true);
        txtEndereco.setEnabled(true);
	txtTelefone.setEnabled(true);
        cmbIdentificacao.setEnabled(true);
	cmbEstado.setEnabled(true);
	cmbcidade.setEnabled(true);
	DData.setEnabled(true);
        

        //bloqueando o adiconar novos usuarios
        novo = false;

        // 3 Adicionando foco ao campo Nome
        txtNome.requestFocus(); // fim 3


    }//GEN-LAST:event_btnEditarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // Chamando a tela frmSobreUsuarios
        frmSobreProdutos sobreProdutos = new frmSobreProdutos();
        sobreProdutos.setVisible(true); //fim 

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // 1 Desabilitar botões e habilitar o Salvar e Cancelar
        btnPrimeiro.setEnabled(false);
        btnAnterior.setEnabled(false);
        btnProximo.setEnabled(false);
        btnUltimo.setEnabled(false);
        btnNovo.setEnabled(false);
        btnEditar.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnExcluir.setEnabled(false);
        btnCancelar.setEnabled(true);
        btnPesquisar.setEnabled(false); //fim 1

        // 2 Habilitar as caixas de texto
	txtIDCliente.setEnabled(true);
        txtNome.setEnabled(true);
	txtSNome.setEnabled(true);
	DNascimento.setEnabled(true);
        txtEndereco.setEnabled(true);
	txtTelefone.setEnabled(true);
        cmbIdentificacao.setEnabled(true);
	cmbEstado.setEnabled(true);
	cmbcidade.setEnabled(true);
	DData.setEnabled(true);//fim  2

        // 3 Limpar caixa de textos
        txtIDCliente.setText("");
        txtNome.setText("");
        txtSNome.setText("");
        DNascimento.setDateFormatString("");
        txtEndereco.setText("");
        txtTelefone.setText("");
        cmbIdentificacao.setSelectedIndex(0);
        cmbEstado.setSelectedIndex(0);
        cmbcidade.setSelectedIndex(0);
        DData.setDateFormatString("");
        

        //adicionar novos usuarios
        novo = true;

        // 4 Adicionando foco ao campo ID
        txtIDCliente.requestFocus(); // fim 4


    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // validar se o campo de produto foi preenchido
        if (txtIDCliente.getText().equals("")) {

            JOptionPane.showMessageDialog(rootPane, "Inserir o ID do produto",
                    "ATENÇÂO", HEIGHT, figura);
            txtIDCliente.requestFocusInWindow();
            return;
        }
        // Validar se o campo de imposto foi preenchido
        /*
        if (cmbImposto.getSelectedIndex() < 0) {
            JOptionPane.showMessageDialog(rootPane, "Selecionar o valor de imposto (taxa)",
                    "ATENÇÂO", HEIGHT, figura);
            cmbImposto.requestFocusInWindow();
            return;
        }
        */
        
        // Validar se o campo de descrição foi preenchido
        if (txtNome.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Inserir o nome do produto",
                    "ATENÇÂO", HEIGHT, figura);
            txtNome.requestFocusInWindow();
            return;
        }
        // Validar se o campo de preco foi preenchido
        if (txtEndereco.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Inserir preço do produto",
                    "ATENÇÂO", HEIGHT, figura);
            txtEndereco.requestFocusInWindow();
            return;
        }
        //Verificar se foi digitado apenas numeros
        if (!Ultilidades.isNumeric(txtEndereco.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Campo preço só aceita números",
                    "ATENÇÂO", HEIGHT, figura);
            txtEndereco.requestFocusInWindow();
            return;
        }
        // Validar para o usuario não digitar valor abaixo de zero
        int preco = Integer.parseInt((txtEndereco.getText()));
        if (preco <= 0) {
            JOptionPane.showMessageDialog(rootPane, "Campo preço não aceita valores 0 ou abaixo de 0",
                    "ATENÇÂO", HEIGHT, figura);
            txtEndereco.requestFocusInWindow();
            return;
        }

        // Verificar se o usuário já existe
        int pos = msDados.posicaoProduto(txtIDCliente.getText());
        if (novo) {
            if (pos != -1) {
                JOptionPane.showMessageDialog(rootPane, """
                    O ID do produto j\u00e1 existe
                    Verifique se trata-se do mesmo produto""", "ATENÇÂO", HEIGHT, figura);
                txtIDCliente.requestFocusInWindow();
                // 3 Limpar caixa de textos
                txtIDCliente.setText("");
                cmbIdentificacao.setSelectedIndex(0);
                txtNome.setText("");
                txtEndereco.setText("");
                txtAnotacao.setText("");
                //fim  3
                return;

            }

        } // Se o usuário não existe
        else {
            if (pos == -1) {
                JOptionPane.showMessageDialog(rootPane, "Ok",
                        "ATENÇÂO", HEIGHT, figura);
                txtIDCliente.requestFocusInWindow();
                return;
            }
        }

        Produto mProduto = new Produto(
                txtIDCliente.getText(),
                txtNome.getText(),
                preco,
                cmbIdentificacao.getSelectedIndex(),
                txtAnotacao.getText());

        String msg;

        if (novo) {
            msg = msDados.adicionarProduto(mProduto);

        } else {
            msg = msDados.editarProduto(mProduto, pos);

        }
        JOptionPane.showMessageDialog(rootPane, msg,
                "ATENÇÂO", HEIGHT, figura);

        // 1 Desabilitar o Salvar e Cancelar e habilitar botões
        btnPrimeiro.setEnabled(true);
        btnAnterior.setEnabled(true);
        btnProximo.setEnabled(true);
        btnUltimo.setEnabled(true);
        btnNovo.setEnabled(true);
        btnEditar.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnExcluir.setEnabled(true);
        btnCancelar.setEnabled(false);
        btnPesquisar.setEnabled(true); //fim 1

        // 2 desabilitar as caixas de texto
        txtIDCliente.setEnabled(false);
        txtNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        cmbIdentificacao.setEnabled(false);
        txtAnotacao.setEnabled(false);
         //fim  2

        preencherTabela();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // 1 Desabilitar o Salvar e Cancelar e habilitar botões
        btnPrimeiro.setEnabled(true);
        btnAnterior.setEnabled(true);
        btnProximo.setEnabled(true);
        btnUltimo.setEnabled(true);
        btnNovo.setEnabled(true);
        btnEditar.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnExcluir.setEnabled(true);
        btnCancelar.setEnabled(false);
        btnPesquisar.setEnabled(true); //fim 1

        // 2 Desabilitar as caixas de texto
        txtIDCliente.setEnabled(false);
        cmbIdentificacao.setEnabled(false);
        txtNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtAnotacao.setEnabled(false);
         //fim  2

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

        // Chamar os registros dos usuarios
        mostrarRegistro();

        //Chamar o preenchimento da tabela
        preencherTabela();

    }//GEN-LAST:event_formInternalFrameOpened

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
        // Chamando o primeiro usuario cadastrado
        CliAtual = 0;
        mostrarRegistro();
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        // Chamando o ultimo usuario cadastrado
        CliAtual = msDados.numeroProdutos()- 1;
        mostrarRegistro();
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        // Chamando o proximo usuario cadastrado
        CliAtual++;
        if (CliAtual == msDados.numeroProdutos()) {
            CliAtual = 0;
        }
        mostrarRegistro();
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        // Chamando o usuario anterior cadastrado
        CliAtual--;
        if (CliAtual == -1) {
            CliAtual = msDados.numeroProdutos()- 1;
        }
        mostrarRegistro();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:

        int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente deletar este produto?",
                "ATENÇÂO", HEIGHT);
        if (resposta != 0) {
            return;
        }
        String msg;
        msg = msDados.deletarProduto(CliAtual);

        JOptionPane.showMessageDialog(rootPane, msg,
                "ATENÇÂO", HEIGHT, figura);

        CliAtual = 0;

        mostrarRegistro();
        preencherTabela();

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated

        // Chamar os registros dos usuarios
        mostrarRegistro();

        //Chamar o preenchimento da tabela
        preencherTabela();
    }//GEN-LAST:event_formInternalFrameActivated

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
        String produto = JOptionPane.showInputDialog("Inserir o produto");
        if (produto.equals("")) {

            return;
        }
        int pos = msDados.posicaoProduto(produto);
        if (pos == -1) {
            JOptionPane.showMessageDialog(rootPane, "Este produto não existe");
            return;
        }
        CliAtual = pos;

        mostrarRegistro();


    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void tblTabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTabelaMouseClicked
        // Evento será usado para setar os campos da tabela
        // clicando com o botao do mouse
        setar_campos();
    }//GEN-LAST:event_tblTabelaMouseClicked

    private void tblTabelaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblTabelaKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_tblTabelaKeyPressed

    private void tblTabelaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblTabelaKeyReleased
        // TODO add your handling code here:


    }//GEN-LAST:event_tblTabelaKeyReleased

    private void txtSNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSNomeActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void cmbcidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbcidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbcidadeActionPerformed

    private void cmbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEstadoActionPerformed

    private void mostrarRegistro() {
        //metodo para mostrar os registros de usuarios na tela
        txtIDCliente.setText(msDados.getProdutos()[CliAtual].getIdProduto());
        txtNome.setText(msDados.getProdutos()[CliAtual].getDescricao());
        txtEndereco.setText("" + msDados.getProdutos()[CliAtual].getPreco());
        txtAnotacao.setText(msDados.getProdutos()[CliAtual].getAnotacao());
        cmbIdentificacao.setSelectedIndex(msDados.getProdutos()[CliAtual].getImposto());
    }

    private void preencherTabela() {

        String titulos[] = {"ID", "Nome", "Preço", "Imposto", "Descrição"};
        String registro[] = new String[5];
        mTabela = new DefaultTableModel(null, titulos);

        for (int i = 0; i < msDados.numeroProdutos(); i++) {
            registro[0] = msDados.getProdutos()[i].getIdProduto();
            registro[1] = msDados.getProdutos()[i].getDescricao();
            registro[2] = "" + msDados.getProdutos()[i].getPreco();
            registro[3] = imposto (msDados.getProdutos()[i].getImposto());
            registro[4] = msDados.getProdutos()[i].getAnotacao();

            mTabela.addRow(registro);

        }

        tblTabela.setModel(mTabela);

    }
    
    // Metodo para o campo imposto
    private String imposto(int idIMPOSTO){
        switch (idIMPOSTO) {
            case 0: return "0%";
            case 1: return "10%";
            case 2: return "15%";
            case 3: return "20%";
            case 4: return "25%";
            case 5: return "30%";
            case 6: return "35%";
            case 7: return "40%";
            case 8: return "45%";
            case 9: return "50%";
            case 10: return "55%";
            case 11: return "60%";
                
            default:
               return "Não definido";
        }
    }
    // Método para setar os campos do formulário com o conteúdo da tabela
    public void setar_campos() {

        int setar = tblTabela.getSelectedRow();
        txtIDCliente.setText("" + tblTabela.getModel().getValueAt(setar, 0));
        txtNome.setText("" + tblTabela.getModel().getValueAt(setar, 1));
        txtEndereco.setText("" + tblTabela.getModel().getValueAt(setar, 2));
        cmbIdentificacao.setSelectedItem(tblTabela.getModel().getValueAt(setar, 3));
        txtAnotacao.setText("" + tblTabela.getModel().getValueAt(setar, 4));

    }

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DData;
    private com.toedter.calendar.JDateChooser DNascimento;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JComboBox<String> cmbIdentificacao;
    private javax.swing.JComboBox<String> cmbcidade;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTabela;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtIDCliente;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}