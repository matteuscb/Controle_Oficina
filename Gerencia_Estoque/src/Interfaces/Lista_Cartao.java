package Interfaces;

import DAO.CartaoDAO;
import Modelo.Cartao;
import java.awt.Color;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class Lista_Cartao extends javax.swing.JInternalFrame {

    DefaultTableModel tmCartao = new DefaultTableModel(null, new String[]{"Cliente", "Venda", "Parcela", "Data da Compra", "Data de Pagamento", "Valor", "Status", "Obs", "Tipo"});
    List<Cartao> cartoes;
    ListSelectionModel lsmCartao;

    public Lista_Cartao() {
        initComponents();
        getContentPane().setBackground(Color.white);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLParcela = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        jRBTudo = new javax.swing.JRadioButton();
        jRBCredito = new javax.swing.JRadioButton();
        jRBDebito = new javax.swing.JRadioButton();
        jRBMes = new javax.swing.JRadioButton();
        jRBDia = new javax.swing.JRadioButton();
        jRBCliente = new javax.swing.JRadioButton();
        jTCPF = new javax.swing.JTextField();
        jCBPaga = new javax.swing.JCheckBox();

        setClosable(true);

        jLParcela.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLParcela.setText("Parcelas");

        Tabela.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Tabela.setModel(tmCartao);
        jScrollPane1.setViewportView(Tabela);

        jRBTudo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRBTudo.setText("Todas");
        jRBTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBTudoActionPerformed(evt);
            }
        });

        jRBCredito.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRBCredito.setText("Crédito");
        jRBCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBCreditoActionPerformed(evt);
            }
        });

        jRBDebito.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRBDebito.setText("Débito");
        jRBDebito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBDebitoActionPerformed(evt);
            }
        });

        jRBMes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRBMes.setText("Mês");
        jRBMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBMesActionPerformed(evt);
            }
        });

        jRBDia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRBDia.setText("Dia");
        jRBDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBDiaActionPerformed(evt);
            }
        });

        jRBCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRBCliente.setText("Cliente - CPF");
        jRBCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBClienteActionPerformed(evt);
            }
        });

        jTCPF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jCBPaga.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBPaga.setText("Pagas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRBTudo)
                    .addComponent(jRBCredito)
                    .addComponent(jRBDebito)
                    .addComponent(jRBMes)
                    .addComponent(jRBDia)
                    .addComponent(jRBCliente)
                    .addComponent(jTCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBPaga))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(382, 382, 382)
                .addComponent(jLParcela)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLParcela)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jCBPaga)
                        .addGap(18, 18, 18)
                        .addComponent(jRBTudo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRBCredito)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRBDebito)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRBMes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRBDia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRBCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRBTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBTudoActionPerformed
        jRBDebito.setSelected(false);
        jRBDia.setSelected(false);
        jRBCliente.setSelected(false);
        jRBMes.setSelected(false);
        jRBCredito.setSelected(false);
        try {
            CartaoDAO cdao = new CartaoDAO();
            if (jCBPaga.isSelected() == true) {
                cartoes = cdao.listarGeral("Pago");
            } else {
                cartoes = cdao.listarGeral("Pendente");
            }


            while (tmCartao.getRowCount() > 0) {
                tmCartao.removeRow(0);
            }

            String[] linha = new String[]{null, null, null, null};
            for (int i = 0; i < cartoes.size(); i++) {
                tmCartao.addRow(linha);
                tmCartao.setValueAt(cartoes.get(i).getCliente().getNome(), i, 0);
                tmCartao.setValueAt(cartoes.get(i).getId(), i, 1);
                tmCartao.setValueAt(cartoes.get(i).getParcela(), i, 2);
                tmCartao.setValueAt(formatData(cartoes.get(i).getDataCompra()), i, 3);
                tmCartao.setValueAt(formatData(cartoes.get(i).getDataPagamento()), i, 4);
                tmCartao.setValueAt(format(cartoes.get(i).getValor()), i, 5);
                tmCartao.setValueAt(cartoes.get(i).getStatus(), i, 6);
                tmCartao.setValueAt(cartoes.get(i).getObs(), i, 7);
                tmCartao.setValueAt(cartoes.get(i).getTipo(), i, 8);

            }


        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }
    }//GEN-LAST:event_jRBTudoActionPerformed

    private void jRBCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBCreditoActionPerformed
        jRBDebito.setSelected(false);
        jRBDia.setSelected(false);
        jRBCliente.setSelected(false);
        jRBMes.setSelected(false);
        jRBTudo.setSelected(false);
        try {
            CartaoDAO cdao = new CartaoDAO();
            if (jCBPaga.isSelected() == true) {

                cartoes = cdao.listarCredito("Pago");
            } else {
                cartoes = cdao.listarCredito("Pendente");
            }


            while (tmCartao.getRowCount() > 0) {
                tmCartao.removeRow(0);
            }

            String[] linha = new String[]{null, null, null, null};
            for (int i = 0; i < cartoes.size(); i++) {
                tmCartao.addRow(linha);
                tmCartao.setValueAt(cartoes.get(i).getCliente().getNome(), i, 0);
                tmCartao.setValueAt(cartoes.get(i).getId(), i, 1);
                tmCartao.setValueAt(cartoes.get(i).getParcela(), i, 2);
                tmCartao.setValueAt(formatData(cartoes.get(i).getDataCompra()), i, 3);
                tmCartao.setValueAt(formatData(cartoes.get(i).getDataPagamento()), i, 4);
                tmCartao.setValueAt(format(cartoes.get(i).getValor()), i, 5);
                tmCartao.setValueAt(cartoes.get(i).getStatus(), i, 6);
                tmCartao.setValueAt(cartoes.get(i).getObs(), i, 7);
                tmCartao.setValueAt(cartoes.get(i).getTipo(), i, 8);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }

    }//GEN-LAST:event_jRBCreditoActionPerformed

    private void jRBDebitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBDebitoActionPerformed
        jRBTudo.setSelected(false);
        jRBDia.setSelected(false);
        jRBCliente.setSelected(false);
        jRBMes.setSelected(false);
        jRBCredito.setSelected(false);
        try {
            CartaoDAO cdao = new CartaoDAO();
            if (jCBPaga.isSelected() == true) {

                cartoes = cdao.listarDebito("Pago");

            } else {
                cartoes = cdao.listarDebito("Pendente");
            }
            while (tmCartao.getRowCount() > 0) {
                tmCartao.removeRow(0);
            }

            String[] linha = new String[]{null, null, null, null};
            for (int i = 0; i < cartoes.size(); i++) {
                tmCartao.addRow(linha);
                tmCartao.setValueAt(cartoes.get(i).getCliente().getNome(), i, 0);
                tmCartao.setValueAt(cartoes.get(i).getId(), i, 1);
                tmCartao.setValueAt(cartoes.get(i).getParcela(), i, 2);
                tmCartao.setValueAt(formatData(cartoes.get(i).getDataCompra()), i, 3);
                tmCartao.setValueAt(formatData(cartoes.get(i).getDataPagamento()), i, 4);
                tmCartao.setValueAt(format(cartoes.get(i).getValor()), i, 5);
                tmCartao.setValueAt(cartoes.get(i).getStatus(), i, 6);
                tmCartao.setValueAt(cartoes.get(i).getObs(), i, 7);
                tmCartao.setValueAt(cartoes.get(i).getTipo(), i, 8);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }
    }//GEN-LAST:event_jRBDebitoActionPerformed

    private void jRBMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBMesActionPerformed
        jRBDebito.setSelected(false);
        jRBDia.setSelected(false);
        jRBCliente.setSelected(false);
        jRBTudo.setSelected(false);
        jRBCredito.setSelected(false);

        try {
            CartaoDAO cdao = new CartaoDAO();
            if (jCBPaga.isSelected() == true) {

                cartoes = cdao.listarMes("Pago");


            } else {
                cartoes = cdao.listarMes("Pendente");
            }
            while (tmCartao.getRowCount() > 0) {
                tmCartao.removeRow(0);
            }

            String[] linha = new String[]{null, null, null, null};
            for (int i = 0; i < cartoes.size(); i++) {
                tmCartao.addRow(linha);
                tmCartao.setValueAt(cartoes.get(i).getCliente().getNome(), i, 0);
                tmCartao.setValueAt(cartoes.get(i).getId(), i, 1);
                tmCartao.setValueAt(cartoes.get(i).getParcela(), i, 2);
                tmCartao.setValueAt(formatData(cartoes.get(i).getDataCompra()), i, 3);
                tmCartao.setValueAt(formatData(cartoes.get(i).getDataPagamento()), i, 4);
                tmCartao.setValueAt(format(cartoes.get(i).getValor()), i, 5);
                tmCartao.setValueAt(cartoes.get(i).getStatus(), i, 6);
                tmCartao.setValueAt(cartoes.get(i).getObs(), i, 7);
                tmCartao.setValueAt(cartoes.get(i).getTipo(), i, 8);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }
    }//GEN-LAST:event_jRBMesActionPerformed

    private void jRBDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBDiaActionPerformed
        jRBDebito.setSelected(false);
        jRBTudo.setSelected(false);
        jRBCliente.setSelected(false);
        jRBMes.setSelected(false);
        jRBCredito.setSelected(false);
        try {
            CartaoDAO cdao = new CartaoDAO();
            if (jCBPaga.isSelected() == true) {

                cartoes = cdao.listarDia("Pago");

            } else {
                cartoes = cdao.listarDia("Pendente");
            }
            while (tmCartao.getRowCount() > 0) {
                tmCartao.removeRow(0);
            }

            String[] linha = new String[]{null, null, null, null};
            for (int i = 0; i < cartoes.size(); i++) {
                tmCartao.addRow(linha);
                tmCartao.setValueAt(cartoes.get(i).getCliente().getNome(), i, 0);
                tmCartao.setValueAt(cartoes.get(i).getId(), i, 1);
                tmCartao.setValueAt(cartoes.get(i).getParcela(), i, 2);
                tmCartao.setValueAt(formatData(cartoes.get(i).getDataCompra()), i, 3);
                tmCartao.setValueAt(formatData(cartoes.get(i).getDataPagamento()), i, 4);
                tmCartao.setValueAt(format(cartoes.get(i).getValor()), i, 5);
                tmCartao.setValueAt(cartoes.get(i).getStatus(), i, 6);
                tmCartao.setValueAt(cartoes.get(i).getObs(), i, 7);
                tmCartao.setValueAt(cartoes.get(i).getTipo(), i, 8);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }
    }//GEN-LAST:event_jRBDiaActionPerformed

    private void jRBClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBClienteActionPerformed
        if (jTCPF.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Favor, preencher o campo do CPF.");
            jRBCliente.setSelected(false);
        } else {
            jRBDebito.setSelected(false);
            jRBDia.setSelected(false);
            jRBTudo.setSelected(false);
            jRBMes.setSelected(false);
            try {
                jRBCredito.setSelected(false);
                CartaoDAO cdao = new CartaoDAO();
                if (jCBPaga.isSelected() == true) {

                    cartoes = cdao.listarCPF("Pago", jTCPF.getText());


                } else {
                    cartoes = cdao.listarCPF("Pendente", jTCPF.getText());
                }
                while (tmCartao.getRowCount() > 0) {
                    tmCartao.removeRow(0);
                }

                String[] linha = new String[]{null, null, null, null};
                for (int i = 0; i < cartoes.size(); i++) {
                    tmCartao.addRow(linha);
                    tmCartao.setValueAt(cartoes.get(i).getCliente().getNome(), i, 0);
                    tmCartao.setValueAt(cartoes.get(i).getId(), i, 1);
                    tmCartao.setValueAt(cartoes.get(i).getParcela(), i, 2);
                    tmCartao.setValueAt(formatData(cartoes.get(i).getDataCompra()), i, 3);
                    tmCartao.setValueAt(formatData(cartoes.get(i).getDataPagamento()), i, 4);
                    tmCartao.setValueAt(format(cartoes.get(i).getValor()), i, 5);
                    tmCartao.setValueAt(cartoes.get(i).getStatus(), i, 6);
                    tmCartao.setValueAt(cartoes.get(i).getObs(), i, 7);
                    tmCartao.setValueAt(cartoes.get(i).getTipo(), i, 8);

                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro: " + ex);
            }
        }
    }//GEN-LAST:event_jRBClienteActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela;
    private javax.swing.JCheckBox jCBPaga;
    private javax.swing.JLabel jLParcela;
    private javax.swing.JRadioButton jRBCliente;
    private javax.swing.JRadioButton jRBCredito;
    private javax.swing.JRadioButton jRBDebito;
    private javax.swing.JRadioButton jRBDia;
    private javax.swing.JRadioButton jRBMes;
    private javax.swing.JRadioButton jRBTudo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTCPF;
    // End of variables declaration//GEN-END:variables

    public static String format(double x) {
        return String.format("R$ %.2f", x);
    }

    public static String formatData(java.util.Date d) {
        String aux, aux2 = "";
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        int ano = cal.get(Calendar.YEAR);
        int mes = cal.get(Calendar.MONTH) + 1;
        int dia = cal.get(Calendar.DAY_OF_MONTH);
        if (mes < 10) {
            aux = "0" + String.valueOf(mes);
        } else {
            aux = String.valueOf(mes);
        }
        if (dia < 10) {
            aux2 = "0" + String.valueOf(dia);
        } else {
            aux2 = String.valueOf(dia);
        }
        String sData = aux2 + "/" + aux + "/" + String.valueOf(ano);
        return sData;
    }
}
