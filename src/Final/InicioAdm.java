package Final;

public class InicioAdm extends javax.swing.JFrame {

    public InicioAdm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTinv = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BTcerrar = new javax.swing.JButton();
        BTVenta = new javax.swing.JButton();
        BTVenta1 = new javax.swing.JButton();
        BTVenta2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        BTVenta3 = new javax.swing.JButton();
        BTVenta4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BTinv.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BTinv.setText("Eventos");
        BTinv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTinvActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EMSA");

        BTcerrar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BTcerrar.setText("Cerrar sesión");
        BTcerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTcerrarActionPerformed(evt);
            }
        });

        BTVenta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BTVenta.setText("Compras");
        BTVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTVentaActionPerformed(evt);
            }
        });

        BTVenta1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BTVenta1.setText("Usuarios");
        BTVenta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTVenta1ActionPerformed(evt);
            }
        });

        BTVenta2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BTVenta2.setText("Ver Eventos");
        BTVenta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTVenta2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("usuario Administrador");

        BTVenta3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BTVenta3.setText("Ver Boletos");
        BTVenta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTVenta3ActionPerformed(evt);
            }
        });

        BTVenta4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BTVenta4.setText("Ver Usuarios");
        BTVenta4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTVenta4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTcerrar)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel2))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(BTinv, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(BTVenta1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BTVenta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BTVenta2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BTVenta3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BTVenta4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel1)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(34, 34, 34)
                .addComponent(BTinv)
                .addGap(18, 18, 18)
                .addComponent(BTVenta)
                .addGap(18, 18, 18)
                .addComponent(BTVenta2)
                .addGap(18, 18, 18)
                .addComponent(BTVenta3)
                .addGap(18, 18, 18)
                .addComponent(BTVenta4)
                .addGap(18, 18, 18)
                .addComponent(BTVenta1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTcerrar)
                .addGap(51, 51, 51))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTcerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTcerrarActionPerformed
        LoginAdm login = new LoginAdm();
        login.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_BTcerrarActionPerformed

    //Eventos
    private void BTinvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTinvActionPerformed
        EVENTOS inv = new EVENTOS();
        inv.setVisible(true);

    }//GEN-LAST:event_BTinvActionPerformed

    //Ventas
    private void BTVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTVentaActionPerformed
        COMPRAS vn = new COMPRAS();
        vn.setVisible(true);
    }//GEN-LAST:event_BTVentaActionPerformed

    private void BTVenta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTVenta1ActionPerformed
        USUARIOS br = new USUARIOS();
        br.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BTVenta1ActionPerformed

    //Ver Evento
    private void BTVenta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTVenta2ActionPerformed
        VerEvento vr = new VerEvento();
        vr.setVisible(true);
    }//GEN-LAST:event_BTVenta2ActionPerformed

    private void BTVenta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTVenta3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTVenta3ActionPerformed

    private void BTVenta4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTVenta4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTVenta4ActionPerformed

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
            java.util.logging.Logger.getLogger(InicioAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTVenta;
    private javax.swing.JButton BTVenta1;
    private javax.swing.JButton BTVenta2;
    private javax.swing.JButton BTVenta3;
    private javax.swing.JButton BTVenta4;
    private javax.swing.JButton BTcerrar;
    private javax.swing.JButton BTinv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
