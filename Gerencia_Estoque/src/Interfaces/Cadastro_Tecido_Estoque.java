package Interfaces;

import DAO.TecidoDAO;
import Modelo.Tecido;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Cadastro_Tecido_Estoque extends javax.swing.JInternalFrame {

    public Cadastro_Tecido_Estoque() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLArtigo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLMost = new javax.swing.JLabel();
        jTQuantidade = new javax.swing.JTextField();
        jLCadastro = new javax.swing.JLabel();
        jTArt = new javax.swing.JTextField();
        jTMost = new javax.swing.JTextField();
        jLQuantidade = new javax.swing.JLabel();
        jLCor = new javax.swing.JLabel();
        jTCor = new javax.swing.JTextField();

        setClosable(true);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Limpar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLArtigo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLArtigo.setText("Artigo:");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLMost.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLMost.setText("Mostruario:");

        jTQuantidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLCadastro.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLCadastro.setText("Cadastro de Tecidos - Estoque");

        jTArt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTMost.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLQuantidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLQuantidade.setText("Quantidade:");

        jLCor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCor.setText("Cor:");

        jTCor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(50, 50, 50)
                .addComponent(jButton2)
                .addGap(60, 60, 60))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLCor)
                            .addComponent(jLMost)
                            .addComponent(jLArtigo)
                            .addComponent(jLQuantidade))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTMost)
                            .addComponent(jTArt)
                            .addComponent(jTQuantidade)
                            .addComponent(jTCor, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLCadastro))
                .addGap(224, 224, 224))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTArt, jTCor, jTMost, jTQuantidade});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLCadastro)
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTArt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLArtigo))
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
                    .addComponent(jTQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTArt.setText("");
        jTCor.setText("");
        jTQuantidade.setText("");
        jTMost.setText("");
        jTQuantidade.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Tecido tecido = new Tecido();
        tecido.setCor(jTCor.getText());
        tecido.setArtigo(jTArt.getText());
        tecido.setMostruario(jTMost.getText());
        tecido.setCor(jTCor.getText());
        tecido.setQuantidade(Double.parseDouble(jTQuantidade.getText()));
        try {
            TecidoDAO tdao = new TecidoDAO();
            tdao.adicionarLoja(tecido);
            JOptionPane.showMessageDialog(null, "Tecido Cadastrado com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLArtigo;
    private javax.swing.JLabel jLCadastro;
    private javax.swing.JLabel jLCor;
    private javax.swing.JLabel jLMost;
    private javax.swing.JLabel jLQuantidade;
    private javax.swing.JTextField jTArt;
    private javax.swing.JTextField jTCor;
    private javax.swing.JTextField jTMost;
    private javax.swing.JTextField jTQuantidade;
    // End of variables declaration//GEN-END:variables
}
