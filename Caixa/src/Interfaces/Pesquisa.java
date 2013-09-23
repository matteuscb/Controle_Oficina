/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import DAO.DAO;
import Modelo.Caixa;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class Pesquisa extends javax.swing.JFrame {

    /**
     * Creates new form Pesquisa
     */
    List<Caixa> caixasE, caixasS;//List de uma classe do modelo para utilização na tabela;
    DefaultTableModel tmCaixaE = new DefaultTableModel(null, new String[]{"Cliente", "Valor", "Data"});
    DefaultTableModel tmCaixaS = new DefaultTableModel(null, new String[]{"Cliente", "Valor", "Data"});
    DAO dao = new DAO();
    
    public Pesquisa() {
        this.setExtendedState(MAXIMIZED_BOTH);
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLDataInicial = new javax.swing.JLabel();
        jLDataFinal = new javax.swing.JLabel();
        jLTotalEntrada = new javax.swing.JLabel();
        jLTotal_Saida = new javax.swing.JLabel();
        jLLiquido = new javax.swing.JLabel();
        jTEntrada = new javax.swing.JTextField();
        jTLiquido = new javax.swing.JTextField();
        jTSaida = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jBPesquisar = new javax.swing.JButton();
        jDCInicial = new com.toedter.calendar.JDateChooser();
        jDCFinal = new com.toedter.calendar.JDateChooser();
        jBVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLDataInicial.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLDataInicial.setText("Data Inicial:");

        jLDataFinal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLDataFinal.setText("Data Final:");

        jLTotalEntrada.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLTotalEntrada.setText("Total de Entrada:");

        jLTotal_Saida.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLTotal_Saida.setText("Total de Saída:");

        jLLiquido.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLLiquido.setText("Total Líquido:");

        jTEntrada.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jTLiquido.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jTSaida.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTable1.setModel(tmCaixaE);
        jTable1.setRowHeight(30);
        jScrollPane1.setViewportView(jTable1);

        jTable2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTable2.setModel(tmCaixaS);
        jTable2.setRowHeight(30);
        jScrollPane2.setViewportView(jTable2);

        jBPesquisar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jBPesquisar.setText("Pesquisar");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        jDCInicial.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jDCFinal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jBVoltar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jBVoltar.setText("Voltar");
        jBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(391, 391, 391)
                        .addComponent(jLDataInicial)
                        .addGap(18, 18, 18)
                        .addComponent(jDCInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jLDataFinal)
                        .addGap(18, 18, 18)
                        .addComponent(jDCFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLTotalEntrada)
                                .addGap(18, 18, 18)
                                .addComponent(jTEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(198, 198, 198)
                                .addComponent(jLTotal_Saida)
                                .addGap(18, 18, 18)
                                .addComponent(jTSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jBPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(509, 509, 509)
                        .addComponent(jLLiquido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTLiquido, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane1, jScrollPane2});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jDCFinal, jDCInicial});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTEntrada, jTLiquido, jTSaida});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jDCInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLDataInicial))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jDCFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLDataFinal))
                                .addGap(2, 2, 2)))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jBPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jBVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLTotal_Saida)
                    .addComponent(jTEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLTotalEntrada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLLiquido)
                    .addComponent(jTLiquido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane1, jScrollPane2});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        if ((jDCInicial.getDate() == null) || (jDCFinal.getDate() == null)) {
            JOptionPane.showMessageDialog(null, "Por favor, preencher as datas necessárias para pesquisa!");
        } else {
            
            caixasE = dao.listarEntrada(jDCInicial.getDate(), jDCFinal.getDate());
            
            caixasS = dao.listarSaida(jDCInicial.getDate(), jDCFinal.getDate());
            
            while (tmCaixaE.getRowCount() > 0) {
                tmCaixaE.removeRow(0);
            }
            while (tmCaixaS.getRowCount() > 0) {
                tmCaixaS.removeRow(0);
            }
            
            for (int i = 0; i < caixasE.size(); i++) {
                
                tmCaixaE.addRow(new String[]{null, null, null, null});
                tmCaixaE.setValueAt(caixasE.get(i).getCliente(), i, 0);
                tmCaixaE.setValueAt(format(caixasE.get(i).getValor()), i, 1);
                tmCaixaE.setValueAt(formatData(caixasE.get(i).getData()), i, 2);
            }
            
            for (int i = 0; i < caixasS.size(); i++) {
                
                tmCaixaS.addRow(new String[]{null, null, null, null});
                tmCaixaS.setValueAt(caixasS.get(i).getCliente(), i, 0);
                tmCaixaS.setValueAt(format(caixasS.get(i).getValor()), i, 1);
                tmCaixaS.setValueAt(formatData(caixasS.get(i).getData()), i, 2);
            }
            jTSaida.setText((format(dao.TotalSaida(jDCInicial.getDate(), jDCFinal.getDate()))));
            jTEntrada.setText((format(dao.TotalEntrada(jDCInicial.getDate(), jDCFinal.getDate()))));
            jTLiquido.setText((format(dao.TotalLiquido(jDCInicial.getDate(), jDCFinal.getDate()))));
        }
        
        
    }//GEN-LAST:event_jBPesquisarActionPerformed
    
    private void jBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoltarActionPerformed
        Inicio in = new Inicio();
        in.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jBVoltarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JButton jBVoltar;
    private com.toedter.calendar.JDateChooser jDCFinal;
    private com.toedter.calendar.JDateChooser jDCInicial;
    private javax.swing.JLabel jLDataFinal;
    private javax.swing.JLabel jLDataInicial;
    private javax.swing.JLabel jLLiquido;
    private javax.swing.JLabel jLTotalEntrada;
    private javax.swing.JLabel jLTotal_Saida;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTEntrada;
    private javax.swing.JTextField jTLiquido;
    private javax.swing.JTextField jTSaida;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
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