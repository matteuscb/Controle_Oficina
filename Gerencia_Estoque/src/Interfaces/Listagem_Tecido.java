package Interfaces;

import DAO.TecidoDAO;
import Modelo.Tecido;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Listagem_Tecido extends javax.swing.JInternalFrame {

    private String funcao;
    Tecido tecido = new Tecido();

    public Listagem_Tecido(String funcao) {
        initComponents();
        this.funcao = funcao;
        jLCab.setText(funcao);

        getContentPane().setBackground(Color.white);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLArtigo = new javax.swing.JLabel();
        jLLoja = new javax.swing.JLabel();
        jLMost = new javax.swing.JLabel();
        jLTipo = new javax.swing.JLabel();
        jLTeflon = new javax.swing.JLabel();
        jLFLinha = new javax.swing.JLabel();
        jTCorf = new javax.swing.JTextField();
        jTPreco = new javax.swing.JTextField();
        jTTeflon = new javax.swing.JTextField();
        jTTipo = new javax.swing.JTextField();
        jTLoja = new javax.swing.JTextField();
        jTArt = new javax.swing.JTextField();
        jTMost = new javax.swing.JTextField();
        jLCab = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBPesquisar = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();
        jLPreco = new javax.swing.JLabel();

        setClosable(true);

        jLArtigo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLArtigo.setText("Artigo:");

        jLLoja.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLLoja.setText("Loja:");

        jLMost.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLMost.setText("Mostruario:");

        jLTipo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLTipo.setText("Tecido:");

        jLTeflon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLTeflon.setText("Teflon:");

        jLFLinha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLFLinha.setText("F. Linha:");

        jTCorf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTPreco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTTeflon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTTipo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTLoja.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTArt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTMost.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLCab.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLCab.setText("Ronaldo Tapeceiro - Pesquisa de Tecidos");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo.png"))); // NOI18N

        jBPesquisar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pesquisar.png"))); // NOI18N
        jBPesquisar.setText("Pesquisar");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        jBLimpar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/limpar.png"))); // NOI18N
        jBLimpar.setText("Limpar");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        jLPreco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLPreco.setText("Preço:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLCab)
                .addContainerGap(218, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                            .addComponent(jTMost, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBPesquisar)
                    .addComponent(jBLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(39, 39, 39))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBLimpar, jBPesquisar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCab)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLArtigo)
                            .addComponent(jTArt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLLoja)
                            .addComponent(jTLoja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
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
                                    .addComponent(jLTeflon)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jBPesquisar)
                                .addGap(18, 18, 18)
                                .addComponent(jBLimpar)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLPreco))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTCorf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLFLinha))))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        try {
            TecidoDAO tdao = new TecidoDAO();
            tecido.setArtigo(jTArt.getText());

            tdao.pegarTecido(tecido);

            jTLoja.setText(tecido.getLoja());
            jTMost.setText(tecido.getMostruario());
            jTTipo.setText(tecido.getTipo());
            jTTeflon.setText(tecido.getTeflon());
            jTPreco.setText(format(tecido.getPreco()));
            jTCorf.setText(tecido.getCorF());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
        }

    }//GEN-LAST:event_jBPesquisarActionPerformed

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        jTArt.setText("");
        jTCorf.setText("");
        jTLoja.setText("");
        jTMost.setText("");
        jTPreco.setText("");
        jTTeflon.setText("");
        jTTipo.setText("");
    }//GEN-LAST:event_jBLimparActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JLabel jLArtigo;
    private javax.swing.JLabel jLCab;
    private javax.swing.JLabel jLFLinha;
    private javax.swing.JLabel jLLoja;
    private javax.swing.JLabel jLMost;
    private javax.swing.JLabel jLPreco;
    private javax.swing.JLabel jLTeflon;
    private javax.swing.JLabel jLTipo;
    private javax.swing.JLabel jLabel2;
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
