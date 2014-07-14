package Interfaces;

import DAO.ClienteDAO;
import Modelo.Cliente;
import java.awt.Color;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

public class Cadastro_Cliente extends javax.swing.JInternalFrame {

    DefaultTableModel tmCliente = new DefaultTableModel(null, new String[]{"Nome", "RG", "Endereço", "Celular", "Telefone"});
    List<Cliente> clientes;
    ListSelectionModel lsmCliente;

    public Cadastro_Cliente() throws ParseException {
        super("Controle de Clientes");
        initComponents();

        MaskFormatter maskData = new MaskFormatter("(##) ####-####");
        MaskFormatter maskData2 = new MaskFormatter("(##) #####-####");
        maskData.install(JFTTelefone);
        maskData2.install(jFTCelular);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLNome = new javax.swing.JLabel();
        jLRG = new javax.swing.JLabel();
        jLCPF = new javax.swing.JLabel();
        jLNascimento = new javax.swing.JLabel();
        jLEmail = new javax.swing.JLabel();
        jLRua = new javax.swing.JLabel();
        jLNumero = new javax.swing.JLabel();
        jLBairro = new javax.swing.JLabel();
        jLCidade = new javax.swing.JLabel();
        jTRG = new javax.swing.JTextField();
        jTCPF = new javax.swing.JTextField();
        jTNome = new javax.swing.JTextField();
        jTEmail = new javax.swing.JTextField();
        jTNumero = new javax.swing.JTextField();
        jTRua = new javax.swing.JTextField();
        jTBairro = new javax.swing.JTextField();
        jTCidade = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jBCadastar = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();
        jBPesquisar = new javax.swing.JButton();
        jTPesquisar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        jLTelefone = new javax.swing.JLabel();
        jFTCelular = new javax.swing.JFormattedTextField();
        JFTTelefone = new javax.swing.JFormattedTextField();

        setClosable(true);

        jLNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLNome.setText("Nome:");

        jLRG.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLRG.setText("RG:");

        jLCPF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCPF.setText("CPF:");

        jLNascimento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLNascimento.setText("Celular:");

        jLEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLEmail.setText("E-mail:");

        jLRua.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLRua.setText("Rua:");

        jLNumero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLNumero.setText("Nº:");

        jLBairro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLBairro.setText("Bairro:");

        jLCidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCidade.setText("Cidade:");

        jTRG.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTCPF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTNumero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTRua.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTBairro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTCidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jBCadastar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBCadastar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/salvar.png"))); // NOI18N
        jBCadastar.setText("Cadastrar");
        jBCadastar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastarActionPerformed(evt);
            }
        });

        jBEditar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/editar.png"))); // NOI18N
        jBEditar.setText("Editar");
        jBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarActionPerformed(evt);
            }
        });

        jBExcluir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/excluir.gif"))); // NOI18N
        jBExcluir.setText("Excluir");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
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

        jBPesquisar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pesquisar.png"))); // NOI18N
        jBPesquisar.setText("Pesquisar");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        jTPesquisar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTPesquisarActionPerformed(evt);
            }
        });
        jTPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTPesquisarKeyTyped(evt);
            }
        });

        Tabela.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Tabela.setModel(tmCliente);
        Tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabela);

        jLTelefone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLTelefone.setText("Telefone:");

        jFTCelular.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        JFTTelefone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTNome)
                .addGap(18, 18, 18)
                .addComponent(jLNascimento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFTCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLTelefone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JFTTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLRua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTRua, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLNumero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLBairro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLCidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLRG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTRG, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLCPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTCPF)
                .addGap(18, 18, 18)
                .addComponent(jLEmail)
                .addGap(18, 18, 18)
                .addComponent(jTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jBPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBCadastar)
                .addGap(32, 32, 32)
                .addComponent(jBEditar)
                .addGap(30, 30, 30)
                .addComponent(jBExcluir)
                .addGap(36, 36, 36)
                .addComponent(jBLimpar)
                .addGap(166, 166, 166))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBCadastar, jBEditar, jBExcluir, jBLimpar, jBPesquisar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNome)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNascimento)
                    .addComponent(jLTelefone)
                    .addComponent(jFTCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JFTTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLRG)
                        .addComponent(jTRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLCPF)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLEmail)
                        .addComponent(jTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLRua)
                        .addComponent(jTRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLNumero)
                        .addComponent(jTNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLBairro)
                        .addComponent(jTBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLCidade)
                        .addComponent(jTCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCadastar)
                    .addComponent(jBEditar)
                    .addComponent(jBExcluir)
                    .addComponent(jBLimpar))
                .addGap(26, 26, 26)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBPesquisar)
                    .addComponent(jTPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadastarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastarActionPerformed
        Cliente cliente = new Cliente();
        cliente.setNome(jTNome.getText());
        cliente.setRg(jTRG.getText());
        cliente.setCpf(jTCPF.getText());
        cliente.setEmail(jTEmail.getText());
        cliente.setCelular(jFTCelular.getText());
        cliente.setTelefone(JFTTelefone.getText());
        cliente.setRua(jTRua.getText());
        cliente.setNumero(jTNumero.getText());
        cliente.setBairro(jTBairro.getText());
        cliente.setCidade(jTCidade.getText());

        try {
            ClienteDAO cdao = new ClienteDAO();
            cdao.adicionar(cliente);
            JOptionPane.showMessageDialog(null, "Cliente Cadastrado com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
        }

    }//GEN-LAST:event_jBCadastarActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
        Cliente cliente = new Cliente();
        cliente.setNome(jTNome.getText());
        cliente.setCelular(jFTCelular.getText());
        cliente.setRg(jTRG.getText());
        cliente.setCpf(jTCPF.getText());
        cliente.setEmail(jTEmail.getText());
        cliente.setTelefone(JFTTelefone.getText());
        cliente.setRua(jTRua.getText());
        cliente.setNumero(jTNumero.getText());
        cliente.setBairro(jTBairro.getText());
        cliente.setCidade(jTCidade.getText());
        cliente.setId(clientes.get(Tabela.getSelectedRow()).getId());
        try {
            ClienteDAO dao = new ClienteDAO();
            dao.alterar(cliente);
            JOptionPane.showMessageDialog(null, "Edição Efetuada com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
        }

    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        jTNome.setText("");
        jTRG.setText("");
        jTCPF.setText("");
        jTEmail.setText("");
        jFTCelular.setText("");
        jTRua.setText("");
        jTNumero.setText("");
        jTBairro.setText("");
        jTCidade.setText("");
        JFTTelefone.setText("");

        while (tmCliente.getRowCount() > 0) {
            tmCliente.removeRow(0);
        }

    }//GEN-LAST:event_jBLimparActionPerformed

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        try {
            ClienteDAO dao = new ClienteDAO();

            clientes = dao.listar("%" + jTPesquisar.getText() + "%");

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
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }

    }//GEN-LAST:event_jBPesquisarActionPerformed

    private void TabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaMouseClicked
        jTNome.setText(clientes.get(Tabela.getSelectedRow()).getNome());
        jFTCelular.setText(clientes.get(Tabela.getSelectedRow()).getCelular());
        JFTTelefone.setText(clientes.get(Tabela.getSelectedRow()).getTelefone());
        jTCPF.setText(clientes.get(Tabela.getSelectedRow()).getCpf());
        jTRG.setText(clientes.get(Tabela.getSelectedRow()).getRg());
        jTEmail.setText(clientes.get(Tabela.getSelectedRow()).getEmail());
        jTRua.setText(clientes.get(Tabela.getSelectedRow()).getRua());
        jTNumero.setText(clientes.get(Tabela.getSelectedRow()).getNumero());
        jTBairro.setText(clientes.get(Tabela.getSelectedRow()).getBairro());
        jTCidade.setText(clientes.get(Tabela.getSelectedRow()).getCidade());
    }//GEN-LAST:event_TabelaMouseClicked

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        int pergunta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir este cliente?");
        if (pergunta == 0) {//clicou em sim  
            try {
                ClienteDAO dao = new ClienteDAO();
                dao.remover(clientes.get(Tabela.getSelectedRow()).getId());
                JOptionPane.showMessageDialog(null, "Cliente Deletado com Sucesso!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
            }
        } else if (pergunta == 1) {//clicou em nao  
        }
    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jTPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTPesquisarActionPerformed
        try {
            ClienteDAO dao = new ClienteDAO();

            clientes = dao.listar("%" + jTPesquisar.getText() + "%");

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
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }

    }//GEN-LAST:event_jTPesquisarActionPerformed

    private void jTPesquisarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTPesquisarKeyTyped
        try {
            ClienteDAO dao = new ClienteDAO();

            clientes = dao.listar("%" + jTPesquisar.getText() + "%");

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
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }

    }//GEN-LAST:event_jTPesquisarKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField JFTTelefone;
    private javax.swing.JTable Tabela;
    private javax.swing.JButton jBCadastar;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JFormattedTextField jFTCelular;
    private javax.swing.JLabel jLBairro;
    private javax.swing.JLabel jLCPF;
    private javax.swing.JLabel jLCidade;
    private javax.swing.JLabel jLEmail;
    private javax.swing.JLabel jLNascimento;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLNumero;
    private javax.swing.JLabel jLRG;
    private javax.swing.JLabel jLRua;
    private javax.swing.JLabel jLTelefone;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTBairro;
    private javax.swing.JTextField jTCPF;
    private javax.swing.JTextField jTCidade;
    private javax.swing.JTextField jTEmail;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTextField jTNumero;
    private javax.swing.JTextField jTPesquisar;
    private javax.swing.JTextField jTRG;
    private javax.swing.JTextField jTRua;
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
