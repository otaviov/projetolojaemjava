package formularios;

import classes.Dados;
import classes.Ultilidades;
import javax.swing.table.DefaultTableModel;

public class frmPesqProdutos extends javax.swing.JDialog {

    private Dados msDados;

    private DefaultTableModel mTabela;

    private String resposta = "";

    public String getResposta() {
        return resposta;
    }

    public void setDados(Dados msDados) {
        this.msDados = msDados;

    }

    private void preencherTabela() {

        String titulos[] = {"ID Produto", "Nome Produto"};
        String registro[] = new String[2];
        mTabela = new DefaultTableModel(null, titulos);
        if (txtpesqprod.getText().equals("")) {
            for (int i = 0; i < msDados.numeroProdutos(); i++) {
                registro[0] = msDados.getProdutos()[i].getIdProduto();
                registro[1] = msDados.getProdutos()[i].getDescricao();

            }
            tblTabela.setModel(mTabela);
            return;
        }
        if (radioProduto.isSelected()) {
            for (int i = 0; i < msDados.numeroProdutos(); i++) {
                if (msDados.getProdutos()[i].getDescricao().startsWith(txtpesqprod.getText())) {
                    registro[0] = msDados.getProdutos()[i].getIdProduto();
                    registro[1] = msDados.getProdutos()[i].getDescricao();

                    mTabela.addRow(registro);
                }
            }
            tblTabela.setModel(mTabela);
            return;
        }

        if (radioid.isSelected()) {
            for (int i = 0; i < msDados.numeroProdutos(); i++) {
                if (msDados.getProdutos()[i].getIdProduto().startsWith(txtpesqprod.getText())) {
                    registro[0] = msDados.getProdutos()[i].getIdProduto();
                    registro[1] = msDados.getProdutos()[i].getDescricao();

                    mTabela.addRow(registro);
                }
            }
            tblTabela.setModel(mTabela);
        }
    }

    public frmPesqProdutos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        //validando escola de radio button
        bgtipopesq.add(radioid);
        bgtipopesq.add(radioProduto);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgtipopesq = new javax.swing.ButtonGroup();
        radioid = new javax.swing.JRadioButton();
        radioProduto = new javax.swing.JRadioButton();
        txtpesqprod = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabela = new javax.swing.JTable();
        btnpesqcli = new javax.swing.JButton();
        btnpesqsair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisa de Produtos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        radioid.setSelected(true);
        radioid.setText("Id Produto");
        radioid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioidActionPerformed(evt);
            }
        });

        radioProduto.setText("Nome do Produto");
        radioProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioProdutoActionPerformed(evt);
            }
        });

        txtpesqprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpesqprodActionPerformed(evt);
            }
        });

        tblTabela.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblTabela);

        btnpesqcli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/pesquisa3.png"))); // NOI18N
        btnpesqcli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesqcliActionPerformed(evt);
            }
        });

        btnpesqsair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/excluir-produto.png"))); // NOI18N
        btnpesqsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesqsairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(btnpesqcli)
                        .addGap(18, 18, 18)
                        .addComponent(btnpesqsair))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtpesqprod)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE))))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(radioid)
                .addGap(18, 18, 18)
                .addComponent(radioProduto)
                .addGap(126, 126, 126))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioid)
                    .addComponent(radioProduto))
                .addGap(18, 18, 18)
                .addComponent(txtpesqprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnpesqcli)
                    .addComponent(btnpesqsair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioidActionPerformed
        txtpesqprod.setText("");
        txtpesqprod.requestFocusInWindow();
        preencherTabela();
    }//GEN-LAST:event_radioidActionPerformed

    private void btnpesqcliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesqcliActionPerformed
        // fazendo contagem de linhas
        int num = tblTabela.getRowCount();
        if (num == 0) {
            resposta = "";
            dispose();
            return;
        }

        for (int i = 0; i < num; i++) {
            if (tblTabela.isRowSelected(i)) {
                resposta = Ultilidades.objectToString(tblTabela.getValueAt(i, 0));

                dispose();
                return;
            }
        }
        resposta = Ultilidades.objectToString(tblTabela.getValueAt(0, 0));

        dispose();
    }//GEN-LAST:event_btnpesqcliActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // chamando metodo de preencher tabela   
        preencherTabela();
        txtpesqprod.requestFocusInWindow();

    }//GEN-LAST:event_formWindowOpened

    private void radioProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioProdutoActionPerformed

        txtpesqprod.setText("");
        txtpesqprod.requestFocusInWindow();
        preencherTabela();

    }//GEN-LAST:event_radioProdutoActionPerformed

    private void txtpesqprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpesqprodActionPerformed
        // pedindo para preencher a tabela
        preencherTabela();
    }//GEN-LAST:event_txtpesqprodActionPerformed

    private void btnpesqsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesqsairActionPerformed
        // Saindo
        resposta = "";
        dispose();
    }//GEN-LAST:event_btnpesqsairActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPesqProdutos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPesqProdutos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPesqProdutos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPesqProdutos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmPesqProdutos dialog = new frmPesqProdutos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgtipopesq;
    private javax.swing.JButton btnpesqcli;
    private javax.swing.JButton btnpesqsair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioProduto;
    private javax.swing.JRadioButton radioid;
    private javax.swing.JTable tblTabela;
    private javax.swing.JTextField txtpesqprod;
    // End of variables declaration//GEN-END:variables
}
