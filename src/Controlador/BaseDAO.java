package Controlador;

import Exception.*;
import java.util.ArrayList;
import java.sql.*;

public abstract class BaseDAO<T> {

    //CARLOS
    /*
    private static String user = "root";
    private static String pass = "Carlosalv089";
    private static String cadenaConexion = "jdbc:mysql://localhost/pomodorobd";
    */
    
    //POLLO
    private static String user = "root";
    private static String pass = "password";
    private static String cadenaConexion = "jdbc:mysql://localhost/pomodorobd";
    

    protected Connection generarConexion() throws SQLException {
        return DriverManager.getConnection(cadenaConexion, user, pass);
    }

    public abstract ArrayList<T> consultar() throws DAOException;

    public abstract void insertar(T entidad) throws DAOException;

    public abstract void actualizar(T entidad) throws DAOException;

    public abstract T consultarID(T entidad) throws DAOException;

    public abstract void eliminar(T entidad) throws DAOException;
}
