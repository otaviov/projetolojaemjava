/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formularios;

import java.awt.Toolkit;


public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        initComponents();
        
         //Criando metodo do icone do jFrame
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        mnuArquivos = new javax.swing.JMenu();
        mnuArquivosCliente = new javax.swing.JMenuItem();
        mnuArquivosProdutos = new javax.swing.JMenuItem();
        mnuArquivosUsuarios = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuArquivosSenha = new javax.swing.JMenuItem();
        mnuArquivostUsuario = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuArquivosSair = new javax.swing.JMenuItem();
        mnuMovimentos = new javax.swing.JMenu();
        mnuMovimentosnovaVenda = new javax.swing.JMenuItem();
        mnuMovimentosRelatorioVenda = new javax.swing.JMenuItem();
        mnuAjuda = new javax.swing.JMenu();
        mnuAjudaSobre = new javax.swing.JMenuItem();
        mnuAjudaAjuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Vendas");

        jMenuBar1.setAutoscrolls(true);
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        mnuArquivos.setText("Arquivos");
        mnuArquivos.setToolTipText("");
        mnuArquivos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        mnuArquivosCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnuArquivosCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/cliente.png"))); // NOI18N
        mnuArquivosCliente.setText("Clientes");
        mnuArquivosCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnuArquivosCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArquivosClienteActionPerformed(evt);
            }
        });
        mnuArquivos.add(mnuArquivosCliente);

        mnuArquivosProdutos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnuArquivosProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/produtos.png"))); // NOI18N
        mnuArquivosProdutos.setText("Produtos");
        mnuArquivosProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnuArquivosProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArquivosProdutosActionPerformed(evt);
            }
        });
        mnuArquivos.add(mnuArquivosProdutos);

        mnuArquivosUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnuArquivosUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/user.png"))); // NOI18N
        mnuArquivosUsuarios.setText("Usuários");
        mnuArquivosUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnuArquivos.add(mnuArquivosUsuarios);
        mnuArquivos.add(jSeparator1);

        mnuArquivosSenha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnuArquivosSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/senha.png"))); // NOI18N
        mnuArquivosSenha.setText("Trocar senha");
        mnuArquivosSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnuArquivos.add(mnuArquivosSenha);

        mnuArquivostUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnuArquivostUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/user2.png"))); // NOI18N
        mnuArquivostUsuario.setText("Editar usuário");
        mnuArquivostUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnuArquivos.add(mnuArquivostUsuario);
        mnuArquivos.add(jSeparator2);

        mnuArquivosSair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnuArquivosSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/sair.png"))); // NOI18N
        mnuArquivosSair.setText("Sair");
        mnuArquivosSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnuArquivosSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArquivosSairActionPerformed(evt);
            }
        });
        mnuArquivos.add(mnuArquivosSair);

        jMenuBar1.add(mnuArquivos);

        mnuMovimentos.setText("Movimentos");
        mnuMovimentos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        mnuMovimentosnovaVenda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnuMovimentosnovaVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/nova-venda.png"))); // NOI18N
        mnuMovimentosnovaVenda.setText("Nova Venda");
        mnuMovimentosnovaVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnuMovimentos.add(mnuMovimentosnovaVenda);

        mnuMovimentosRelatorioVenda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnuMovimentosRelatorioVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/relatorio-de-vendas.png"))); // NOI18N
        mnuMovimentosRelatorioVenda.setText("Relatorio de vendas");
        mnuMovimentosRelatorioVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnuMovimentos.add(mnuMovimentosRelatorioVenda);

        jMenuBar1.add(mnuMovimentos);

        mnuAjuda.setText("Ajuda");
        mnuAjuda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        mnuAjudaSobre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnuAjudaSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/sobre.png"))); // NOI18N
        mnuAjudaSobre.setText("Sobre");
        mnuAjudaSobre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnuAjuda.add(mnuAjudaSobre);

        mnuAjudaAjuda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnuAjudaAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/ajuda.png"))); // NOI18N
        mnuAjudaAjuda.setText("Ajuda");
        mnuAjudaAjuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnuAjuda.add(mnuAjudaAjuda);

        jMenuBar1.add(mnuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 819, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 469, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuArquivosClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArquivosClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuArquivosClienteActionPerformed

    private void mnuArquivosProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArquivosProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuArquivosProdutosActionPerformed

    private void mnuArquivosSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArquivosSairActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        
    }//GEN-LAST:event_mnuArquivosSairActionPerformed

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
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu mnuAjuda;
    private javax.swing.JMenuItem mnuAjudaAjuda;
    private javax.swing.JMenuItem mnuAjudaSobre;
    private javax.swing.JMenu mnuArquivos;
    private javax.swing.JMenuItem mnuArquivosCliente;
    private javax.swing.JMenuItem mnuArquivosProdutos;
    private javax.swing.JMenuItem mnuArquivosSair;
    private javax.swing.JMenuItem mnuArquivosSenha;
    private javax.swing.JMenuItem mnuArquivosUsuarios;
    private javax.swing.JMenuItem mnuArquivostUsuario;
    private javax.swing.JMenu mnuMovimentos;
    private javax.swing.JMenuItem mnuMovimentosRelatorioVenda;
    private javax.swing.JMenuItem mnuMovimentosnovaVenda;
    // End of variables declaration//GEN-END:variables


        // Trocar icone do desktop (icone do café):
    private void setIcon() {
       this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icones/nix1.png")));
    
    }
}
