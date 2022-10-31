package Vista;

import Controlador.TareaDAO;
import Exception.DAOException;
import Modelo.Tarea;
import Modelo.Usuario;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PomodoroDlg extends javax.swing.JDialog {

    TareaDAO tdao = new TareaDAO();
    Usuario user = Vista.Login.usuario;

    public PomodoroDlg() throws DAOException {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonCerrar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaTareas = new javax.swing.JTable();
        botonContinuar = new javax.swing.JButton();
        txtContenido = new javax.swing.JTextArea();
        txtTitulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        botonAceptar = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/titulo3.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 65, 326, 107));

        botonCerrar.setText("Cerrar");
        botonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(botonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 60, -1, 51));

        tablaTareas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tarea", "Descripcion", "Estatus"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablaTareas);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 530, 356));

        botonContinuar.setText("Continuar");
        botonContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonContinuarActionPerformed(evt);
            }
        });
        jPanel1.add(botonContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 560, 140, 59));

        txtContenido.setColumns(20);
        txtContenido.setForeground(new java.awt.Color(0, 0, 0));
        txtContenido.setRows(5);
        jPanel1.add(txtContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 260, 260, 180));

        txtTitulo.setForeground(new java.awt.Color(0, 0, 0));
        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });
        jPanel1.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 190, 260, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/tarea.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, -1, 330));

        botonAceptar.setText("Agregar");
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(botonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 500, 140, 59));

        botonLimpiar.setText("Limpiar");
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(botonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 500, 140, 59));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1356, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        try {
            this.crearTarea();
        } catch (DAOException ex) {
            Logger.getLogger(PomodoroDlg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonAceptarActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_botonCerrarActionPerformed

    private void botonContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonContinuarActionPerformed
        try {
            tablaTareasPendientes();
        } catch (DAOException ex) {
            Logger.getLogger(PomodoroDlg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonContinuarActionPerformed

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
     
    }//GEN-LAST:event_txtTituloActionPerformed

    private void tablaTareasPendientes() throws DAOException {
        DefaultTableModel modeloTabla = (DefaultTableModel) this.tablaTareas.getModel();
        modeloTabla.setRowCount(0);
        ArrayList<Tarea> tareas = tdao.tareasPendientes(user.getId());

        for (Tarea t : tareas) {
            Object[] filaDatos = new Object[3];

            filaDatos[0] = t.getTitulo();
            filaDatos[1] = t.getDescripcion();
            filaDatos[2] = t.getEstado();

            modeloTabla.addRow(filaDatos);
        }
    }

    private void limpiar() {
        this.txtContenido.setText("");
        this.txtTitulo.setText("");
    }

    private void crearTarea() throws DAOException {
        String titulo = this.txtTitulo.getText();
        String descripcion = this.txtContenido.getText();
        String estado = "Pendiente";

        List<Tarea> tareas = tdao.consultar();
        List<Tarea> ts = new ArrayList<>();

        Tarea tarea = new Tarea(titulo, descripcion);

        for (Tarea t : tareas) {
            Tarea tAgregar = new Tarea(t.getTitulo(), t.getDescripcion());
            ts.add(tAgregar);
        }

        if (ts.contains(tarea)) {
            JOptionPane.showMessageDialog(this, "La tarea ya existe.",
                    "Error al agregar tarea", JOptionPane.ERROR_MESSAGE);
        } else {

            Tarea tareaAgregar = new Tarea(titulo, new GregorianCalendar(), descripcion, estado, user);

            if (descripcion.length() > 100) {
                JOptionPane.showMessageDialog(this, "La descripcion debe tener max 100 caracteres.",
                        "Error al agregar tarea", JOptionPane.ERROR_MESSAGE);
            } else {
                if (!descripcion.isEmpty() || !titulo.isEmpty()) {
                    tdao.insertar(tareaAgregar);
                    JOptionPane.showMessageDialog(this, ("Se ha agregado la tarea."),
                            "Tarea agregada", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Debe llenar la informacion requerida.",
                            "Error al agregar tarea", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonCerrar;
    private javax.swing.JButton botonContinuar;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tablaTareas;
    private javax.swing.JTextArea txtContenido;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
