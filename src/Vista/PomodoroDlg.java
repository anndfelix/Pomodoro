package Vista;

import Controlador.TaskDAO;
import Exception.DAOException;
import Modelo.Task;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyledDocument;

public class PomodoroDlg extends javax.swing.JDialog {

    TaskDAO tdao = new TaskDAO();

    public PomodoroDlg() {
        try {
            initComponents();
            tareasPendientes();
            tareasEnProgreso();
            tareasTerminadas();
            setLocationRelativeTo(null);
            TextPrompt ph1 = new TextPrompt("Nombre de la tarea", txtTitulo);
            TextPrompt ph2 = new TextPrompt("Descripcion de la tarea", txtContenido);

            ph1.changeAlpha(0.45f);
            ph2.changeAlpha(0.45f);

        } catch (DAOException ex) {
            Logger.getLogger(PomodoroDlg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtContenido = new javax.swing.JTextArea();
        txtTitulo = new javax.swing.JTextField();
        botonAceptar = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtId = new javax.swing.JLabel();
        txtEstado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelTerminadas = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        panelProgreso = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        panelPendientes = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/titulo3.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 65, 326, 107));

        txtContenido.setColumns(20);
        txtContenido.setForeground(new java.awt.Color(0, 0, 0));
        txtContenido.setRows(5);
        jPanel1.add(txtContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 260, 180));

