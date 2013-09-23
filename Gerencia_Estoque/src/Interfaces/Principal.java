package Interfaces;

import DAO.CartaoDAO;
import backup.Backup;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    public Principal() throws SQLException {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        CartaoDAO cdao = new CartaoDAO();
        cdao.PagarParcela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        Painel = new javax.swing.JDesktopPane();
        jMBarra = new javax.swing.JMenuBar();
        jMArquivo = new javax.swing.JMenu();
        jMIPDFs = new javax.swing.JMenuItem();
        jMBackup = new javax.swing.JMenu();
        jMIRealizarB = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMTecido = new javax.swing.JMenu();
        jMPesquisa = new javax.swing.JMenu();
        jMIPesqusa_Mostruario = new javax.swing.JMenuItem();
        jMCadastro = new javax.swing.JMenu();
        jMICadastro_Estoque = new javax.swing.JMenuItem();
        jMICadastro_Mostruario = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMCliente = new javax.swing.JMenu();
        jMICadastroCliente = new javax.swing.JMenuItem();
        jMCartao = new javax.swing.JMenu();
        jMIVenda = new javax.swing.JMenuItem();
        jMIListar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMBarra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMArquivo.setText("Arquivo");
        jMArquivo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMIPDFs.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMIPDFs.setText("Gerencia");
        jMIPDFs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIPDFsActionPerformed(evt);
            }
        });
        jMArquivo.add(jMIPDFs);

        jMBackup.setText("Backup");
        jMBackup.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMIRealizarB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMIRealizarB.setText("Realizar Backup");
        jMIRealizarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIRealizarBActionPerformed(evt);
            }
        });
        jMBackup.add(jMIRealizarB);

        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem3.setText("Restaurar Backup");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMBackup.add(jMenuItem3);

        jMArquivo.add(jMBackup);

        jMBarra.add(jMArquivo);

        jMTecido.setText("Tecido");
        jMTecido.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMPesquisa.setText("Pesquisa");
        jMPesquisa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMIPesqusa_Mostruario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMIPesqusa_Mostruario.setText("Tecidos do Mostruário");
        jMIPesqusa_Mostruario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIPesqusa_MostruarioActionPerformed(evt);
            }
        });
        jMPesquisa.add(jMIPesqusa_Mostruario);

        jMTecido.add(jMPesquisa);

        jMCadastro.setText("Controle");
        jMCadastro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMICadastro_Estoque.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMICadastro_Estoque.setText("Cadastro - Tecidos do Estoque");
        jMICadastro_Estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICadastro_EstoqueActionPerformed(evt);
            }
        });
        jMCadastro.add(jMICadastro_Estoque);

        jMICadastro_Mostruario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMICadastro_Mostruario.setText("Cadastro - Tecidos do Mostruário");
        jMICadastro_Mostruario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICadastro_MostruarioActionPerformed(evt);
            }
        });
        jMCadastro.add(jMICadastro_Mostruario);
        jMCadastro.add(jSeparator1);

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem1.setText("Editar - Tecidos do Estoque");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMCadastro.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem2.setText("Editar - Tecidos do Mostruário");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMCadastro.add(jMenuItem2);

        jMTecido.add(jMCadastro);

        jMBarra.add(jMTecido);

        jMCliente.setText("Cliente");
        jMCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMICadastroCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMICadastroCliente.setText("Cadastro de Cliente");
        jMICadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICadastroClienteActionPerformed(evt);
            }
        });
        jMCliente.add(jMICadastroCliente);

        jMBarra.add(jMCliente);

        jMCartao.setText("Cartão");
        jMCartao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMIVenda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMIVenda.setText("Venda");
        jMIVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIVendaActionPerformed(evt);
            }
        });
        jMCartao.add(jMIVenda);

        jMIListar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMIListar.setText("Listar - Parcelas");
        jMIListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIListarActionPerformed(evt);
            }
        });
        jMCartao.add(jMIListar);

        jMBarra.add(jMCartao);

        setJMenuBar(jMBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMICadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICadastroClienteActionPerformed

        try {
            Cadastro_Cliente cc = new Cadastro_Cliente();
            Painel.add(cc);
            cc.setVisible(true);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }

    }//GEN-LAST:event_jMICadastroClienteActionPerformed

    private void jMIVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIVendaActionPerformed
        Venda_Cartao vc = new Venda_Cartao();
        Painel.add(vc);
        vc.setVisible(true);
    }//GEN-LAST:event_jMIVendaActionPerformed

    private void jMIListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIListarActionPerformed
        Lista_Cartao lc = new Lista_Cartao();
        Painel.add(lc);
        lc.setVisible(true);
    }//GEN-LAST:event_jMIListarActionPerformed

    private void jMICadastro_MostruarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICadastro_MostruarioActionPerformed
        Cadastro_Tecido cm = new Cadastro_Tecido();
        Painel.add(cm);
        cm.setVisible(true);
    }//GEN-LAST:event_jMICadastro_MostruarioActionPerformed

    private void jMICadastro_EstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICadastro_EstoqueActionPerformed
        Cadastro_Tecido_Estoque cte = new Cadastro_Tecido_Estoque();
        Painel.add(cte);
        cte.setVisible(true);
    }//GEN-LAST:event_jMICadastro_EstoqueActionPerformed

    private void jMIPesqusa_MostruarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIPesqusa_MostruarioActionPerformed
        Listagem_Tecido lt = new Listagem_Tecido("Pesquisa de Mostruário");
        Painel.add(lt);
        lt.setVisible(true);
    }//GEN-LAST:event_jMIPesqusa_MostruarioActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Edicao_Tecido et = new Edicao_Tecido();
        Painel.add(et);
        et.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Edicao_Tecido_Estoque ete = new Edicao_Tecido_Estoque();
        Painel.add(ete);
        ete.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMIPDFsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIPDFsActionPerformed
        Gerencia ger = new Gerencia();
        Painel.add(ger);
        ger.setVisible(true);
    }//GEN-LAST:event_jMIPDFsActionPerformed

    private void jMIRealizarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIRealizarBActionPerformed
        Backup bac = new Backup();
        bac.fazBackup();
    }//GEN-LAST:event_jMIRealizarBActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Backup bac = new Backup();
        bac.realizaRestore();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        } catch (InstantiationException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        } catch (IllegalAccessException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Principal().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Painel;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMArquivo;
    private javax.swing.JMenu jMBackup;
    private javax.swing.JMenuBar jMBarra;
    private javax.swing.JMenu jMCadastro;
    private javax.swing.JMenu jMCartao;
    private javax.swing.JMenu jMCliente;
    private javax.swing.JMenuItem jMICadastroCliente;
    private javax.swing.JMenuItem jMICadastro_Estoque;
    private javax.swing.JMenuItem jMICadastro_Mostruario;
    private javax.swing.JMenuItem jMIListar;
    private javax.swing.JMenuItem jMIPDFs;
    private javax.swing.JMenuItem jMIPesqusa_Mostruario;
    private javax.swing.JMenuItem jMIRealizarB;
    private javax.swing.JMenuItem jMIVenda;
    private javax.swing.JMenu jMPesquisa;
    private javax.swing.JMenu jMTecido;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
