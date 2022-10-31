package Controlador;

import Exception.DAOException;
import Modelo.Pomodoro;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class PomodoroDAO extends BaseDAO<Pomodoro> {
    
    public ArrayList<Pomodoro> consultar() throws DAOException {
        
        EntityManager em = this.generarConexion();
        Query consulta = em.createQuery("SELECT p FROM Pomodoro p");
        
        List<Pomodoro> pomodoros = consulta.getResultList();
        return new ArrayList<>(pomodoros);
    }
    
    @Override
    public void insertar(Pomodoro pomodoro) throws DAOException {
        try {
            EntityManager em = this.generarConexion();
            em.getTransaction().begin();
            em.persist(pomodoro);
            em.getTransaction().commit();
        } catch (DAOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    @Override
    public void actualizar(Pomodoro pomodoro) throws DAOException {
        
        EntityManager em = this.generarConexion();
        em.getTransaction().begin();
        
        Pomodoro p = em.find(Pomodoro.class, pomodoro.getId());
        
        try {
            if (p != null) {
                p.setTarea(pomodoro.getTarea());
                p.setUsuario(pomodoro.getUsuario());
                em.persist(p);
                
            } else {
                throw new DAOException("El pomodoro " + pomodoro.getId() + " no existe!");
            }
        } catch (DAOException ex) {
            System.out.println(ex.getMessage());
        }
        
        em.getTransaction().commit();
    }
    
    @Override
    public Pomodoro consultarID(Long id) throws DAOException {
        
        EntityManager em = this.generarConexion();
        Pomodoro pomodoro = em.find(Pomodoro.class, id);
        
        try {
            if (pomodoro != null) {
                return pomodoro;
            } else {
                throw new DAOException("El pomodoro " + id + " no existe!");
            }
        } catch (DAOException ex) {
            System.out.println(ex.getMessage());
            return pomodoro;
        }
        
    }
    
    @Override
    public void eliminar(Long id) throws DAOException {
        
        EntityManager em = this.generarConexion();
        em.getTransaction().begin();
        
        Pomodoro pomodoro = em.find(Pomodoro.class, id);
        
        try {
            
            if (pomodoro != null) {
                em.remove(pomodoro);
                System.out.println("Se elimino el pomodoro: " + pomodoro.getId());
            } else {
                throw new DAOException("El pomodoro " + id + " no existe!");
            }
            
        } catch (DAOException ex) {
            System.out.println(ex.getMessage());
        }
        em.getTransaction().commit();
    }
    
}
