package formularios;

import classes.Cliente;
import classes.Dados;
import classes.Ultilidades;
import formularios.sobres.frmSobreClientes;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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

        String formatodDate = null;
        Date date = new Date();
        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        formatodDate = formato.format(date);
        DData.setText(formatodDate);//codigo para pegar a data do sistema e gravar na base

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
        jLabel11 = new javax.swing.JLabel();
        cmbEstado = new javax.swing.JComboBox<>();
        DData = new javax.swing.JTextField();
        DNascimento = new com.toedter.calendar.JDateChooser();

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
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "S_nome", "D_Nasc", "Endereço", "Cel", "Identificação", "UF", "Cidade", "D_atual"
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

        cmbcidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar cidade do Cliente", "Abreu e Lima", "Afrânio", "Agrestina", "Água Preta", "Águas Belas", "Alagoinha", "Aliança", "Altinho", "Amaraji", "Angelim", "Araçoiaba", "Araripina", "Arcoverde" }));
        cmbcidade.setToolTipText("");
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

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Estado:");
        jLabel11.setAlignmentX(0.5F);

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado", "AC", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA            ", "MT", "MS            ", "MG", "PA", "PB         ", "PR", "PE", "PI         ", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE           ", "TO" }));
        cmbEstado.setToolTipText("Selecione o tipo de acesso");
        cmbEstado.setEnabled(false);
        cmbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEstadoActionPerformed(evt);
            }
        });

        DData.setEnabled(false);
        DData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DDataActionPerformed(evt);
            }
        });

        DNascimento.setEnabled(false);

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbIdentificacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmbEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbcidade, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(txtSNome)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(DNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(26, 26, 26))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())))
                            .addComponent(DData, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(169, Short.MAX_VALUE)
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
                .addGap(169, 169, 169))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8))
                            .addComponent(cmbIdentificacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(cmbcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(DData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
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
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        cmbcidade.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDClienteActionPerformed

    }//GEN-LAST:event_txtIDClienteActionPerformed

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed

    }//GEN-LAST:event_txtEnderecoActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed

    }//GEN-LAST:event_txtNomeActionPerformed

    private void cmbIdentificacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIdentificacaoActionPerformed

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

        //bloqueando o adiconar novos usuarios
        novo = false;
        // 3 Adicionando foco ao campo Nome
        txtNome.requestFocus(); // fim 3

    }//GEN-LAST:event_btnEditarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // Chamando a tela frmSobreClientes
        frmSobreClientes sobreClientes = new frmSobreClientes();
        sobreClientes.setVisible(true); //fim 

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
        //fim  2

        // 3 Limpar caixa de textos
        txtIDCliente.setText("");
        txtNome.setText("");
        txtSNome.setText("");
        DNascimento.setDate(new Date());
        txtEndereco.setText("");
        txtTelefone.setText("");
        cmbIdentificacao.setSelectedIndex(0);
        cmbEstado.setSelectedIndex(0);
        cmbcidade.setSelectedIndex(0);

        //adicionar novos usuarios
        novo = true;

        // 4 Adicionando foco ao campo ID
        txtIDCliente.requestFocus(); // fim 4

    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // validar se o campo de Id Cliente foi preenchido
        if (txtIDCliente.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Inserir o ID do Cliente",
                    "ATENÇÂO", HEIGHT, figura);
            txtIDCliente.requestFocusInWindow();
            return;
        }

        // Validar se o campo de Nome foi preenchido
        if (txtNome.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Inserir o nome do Cliente",
                    "ATENÇÂO", HEIGHT, figura);
            txtNome.requestFocusInWindow();
            return;
        }

        // Validar se o campo Sobrenome foi preenchido
        if (txtSNome.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Inserir o Sobrenome do Cliente",
                    "ATENÇÂO", HEIGHT, figura);
            txtSNome.requestFocusInWindow();
            return;
        }

        //Validar se o campo Nascimento foi preenchido
        if (DNascimento.getDate().after(new Date())) {
            JOptionPane.showMessageDialog(rootPane, """
                Por quest\u00f5es de segura\u00e7a 
                inserir a data de nascimento do cliente.
                Para mais informa\u00e7\u00f5es clique no bot\u00e3o de interroga\u00e7\u00e3o
                e saiba mais sobre""",
                    "ATENÇÂO", HEIGHT, figura);
            DNascimento.requestFocusInWindow();
            return;
        }

        //Verificar se o telefone foi digitado apenas numeros
        if (!Ultilidades.isNumericDouble(txtTelefone.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Campo telefone só aceita números",
                    "ATENÇÂO", HEIGHT, figura);
            txtTelefone.requestFocusInWindow();
            return;
        }

        // Validar para o usuario não digitar valor abaixo de zero
        //int fone = Integer.parseInt((txtTelefone.getText()));
        /*
        if (preco <= 0) {
            JOptionPane.showMessageDialog(rootPane, "Campo preço não aceita valores 0 ou abaixo de 0",
                    "ATENÇÂO", HEIGHT, figura);
            txtEndereco.requestFocusInWindow();
            return;
        }*/
        // Verificar se o Cliente já existe
        int pos = msDados.posicaoCliente(txtIDCliente.getText());
        if (novo) {
            if (pos != -1) {
                JOptionPane.showMessageDialog(rootPane, """
                    O ID do cliente j\u00e1 existe
                    Verifique se trata-se do mesmo cliente""", "ATENÇÂO", HEIGHT, figura);
                txtIDCliente.requestFocusInWindow();

                // 3 Limpar caixa de textos
                txtIDCliente.setText("");
                txtNome.setText("");
                txtSNome.setText("");
                DNascimento.setDate(new Date());
                txtEndereco.setText("");
                txtTelefone.setText("");
                cmbIdentificacao.setSelectedIndex(0);
                cmbEstado.setSelectedIndex(0);
                cmbcidade.setSelectedIndex(0);

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

        Cliente mCliente = new Cliente(
                txtIDCliente.getText(),
                txtNome.getText(),
                txtSNome.getText(),
                DNascimento.getDate(),
                txtEndereco.getText(),
                txtTelefone.getText(),
                cmbIdentificacao.getSelectedIndex(),
                cmbEstado.getSelectedIndex(),
                cmbcidade.getSelectedIndex(),
                DData.getText());

        String msg;

        if (novo) {
            msg = msDados.adicionarCliente(mCliente);

        } else {
            msg = msDados.editarCliente(mCliente, pos);

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
        txtIDCliente.setEditable(false);
        txtNome.setEnabled(false);
        txtSNome.setEnabled(false);
        DNascimento.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtTelefone.setEnabled(false);
        cmbIdentificacao.setEnabled(false);
        cmbEstado.setEnabled(false);
        cmbcidade.setEnabled(false);

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
        txtIDCliente.setEditable(false);
        txtNome.setEnabled(false);
        txtSNome.setEnabled(false);
        DNascimento.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtTelefone.setEnabled(false);
        cmbIdentificacao.setEnabled(false);
        cmbEstado.setEnabled(false);
        cmbcidade.setEnabled(false);

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
        CliAtual = msDados.numeroCliente() - 1;
        mostrarRegistro();
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        // Chamando o proximo usuario cadastrado
        CliAtual++;
        if (CliAtual == msDados.numeroCliente()) {
            CliAtual = 0;
        }
        mostrarRegistro();
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        // Chamando o usuario anterior cadastrado
        CliAtual--;
        if (CliAtual == -1) {
            CliAtual = msDados.numeroCliente() - 1;
        }
        mostrarRegistro();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:

        int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente deletar este cliente?",
                "ATENÇÂO", HEIGHT);
        if (resposta != 0) {
            return;
        }
        String msg;
        msg = msDados.deletarCliente(CliAtual);

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
        String cliente = JOptionPane.showInputDialog("Inserir o cliente");
        if (cliente.equals("")) {

            return;
        }
        int pos = msDados.posicaoCliente(cliente);
        if (pos == -1) {
            JOptionPane.showMessageDialog(rootPane, "Este cliente não existe");
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

    }//GEN-LAST:event_tblTabelaKeyPressed

    private void tblTabelaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblTabelaKeyReleased

    }//GEN-LAST:event_tblTabelaKeyReleased

    private void txtSNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSNomeActionPerformed

    }//GEN-LAST:event_txtSNomeActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed

    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void cmbcidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbcidadeActionPerformed

    }//GEN-LAST:event_cmbcidadeActionPerformed

    private void cmbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEstadoActionPerformed

    }//GEN-LAST:event_cmbEstadoActionPerformed

    private void DDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DDataActionPerformed

    private void mostrarRegistro() {

        //metodo para mostrar os registros de clientes na tela
        txtIDCliente.setText(msDados.getCliente()[CliAtual].getIdCliente());
        txtNome.setText(msDados.getCliente()[CliAtual].getNome());
        txtSNome.setText(msDados.getCliente()[CliAtual].getSNome());
        DNascimento.setDate(msDados.getCliente()[CliAtual].getNascimento());
        txtEndereco.setText(msDados.getCliente()[CliAtual].getEndereço());
        txtTelefone.setText("" + msDados.getCliente()[CliAtual].getTelefone());
        cmbIdentificacao.setSelectedIndex(msDados.getCliente()[CliAtual].getIdTipo());
        cmbEstado.setSelectedIndex(msDados.getCliente()[CliAtual].getEstado());
        cmbcidade.setSelectedIndex(msDados.getCliente()[CliAtual].getIdcidade());

    }

    private void preencherTabela() {

        String titulos[] = {"ID", "Nome", "S_nome", "D_nasc", "Endereço", "Cel", "Indentificação", "UF", "Cidade", "D_cadas"};
        String registro[] = new String[9];
        mTabela = new DefaultTableModel(null, titulos);

        for (int i = 0; i < msDados.numeroCliente(); i++) {
            registro[0] = msDados.getCliente()[i].getIdCliente();
            registro[1] = msDados.getCliente()[i].getNome();
            registro[2] = msDados.getCliente()[i].getSNome();
            registro[3] = "" + msDados.getCliente()[i].getNascimento();
            registro[4] = (msDados.getCliente()[i].getEndereço());
            registro[5] = "" + msDados.getCliente()[i].getTelefone();
            registro[6] = tipoId(msDados.getCliente()[i].getIdTipo());
            registro[7] = tipoEstado(msDados.getCliente()[i].getEstado());
            registro[8] = tipoCidade(msDados.getCliente()[i].getIdcidade());

            mTabela.addRow(registro);

        }

        tblTabela.setModel(mTabela);

    }

    // Metodo para o campo identificação
    private String tipoId(int id) {
        switch (id) {
            case 1:
                return "CNH";
            case 2:
                return "Identidade";
            case 3:
                return "Passaporte";
            case 4:
                return "Chave Pix";

            default:
                return "Não definido";
        }
    }

    // Metodo para o campo estado
    private String tipoEstado(int id) {
        switch (id) {

            case 1:
                return "AC";
            case 2:
                return "AP";
            case 3:
                return "AM";
            case 4:
                return "BA";
            case 5:
                return "CE";
            case 6:
                return "DF";
            case 7:
                return "ES";
            case 8:
                return "GO";
            case 9:
                return "MA";
            case 10:
                return "MT";
            case 11:
                return "MS";
            case 12:
                return "MG";
            case 13:
                return "PA";
            case 14:
                return "PB";
            case 15:
                return "PR";
            case 16:
                return "PE";
            case 17:
                return "PI";
            case 18:
                return "RJ";
            case 19:
                return "RN";
            case 20:
                return "RS";
            case 21:
                return "RO";
            case 22:
                return "RR";
            case 23:
                return "SC";
            case 24:
                return "SP";
            case 25:
                return "SE";
            case 26:
                return "TO";

            default:
                return "Não definido";
        }
    }

    private String tipoCidade(int id) {
        switch (id) {

            case 1:
                return "Abreu e Lima";
            case 2:
                return "Afrânio";
            case 3:
                return "Agrestina";
            case 4:
                return "Água Preta";
            case 5:
                return "Águas Belas";
            case 6:
                return "Alagoinha";
            case 7:
                return "Aliança";
            case 8:
                return "Altinho";
            case 9:
                return "Agrestina";
            case 10:
                return "Amaraji";
            case 11:
                return "Agrestina";
            case 12:
                return "Angelim";
            case 13:
                return "Araçoiaba";
            case 14:
                return "Araripina";
            case 15:
                return "Arcoverde";

            default:
                return "Não definido";
        }
    }

    // Método para setar os campos do formulário com o conteúdo da tabela
    public void setar_campos() {

        int setar = tblTabela.getSelectedRow();

        txtIDCliente.setText((String) tblTabela.getModel().getValueAt(setar, 0));
        txtNome.setText((String) tblTabela.getModel().getValueAt(setar, 1));
        txtSNome.setText((String) tblTabela.getModel().getValueAt(setar, 2));
        //DNascimento.setDate((Date) tblTabela.getModel().getValueAt(setar, 3));
        txtEndereco.setText((String) tblTabela.getModel().getValueAt(setar, 4));
        txtTelefone.setText((String) tblTabela.getModel().getValueAt(setar, 5));
        cmbIdentificacao.setSelectedItem(tblTabela.getModel().getValueAt(setar, 6));
        cmbEstado.setSelectedItem(tblTabela.getModel().getValueAt(setar, 7));
        cmbcidade.setSelectedItem(tblTabela.getModel().getValueAt(setar, 8));
        DData.setText((String) tblTabela.getModel().getValueAt(setar, 9));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DData;
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
