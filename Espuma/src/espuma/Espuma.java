package espuma;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Espuma extends javax.swing.JFrame {

    public Espuma() {
        super("Calculador");
        this.setResizable(false);
        initComponents();
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLAltura = new javax.swing.JLabel();
        jLComp = new javax.swing.JLabel();
        jLLargura = new javax.swing.JLabel();
        jTLargura = new javax.swing.JTextField();
        jTComp = new javax.swing.JTextField();
        jTAltura = new javax.swing.JTextField();
        jLTotal = new javax.swing.JLabel();
        jTTotal = new javax.swing.JTextField();
        jLCab = new javax.swing.JLabel();
        jBCalc = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLAltura.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLAltura.setText("Altura:");

        jLComp.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLComp.setText("Comprimento:");

        jLLargura.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLLargura.setText("Largura:");

        jTLargura.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jTComp.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jTAltura.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLTotal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLTotal.setText("Total:");

        jTTotal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLCab.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLCab.setText("Orçamento de Espuma");

        jBCalc.setText("Calcular");
        jBCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCalcActionPerformed(evt);
            }
        });

        jBSair.setText("Cancelar");
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBCalc)
                .addGap(18, 18, 18)
                .addComponent(jBSair)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLLargura)
                                    .addComponent(jLAltura))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTLargura, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLTotal)
                                    .addComponent(jLComp))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTComp, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLCab)))
                .addContainerGap(169, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBCalc, jBSair});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLCab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLAltura))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLLargura)
                    .addComponent(jTLargura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLComp)
                    .addComponent(jTComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLTotal)
                    .addComponent(jTTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCalc)
                    .addComponent(jBSair))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {                                       
        dispose();
    }                                      

    private void jBCalcActionPerformed(java.awt.event.ActionEvent evt) {                                       
        try {
            double alt = Double.parseDouble(jTAltura.getText());
            double comp = Double.parseDouble(jTComp.getText());
            double larg = Double.parseDouble(jTLargura.getText());
            double precoEspuma = (((comp * larg) * alt) * 2220);     
            jTTotal.setText(String.format("%.2f", precoEspuma));
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Erro, Preencha todos os campos.\n" + ex);
        }
    }                                      

    public static void main(String args[]) {
                Espuma p = new Espuma();
                p.setVisible(true);
    }
    
    // Variables declaration - do not modify
    private javax.swing.JButton jBCalc;
    private javax.swing.JButton jBSair;
    private javax.swing.JLabel jLAltura;
    private javax.swing.JLabel jLCab;
    private javax.swing.JLabel jLComp;
    private javax.swing.JLabel jLLargura;
    private javax.swing.JLabel jLTotal;
    private javax.swing.JTextField jTAltura;
    private javax.swing.JTextField jTComp;
    private javax.swing.JTextField jTLargura;
    private javax.swing.JTextField jTTotal;
    // End of variables declaration
}
