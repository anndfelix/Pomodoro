
package Vista;


public class PrincipalDlg extends javax.swing.JDialog {

    public PrincipalDlg() {
        initComponents();
        setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonPomodoro = new javax.swing.JButton();
        botonCerrarSesion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        botonPerfil = new javax.swing.JButton();
        botonHistorial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        botonPomodoro.setBackground(new java.awt.Color(0, 0, 0));
        botonPomodoro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/boton2.png"))); // NOI18N
        botonPomodoro.setToolTipText("");
        botonPomodoro.setBorderPainted(false);
        botonPomodoro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPomodoroActionPerformed(evt);
            }
        });

        botonCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cerrarsesion.png"))); // NOI18N
        botonCerrarSesion.setBorderPainted(false);
        botonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarSesionActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/logo3.png"))); // NOI18N

        botonPerfil.setBackground(new java.awt.Color(0, 0, 0));
        botonPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/boton1.png"))); // NOI18N
        botonPerfil.setToolTipText("");
        botonPerfil.setBorderPainted(false);
        botonPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPerfilActionPerformed(evt);
            }
        });

        botonHistorial.setBackground(new java.awt.Color(0, 0, 0));
        botonHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/boton3.png"))); // NOI18N
        botonHistorial.setToolTipText("");
        botonHistorial.setBorderPainted(false);
        botonHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonHistorialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(botonPomodoro, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botonPerfil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(botonCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(botonPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(botonHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(botonPomodoro, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(botonCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonPomodoroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPomodoroActionPerformed
       
    }//GEN-LAST:event_botonPomodoroActionPerformed

    private void botonHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonHistorialActionPerformed
        
    }//GEN-LAST:event_botonHistorialActionPerformed

    private void botonPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPerfilActionPerformed
        
    }//GEN-LAST:event_botonPerfilActionPerformed

    private void botonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarSesionActionPerformed
        
    }//GEN-LAST:event_botonCerrarSesionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCerrarSesion;
    private javax.swing.JButton botonHistorial;
    private javax.swing.JButton botonPerfil;
    private javax.swing.JButton botonPomodoro;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
