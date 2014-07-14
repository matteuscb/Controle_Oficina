package Interfaces;

import DAO.TecidoDAO;
import DocumentFilter.NameDocumentFilter;
import Modelo.Tecido;
import java.awt.Color;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AbstractDocument;
import javax.swing.text.DocumentFilter;

public class Edicao_Tecido extends javax.swing.JInternalFrame {

    DefaultTableModel tmTecido = new DefaultTableModel(null, new String[]{"Artigo", "Tecido", "Preço"});
    List<Tecido> tecidos;
    ListSelectionModel lsmTecido;

    public Edicao_Tecido() {
        initComponents();

        /*DocumentFilter filter = new NameDocumentFilter();
         ((AbstractDocument) jTPre.getDocument()).setDocumentFilter(filter);*/
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTTipo = new javax.swing.JTextField();
        jLArtigo = new javax.swing.JLabel();
        jTLoja = new javax.swing.JTextField();
        jLLoja = new javax.swing.JLabel();
        jTPreco = new javax.swing.JTextField();
        jLMost = new javax.swing.JLabel();
        jTTeflon = new javax.swing.JTextField();
        jLTipo = new javax.swing.JLabel();
        jTArt = new javax.swing.JTextField();
        jTMost = new javax.swing.JTextField();
        jLTeflon = new javax.swing.JLabel();
        jTCorf = new javax.swing.JTextField();
        jLFLinha = new javax.swing.JLabel();
        jLPreco = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setClosable(true);

        jTTipo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLArtigo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLArtigo.setText("Artigo:");

        jTLoja.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLLoja.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLLoja.setText("Loja:");

        jTPreco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLMost.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLMost.setText("Mostruario:");

        jTTeflon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLTipo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLTipo.setText("Tecido:");

        jTArt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTMost.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLTeflon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLTeflon.setText("Teflon:");

        jTCorf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLFLinha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLFLinha.setText("F. Linha:");

        jLPreco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLPreco.setText("Preço:");

        Tabela.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Tabela.setModel(tmTecido);
        Tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabela);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Edição de Tecidos - Mostruário");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pesquisar.png"))); // NOI18N
        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/editar.png"))); // NOI18N
        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/excluir.gif"))); // NOI18N
        jButton3.setText("Excluir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/limpar.png"))); // NOI18N
        jButton4.setText("Limpar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLLoja)
                                    .addComponent(jLArtigo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTLoja)
                                    .addComponent(jTArt, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLTipo)
                                    .addComponent(jLTeflon)
                                    .addComponent(jLFLinha)
                                    .addComponent(jLMost)
                                    .addComponent(jLPreco))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTTeflon)
                                    .addComponent(jTPreco)
                                    .addComponent(jTCorf)
                                    .addComponent(jTTipo)
                                    .addComponent(jTMost, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3)
                                .addGap(29, 29, 29)
                                .addComponent(jButton4)
                                .addGap(19, 19, 19)))
                        .addGap(25, 25, 25))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton2, jButton3, jButton4});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLArtigo)
                            .addComponent(jTArt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLLoja)
                            .addComponent(jTLoja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLMost)
                            .addComponent(jTMost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLTipo)
                            .addComponent(jTTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTTeflon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLTeflon))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLPreco))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTCorf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLFLinha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton4))))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        while (tmTecido.getRowCount() > 0) {
            tmTecido.removeRow(0);
        }
        try {
            TecidoDAO dao = new TecidoDAO();
            tecidos = dao.getLista();
            String[] linha = new String[]{null, null, null, null};
            for (int i = 0; i < tecidos.size(); i++) {
                tmTecido.addRow(linha);
                tmTecido.setValueAt(tecidos.get(i).getArtigo(), i, 0);
                tmTecido.setValueAt(tecidos.get(i).getTipo(), i, 1);
                tmTecido.setValueAt(format(tecidos.get(i).getPreco()), i, 2);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaMouseClicked
        jTArt.setText(tecidos.get(Tabela.getSelectedRow()).getArtigo());
        jTLoja.setText(tecidos.get(Tabela.getSelectedRow()).getLoja());
        jTMost.setText(tecidos.get(Tabela.getSelectedRow()).getMostruario());
        jTTipo.setText(tecidos.get(Tabela.getSelectedRow()).getTipo());
        jTTeflon.setText(tecidos.get(Tabela.getSelectedRow()).getTeflon());
        jTPreco.setText(format(tecidos.get(Tabela.getSelectedRow()).getPreco()));
        jTCorf.setText(tecidos.get(Tabela.getSelectedRow()).getCorF());

    }//GEN-LAST:event_TabelaMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int pergunta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir esta sessão?\n");
        if (pergunta == 0) {//clicou em sim  
            try {
                TecidoDAO tdao = new TecidoDAO();
                Tecido tecido = new Tecido();
                tecido.setArtigo(tecidos.get(Tabela.getSelectedRow()).getArtigo());
                tdao.remover(tecido);
                JOptionPane.showMessageDialog(null, "Tecido Excluído com Sucesso!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
            }
        } else if (pergunta == 1) {//clicou em nao  
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        while (tmTecido.getRowCount() > 0) {
            tmTecido.removeRow(0);
        }
        jTArt.setText("");
        jTLoja.setText("");
        jTMost.setText("");
        jTTipo.setText("");
        jTTeflon.setText("");
        jTPreco.setText("");
        jTCorf.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Tecido tecido = new Tecido();
        tecido.setArtigo(jTArt.getText());
        tecido.setCorF(jTCorf.getText());
        tecido.setLoja(jTLoja.getText());
        tecido.setMostruario(jTMost.getText());
        if (jTPreco.getText().equals(format(tecidos.get(Tabela.getSelectedRow()).getPreco()))) {
            tecido.setPreco(tecidos.get(Tabela.getSelectedRow()).getPreco());
        } else {
            tecido.setPreco(Double.parseDouble(jTPreco.getText()) * 2);
        }

        tecido.setTipo(jTTipo.getText());
        tecido.setTeflon(jTTeflon.getText());

        try {
            TecidoDAO tdao = new TecidoDAO();
            tdao.altera(tecido);
            JOptionPane.showMessageDialog(null, "Tecido Editado com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }

    }//GEN-LAST:event_jButton2ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLArtigo;
    private javax.swing.JLabel jLFLinha;
    private javax.swing.JLabel jLLoja;
    private javax.swing.JLabel jLMost;
    private javax.swing.JLabel jLPreco;
    private javax.swing.JLabel jLTeflon;
    private javax.swing.JLabel jLTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTArt;
    private javax.swing.JTextField jTCorf;
    private javax.swing.JTextField jTLoja;
    private javax.swing.JTextField jTMost;
    private javax.swing.JTextField jTPreco;
    private javax.swing.JTextField jTTeflon;
    private javax.swing.JTextField jTTipo;
    // End of variables declaration//GEN-END:variables

    public static String format(double x) {
        return String.format("R$ %.2f", x);
    }
}
