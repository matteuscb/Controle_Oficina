package Interfaces;

import DAO.CartaoDAO;
import DAO.ClienteDAO;
import DocumentFilter.NameDocumentFilter;
import Modelo.Cartao;
import Modelo.Cliente;
import java.awt.Color;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AbstractDocument;
import javax.swing.text.DocumentFilter;

public class Venda_Cartao extends javax.swing.JInternalFrame {

    DefaultTableModel tmCliente = new DefaultTableModel(null, new String[]{"Nome", "RG", "Endereço", "Celular", "Telefone"});
    List<Cliente> clientes;
    ListSelectionModel lsmCliente;

    public Venda_Cartao() {
        initComponents();

        /*DocumentFilter filter = new NameDocumentFilter();
         ((AbstractDocument) jTPre.getDocument()).setDocumentFilter(filter);*/
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLCliente = new javax.swing.JLabel();
        jTCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        jBPesquisar = new javax.swing.JButton();
        jLValor = new javax.swing.JLabel();
        jLParcela = new javax.swing.JLabel();
        jLOBS = new javax.swing.JLabel();
        jTValor = new javax.swing.JTextField();
        jTOBS = new javax.swing.JTextField();
        jCBParcela = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jDCEntrada = new com.toedter.calendar.JDateChooser();
        jCBCartao = new javax.swing.JCheckBox();

        setClosable(true);

        jLCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCliente.setText("Cliente:");

        jTCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Tabela.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Tabela.setModel(tmCliente);
        Tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabela);

        jBPesquisar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pesquisar.png"))); // NOI18N
        jBPesquisar.setText("Pesquisar");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        jLValor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLValor.setText("Valor:");

        jLParcela.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLParcela.setText("Parcelas:");

        jLOBS.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLOBS.setText("Obs:");

        jTValor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTOBS.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jCBParcela.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBParcela.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Cartão Crédito / Débito");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/vender.png"))); // NOI18N
        jButton1.setText("Vender");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jCBCartao.setText("Cartão Crédito");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(238, 238, 238))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLParcela)
                                    .addComponent(jLValor)
                                    .addComponent(jLOBS))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTValor, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCBCartao))
                                    .addComponent(jTOBS, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCBParcela, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDCEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLValor)
                            .addComponent(jTValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCBCartao)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDCEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTOBS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLOBS))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLParcela)
                    .addComponent(jCBParcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCliente)
                    .addComponent(jTCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CartaoDAO cdao = new CartaoDAO();
        Cartao cartao = new Cartao();
        Calendar cal = Calendar.getInstance();

        try {
            int Tparcela = Integer.parseInt((String) jCBParcela.getSelectedItem());
            cartao.setValor(Double.parseDouble(jTValor.getText()) / Tparcela);
            cartao.setId(cdao.PegarId());
            cartao.setId_cliente(clientes.get(Tabela.getSelectedRow()).getId());
            cartao.setDataCompra(jDCEntrada.getDate());
            cartao.setObs(jTOBS.getText());

            if (jCBCartao.isSelected() == true) {
                cartao.setTipo("Crédito");

            } else {
                cartao.setTipo("Débito");
            }
            for (int i = 1; i <= Tparcela; i++) {
                cartao.setParcela(i);
                cal.setTime(jDCEntrada.getDate());
                cal.add(Calendar.MONTH, i);
                cartao.setDataPagamento(cal.getTime());
                cartao.setStatus("Pendente");
                cdao.adicionar(cartao);
            }
            JOptionPane.showMessageDialog(null, "Venda Efetuada com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        try {
            ClienteDAO dao = new ClienteDAO();

            clientes = dao.listar("%" + jTCliente.getText() + "%");
            String endereco;

            while (tmCliente.getRowCount() > 0) {
                tmCliente.removeRow(0);
            }

            String[] linha = new String[]{null, null, null, null};
            for (int i = 0; i < clientes.size(); i++) {
                endereco = clientes.get(i).getRua() + " " + clientes.get(i).getNumero() + ", " + clientes.get(i).getBairro() + " - " + clientes.get(i).getCidade();
                tmCliente.addRow(linha);
                tmCliente.setValueAt(clientes.get(i).getNome(), i, 0);
                tmCliente.setValueAt(clientes.get(i).getRg(), i, 1);
                tmCliente.setValueAt(endereco, i, 2);
                tmCliente.setValueAt(clientes.get(i).getCelular(), i, 3);
                tmCliente.setValueAt(clientes.get(i).getTelefone(), i, 4);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
        }
    }//GEN-LAST:event_jBPesquisarActionPerformed

    private void TabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaMouseClicked
        jTCliente.setText(clientes.get(Tabela.getSelectedRow()).getNome());
    }//GEN-LAST:event_TabelaMouseClicked
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCBCartao;
    private javax.swing.JComboBox jCBParcela;
    private com.toedter.calendar.JDateChooser jDCEntrada;
    private javax.swing.JLabel jLCliente;
    private javax.swing.JLabel jLOBS;
    private javax.swing.JLabel jLParcela;
    private javax.swing.JLabel jLValor;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTCliente;
    private javax.swing.JTextField jTOBS;
    private javax.swing.JTextField jTValor;
    // End of variables declaration//GEN-END:variables

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
