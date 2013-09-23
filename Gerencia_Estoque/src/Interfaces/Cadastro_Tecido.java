package Interfaces;

import DAO.TecidoDAO;
import DocumentFilter.NameDocumentFilter;
import Modelo.Tecido;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.AbstractDocument;
import javax.swing.text.DocumentFilter;

public class Cadastro_Tecido extends javax.swing.JInternalFrame {

    public Cadastro_Tecido() {
        initComponents();
        getContentPane().setBackground(Color.white);
        /*DocumentFilter filter = new NameDocumentFilter();
         ((AbstractDocument) jTPre.getDocument()).setDocumentFilter(filter);*/
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLCadastro = new javax.swing.JLabel();
        jTMost = new javax.swing.JTextField();
        jLArtigo = new javax.swing.JLabel();
        jTLoja = new javax.swing.JTextField();
        jLTipo = new javax.swing.JLabel();
        jLMost = new javax.swing.JLabel();
        jTArt = new javax.swing.JTextField();
        jTTipo = new javax.swing.JTextField();
        jLLoja = new javax.swing.JLabel();
        jTPre = new javax.swing.JTextField();
        jCTeflon = new javax.swing.JCheckBox();
        jLPreco = new javax.swing.JLabel();
        jLCorF = new javax.swing.JLabel();
        jTCorF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);

        jLCadastro.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLCadastro.setText("Cadastro de Tecidos - Mostruário");

        jTMost.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLArtigo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLArtigo.setText("Artigo:");

        jTLoja.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLTipo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLTipo.setText("Tecido:");

        jLMost.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLMost.setText("Mostruario:");

        jTArt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTTipo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLLoja.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLLoja.setText("Loja:");

        jTPre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jCTeflon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCTeflon.setText("Teflon");

        jLPreco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLPreco.setText("Preço:");

        jLCorF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCorF.setText("Cor F. Linha:");

        jTCorF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Limpar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

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
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLCadastro)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLMost)
                            .addComponent(jLArtigo)
                            .addComponent(jLLoja)
                            .addComponent(jLTipo)
                            .addComponent(jLCorF)
                            .addComponent(jLPreco))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTLoja, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTMost, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTArt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTCorF, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTPre, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCTeflon))))
                .addContainerGap(229, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTArt, jTCorF, jTLoja, jTMost, jTPre, jTTipo});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLCadastro)
                .addGap(43, 43, 43)
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
                    .addComponent(jTArt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLArtigo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCorF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCorF))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTPre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLPreco))
                .addGap(18, 18, 18)
                .addComponent(jCTeflon)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTArt.setText("");
        jTCorF.setText("");
        jTLoja.setText("");
        jTMost.setText("");
        jTPre.setText("");
        jTTipo.setText("");
        jCTeflon.setSelected(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Tecido tecido = new Tecido();
        tecido.setArtigo(jTArt.getText());
        tecido.setCorF(jTCorF.getText());
        tecido.setLoja(jTLoja.getText());
        tecido.setMostruario(jTMost.getText());
        tecido.setPreco(Double.parseDouble(jTPre.getText()) * 2);
        tecido.setTipo(jTTipo.getText());
        if (jCTeflon.isSelected() == true) {
            tecido.setTeflon("Teflonado");
        } else {
            tecido.setTeflon("Não Teflonado");
        }

        try {
            TecidoDAO tdao = new TecidoDAO();

            tdao.adicionar(tecido);
            JOptionPane.showMessageDialog(null, "Tecido Cadastrado com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }


    }//GEN-LAST:event_jButton1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCTeflon;
    private javax.swing.JLabel jLArtigo;
    private javax.swing.JLabel jLCadastro;
    private javax.swing.JLabel jLCorF;
    private javax.swing.JLabel jLLoja;
    private javax.swing.JLabel jLMost;
    private javax.swing.JLabel jLPreco;
    private javax.swing.JLabel jLTipo;
    private javax.swing.JTextField jTArt;
    private javax.swing.JTextField jTCorF;
    private javax.swing.JTextField jTLoja;
    private javax.swing.JTextField jTMost;
    private javax.swing.JTextField jTPre;
    private javax.swing.JTextField jTTipo;
    // End of variables declaration//GEN-END:variables
}