        txtTitulo.setForeground(new java.awt.Color(0, 0, 0));
        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });
        jPanel1.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 260, 50));

        botonAceptar.setText("Agregar");
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(botonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 140, 59));

        botonLimpiar.setText("Limpiar");
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(botonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, 140, 59));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/terminadas.png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(150, 78));
        jLabel2.setMinimumSize(new java.awt.Dimension(150, 78));
        jLabel2.setPreferredSize(new java.awt.Dimension(150, 78));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 80, 150, 24));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/pendientes.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 150, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/enprogreso.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 80, 150, 20));

        txtId.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 90, 30));
        jPanel1.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 140, 30));

        jScrollPane1.setViewportView(panelTerminadas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 120, 260, 520));

        jScrollPane2.setViewportView(panelProgreso);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 120, 260, 520));

        jScrollPane3.setViewportView(panelPendientes);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 260, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1364, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed

        try {

            if (!txtId.getText().isEmpty()) {
                this.actualizarTarea();
            } else {
                this.crearTarea();
            }

            limpiar();
            tareasPendientes();
            tareasEnProgreso();
            tareasTerminadas();
            this.txtContenido.setEditable(true);

        } catch (DAOException ex) {
            Logger.getLogger(PomodoroDlg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonAceptarActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed

    }//GEN-LAST:event_txtTituloActionPerformed

    private void limpiar() {
        this.txtContenido.setText("");
        this.txtTitulo.setText("");
        this.txtId.setText("");
    }

    private void crearTarea() throws DAOException {
        String titulo = this.txtTitulo.getText();
        String descripcion = this.txtContenido.getText();
        String estado = "Pendiente";
        boolean existe = false;

        ArrayList<Task> tareas = tdao.consultar();

        Task task = new Task(titulo, Timestamp.from(Instant.MIN), estado, descripcion);
        task.setFechaProgreso(Timestamp.from(Instant.MIN));

        for (Task t : tareas) {

            if (!t.getEstado().equals("Terminada")) {
                if (t.getDescripcion().equals(task.getDescripcion()) || t.getTitulo().equals(task.getTitulo())) {
                    existe = true;
                    break;
                }
            }
        }

        if (existe == true) {
            JOptionPane.showMessageDialog(this, "Esta tarea ya esta existe.",
                    "Error al agregar tarea", JOptionPane.ERROR_MESSAGE);
        } else {
            if (descripcion.length() > 100) {
                JOptionPane.showMessageDialog(this, "La descripcion debe tener max 100 caracteres.",
                        "Error al agregar tarea", JOptionPane.ERROR_MESSAGE);
            } else {
                if (!descripcion.isEmpty() || !titulo.isEmpty()) {
                    tdao.insertar(task);
                    JOptionPane.showMessageDialog(this, ("Se ha agregado la tarea."),
                            "Tarea agregada", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Debe llenar la informacion requerida.",
                            "Error al agregar tarea", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    private void actualizarTarea() throws DAOException {
        Integer id = Integer.parseInt(this.txtId.getText());
        String titulo = this.txtTitulo.getText();
        String descripcion = this.txtContenido.getText();
        String estado = this.txtEstado.getText();
        boolean existe = false;

        ArrayList<Task> tareas = tdao.consultar();

        Task task = new Task(id, titulo, Timestamp.from(Instant.MIN), estado, descripcion);
        task.setFechaProgreso(Timestamp.from(Instant.MIN));
        for (Task t : tareas) {

            if (!t.getEstado().equals("Terminada")) {
                if (t.getTitulo().equals(task.getTitulo())) {
                    existe = true;
                    break;
                }
            }
        }

        if (existe == true) {
            JOptionPane.showMessageDialog(this, "Esta tarea ya esta existe.",
                    "Error al actualizar tarea", JOptionPane.ERROR_MESSAGE);
        } else {
            if (descripcion.length() > 100) {
                JOptionPane.showMessageDialog(this, "La descripcion debe tener max 100 caracteres.",
                        "Error al actualizar tarea", JOptionPane.ERROR_MESSAGE);
            } else {
                if (!descripcion.isEmpty() || !titulo.isEmpty()) {

                    int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea modificar la tarea? ");

                    if (JOptionPane.OK_OPTION == confirmar) {
                        tdao.actualizar(task);

                        JOptionPane.showMessageDialog(this, ("Se ha actualizado la tarea."),
                                "Tarea actualizada", JOptionPane.INFORMATION_MESSAGE);
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "Debe llenar la informacion requerida.",
                            "Error al actualizar tarea", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    private void tareasPendientes() throws DAOException {

        List<Task> tareas = tdao.consultar();

        panelPendientes.setText("");

        StyledDocument doc = panelPendientes.getStyledDocument();

        for (Task task : tareas) {

            if (task.getEstado().equals("Pendiente")) {
                JButton botonPendiente = new JButton("Iniciar");
                JButton botonEliminar = new JButton("Eliminar");
                JButton botonModificar = new JButton("Modificar");

                botonPendiente.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            task.setEstado("En progreso");
                            tdao.actualizar(task);
                            tareasEnProgreso();
                            tareasPendientes();
                        } catch (DAOException ex) {
                            Logger.getLogger(PomodoroDlg.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                });

                botonEliminar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {

                            int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea eliminar la tarea? ");

                            if (JOptionPane.OK_OPTION == confirmar) {

                                tdao.eliminar(task);
                                tareasEnProgreso();
                                tareasPendientes();
                                tareasTerminadas();

                                JOptionPane.showMessageDialog(null, ("Se ha eliminado la tarea."), "Tarea eliminada con éxito", JOptionPane.INFORMATION_MESSAGE);
                            }

                        } catch (DAOException ex) {
                            Logger.getLogger(PomodoroDlg.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                });

                botonModificar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        txtTitulo.setText(task.getTitulo());
                        txtContenido.setText(task.getDescripcion());
                        txtId.setText(task.getId_tarea().toString());
                        txtEstado.setText(task.getEstado());
                        txtContenido.setEditable(false);

                    }
                });

                try {
                    doc.insertString(doc.getLength(), task.toString(), null);
                    doc.insertString(doc.getLength(), "\n", null);
                    panelPendientes.setCaretPosition(panelPendientes.getDocument().getLength());
                    panelPendientes.insertComponent(botonPendiente);
                    panelPendientes.insertComponent(botonModificar);
                    panelPendientes.insertComponent(botonEliminar);
                    doc.insertString(doc.getLength(), "\n", null);
                    doc.insertString(doc.getLength(), "\n", null);

                } catch (BadLocationException ex) {

                }
            }
        }

        panelPendientes.setEditable(
                false);
    }

    private void tareasTerminadas() throws DAOException {

        List<Task> tareas = tdao.consultarFechasAscendente();

        panelTerminadas.setText("");
        StyledDocument doc = panelTerminadas.getStyledDocument();

        for (Task task : tareas) {

            if (task.getEstado().equals("Terminada")) {

                String taskString = "Titulo: " + task.getTitulo()
                        + "\nDescripcion: " + task.getDescripcion()
                        + "\n" + task.getFechaTerminada().toString();

                try {
                    doc.insertString(doc.getLength(), taskString, null);
                    doc.insertString(doc.getLength(), "\n", null);
                    panelTerminadas.setCaretPosition(panelTerminadas.getDocument().getLength());
                    doc.insertString(doc.getLength(), "\n", null);
                    doc.insertString(doc.getLength(), "\n", null);

                } catch (BadLocationException ex) {

                }
            }
        }

        panelTerminadas.setEditable(false);
    }

    private void tareasEnProgreso() throws DAOException {

        List<Task> tareas = tdao.consultarFechasAscendenteProgreso();

        panelProgreso.setText("");

        StyledDocument doc = panelProgreso.getStyledDocument();

        for (Task task : tareas) {

            if (task.getEstado().equals("En progreso")) {
                JButton botonPendiente = new JButton("Regresar");
                JButton botonTerminar = new JButton("Terminar");
                JButton botonIniciar = new JButton("Iniciar");
                JButton botonEliminar = new JButton("Eliminar");
                JButton botonModificar = new JButton("Modificar");

                botonTerminar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {

                            int confirmar = JOptionPane.showConfirmDialog(null,
                                    "¿Desea terminar la tarea? ");

                            if (JOptionPane.OK_OPTION == confirmar) {
                                task.setEstado("Terminada");
                                tdao.actualizar(task);
                                tareasTerminadas();
                                tareasEnProgreso();

                                JOptionPane.showMessageDialog(null, ("Se ha terminado la tarea."),
                                        "Tarea terminada", JOptionPane.INFORMATION_MESSAGE);

                            }

                        } catch (DAOException ex) {
                            Logger.getLogger(PomodoroDlg.class
                                    .getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                });

                botonPendiente.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {

                            task.setEstado("Pendiente");
                            tdao.actualizar(task);
                            JOptionPane.showMessageDialog(null, ("Se ha regresado la tarea."), "Tarea pendiente", JOptionPane.INFORMATION_MESSAGE);
                            tareasPendientes();
                            tareasEnProgreso();

                        } catch (DAOException ex) {
                            Logger.getLogger(PomodoroDlg.class
                                    .getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                });

                botonIniciar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Temporizador temporizador = new Temporizador();
                        temporizador.setVisible(true);
                    }
                });

                botonEliminar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        try {
                            int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea eliminar la tarea? ");

                            if (JOptionPane.OK_OPTION == confirmar) {

                                tdao.eliminar(task);
                                tareasEnProgreso();
                                tareasPendientes();
                                tareasTerminadas();

                                JOptionPane.showMessageDialog(null, ("Se ha eliminado la tarea."), "Tarea eliminada con éxito", JOptionPane.INFORMATION_MESSAGE);

                            }

                        } catch (DAOException ex) {
                            Logger.getLogger(PomodoroDlg.class
                                    .getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                });

                botonModificar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        txtTitulo.setText(task.getTitulo());
                        txtContenido.setText(task.getDescripcion());
                        txtId.setText(task.getId_tarea().toString());
                        txtEstado.setText(task.getEstado());
                        txtContenido.setEditable(false);
                    }
                });

                try {
                    doc.insertString(doc.getLength(), task.toString(), null);
                    doc.insertString(doc.getLength(), "\n", null);
                    panelProgreso.setCaretPosition(panelProgreso.getDocument().getLength());
                    panelProgreso.insertComponent(botonPendiente);
                    panelProgreso.insertComponent(botonIniciar);
                    panelProgreso.insertComponent(botonModificar);
                    doc.insertString(doc.getLength(), "\n", null);
                    panelProgreso.insertComponent(botonTerminar);
                    panelProgreso.insertComponent(botonEliminar);
                    doc.insertString(doc.getLength(), "\n", null);
                    doc.insertString(doc.getLength(), "\n", null);

                } catch (BadLocationException ex) {

                }
            }
        }

        panelProgreso.setEditable(false);
    }

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
            java.util.logging.Logger.getLogger(Temporizador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Temporizador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Temporizador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Temporizador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PomodoroDlg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane panelPendientes;
    private javax.swing.JTextPane panelProgreso;
    private javax.swing.JTextPane panelTerminadas;
    private javax.swing.JTextArea txtContenido;
    private javax.swing.JLabel txtEstado;
    private javax.swing.JLabel txtId;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables

}
