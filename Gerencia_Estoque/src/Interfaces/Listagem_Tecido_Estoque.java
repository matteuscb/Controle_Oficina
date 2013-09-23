package Interfaces;

import DAO.TecidoDAO;
import Modelo.Tecido;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Listagem_Tecido_Estoque extends javax.swing.JInternalFrame {

    private String funcao;
    Tecido tecido = new Tecido();

    public Listagem_Tecido_Estoque(String funcao) {
        initComponents();
        this.funcao = funcao;
        jLCab.setText(funcao);

        getContentPane().setBackground(Color.white);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLArtigo = new javax.swing.JLabel();
        jTArt = new javax.swing.JTextField();
        jTMost = new javax.swing.JTextField();
        jLCab = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBLimpar = new javax.swing.JButton();
        jBPesquisar = new javax.swing.JButton();
        jLMost = new javax.swing.JLabel();
        jTQuantidade = new javax.swing.JTextField();
        jLQuantidade = new javax.swing.JLabel();
        jLCor = new javax.swing.JLabel();
        jTCor = new javax.swing.JTextField();

        setClosable(true);

        jLArtigo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLArtigo.setText("Artigo:");

        jTArt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTMost.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLCab.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLCab.setText("Ronaldo Tapeceiro - Pesquisa de Tecidos");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo.png"))); // NOI18N

        jBLimpar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/limpar.png"))); // NOI18N
        jBLimpar.setText("Limpar");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        jBPesquisar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pesquisar.png"))); // NOI18N
        jBPesquisar.setText("Pesquisar");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        jLMost.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLMost.setText("Mostruario:");

        jTQuantidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLQuantidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLQuantidade.setText("Quantidade:");

        jLCor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCor.setText("Cor:");

        jTCor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLCab)
                .addContainerGap(218, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLArtigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTArt, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLCor)
                            .addComponent(jLMost)
                            .addComponent(jLQuantidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTMost, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTCor, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBPesquisar)
                    .addComponent(jBLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(39, 39, 39))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBLimpar, jBPesquisar});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTArt, jTCor, jTMost, jTQuantidade});

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
                        .addGap(190, 190, 190)
                        .addComponent(jBPesquisar)
                        .addGap(18, 18, 18)
                        .addComponent(jBLimpar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLArtigo)
                            .addComponent(jTArt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLMost)
                            .addComponent(jTMost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLCor)
                            .addComponent(jTCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLQuantidade)
                            .addComponent(jTQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        jTCor.setText("");
        jTArt.setText("");
        jTMost.setText("");
        jTQuantidade.setText("");
    }//GEN-LAST:event_jBLimparActionPerformed

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        try {
            TecidoDAO tdao = new TecidoDAO();
            tecido.setArtigo(jTArt.getText());

            tdao.pegarTecidoEstoque(tecido);

            jTMost.setText(tecido.getMostruario());
            jTCor.setText(tecido.getCor());
            jTQuantidade.setText(String.valueOf(tecido.getQuantidade()));


        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
        }
    }//GEN-LAST:event_jBPesquisarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JLabel jLArtigo;
    private javax.swing.JLabel jLCab;
    private javax.swing.JLabel jLCor;
    private javax.swing.JLabel jLMost;
    private javax.swing.JLabel jLQuantidade;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTArt;
    private javax.swing.JTextField jTCor;
    private javax.swing.JTextField jTMost;
    private javax.swing.JTextField jTQuantidade;
    // End of variables declaration//GEN-END:variables

    public static String format(double x) {
        return String.format("R$ %.2f", x);
    }
}
