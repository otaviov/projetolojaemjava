
package formularios;

import classes.Dados;
import classes.Opcoes;
import classes.Ultilidades;
import java.util.Date;

public class frmFatura extends javax.swing.JInternalFrame {

    private Dados msDados;

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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
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

        btndeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/excluir-produto.png"))); // NOI18N
        btndeletar.setToolTipText("Deletar Produto");

        btndeletartodos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/excluir-todos.png"))); // NOI18N
        btndeletartodos.setToolTipText("Deletar todos os Produtos");

        btnsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/salvar.png"))); // NOI18N
        btnsalvar.setToolTipText("Salvar Venda");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Total:");

        txtvalor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvalorActionPerformed(evt);
            }
        });

        txtquant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtquantActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtquant, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                                    .addGap(40, 40, 40)
                                    .addComponent(btndeletar)
                                    .addGap(40, 40, 40)
                                    .addComponent(btndeletartodos)
                                    .addGap(40, 40, 40)
                                    .addComponent(btnsalvar)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5))))
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
                    .addComponent(txtquant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        cmbcliente.addItem(opc.toString());
        for(int i = 0; i<msDados.numeroCliente();i++){
            opc = new Opcoes(
                    msDados.getCliente()[i].getIdCliente(),
                    msDados.getCliente()[i].getNome()+" "+
                    msDados.getCliente()[i].getSNome());
                    
            cmbcliente.addItem(opc.toString());
            
                    }
        
        opc = new Opcoes("otavioveira32@gmail.com", "SELECIONE UM PRODUTO");
        cmbproduto.addItem(opc.toString());
        for(int i = 0; i<msDados.numeroProdutos();i++){
            opc = new Opcoes(
                    msDados.getProdutos()[i].getIdProduto(),
                    msDados.getProdutos()[i].getDescricao());
                   
            cmbproduto.addItem(opc.toString());
            
                    }
        
        //chamar data atual
        txtdata.setText(Ultilidades.formatDate(new Date()));
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnpesqclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesqclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnpesqclienteActionPerformed

    private void txtvalorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvalorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvalorActionPerformed

    private void txtquantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtquantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtquantActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadicionar;
    private javax.swing.JButton btndeletar;
    private javax.swing.JButton btndeletartodos;
    private javax.swing.JButton btnpesqcliente;
    private javax.swing.JButton btnpesqproduto;
    private javax.swing.JButton btnsalvar;
    private javax.swing.JComboBox<String> cmbcliente;
    private javax.swing.JComboBox<String> cmbproduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbldetalhes;
    private javax.swing.JTextField txtdata;
    private javax.swing.JTextField txtquant;
    private javax.swing.JTextField txtquantidade;
    private javax.swing.JTextField txtvalor;
    // End of variables declaration//GEN-END:variables
}
