/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tugasvio;

/**
 *
 * @author PC RPL - R1
 */
public class modul5 extends javax.swing.JFrame {

    /**
     * Creates new form modul5
     */
    public modul5() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        eNama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        eAlamat = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbMieAyam = new javax.swing.JCheckBox();
        cbPangsit = new javax.swing.JCheckBox();
        cbSeblak = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        cbEsJeruk = new javax.swing.JCheckBox();
        cbTehManis = new javax.swing.JCheckBox();
        cbGreentea = new javax.swing.JCheckBox();
        bPesan = new javax.swing.JButton();
        bClear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaPesan = new javax.swing.JTextArea();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nama");

        jLabel2.setText("Alamat");

        jLabel3.setText("Makanan");

        cbMieAyam.setText("Mie Ayam");
        cbMieAyam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMieAyamActionPerformed(evt);
            }
        });

        cbPangsit.setText("Pangsit");

        cbSeblak.setText("Seblak");

        jLabel4.setText("Minuman");

        cbEsJeruk.setText("Es Jeruk");
        cbEsJeruk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEsJerukActionPerformed(evt);
            }
        });

        cbTehManis.setText("Teh Manis");

        cbGreentea.setText("Greentea");

        bPesan.setText("PESAN");
        bPesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPesanActionPerformed(evt);
            }
        });

        bClear.setText("CLEAR");
        bClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClearActionPerformed(evt);
            }
        });

        areaPesan.setColumns(20);
        areaPesan.setRows(5);
        jScrollPane1.setViewportView(areaPesan);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bPesan)
                        .addGap(168, 168, 168)
                        .addComponent(bClear)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbGreentea)
                            .addComponent(cbTehManis)
                            .addComponent(cbEsJeruk)
                            .addComponent(cbSeblak)
                            .addComponent(cbPangsit)
                            .addComponent(cbMieAyam)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(eNama)
                                .addComponent(eAlamat, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(eAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbMieAyam)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbPangsit)
                        .addGap(12, 12, 12)
                        .addComponent(cbSeblak)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbEsJeruk)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbTehManis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbGreentea))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bPesan)
                    .addComponent(bClear))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbMieAyamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMieAyamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMieAyamActionPerformed

    private void cbEsJerukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEsJerukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEsJerukActionPerformed

    private void bClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClearActionPerformed
        // TODO add your handling code here:
        areaPesan.setText(null);
    }//GEN-LAST:event_bClearActionPerformed

    private void bPesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPesanActionPerformed
        // TODO add your handling code here:
        int IndexCombo;
        String daftarMakanan="";
        String daftarMinuman="";
        if (cbMieAyam.isSelected()){
            daftarMakanan +=cbMieAyam.getText()+"";
       }if (cbPangsit.isSelected()){
            daftarMakanan +=cbPangsit.getText()+"";
       }if (cbSeblak.isSelected()){
            daftarMakanan +=cbSeblak.getText()+"";
       }
       if (cbEsJeruk.isSelected()){
            daftarMinuman +=cbEsJeruk.getText()+"";
        }if (cbTehManis.isSelected()){
            daftarMinuman +=cbTehManis.getText()+"";
        }
        if (cbGreentea.isSelected()){
            daftarMinuman +=cbGreentea.getText()+"";
        }
        areaPesan.setText(
             "NAMA :\t"+eNama.getText() + "\n"+
              "ALAMAT :\t"+eAlamat.getText() + "\n"+
               "MAKANAN :\t"+ daftarMakanan + "\n"+
                "MINUMAN :\t"+ daftarMinuman + "\n"
        );
    }//GEN-LAST:event_bPesanActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(modul5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modul5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modul5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modul5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modul5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaPesan;
    private javax.swing.JButton bClear;
    private javax.swing.JButton bPesan;
    private javax.swing.JCheckBox cbEsJeruk;
    private javax.swing.JCheckBox cbGreentea;
    private javax.swing.JCheckBox cbMieAyam;
    private javax.swing.JCheckBox cbPangsit;
    private javax.swing.JCheckBox cbSeblak;
    private javax.swing.JCheckBox cbTehManis;
    private javax.swing.JTextField eAlamat;
    private javax.swing.JTextField eNama;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
