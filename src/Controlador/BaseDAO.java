package Controlador;

import Exception.*;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class BaseDAO<T> {

    public EntityManager generarConexion() throws DAOException {

        Persistence p = new Persistence();

        try {
            EntityManagerFactory emf = p.createEntityManagerFactory("PomodoroPU");
            EntityManager em = emf.createEntityManager();
            return em;

        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            throw new DAOException(ex.getMessage(), ex);
        }
    }

    public abstract ArrayList<T> consultar() throws DAOException;

    public abstract void insertar(T entidad) throws DAOException;

    public abstract void actualizar(T entidad) throws DAOException;

    public abstract T consultarID(Long id) throws DAOException;

    public abstract void eliminar(Long id) throws DAOException;
}
