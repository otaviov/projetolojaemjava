package formularios;

import classes.Dados;
import classes.Opcoes;
import classes.Ultilidades;
import java.awt.Dimension;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class frmFatura extends javax.swing.JInternalFrame {

    private Dados msDados;

    private DefaultTableModel mTabela;

    public void setDados(Dados msDados) {
        this.msDados = msDados;

    }

    public frmFatura() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtdata = new javax.swing.JTextField();
        cmbcliente = new javax.swing.JComboBox<>();
        cmbproduto = new javax.swing.JComboBox<>();
        txtquantidade = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldetalhes = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btnpesqcliente = new javax.swing.JButton();
        btnpesqproduto = new javax.swing.JButton();
        btnadicionar = new javax.swing.JButton();
        btndeletar = new javax.swing.JButton();
        btndeletartodos = new javax.swing.JButton();
        btnsalvar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtvalor = new javax.swing.JTextField();
        txtquant = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Relatório");
        setToolTipText("");
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

        jLabel1.setText("Data:");

        jLabel2.setText("Cliente:");

        jLabel3.setText("Produto:");

        jLabel4.setText("Quantidade:");

        txtdata.setEnabled(false);
        txtdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdataActionPerformed(evt);
            }
        });

        tbldetalhes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID PRO", "Produto", "Preço", "Quant", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbldetalhes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbldetalhes.getTableHeader().setResizingAllowed(false);
        tbldetalhes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbldetalhes);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Vendas1.png"))); // NOI18N

        btnpesqcliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/pesquisa3.png"))); // NOI18N
        btnpesqcliente.setToolTipText("Pesquisar Clientes");
        btnpesqcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesqclienteActionPerformed(evt);
            }
        });

        btnpesqproduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/pesquisa3.png"))); // NOI18N
        btnpesqproduto.setToolTipText("Pesquisar Produtos");
        btnpesqproduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesqprodutoActionPerformed(evt);
            }
        });

        btnadicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/adicionar-produto1.png"))); // NOI18N
        btnadicionar.setToolTipText("Adicionar Produto");
        btnadicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadicionarActionPerformed(evt);
            }
        });

        btndeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/excluir-produto.png"))); // NOI18N
        btndeletar.setToolTipText("Deletar Produto");
        btndeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeletarActionPerformed(evt);
            }
        });

        btndeletartodos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/excluir-todos.png"))); // NOI18N
        btndeletartodos.setToolTipText("Deletar todos os Produtos");
        btndeletartodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeletartodosActionPerformed(evt);
            }
        });

        btnsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/salvar.png"))); // NOI18N
        btnsalvar.setToolTipText("Salvar Venda");
        btnsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Quantidade de itens:");

        txtvalor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtvalor.setEnabled(false);
        txtvalor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvalorActionPerformed(evt);
            }
        });

        txtquant.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtquant.setEnabled(false);
        txtquant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtquantActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Valor Total:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtquant, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtvalor))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdata, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(btnpesqcliente))
                            .addComponent(txtquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbproduto, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(btnpesqproduto))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnadicionar)
                                .addGap(41, 41, 41)
                                .addComponent(btndeletar)
                                .addGap(41, 41, 41)
                                .addComponent(btndeletartodos)
                                .addGap(41, 41, 41)
                                .addComponent(btnsalvar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnpesqcliente)
                        .addGap(11, 11, 11)
                        .addComponent(btnpesqproduto)
                        .addGap(38, 38, 38))
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cmbcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cmbproduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btndeletar)
                    .addComponent(btndeletartodos)
                    .addComponent(btnsalvar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnadicionar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtvalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtquant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdataActionPerformed

    private void btnpesqprodutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesqprodutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnpesqprodutoActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

        //Botão pesquisa1
        btnpesqcliente.setBorderPainted(false);
        btnpesqcliente.setContentAreaFilled(false);
        btnpesqcliente.setOpaque(true);

        //Botão pesquisa2
        btnpesqproduto.setBorderPainted(false);
        btnpesqproduto.setContentAreaFilled(false);
        btnpesqproduto.setOpaque(true);

        Opcoes opc = new Opcoes("otavioveira32@gmail.com", "SELECIONE UM CLIENTE");
        cmbcliente.addItem(opc);
        for (int i = 0; i < msDados.numeroCliente(); i++) {
            opc = new Opcoes(
                    msDados.getCliente()[i].getIdCliente(),
                    msDados.getCliente()[i].getNome() + " "
                    + msDados.getCliente()[i].getSNome());

            cmbcliente.addItem(opc);

        }

        opc = new Opcoes("otavioveira32@gmail.com", "SELECIONE UM PRODUTO");
        cmbproduto.addItem(opc);
        for (int i = 0; i < msDados.numeroProdutos(); i++) {
            opc = new Opcoes(
                    msDados.getProdutos()[i].getIdProduto(),
                    msDados.getProdutos()[i].getDescricao());

            cmbproduto.addItem(opc);

        }

        //chamar data atual
        txtdata.setText(Ultilidades.formatDate(new Date()));

        //Campos de totais iniciar com o valor Zero
        txtquant.setText("0");
        txtvalor.setText("0");

        //chamar metodo da tabela
        preencherTabela();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnpesqclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesqclienteActionPerformed
         // chamando formulario de pesquisar cliente
        frmPesqCliente mPesqCliente = new frmPesqCliente(null, closable);
        mPesqCliente.setDados(msDados);
        mPesqCliente.setLocationRelativeTo(null);
        mPesqCliente.setVisible(true);
    }//GEN-LAST:event_btnpesqclienteActionPerformed

    private void txtvalorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvalorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvalorActionPerformed

    private void txtquantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtquantActionPerformed
       
    }//GEN-LAST:event_txtquantActionPerformed

    private void btnadicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadicionarActionPerformed
        // ---- Validar campos ----
        // Validando campo de produtos
        if (cmbproduto.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "O campo de protudo está vazio!");
            cmbproduto.requestFocusInWindow();
            return;
        }
        // Validando campo de quantidade
        if (txtquantidade.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O campo de quantidade não pode ser vazio");
            txtquantidade.requestFocusInWindow();
            return;
        }

        if (!Ultilidades.isNumericInt(txtquantidade.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Campo de quantidade só aceita números");
            txtquantidade.setText("");
            txtquantidade.requestFocusInWindow();
            return;
        }
        // Validar para o usuario não digitar valor abaixo de zero
        int quantidade = Integer.parseInt((txtquantidade.getText()));
        if (quantidade <= 0) {
            JOptionPane.showMessageDialog(rootPane, "Campo preço não aceita valores 0 ou abaixo de 0");
            txtquantidade.setText("");
            txtquantidade.requestFocusInWindow();
            return;
        }
        //carregar campos na tabela
        int pos = msDados.posicaoProduto(((Opcoes) cmbproduto.getSelectedItem()).getValor());

        String registro[] = new String[5];
        registro[0] = msDados.getProdutos()[pos].getIdProduto();
        registro[1] = msDados.getProdutos()[pos].getDescricao();
        registro[2] = "" + msDados.getProdutos()[pos].getPreco();
        registro[3] = "" + quantidade;
        registro[4] = "" + (quantidade * msDados.getProdutos()[pos].getPreco());
        mTabela.addRow(registro);

        //Limpar campos
        cmbcliente.setSelectedIndex(0);
        cmbproduto.setSelectedIndex(0);
        txtquantidade.setText("");
        //Focar no campo de cliente
        cmbcliente.requestFocusInWindow();

        //chamar metodo de totais
        totais();

    }//GEN-LAST:event_btnadicionarActionPerformed

    private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarActionPerformed
        // Salvando venda
        int numFatura = msDados.getNumeroFatura() + 1;

        FileWriter fw = null;
        PrintWriter pw = null;

        try {
            fw = new FileWriter("Data/Fatura.txt", true);
            pw = new PrintWriter(fw);

            String aux = "1|"
                    + "Numero de fatura: " + numFatura + "|"
                    + ((Opcoes) cmbcliente.getSelectedItem()).getValor() + "|"
                    + ((Opcoes) cmbcliente.getSelectedItem()).getDescricao() + "|"
                    + txtdata.getText();
            pw.println(aux);

            double num = tbldetalhes.getRowCount();

            for (int i = 0; i < num; i++) {
                aux = "2|"
                        + "ID: " + Ultilidades.objectToString(tbldetalhes.getValueAt(i, 0)) + "|"
                        + "Produto: " + Ultilidades.objectToString(tbldetalhes.getValueAt(i, 1)) + "|"
                        + "Preço: " + Ultilidades.objectToString(tbldetalhes.getValueAt(i, 2)) + "|"
                        + "Quantidade: " + Ultilidades.objectToString(tbldetalhes.getValueAt(i, 3)) + "|"
                        + "Valor Total:" + Ultilidades.objectToString(tbldetalhes.getValueAt(i, 4));

                pw.println(aux);
            }

        } catch (Exception e1) {
            e1.printStackTrace();

        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        JOptionPane.showMessageDialog(rootPane, "Venda: " + numFatura + " Realizada com sucesso!");
        msDados.setNumeroFatura(numFatura);
        cmbcliente.setSelectedIndex(0);
        Limpartabela();
        totais();
        cmbcliente.requestFocusInWindow();

    }//GEN-LAST:event_btnsalvarActionPerformed

    private void btndeletartodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeletartodosActionPerformed
        // deletar tudo
        int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja excluir esta venda?");
        if (resposta != 0) {
            return;
        }
        Limpartabela();
        totais();
    }//GEN-LAST:event_btndeletartodosActionPerformed

    private void btndeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeletarActionPerformed
        // TODO add your handling code here:
        
        
        try {
            DefaultTableModel modelo = (DefaultTableModel) tbldetalhes.getModel();
            int Linha = tbldetalhes.getRowCount();
            for (int i = 0; Linha > i; i++) {
                String idTabela = Ultilidades.objectToString(tbldetalhes.getValueAt(i, 0));
                String idCombo = ((Opcoes) cmbproduto.getSelectedItem()).getValor();
                
                if(idTabela.equals(idCombo)){
                modelo.removeRow(i);
                totais();
                return;
                        }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }//GEN-LAST:event_btndeletarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadicionar;
    private javax.swing.JButton btndeletar;
    private javax.swing.JButton btndeletartodos;
    private javax.swing.JButton btnpesqcliente;
    private javax.swing.JButton btnpesqproduto;
    private javax.swing.JButton btnsalvar;
    private javax.swing.JComboBox<Opcoes> cmbcliente;
    private javax.swing.JComboBox<Opcoes> cmbproduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbldetalhes;
    private javax.swing.JTextField txtdata;
    private javax.swing.JTextField txtquant;
    private javax.swing.JTextField txtquantidade;
    private javax.swing.JTextField txtvalor;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela() {

        String titulos[] = {"ID Pro", "Produto", "Preço", "Quant", "Valor"};
        String registro[] = new String[5];
        mTabela = new DefaultTableModel(null, titulos);

        for (int i = 0; i < msDados.numeroCliente(); i++) {
            tbldetalhes.setModel(mTabela);

            //alinhar preços
            DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
            dtcr.setHorizontalAlignment(SwingConstants.RIGHT);
            tbldetalhes.getColumnModel().getColumn(2).setCellRenderer(dtcr);
            tbldetalhes.getColumnModel().getColumn(3).setCellRenderer(dtcr);
            tbldetalhes.getColumnModel().getColumn(4).setCellRenderer(dtcr);
        }
    }

    // Centralizando o JInternal
    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);

    }

    private void totais() {
        double num = tbldetalhes.getRowCount();
        int somQuant = 0;
        double somVal = 0;
        for (int i = 0; i < num; i++) {
            somQuant += Ultilidades.objectToInt(tbldetalhes.getValueAt(i, 3));
            somVal += Ultilidades.objectToDouble(tbldetalhes.getValueAt(i, 4));
        }
        txtquant.setText("" + somQuant);
        txtvalor.setText("" + somVal);
    }

    public void Limpartabela() {
        try {
            DefaultTableModel modelo = (DefaultTableModel) tbldetalhes.getModel();
            int Linha = tbldetalhes.getRowCount();
            for (int i = 0; Linha > i; i++) {
                modelo.removeRow(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
