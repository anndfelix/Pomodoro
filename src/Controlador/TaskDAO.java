package Controlador;

import Exception.DAOException;
import java.sql.*;
import java.util.ArrayList;
import Modelo.Task;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TaskDAO extends BaseDAO<Task> {

    @Override
    public ArrayList<Task> consultar() throws DAOException {

        ArrayList<Task> listaTasks = new ArrayList<>();

        try {
            Connection conexion = this.generarConexion();
            Statement comando = conexion.createStatement();
            ResultSet resultado = comando.executeQuery("SELECT id_tarea,titulo,descripcion,estado,fecha FROM tareas");

            while (resultado.next()) {

                Task task = new Task();

                task.setId_tarea(resultado.getInt("id_tarea"));
                task.setTitulo(resultado.getString("titulo"));
                task.setFecha(resultado.getTimestamp("fecha"));
                task.setEstado(resultado.getString("estado"));
                task.setDescripcion(resultado.getString("descripcion"));

                listaTasks.add(task);
            }
            conexion.close();
            return listaTasks;

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return listaTasks;
        }

    }

    @Override
    public void insertar(Task tarea) throws DAOException {
        try {
            Connection conexion = this.generarConexion();
            Statement comando = conexion.createStatement();
            comando.executeUpdate(String.format("INSERT INTO tareas(titulo,descripcion,estado,fecha) VALUES ('%s','%s','%s',CURRENT_TIMESTAMP)", tarea.getTitulo(), tarea.getDescripcion(), tarea.getEstado()));

            conexion.close();
            System.out.println("Se registro la tarea!");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void actualizar(Task tarea) throws DAOException {

        if (tarea.getId_tarea() == null) {
            try {
                throw new Exception("Tarea no encontrada");
            } catch (Exception ex) {
                Logger.getLogger(TaskDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        try {
            Connection conexion = this.generarConexion();
            Statement comando = conexion.createStatement();
            String codigoSQL = String.format(
                    "UPDATE tareas SET titulo='%s',descripcion='%s' WHERE id_tarea='%d'",
                    tarea.getTitulo(),
                    tarea.getDescripcion(),
                    tarea.getId_tarea()
            );

            int conteoRegistrosAfectados = comando.executeUpdate(codigoSQL);
            if (conteoRegistrosAfectados == 1) {
                System.out.println("Se actualizó la tarea");
            } else {
                System.out.println("No se pudo actualizar la tarea");
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

    }

    @Override
    public Task consultarID(Task tarea) throws DAOException {

        ArrayList<Task> listaTasks = new ArrayList<>();

        try {
            Connection conexion = this.generarConexion();
            Statement comando = conexion.createStatement();
            ResultSet resultado = comando.executeQuery(String.format("SELECT id_tarea,titulo,descripcion,estado,fecha FROM tareas WHERE id_tarea = %d", tarea.getId_tarea()));

            while (resultado.next()) {

                Task task = new Task();

                task.setId_tarea(resultado.getInt("id_tarea"));
                task.setTitulo(resultado.getString("titulo"));
                task.setFecha(resultado.getTimestamp("fecha"));
                task.setEstado(resultado.getString("estado"));
                task.setDescripcion(resultado.getString("descripcion"));

                listaTasks.add(task);

            }
            conexion.close();
            return listaTasks.get(0);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return listaTasks.get(0);
        }
    }

    @Override
    public void eliminar(Task tarea) throws DAOException {
        if (tarea.getId_tarea() == null) {
            try {
                throw new Exception("Tarea no encontrada");
            } catch (Exception ex) {
                Logger.getLogger(TaskDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        try {
            Connection conexion = this.generarConexion();
            Statement comando = conexion.createStatement();
            Integer conteoR = comando.executeUpdate(String.format("DELETE FROM tareas WHERE id_tarea = %d", tarea.getId_tarea()));

            conexion.close();

            if (conteoR == 1) {
                System.out.println("Se elimino la tarea: " + tarea.getTitulo());
            } else {
                throw new DAOException("No existe la tarea");
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public ArrayList<Task> consultarFechasAscendente() {

        ArrayList<Task> listaTasks = new ArrayList<>();

        try {
            Connection conexion = this.generarConexion();
            Statement comando = conexion.createStatement();
            ResultSet resultado = comando.executeQuery("SELECT id_tarea,titulo,descripcion,estado,fecha FROM tareas ORDER BY fecha ASC");

            while (resultado.next()) {

                Task task = new Task();

                task.setId_tarea(resultado.getInt("id_tarea"));
                task.setTitulo(resultado.getString("titulo"));
                task.setFecha(resultado.getTimestamp("fecha"));
                task.setEstado(resultado.getString("estado"));
                task.setDescripcion(resultado.getString("descripcion"));

                listaTasks.add(task);
            }
            conexion.close();
            return listaTasks;

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return listaTasks;
        }

    }

}
