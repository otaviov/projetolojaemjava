package formularios;

//importaçoes
import classes.Dados;
import classes.Produto;
import classes.Ultilidades;
import formularios.sobres.frmSobreProdutos;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmProdutos extends javax.swing.JInternalFrame {

    Icon figura = new ImageIcon(getToolkit().createImage(getClass().getResource("/icones/atencao.png")));

    private Dados msDados;
    //Dados msDados = new Dados();

    // para gravar os usuarios
    private int proAtual = 0;

    //cadastro de novos usuarios
    private boolean novo = false;

    private DefaultTableModel mTabela;

    public void setDados(Dados msDados) {
        this.msDados = msDados;
    }

    public frmProdutos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIDProduto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbImposto = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAnotacao = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setTitle("Produtos");
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
        jLabel1.setText("ID:");
        jLabel1.setToolTipText("");
        jLabel1.setAlignmentX(0.5F);

        txtIDProduto.setEnabled(false);
        txtIDProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDProdutoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Imposto:");
        jLabel2.setAlignmentX(0.5F);

        cmbImposto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0%", "10%", "15%", "20%", "25%", "30%", "35%", "40%", "45%", "50%", "55%", "60%" }));
        cmbImposto.setToolTipText("Selecione o tipo de acesso");
        cmbImposto.setEnabled(false);
        cmbImposto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbImpostoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Nome:");
        jLabel3.setAlignmentX(0.5F);

        txtDescricao.setEnabled(false);
        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Preço:");
        jLabel5.setAlignmentX(0.5F);

        txtPreco.setText("R$");
        txtPreco.setEnabled(false);
        txtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/produtos1.png"))); // NOI18N
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
        jLabel8.setText("Descrição:");
        jLabel8.setAlignmentX(0.5F);

        txtAnotacao.setColumns(20);
        txtAnotacao.setRows(5);
        txtAnotacao.setEnabled(false);
        jScrollPane2.setViewportView(txtAnotacao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtPreco)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbImposto, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtDescricao)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(txtIDProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(45, 45, 45)
                                .addComponent(jLabel4))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(143, 143, 143)
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
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIDProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbImposto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
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
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDProdutoActionPerformed

    private void txtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoActionPerformed

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void cmbImpostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbImpostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbImpostoActionPerformed

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
        cmbImposto.setEnabled(true);
        txtDescricao.setEnabled(true);
        txtPreco.setEnabled(true);
        txtAnotacao.setEnabled(true);

        //bloqueando o adiconar novos usuarios
        novo = false;

        // 3 Adicionando foco ao campo Nome
        txtDescricao.requestFocus(); // fim 3


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
        txtIDProduto.setEnabled(true);
        txtDescricao.setEnabled(true);
        txtPreco.setEnabled(true);
        cmbImposto.setEnabled(true);
        txtAnotacao.setEnabled(true);//fim  2

        // 3 Limpar caixa de textos
        txtIDProduto.setText("");
        txtDescricao.setText("");
        txtPreco.setText("");
        cmbImposto.setSelectedIndex(0);
        txtAnotacao.setText("");

        //adicionar novos usuarios
        novo = true;

        // 4 Adicionando foco ao campo ID
        txtIDProduto.requestFocus(); // fim 4


    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // validar se o campo de produto foi preenchido
        if (txtIDProduto.getText().equals("")) {

            JOptionPane.showMessageDialog(rootPane, "Inserir o ID do produto",
                    "ATENÇÂO", HEIGHT, figura);
            txtIDProduto.requestFocusInWindow();
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
        if (txtDescricao.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Inserir o nome do produto",
                    "ATENÇÂO", HEIGHT, figura);
            txtDescricao.requestFocusInWindow();
            return;
        }
        // Validar se o campo de preco foi preenchido
        if (txtPreco.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Inserir preço do produto",
                    "ATENÇÂO", HEIGHT, figura);
            txtPreco.requestFocusInWindow();
            return;
        }
        //Verificar se foi digitado apenas numeros
        if (!Ultilidades.isNumericFloat(txtPreco.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Campo preço só aceita números" + 
                    "\nCaso seja números decimais usar ponto '.' no lugar da vírgula ','",
                    "ATENÇÂO", HEIGHT, figura);
            txtPreco.requestFocusInWindow();
            return;
        }
        // Validar para o usuario não digitar valor abaixo de zero
        float preco = Float.parseFloat((txtPreco.getText()));
        if (preco <= 0) {
            JOptionPane.showMessageDialog(rootPane, "Campo preço não aceita valores 0 ou abaixo de 0",
                    "ATENÇÂO", HEIGHT, figura);
            txtPreco.requestFocusInWindow();
            return;
        }

        // Verificar se o usuário já existe
        int pos = msDados.posicaoProduto(txtIDProduto.getText());
        if (novo) {
            if (pos != -1) {
                JOptionPane.showMessageDialog(rootPane, """
                    O ID do produto j\u00e1 existe
                    Verifique se trata-se do mesmo produto""", "ATENÇÂO", HEIGHT, figura);
                txtIDProduto.requestFocusInWindow();
                // 3 Limpar caixa de textos
                txtIDProduto.setText("");
                cmbImposto.setSelectedIndex(0);
                txtDescricao.setText("");
                txtPreco.setText("");
                txtAnotacao.setText("");
                //fim  3
                return;

            }

        } // Se o usuário não existe
        else {
            if (pos == -1) {
                JOptionPane.showMessageDialog(rootPane, "Ok",
                        "ATENÇÂO", HEIGHT, figura);
                txtIDProduto.requestFocusInWindow();
                return;
            }
        }

        Produto mProduto = new Produto(
                txtIDProduto.getText(),
                txtDescricao.getText(),
                preco,
                cmbImposto.getSelectedIndex(),
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
        txtIDProduto.setEnabled(false);
        txtDescricao.setEnabled(false);
        txtPreco.setEnabled(false);
        cmbImposto.setEnabled(false);
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
        txtIDProduto.setEnabled(false);
        cmbImposto.setEnabled(false);
        txtDescricao.setEnabled(false);
        txtPreco.setEnabled(false);
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
        proAtual = 0;
        
        mostrarRegistro();
        
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        // Chamando o ultimo usuario cadastrado
        proAtual = msDados.numeroProdutos()- 1;
        mostrarRegistro();
        
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        // Chamando o proximo usuario cadastrado
        proAtual++;
        if (proAtual == msDados.numeroProdutos()) {
            proAtual = 0;
        }
        mostrarRegistro();
        
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        // Chamando o usuario anterior cadastrado
        proAtual--;
        if (proAtual == -1) {
            proAtual = msDados.numeroProdutos()- 1;
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
        msg = msDados.deletarProduto(proAtual);

        JOptionPane.showMessageDialog(rootPane, msg,
                "ATENÇÂO", HEIGHT, figura);

        proAtual = 0;

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
        proAtual = pos;

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

    private void mostrarRegistro() {
        //metodo para mostrar os registros de usuarios na tela
        txtIDProduto.setText(msDados.getProdutos()[proAtual].getIdProduto());
        txtDescricao.setText(msDados.getProdutos()[proAtual].getDescricao());
        txtPreco.setText("" + msDados.getProdutos()[proAtual].getPreco());
        cmbImposto.setSelectedIndex(msDados.getProdutos()[proAtual].getImposto());
        txtAnotacao.setText(msDados.getProdutos()[proAtual].getAnotacao());
        
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
        txtIDProduto.setText("" + tblTabela.getModel().getValueAt(setar, 0));
        txtDescricao.setText("" + tblTabela.getModel().getValueAt(setar, 1));
        txtPreco.setText("" + tblTabela.getModel().getValueAt(setar, 2));
        cmbImposto.setSelectedItem(tblTabela.getModel().getValueAt(setar, 3));
        txtAnotacao.setText("" + tblTabela.getModel().getValueAt(setar, 4));

    }

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JComboBox<String> cmbImposto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblTabela;
    private javax.swing.JTextArea txtAnotacao;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtIDProduto;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
