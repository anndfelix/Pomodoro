package Vista;

import java.io.IOException;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class RegistrarseDlg extends javax.swing.JDialog {


    public RegistrarseDlg() {

        initComponents();
        setLocationRelativeTo(null);
        TextoPreliminar();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtEmail = new javax.swing.JTextField();
        txtContraseña1 = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        botonCuentaNueva = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEmail.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 230, 340, 50));

        txtContraseña1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtContraseña1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txtContraseña1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 300, 340, 50));

        txtNombre.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNombre.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtNombreCaretUpdate(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 160, 340, 50));

        txtContraseña.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtContraseña.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtContraseña.setPreferredSize(new java.awt.Dimension(111, 25));
        txtContraseña.setToolTipText("");
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 370, 340, 50));

        botonCuentaNueva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/3.png"))); // NOI18N
        botonCuentaNueva.setText("jButton1");
        botonCuentaNueva.setBorder(null);
        botonCuentaNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCuentaNuevaActionPerformed(evt);
            }
        });
        jPanel1.add(botonCuentaNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 490, 400, 60));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 460, 340, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/4.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 150, -1, 452));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/4.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 60, -1, 452));

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

    private void botonCuentaNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCuentaNuevaActionPerformed

    }//GEN-LAST:event_botonCuentaNuevaActionPerformed

    private void txtNombreCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtNombreCaretUpdate

    }//GEN-LAST:event_txtNombreCaretUpdate

    private void TextoPreliminar() {
        TextPrompt placeholder1 = new TextPrompt("Correo electronico", txtEmail);
        TextPrompt placeholder2 = new TextPrompt("Contraseña", txtContraseña);
        TextPrompt placeholder3 = new TextPrompt("Número de celular", txtContraseña1);
        TextPrompt placeholder4 = new TextPrompt("Nombre completo", txtNombre);

        placeholder1.changeAlpha(0.45f);
        placeholder2.changeAlpha(0.45f);
        placeholder3.changeAlpha(0.45f);
        placeholder4.changeAlpha(0.45f);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCuentaNueva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtContraseña1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
