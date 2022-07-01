package formularios;

import classes.Background;
import classes.Dados;
import formulariosSobres.frmSobrePrincipal;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.Timer;

public class frmPrincipal extends javax.swing.JFrame {

    ;
    
    // Verificar se é Administrador ou Usuario comum
    private int perfil;
    // Senha
    private String senha;
    //Saber se é usuario
    private String usuario;
    private Dados msDados;

    public void setDados(Dados msDados) {
        this.msDados = msDados;
    }

    //Metodo para saber o tipo de usuario
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    // Metodo da senha
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public frmPrincipal() {
        initComponents();

        //Criando metodo do icone do jFrame -- fim do codigo, linha 271
        setIcon(); // fim

    }

    // Verificar se é Administrador ou Usuario comum
    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpnDesk = new Background ();
        jLabel2 = new javax.swing.JLabel();
        dataPrincipal = new javax.swing.JLabel();
        horaPrincipal = new javax.swing.JLabel();
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
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout dpnDeskLayout = new javax.swing.GroupLayout(dpnDesk);
        dpnDesk.setLayout(dpnDeskLayout);
        dpnDeskLayout.setHorizontalGroup(
            dpnDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 918, Short.MAX_VALUE)
        );
        dpnDeskLayout.setVerticalGroup(
            dpnDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 644, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("SimSun", 1, 15)); // NOI18N
        jLabel2.setText("Seja Bem-Vindo(a)");

        dataPrincipal.setFont(new java.awt.Font("SimSun", 1, 15)); // NOI18N
        dataPrincipal.setText("DATA?");

        horaPrincipal.setFont(new java.awt.Font("SimSun", 1, 15)); // NOI18N
        horaPrincipal.setText("HORA?");

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
        mnuArquivotSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArquivotSenhaActionPerformed(evt);
            }
        });
        mnuArquivo.add(mnuArquivotSenha);

        mnuArquivotUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnuArquivotUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/user2.png"))); // NOI18N
        mnuArquivotUsuario.setText("Trocar usuário");
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
        mnuAjudaSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAjudaSobreActionPerformed(evt);
            }
        });
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
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dataPrincipal)
                .addGap(35, 35, 35)
                .addComponent(horaPrincipal)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dpnDesk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dataPrincipal)
                    .addComponent(horaPrincipal))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuArquivoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArquivoClienteActionPerformed
        // Chamando tela de Clientes (frmClientes)
        frmClientes msClientes = new frmClientes();
        msClientes.setDados(msDados);
        dpnDesk.add(msClientes);
        msClientes.show();

        // 3 Centralizando o JInternalJFrame (frmClientes -- nome da variarial: msClientes
        Dimension desktopSize = dpnDesk.getSize();
        Dimension FrameSize = msClientes.getSize();
        msClientes.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        msClientes.show(); // 3 fim

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

        msDados.salvarTodo();
        System.exit(0);

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
        this.setVisible(false);
        frmLogin mLogin = new frmLogin();
        mLogin.setDados(msDados);
        mLogin.setLocationRelativeTo(null);
        mLogin.setVisible(true);

    }//GEN-LAST:event_mnuArquivotUsuarioActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // abrir imagem

        //final JDesktopPane desktopPane = new Background();
        //dpnDesk.(getContentPane()).add(desktopPane, BorderLayout.CENTER);
        //((Background)dpnDesk).setImagen("/icones/background.jpg");
        if (perfil == 2) {
            mnuArquivoCliente.setEnabled(false);
            mnuArquivoProdutos.setEnabled(false);
            mnuArquivoUsuarios.setEnabled(false);
            mnuMovimentosRelatoriovenda.setEnabled(false);
        }

        /// Chamando a data atual do sistema 
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy ");
        dataPrincipal.setText(sdf.format(new Date()));

        // Chamando a hora em tempo real do sistema
        Timer timer = new Timer(1000, new hora());
        timer.start();
    }

    // Metodo para chamar o tempo rodando em tempo real do sistema
    class hora implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Calendar now = Calendar.getInstance();
            horaPrincipal.setText(String.format("%1$tH:%1$tM:%1$tS", now)); //O Horário vai ter horas, minutos e segundos
        }
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void mnuArquivotSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArquivotSenhaActionPerformed
        // chamando o trocar senha
       frmTrocarSenha msSenha = new frmTrocarSenha(this, rootPaneCheckingEnabled);
       msSenha.setSenha(senha);
       msSenha.setUsuario(usuario);
       msSenha.setDados(msDados);
       msSenha.setVisible(rootPaneCheckingEnabled);
       
    }//GEN-LAST:event_mnuArquivotSenhaActionPerformed

    private void mnuAjudaSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAjudaSobreActionPerformed
        // TODO add your handling code here:
        frmSobrePrincipal SobrePrin = new frmSobrePrincipal(this, rootPaneCheckingEnabled);
        SobrePrin.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_mnuAjudaSobreActionPerformed

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
    private javax.swing.JLabel dataPrincipal;
    private javax.swing.JDesktopPane dpnDesk;
    private javax.swing.JLabel horaPrincipal;
    private javax.swing.JLabel jLabel2;
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
