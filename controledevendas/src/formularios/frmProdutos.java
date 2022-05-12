package formularios;

import classes.Dados;
import classes.Usuario;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class frmProdutos extends javax.swing.JInternalFrame {

    Icon figura = new ImageIcon(getToolkit().createImage(getClass().getResource("/icones/atencao.png")));

    private Dados msDados;
    //Dados msDados = new Dados();

    // para gravar os usuarios
    private int usuAtual = 0;

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
        txtIDUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbPerfil = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtsnome = new javax.swing.JTextField();
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
        jTextArea1 = new javax.swing.JTextArea();

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
        jLabel1.setText("ID Produto:");
        jLabel1.setToolTipText("");
        jLabel1.setAlignmentX(0.5F);

        txtIDUsuario.setEnabled(false);
        txtIDUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDUsuarioActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Imposto:");
        jLabel2.setAlignmentX(0.5F);

        cmbPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0%", "10%", "15%", "20%", "25%" }));
        cmbPerfil.setToolTipText("Selecione o tipo de acesso");
        cmbPerfil.setEnabled(false);
        cmbPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPerfilActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Descrição:");
        jLabel3.setAlignmentX(0.5F);

        txtNome.setEnabled(false);
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Preço:");
        jLabel5.setAlignmentX(0.5F);

        txtsnome.setEnabled(false);
        txtsnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsnomeActionPerformed(evt);
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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Usuário", "Nome", "Sobrenome", "Tipo de Acesso"
            }
        ));
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
        jLabel8.setText("Anotação:");
        jLabel8.setAlignmentX(0.5F);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(jLabel1))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome)
                            .addComponent(txtIDUsuario)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtsnome, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(cmbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 2, Short.MAX_VALUE))
                            .addComponent(jScrollPane2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel4)
                                .addGap(29, 29, 29))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtIDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(60, 60, 60))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtsnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void txtIDUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDUsuarioActionPerformed

    private void txtsnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsnomeActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void cmbPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPerfilActionPerformed

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
        cmbPerfil.setEnabled(true);
        txtNome.setEnabled(true);
        txtsnome.setEnabled(true);
        txtSenhaUsuario.setEnabled(true);
        txtConfSenhaUsuario.setEnabled(true); //fim  2

        //bloqueando o adiconar novos usuarios
        novo = false;

        // 3 Adicionando foco ao campo Nome
        txtNome.requestFocus(); // fim 3


    }//GEN-LAST:event_btnEditarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // Chamando a tela frmSobreUsuarios
        frmSobreUsuarios SobreUser = new frmSobreUsuarios();
        SobreUser.setVisible(true); //fim 

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
        txtIDUsuario.setEnabled(true);
        cmbPerfil.setEnabled(true);
        txtNome.setEnabled(true);
        txtsnome.setEnabled(true);
        txtSenhaUsuario.setEnabled(true);
        txtConfSenhaUsuario.setEnabled(true); //fim  2

        // 3 Limpar caixa de textos
        txtIDUsuario.setText("");
        cmbPerfil.setSelectedIndex(0);
        txtNome.setText("");
        txtsnome.setText("");
        txtSenhaUsuario.setText("");
        txtConfSenhaUsuario.setText(""); //fim  3

        //adicionar novos usuarios
        novo = true;

        // 4 Adicionando foco ao campo ID
        txtIDUsuario.requestFocus(); // fim 4


    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // validar se o campo de ID foi preenchido
        if (txtIDUsuario.getText().equals("")) {

            JOptionPane.showMessageDialog(rootPane, "Inserir o número de ID",
                    "ATENÇÂO", HEIGHT, figura);
            txtIDUsuario.requestFocusInWindow();
            return;
        }
        // Validar se o campo de Perfil foi preenchido
        if (cmbPerfil.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Selecionar o tipo de usuário",
                    "ATENÇÂO", HEIGHT, figura);
            cmbPerfil.requestFocusInWindow();
            return;
        }
        // Validar se o campo de nome foi preenchido
        if (txtNome.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Inserir nome do usuário",
                    "ATENÇÂO", HEIGHT, figura);
            txtNome.requestFocusInWindow();
            return;
        }
        // Validar se o campo de Sobrenome foi preenchido
        if (txtsnome.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Inserir Sobrenome do usuário",
                    "ATENÇÂO", HEIGHT, figura);
            txtsnome.requestFocusInWindow();
            return;
        }

        //verificar se senha e confirmação de senha está igual
        String senha = new String(txtSenhaUsuario.getPassword());
        String confirmar = new String(txtConfSenhaUsuario.getPassword());

        // Validar se o campo de senha foi preenchido
        if (senha.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Inserir uma senha",
                    "ATENÇÂO", HEIGHT, figura);
            txtSenhaUsuario.requestFocusInWindow();
            return;
        }
        // Validar se o campo de confirmação de senha foi preenchido
        if (confirmar.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Confirmar senha do usuário",
                    "ATENÇÂO", HEIGHT, figura);
            txtConfSenhaUsuario.requestFocusInWindow();
            return;
        }
        // Avisar que senha e confirmação estão diferentes
        if (!senha.equals(confirmar)) {
            JOptionPane.showMessageDialog(rootPane, "Você digitou senhas diferentes",
                    "ATENÇÂO", HEIGHT, figura);
            txtSenhaUsuario.setText("");
            txtConfSenhaUsuario.setText("");
            txtSenhaUsuario.requestFocusInWindow();
            return;
        }

        // Verificar se o usuário já existe
        int pos = msDados.posicaoUsuario(txtIDUsuario.getText());
        if (novo) {
            if (pos != -1) {
                JOptionPane.showMessageDialog(rootPane, "Este usuário já existe",
                        "ATENÇÂO", HEIGHT, figura);
                txtIDUsuario.requestFocusInWindow();
                // 3 Limpar caixa de textos
                txtIDUsuario.setText("");
                cmbPerfil.setSelectedIndex(0);
                txtNome.setText("");
                txtsnome.setText("");
                txtSenhaUsuario.setText("");
                txtConfSenhaUsuario.setText(""); //fim  3
                return;

            }

        } // Se o usuário não existe
        else {
            if (pos == -1) {
                JOptionPane.showMessageDialog(rootPane, "Ok",
                        "ATENÇÂO", HEIGHT, figura);
                txtIDUsuario.requestFocusInWindow();
                return;
            }
        }

        Usuario mUsuario = new Usuario(
                txtIDUsuario.getText(),
                txtNome.getText(),
                txtsnome.getText(),
                senha,
                cmbPerfil.getSelectedIndex());

        String msg;

        if (novo) {
            msg = msDados.adicionarUsuario(mUsuario);

        } else {
            msg = msDados.editarUsuario(mUsuario, pos);

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
        txtIDUsuario.setEnabled(false);
        cmbPerfil.setEnabled(false);
        txtNome.setEnabled(false);
        txtsnome.setEnabled(false);
        txtSenhaUsuario.setEnabled(false);
        txtConfSenhaUsuario.setEnabled(false); //fim  2

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
        txtIDUsuario.setEnabled(false);
        cmbPerfil.setEnabled(false);
        txtNome.setEnabled(false);
        txtsnome.setEnabled(false);
        txtSenhaUsuario.setEnabled(false);
        txtConfSenhaUsuario.setEnabled(false); //fim  2

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

        // Chamar os registros dos usuarios
        mostrarRegistro();

        //Chamar o preenchimento da tabela
        preencherTabela();

    }//GEN-LAST:event_formInternalFrameOpened

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
        // Chamando o primeiro usuario cadastrado
        usuAtual = 0;
        mostrarRegistro();
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        // Chamando o ultimo usuario cadastrado
        usuAtual = msDados.numeroUsuarios() - 1;
        mostrarRegistro();
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        // Chamando o proximo usuario cadastrado
        usuAtual++;
        if (usuAtual == msDados.numeroUsuarios()) {
            usuAtual = 0;
        }
        mostrarRegistro();
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        // Chamando o usuario anterior cadastrado
        usuAtual--;
        if (usuAtual == -1) {
            usuAtual = msDados.numeroUsuarios() - 1;
        }
        mostrarRegistro();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:

        int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente deletar este usuário?",
                "ATENÇÂO", HEIGHT);
        if (resposta != 0) {
            return;
        }
        String msg;
        msg = msDados.deletarUsuario(usuAtual);

        JOptionPane.showMessageDialog(rootPane, msg,
                "ATENÇÂO", HEIGHT, figura);

        usuAtual = 0;

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
        String usuario = JOptionPane.showInputDialog("Inserir o usuário");
        if (usuario.equals("")) {
            
            return ;
        }
        int pos = msDados.posicaoUsuario(usuario);
        if (pos == -1) {
            JOptionPane.showMessageDialog(rootPane, "Este usuário não existe");
            return;
        }
        usuAtual = pos;

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
        txtIDUsuario.setText(msDados.getUsuarios()[usuAtual].getIdUsuario());
        txtNome.setText(msDados.getUsuarios()[usuAtual].getNome());
        txtsnome.setText(msDados.getUsuarios()[usuAtual].getSnome());
        txtSenhaUsuario.setText(msDados.getUsuarios()[usuAtual].getSenha());
        txtConfSenhaUsuario.setText(msDados.getUsuarios()[usuAtual].getSenha());
        cmbPerfil.setSelectedIndex(msDados.getUsuarios()[usuAtual].getPerfil());
    }

    private void preencherTabela() {

        String titulos[] = {"Usuário", "Nome", "Sobrenome", "Tipo de Acesso"};
        String registro[] = new String[4];
        mTabela = new DefaultTableModel(null, titulos);

        for (int i = 0; i < msDados.numeroUsuarios(); i++) {
            registro[0] = msDados.getUsuarios()[i].getIdUsuario();
            registro[1] = msDados.getUsuarios()[i].getNome();
            registro[2] = msDados.getUsuarios()[i].getSnome();
            registro[3] = perfil(msDados.getUsuarios()[i].getPerfil());

            mTabela.addRow(registro);

        }

        tblTabela.setModel(mTabela);

    }

    // Método para setar os campos do formulário com o conteúdo da tabela
    public void setar_campos(){
        
        
        int setar = tblTabela.getSelectedRow();
        txtIDUsuario.setText("" + tblTabela.getModel().getValueAt(setar, 0));
        txtNome.setText(tblTabela.getModel().getValueAt(setar, 1).toString());
        txtsnome.setText("" + tblTabela.getModel().getValueAt(setar, 2));
        cmbPerfil.setSelectedItem(tblTabela.getModel().getValueAt(setar,3));
        
        
    }

    private String perfil(int idPerfil) {
        if (idPerfil == 1) {
            return "Administrador";
        } else {
            return "Comum";
        }
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
    private javax.swing.JComboBox<String> cmbPerfil;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTable tblTabela;
    private javax.swing.JTextField txtIDUsuario;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtsnome;
    // End of variables declaration//GEN-END:variables
}
