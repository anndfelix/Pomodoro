package Controlador;

import Exception.DAOException;
import Modelo.Tarea;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class TareaDAO extends BaseDAO<Tarea> {

    public ArrayList<Tarea> consultar() throws DAOException {

        EntityManager em = this.generarConexion();
        Query consulta = em.createQuery("SELECT t FROM Tarea t");

        List<Tarea> tareas = consulta.getResultList();
        return new ArrayList<>(tareas);
    }

    @Override
    public void insertar(Tarea tarea) throws DAOException {
        try {
            EntityManager em = this.generarConexion();
            em.getTransaction().begin();
            em.persist(tarea);
            em.getTransaction().commit();
        } catch (DAOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void actualizar(Tarea tarea) throws DAOException {

        EntityManager em = this.generarConexion();
        em.getTransaction().begin();

        Tarea t = em.find(Tarea.class, tarea.getId());

        try {
            if (t != null) {
                t.setTitulo(tarea.getTitulo());
                t.setDescripcion(tarea.getDescripcion());
                t.setEstado(tarea.getEstado());
                t.setUsuario(tarea.getUsuario());
                t.setFecha(tarea.getFecha());
                em.persist(t);

            } else {
                throw new DAOException("La tarea " + tarea.getId() + " no existe!");
            }
        } catch (DAOException ex) {
            System.out.println(ex.getMessage());
        }

        em.getTransaction().commit();
    }

    @Override
    public Tarea consultarID(Long id) throws DAOException {

        EntityManager em = this.generarConexion();
        Tarea tarea = em.find(Tarea.class, id);

        try {
            if (tarea != null) {
                return tarea;
            } else {
                throw new DAOException("La tarea " + id + " no existe!");
            }
        } catch (DAOException ex) {
            System.out.println(ex.getMessage());
            return tarea;
        }

    }

    @Override
    public void eliminar(Long id) throws DAOException {

        EntityManager em = this.generarConexion();
        em.getTransaction().begin();

        Tarea tarea = em.find(Tarea.class, id);

        try {

            if (tarea != null) {
                em.remove(tarea);
                System.out.println("Se elimino la tarea: " + tarea.getTitulo());
            } else {
                throw new DAOException("La tarea " + id + " no existe!");
            }

        } catch (DAOException ex) {
            System.out.println(ex.getMessage());
        }
        em.getTransaction().commit();
    }
}
