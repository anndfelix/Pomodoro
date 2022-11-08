/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.SClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Carlos
 */
public class Temporizador extends javax.swing.JFrame {

    private int iteracionSesiones = 0;
    private int sesion = 0;
    private int maxSesiones = 1;
    private int tiempoDescansoLargo = 10; //segundos
    private int tiempoDescansoAux = 7; //segundos
    private int tiempoDescanso = tiempoDescansoAux; //segundos
    private int tiempoSesionAux = 9; // Segundos
    private int tiempoSesion = tiempoSesionAux; // Segundos
    private int tiempoTranscurrido = tiempoSesion * 1000; // Milisegundos
    private int h = tiempoTranscurrido / 3600000;
    private int m = (tiempoTranscurrido / 600000) % 60;
    private int s = (tiempoTranscurrido / 1000) % 60;

    boolean iniciarPresionado = false;
    String h_string = String.format("%02d", h);
    String m_string = String.format("%02d", m);
    String s_string = String.format("%02d", s);

    /**
     * Creates new form Temporizador
     */
    public Temporizador() {
        initComponents();
        this.setLocationRelativeTo(null);
        imprimeTemporizador();
        validaSesion();
        imprimeSesion();

    }

    private void imprimeTemporizador() {
        this.txtTemporizador.setText(h_string + ":" + m_string + ":" + s_string);
    }

    Timer timer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            imprimeSesion();
            if (tiempoTranscurrido != 0) {
                tiempoTranscurrido -= 1000;
                h = (tiempoTranscurrido / 3600000);
                m = (tiempoTranscurrido / 60000) % 60;
                s = (tiempoTranscurrido / 1000) % 60;

                String h_string = String.format("%02d", h);
                String m_string = String.format("%02d", m);
                String s_string = String.format("%02d", s);
                txtTemporizador.setText(h_string + ":" + m_string + ":" + s_string);

                if (h == 0 && m == 0 && s == 5) {
                    try {
                        Path rutaRelativa = Paths.get("src/iconos/Ding.wav");
                        SClip sonido = new SClip(rutaRelativa.toAbsolutePath().toString());
                        sonido.play();
                    } catch (Exception ex) {
                        System.out.println(ex.toString());
                    }
                }

            } else {
                pararTemporizadorEnCero();
            }
        }

        private void pararTemporizadorEnCero() {
            validaSesion();
            timer.stop();
            tiempoTranscurrido = tiempoSesion * 1000;
            h = (tiempoTranscurrido / 3600000);
            m = (tiempoTranscurrido / 60000) % 60;
            s = (tiempoTranscurrido / 1000) % 60;

            String h_string = String.format("%02d", h);
            String m_string = String.format("%02d", m);
            String s_string = String.format("%02d", s);
            txtTemporizador.setText(h_string + ":" + m_string + ":" + s_string);
            btnIniciar.setText("Iniciar");
            iniciarPresionado = false;

            int opcion = JOptionPane.showConfirmDialog(null, "¿Quieres seguir con las sesiones?", "Sesion Pomodoro", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "¡Continuemos con la siguiente sesion!");
                iniciarTemporizador();
                System.out.println(sesion);
            } else if (opcion == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "No te rindas, ¡suerte en tu proxima sesion!");
            }
        }

    });

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnIniciar = new javax.swing.JButton();
        txtTemporizador = new javax.swing.JLabel();
        btnReiniciar = new javax.swing.JButton();
        txtTemporizadorPomodoro = new javax.swing.JLabel();
        txtNumSesion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        btnIniciar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        txtTemporizador.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtTemporizador.setForeground(new java.awt.Color(204, 204, 204));
        txtTemporizador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTemporizador.setText("0");

        btnReiniciar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        txtTemporizadorPomodoro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtTemporizadorPomodoro.setForeground(new java.awt.Color(204, 204, 204));
        txtTemporizadorPomodoro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTemporizadorPomodoro.setText("Temporizador Pomodoro");

        txtNumSesion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtNumSesion.setForeground(new java.awt.Color(204, 204, 204));
        txtNumSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNumSesion.setText("Sesion");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtTemporizadorPomodoro, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(txtTemporizador, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(txtNumSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(txtTemporizadorPomodoro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(txtTemporizador)
                .addGap(32, 32, 32)
                .addComponent(txtNumSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btnReiniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(95, 95, 95))
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

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        iniciarTemporizador();
    }//GEN-LAST:event_btnIniciarActionPerformed

    public void iniciarTemporizador() {
        if (iniciarPresionado == false) {
            this.btnIniciar.setText("Parar");
            iniciarPresionado = true;
            timer.start();
        } else {
            btnIniciar.setText("Iniciar");
            iniciarPresionado = false;
            timer.stop();
        }
    }

    private void validaSesion() {
        if (sesion < maxSesiones) {
            sesion++;
        } else if (sesion == maxSesiones) {
            sesion = 0;
            validaIteracionSesiones();
        }
        imprimeSesion();
    }

    private void validaIteracionSesiones() {
        if (iteracionSesiones < 3) {
            iteracionSesiones++;
        } else {
            iteracionSesiones = 0;
        }
        System.out.println("Iteracion " + iteracionSesiones + "Completada");
    }

    private void imprimeSesion() {
        if (iteracionSesiones < 3) {
            if (sesion == 0) {
                txtNumSesion.setText("Sesion de descanso");
                tiempoSesion = tiempoDescanso;
            } else {
                txtNumSesion.setText("Sesion " + sesion + "/" + maxSesiones);
                tiempoSesion = 9;
            }
        } else {
            txtNumSesion.setText("Sesion de descanso");
            tiempoSesion = tiempoDescansoLargo;
            iteracionSesiones = 0;
        }

    }

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        timer.stop();
        tiempoTranscurrido = tiempoSesion * 1000;
        h = (tiempoTranscurrido / 3600000);
        m = (tiempoTranscurrido / 60000) % 60;
        s = (tiempoTranscurrido / 1000) % 60;

        String h_string = String.format("%02d", h);
        String m_string = String.format("%02d", m);
        String s_string = String.format("%02d", s);
        txtTemporizador.setText(h_string + ":" + m_string + ":" + s_string);
        this.btnIniciar.setText("Iniciar");
        iniciarPresionado = false;
    }//GEN-LAST:event_btnReiniciarActionPerformed

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
            java.util.logging.Logger.getLogger(Temporizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Temporizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Temporizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Temporizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Temporizador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtNumSesion;
    private javax.swing.JLabel txtTemporizador;
    private javax.swing.JLabel txtTemporizadorPomodoro;
    // End of variables declaration//GEN-END:variables

}
