package Interfaces;

import DAO.TecidoDAO;
import Mostruario.Gerador_tabelas;
import Mostruario.Gerador_Mostruarios;
import java.awt.Color;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;

public class Gerencia extends javax.swing.JInternalFrame {

    public Gerencia() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBTabela = new javax.swing.JButton();
        jCBA = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jBMost = new javax.swing.JButton();
        jTMost = new javax.swing.JTextField();
        jCBTS = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jCBC = new javax.swing.JCheckBox();
        jCBAD = new javax.swing.JCheckBox();

        setClosable(true);

        jBTabela.setText("Gerar Tabelas");
        jBTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTabelaActionPerformed(evt);
            }
        });

        jCBA.setText("Aladim");

        jLabel2.setText("Número do Mostruario:");

        jBMost.setText("Gerar Mostruário");
        jBMost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMostActionPerformed(evt);
            }
        });

        jTMost.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jCBTS.setText("Tec-Sel");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Gerência de Sistema - Ronaldo Tapeceiro");

        jCBC.setText("Central");

        jCBAD.setText("Arco Decorações");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCBTS)
                            .addComponent(jCBC)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCBAD)
                                            .addComponent(jCBA))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBTabela))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTMost, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(28, 28, 28)
                                .addComponent(jBMost)))))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTMost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBMost))
                .addGap(50, 50, 50)
                .addComponent(jCBTS)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jCBA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCBAD))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jBTabela)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCBC)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTabelaActionPerformed
        if (jCBA.isSelected()) {
            try {
                String caminho = "C:\\Gerencia_Estoque\\pdfs\\Tabelas\\XML\\tabelas.jrxml";
                Gerador_tabelas al = new Gerador_tabelas();
                try {
                    al.gerar(caminho, "AL");
                } catch (JRException ex) {
                    JOptionPane.showMessageDialog(null, "Erro, por favor constatar ao administrador.\n" + ex);
                } catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "Erro, por favor constatar ao administrador.\n" + ex);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro, por favor constatar ao administrador.\n" + ex);
            }
        }
        if (jCBTS.isSelected()) {
            try {
                String caminho = "C:\\Gerencia_Estoque\\pdfs\\Tabelas\\XML\\tabelas.jrxml";
                Gerador_tabelas al = new Gerador_tabelas();
                try {
                    al.gerar(caminho, "TS");
                } catch (JRException ex) {
                    JOptionPane.showMessageDialog(null, "Erro, por favor constatar ao administrador.\n" + ex);
                } catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "Erro, por favor constatar ao administrador.\n" + ex);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro, por favor constatar ao administrador.\n" + ex);
            }
        }
        if (jCBAD.isSelected()) {
            try {
                String caminho = "C:\\Gerencia_Estoque\\pdfs\\Tabelas\\XML\\tabelas.jrxml";
                Gerador_tabelas al = new Gerador_tabelas();
                try {
                    al.gerar(caminho, "AD");
                } catch (JRException ex) {
                    JOptionPane.showMessageDialog(null, "Erro, por favor constatar ao administrador.\n" + ex);
                } catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "Erro, por favor constatar ao administrador.\n" + ex);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro, por favor constatar ao administrador.\n" + ex);
            }
        }
        if (jCBC.isSelected()) {
            try {
                String caminho = "C:\\Gerencia_Estoque\\pdfs\\Tabelas\\XML\\tabelas.jrxml";
                Gerador_tabelas al = new Gerador_tabelas();
                try {
                    al.gerar(caminho, "CT");
                } catch (JRException ex) {
                    JOptionPane.showMessageDialog(null, "Erro, por favor constatar ao administrador.\n" + ex);
                } catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "Erro, por favor constatar ao administrador.\n" + ex);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro, por favor constatar ao administrador.\n" + ex);
            }
        }
    }//GEN-LAST:event_jBTabelaActionPerformed

    private void jBMostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMostActionPerformed
        if (jTMost.getText().equals("")) {
            try {
                TecidoDAO tdao = new TecidoDAO();
                List<String> mostruarios = tdao.getMostruarios();
                String most = jTMost.getText();
                String layout = "C:\\Gerencia_Estoque\\pdfs\\Mostruarios\\XML\\Mostruario.jrxml";
                Gerador_Mostruarios rel = new Gerador_Mostruarios();
                for (int i = 0; i < mostruarios.size(); i++) {
                    rel.gerar(layout, mostruarios.get(i));
                }
            } catch (SQLException ex) {
            } catch (JRException | ClassNotFoundException ex) {
                ex.printStackTrace();
            }

        } else {
            String most = jTMost.getText();
            String layout = "C:\\Gerencia_Estoque\\pdfs\\Mostruarios\\XML\\Mostruario.jrxml";
            try {
                Gerador_Mostruarios rel = new Gerador_Mostruarios();
                try {
                    rel.gerar(layout, most);
                } catch (JRException | ClassNotFoundException ex) {
                    ex.printStackTrace();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jBMostActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBMost;
    private javax.swing.JButton jBTabela;
    private javax.swing.JCheckBox jCBA;
    private javax.swing.JCheckBox jCBAD;
    private javax.swing.JCheckBox jCBC;
    private javax.swing.JCheckBox jCBTS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTMost;
    // End of variables declaration//GEN-END:variables
}
