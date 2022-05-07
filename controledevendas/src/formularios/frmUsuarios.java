package formularios;

import classes.Dados;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class frmUsuarios extends javax.swing.JInternalFrame {

    private Dados msDados;
    // para gravar os usuarios
    private int usuAtual = 0;
    //cadastro de novos usuarios
    private boolean novo = false;

    public void setDados(Dados msDados) {
        this.msDados = msDados;
    }

    public frmUsuarios() {
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
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
        txtSenhaUsuario = new javax.swing.JPasswordField();
        txtConfSenhaUsuario = new javax.swing.JPasswordField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Usuários");
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
        jLabel1.setText("ID Usuário:");
        jLabel1.setAlignmentX(0.5F);

        txtIDUsuario.setEnabled(false);
        txtIDUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDUsuarioActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Tipo de acesso:");
        jLabel2.setAlignmentX(0.5F);

        cmbPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o tipo de acesso", "Administrador", "Comum" }));
        cmbPerfil.setToolTipText("Selecione o tipo de acesso");
        cmbPerfil.setEnabled(false);
        cmbPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPerfilActionPerformed(evt);
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
        jLabel5.setText("Sobrenome:");
        jLabel5.setAlignmentX(0.5F);

        txtsnome.setEnabled(false);
        txtsnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsnomeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Senha:");
        jLabel6.setAlignmentX(0.5F);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Conf Senha:");
        jLabel7.setToolTipText("Confirmar senha");
        jLabel7.setAlignmentX(0.5F);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/usuario-image.png"))); // NOI18N
        jLabel4.setAlignmentX(0.5F);

        btnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/usuario-anterior.png"))); // NOI18N
        btnAnterior.setToolTipText("Ir para o Usuário Anterior");
        btnAnterior.setAlignmentX(0.5F);

        btnPrimeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/primeiro-usuario.png"))); // NOI18N
        btnPrimeiro.setToolTipText("Ir para o Primeiro Usuário");
        btnPrimeiro.setAlignmentX(0.5F);

        btnProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/proximo-usuario.png"))); // NOI18N
        btnProximo.setToolTipText("Ir para o Próximo Usuário");
        btnProximo.setAlignmentX(0.5F);

        btnUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/ultimo-usuario.png"))); // NOI18N
        btnUltimo.setToolTipText("Ir para o Ultimo Usuário");
        btnUltimo.setAlignmentX(0.5F);

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

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/ajuda-usuario.png"))); // NOI18N
        jButton1.setToolTipText("Ajuda");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtSenhaUsuario.setEnabled(false);

        txtConfSenhaUsuario.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3))
                    .addComponent(jLabel7)
                    .addComponent(jLabel1))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsnome, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtConfSenhaUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                .addComponent(txtSenhaUsuario, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtIDUsuario)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cmbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(cmbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtsnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtConfSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
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
            Icon figura = new ImageIcon(getToolkit().createImage(getClass().getResource("/icones/atencao.png")));
            JOptionPane.showMessageDialog(rootPane, "Inserir o número de ID",
                    "ATENÇÂO", HEIGHT, figura);
            txtIDUsuario.requestFocusInWindow();
            return;
        }
        // Validar se o campo de Perfil foi preenchido
        if (cmbPerfil.getSelectedIndex() == 0) {
            Icon figura = new ImageIcon(getToolkit().createImage(getClass().getResource("/icones/atencao.png")));
            JOptionPane.showMessageDialog(rootPane, "Selecionar o tipo de usuário",
                    "ATENÇÂO", HEIGHT, figura);
            cmbPerfil.requestFocusInWindow();
            return;
        }
        // Validar se o campo de nome foi preenchido
        if (txtNome.getText().equals("")) {
            Icon figura = new ImageIcon(getToolkit().createImage(getClass().getResource("/icones/atencao.png")));
            JOptionPane.showMessageDialog(rootPane, "Inserir nome do usuário",
                    "ATENÇÂO", HEIGHT, figura);
            txtNome.requestFocusInWindow();
            return;
        }
        // Validar se o campo de Sobrenome foi preenchido
        if (txtsnome.getText().equals("")) {
            Icon figura = new ImageIcon(getToolkit().createImage(getClass().getResource("/icones/atencao.png")));
            JOptionPane.showMessageDialog(rootPane, "Inserir nome do usuário",
                    "ATENÇÂO", HEIGHT, figura);
            txtsnome.requestFocusInWindow();
            return;
        }

        //verificar se senha e confirmação de senha está igual
        String senha = new String(txtSenhaUsuario.getPassword());
        String confirmar = new String(txtConfSenhaUsuario.getPassword());

        // Validar se o campo de senha foi preenchido
        if (senha.equals("")) {
            Icon figura = new ImageIcon(getToolkit().createImage(getClass().getResource("/icones/atencao.png")));
            JOptionPane.showMessageDialog(rootPane, "Selecionar o tipo de usuário",
                    "ATENÇÂO", HEIGHT, figura);
            txtSenhaUsuario.requestFocusInWindow();
            return;
        }
        // Validar se o campo de confirmação de senha foi preenchido
        if (confirmar.equals("")) {
            Icon figura = new ImageIcon(getToolkit().createImage(getClass().getResource("/icones/atencao.png")));
            JOptionPane.showMessageDialog(rootPane, "Selecionar o tipo de usuário",
                    "ATENÇÂO", HEIGHT, figura);
            txtConfSenhaUsuario.requestFocusInWindow();
            return;
        }
        // Avisar que senha e confirmação estão diferentes
        if (!senha.equals(confirmar)) {
            Icon figura = new ImageIcon(getToolkit().createImage(getClass().getResource("/icones/atencao.png")));
            JOptionPane.showMessageDialog(rootPane, "Você digitou senhas diferentes :)",
                    "ATENÇÂO", HEIGHT, figura);
            txtConfSenhaUsuario.requestFocusInWindow();
            return;
        }

        int pos = msDados.posicaoUsuario(txtIDUsuario.getText());
        if (novo) {
            if (pos != -1) {
                Icon figura = new ImageIcon(getToolkit().createImage(getClass().getResource("/icones/atencao.png")));
                JOptionPane.showMessageDialog(rootPane, "Este usuário já existe",
                        "ATENÇÂO", HEIGHT, figura);
                txtIDUsuario.requestFocusInWindow();
                return;
            }

        } else {
            if (pos == -1) {
                Icon figura = new ImageIcon(getToolkit().createImage(getClass().getResource("/icones/atencao.png")));
                JOptionPane.showMessageDialog(rootPane, "Ok",
                        "ATENÇÂO", HEIGHT, figura);
                txtIDUsuario.requestFocusInWindow();
                return;
            }
        }

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
        // TODO add your handling code here:
        txtIDUsuario.setText(msDados.getUsuarios()[usuAtual].getIdUsuario());
        txtNome.setText(msDados.getUsuarios()[usuAtual].getNome());
        txtsnome.setText(msDados.getUsuarios()[usuAtual].getSnome());
        txtSenhaUsuario.setText(msDados.getUsuarios()[usuAtual].getSenha());
        txtConfSenhaUsuario.setText(msDados.getUsuarios()[usuAtual].getSenha());
        cmbPerfil.setSelectedIndex(msDados.getUsuarios()[usuAtual].getPerfil());

    }//GEN-LAST:event_formInternalFrameOpened


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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField txtConfSenhaUsuario;
    private javax.swing.JTextField txtIDUsuario;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenhaUsuario;
    private javax.swing.JTextField txtsnome;
    // End of variables declaration//GEN-END:variables
}
