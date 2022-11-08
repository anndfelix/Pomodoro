package Vista;

import Controlador.TareaDAO;
import Exception.DAOException;
import Modelo.Tarea;
import Modelo.Usuario;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class InicioPomodoroDlg extends javax.swing.JDialog {

    TareaDAO tdao = new TareaDAO();
    Usuario user = Vista.Login.usuario;

    public InicioPomodoroDlg() throws DAOException {
        initComponents();
        setLocationRelativeTo(null);
        tablaTareasPendientes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonCerrar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaPendientes = new javax.swing.JTable();
        botonCancelar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaProgreso = new javax.swing.JTable();
        botonContinuar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

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

        tablaPendientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tarea"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaPendientes.setDropMode(javax.swing.DropMode.ON);
        tablaPendientes.getTableHeader().setReorderingAllowed(false);
        tablaPendientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaPendientesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaPendientes);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 390, 310));

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(botonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 370, 140, 59));

        tablaProgreso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tarea"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProgreso.setDropMode(javax.swing.DropMode.ON);
        tablaProgreso.getTableHeader().setReorderingAllowed(false);
        tablaProgreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProgresoMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tablaProgreso);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, 390, 310));

        botonContinuar.setText("Iniciar");
        botonContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonContinuarActionPerformed(evt);
            }
        });
        jPanel1.add(botonContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 280, 140, 59));

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel2.setText("En progreso");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 180, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Pendientes");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 180, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1356, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed

    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_botonCerrarActionPerformed

    private void botonContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonContinuarActionPerformed

    }//GEN-LAST:event_botonContinuarActionPerformed

    private void tablaPendientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPendientesMouseClicked

        DefaultTableModel modeloProgreso = (DefaultTableModel) this.tablaProgreso.getModel();

        String descripcion;
        int fila = tablaPendientes.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe de seleccionar una fila", "Error de selección", JOptionPane.ERROR_MESSAGE);
        } else {
            descripcion = tablaPendientes.getValueAt(fila, 0).toString();

            try {
                ArrayList<Tarea> tareas = tdao.tareasIguales(user.getId(), descripcion);
                
            } catch (DAOException ex) {
                Logger.getLogger(InicioPomodoroDlg.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_tablaPendientesMouseClicked

    private void tablaProgresoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProgresoMouseClicked

    }//GEN-LAST:event_tablaProgresoMouseClicked

    private void tablaTareasPendientes() throws DAOException {
        DefaultTableModel modeloTabla = (DefaultTableModel) this.tablaPendientes.getModel();
        modeloTabla.setRowCount(0);
        ArrayList<Tarea> tareas = tdao.tareasPendientes(user.getId());

        for (Tarea t : tareas) {
            Object[] filaDatos = new Object[1];
            
            filaDatos[0] = t.getTitulo();
            
            modeloTabla.addRow(filaDatos);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonCerrar;
    private javax.swing.JButton botonContinuar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tablaPendientes;
    private javax.swing.JTable tablaProgreso;
    // End of variables declaration//GEN-END:variables

}
