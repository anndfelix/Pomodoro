

package Vista;

public class Login extends javax.swing.JDialog {

    public Login(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        TextoPreliminar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonIniciarSesion = new javax.swing.JButton();
        botonCuentaNueva = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtEmail = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonIniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/2.png"))); // NOI18N
        botonIniciarSesion.setText("jButton1");
        botonIniciarSesion.setBorder(null);
        botonIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(botonIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 310, 390, 60));

        botonCuentaNueva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/3.png"))); // NOI18N
        botonCuentaNueva.setText("jButton1");
        botonCuentaNueva.setBorder(null);
        botonCuentaNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCuentaNuevaActionPerformed(evt);
            }
        });
        jPanel1.add(botonCuentaNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 430, 400, 60));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 400, 340, 30));

        txtEmail.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 160, 340, 50));

        txtContraseña.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtContraseña.setToolTipText("");
        txtContraseña.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtContraseña.setPreferredSize(new java.awt.Dimension(111, 25));
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 230, 340, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/4.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 80, -1, 452));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1344, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarSesionActionPerformed

    }//GEN-LAST:event_botonIniciarSesionActionPerformed

    private void botonCuentaNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCuentaNuevaActionPerformed
        RegistrarseDlg registrarse = new RegistrarseDlg();
        registrarse.setVisible(true);
        
        if (registrarse.isVisible()) {
                dispose();
            }

    }//GEN-LAST:event_botonCuentaNuevaActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed

    }//GEN-LAST:event_txtEmailActionPerformed

    
    private void TextoPreliminar() {
        TextPrompt placeholder1 = new TextPrompt("Correo electronico", txtEmail);
        TextPrompt placeholder2 = new TextPrompt("Contraseña", txtContraseña);

        placeholder1.changeAlpha(0.45f);
        placeholder2.changeAlpha(0.45f);
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login dialog = new Login(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCuentaNueva;
    private javax.swing.JButton botonIniciarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
}
