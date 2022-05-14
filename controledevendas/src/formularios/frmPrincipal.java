
package formularios;

import classes.Dados;
import java.awt.Dimension;
import java.awt.Toolkit;

public class frmPrincipal extends javax.swing.JFrame {

    private Dados msDados;

    public void setDados(Dados msDados) {
        this.msDados = msDados;
    }

    public frmPrincipal() {
        initComponents();

        //Criando metodo do icone do jFrame -- fim do codigo, linha 271
        setIcon(); // fim
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpnDesk = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuArquivo = new javax.swing.JMenu();
        mnuArquivoCliente = new javax.swing.JMenuItem();
        mnuArquivoProdutos = new javax.swing.JMenuItem();
        mnuArquivoUsuarios = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuArquivotSenha = new javax.swing.JMenuItem();
        mnuArquivotUsuario = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuArquivoSair = new javax.swing.JMenuItem();
        mnuMovimentos = new javax.swing.JMenu();
        mnuMovimentosnovaVenda = new javax.swing.JMenuItem();
        mnuMovimentosRelatoriovenda = new javax.swing.JMenuItem();
        mnuAjuda = new javax.swing.JMenu();
        mnuAjudaSobre = new javax.swing.JMenuItem();
        mnuAjudaAjuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Vendas");

        javax.swing.GroupLayout dpnDeskLayout = new javax.swing.GroupLayout(dpnDesk);
        dpnDesk.setLayout(dpnDeskLayout);
        dpnDeskLayout.setHorizontalGroup(
            dpnDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 854, Short.MAX_VALUE)
        );
        dpnDeskLayout.setVerticalGroup(
            dpnDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 518, Short.MAX_VALUE)
        );

        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar1.setAutoscrolls(true);
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        mnuArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/arquivo.png"))); // NOI18N
        mnuArquivo.setText("Arquivos");
        mnuArquivo.setToolTipText("");
        mnuArquivo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        mnuArquivoCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnuArquivoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/cliente.png"))); // NOI18N
        mnuArquivoCliente.setText("Clientes");
        mnuArquivoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnuArquivoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArquivoClienteActionPerformed(evt);
            }
        });
        mnuArquivo.add(mnuArquivoCliente);

        mnuArquivoProdutos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnuArquivoProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/produtos.png"))); // NOI18N
        mnuArquivoProdutos.setText("Produtos");
        mnuArquivoProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnuArquivoProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArquivoProdutosActionPerformed(evt);
            }
        });
        mnuArquivo.add(mnuArquivoProdutos);

        mnuArquivoUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnuArquivoUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/user.png"))); // NOI18N
        mnuArquivoUsuarios.setText("Usuários");
        mnuArquivoUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnuArquivoUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArquivoUsuariosActionPerformed(evt);
            }
        });
        mnuArquivo.add(mnuArquivoUsuarios);
        mnuArquivo.add(jSeparator1);

        mnuArquivotSenha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnuArquivotSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/senha.png"))); // NOI18N
        mnuArquivotSenha.setText("Trocar Senha");
        mnuArquivotSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnuArquivo.add(mnuArquivotSenha);

        mnuArquivotUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnuArquivotUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/user2.png"))); // NOI18N
        mnuArquivotUsuario.setText("Editar usuário");
        mnuArquivotUsuario.setActionCommand("Trocar Usuário");
        mnuArquivotUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnuArquivotUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArquivotUsuarioActionPerformed(evt);
            }
        });
        mnuArquivo.add(mnuArquivotUsuario);
        mnuArquivo.add(jSeparator2);

        mnuArquivoSair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnuArquivoSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/sair.png"))); // NOI18N
        mnuArquivoSair.setText("Sair");
        mnuArquivoSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnuArquivoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArquivoSairActionPerformed(evt);
            }
        });
        mnuArquivo.add(mnuArquivoSair);

        jMenuBar1.add(mnuArquivo);

        mnuMovimentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/movimentos.png"))); // NOI18N
        mnuMovimentos.setText("Movimentos");
        mnuMovimentos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        mnuMovimentosnovaVenda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnuMovimentosnovaVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/nova-venda.png"))); // NOI18N
        mnuMovimentosnovaVenda.setText("Nova Venda");
        mnuMovimentosnovaVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnuMovimentos.add(mnuMovimentosnovaVenda);

        mnuMovimentosRelatoriovenda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnuMovimentosRelatoriovenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/relatorio-de-vendas.png"))); // NOI18N
        mnuMovimentosRelatoriovenda.setText("Relatorio de Vendas");
        mnuMovimentosRelatoriovenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnuMovimentos.add(mnuMovimentosRelatoriovenda);

        jMenuBar1.add(mnuMovimentos);

        mnuAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/ajuda.png"))); // NOI18N
        mnuAjuda.setText("Ajuda");
        mnuAjuda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        mnuAjudaSobre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnuAjudaSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/sobre.png"))); // NOI18N
        mnuAjudaSobre.setText("Sobre");
        mnuAjudaSobre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnuAjuda.add(mnuAjudaSobre);

        mnuAjudaAjuda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnuAjudaAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/ajuda-sub-menu.png"))); // NOI18N
        mnuAjudaAjuda.setText("Ajuda");
        mnuAjudaAjuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnuAjuda.add(mnuAjudaAjuda);

        jMenuBar1.add(mnuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnDesk)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnDesk)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuArquivoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArquivoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuArquivoClienteActionPerformed

    private void mnuArquivoProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArquivoProdutosActionPerformed
        // Chamando tela produtos (frmProdutos)
        frmProdutos msProdutos = new frmProdutos();
        msProdutos.setDados(msDados);
        dpnDesk.add(msProdutos);
        msProdutos.show();
        
        
        // 3 Centralizando o JInternalJFrame (frmProdutos -- nome da variarial: msProdutos
        Dimension desktopSize = dpnDesk.getSize();
        Dimension FrameSize = msProdutos.getSize();
        msProdutos.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        msProdutos.show(); // 3 fim
        
    }//GEN-LAST:event_mnuArquivoProdutosActionPerformed

    private void mnuArquivoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArquivoSairActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);

    }//GEN-LAST:event_mnuArquivoSairActionPerformed

    private void mnuArquivoUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArquivoUsuariosActionPerformed
        // 1 chamando o formulario de usuarios:
        frmUsuarios mUsuarios = new frmUsuarios();
        // 2 chamar o objeto
        mUsuarios.setDados(msDados);//fim 2
        dpnDesk.add(mUsuarios);
        mUsuarios.show(); // 1 fim
        
        

        // 3 Centralizando o JInternalJFrame (frmUsuarios -- nome da variarial: mUsuarios) 
        Dimension desktopSize = dpnDesk.getSize();
        Dimension FrameSize = mUsuarios.getSize();
        mUsuarios.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        mUsuarios.show(); // 3 fim

        

    }//GEN-LAST:event_mnuArquivoUsuariosActionPerformed

    private void mnuArquivotUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArquivotUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuArquivotUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpnDesk;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu mnuAjuda;
    private javax.swing.JMenuItem mnuAjudaAjuda;
    private javax.swing.JMenuItem mnuAjudaSobre;
    private javax.swing.JMenu mnuArquivo;
    private javax.swing.JMenuItem mnuArquivoCliente;
    private javax.swing.JMenuItem mnuArquivoProdutos;
    private javax.swing.JMenuItem mnuArquivoSair;
    private javax.swing.JMenuItem mnuArquivoUsuarios;
    private javax.swing.JMenuItem mnuArquivotSenha;
    private javax.swing.JMenuItem mnuArquivotUsuario;
    private javax.swing.JMenu mnuMovimentos;
    private javax.swing.JMenuItem mnuMovimentosRelatoriovenda;
    private javax.swing.JMenuItem mnuMovimentosnovaVenda;
    // End of variables declaration//GEN-END:variables

    // Trocar icone do desktop (icone do café): -- inicio do codigo, linha 20
    private void setIcon() {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icones/nix1.png")));
    } //fim

}
