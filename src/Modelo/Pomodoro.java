package Modelo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "pomodoro")
public class Pomodoro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id_pomodoro")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne()
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;
    
    @ManyToOne()
    @JoinColumn(name = "id_tarea", nullable = false)
    private Tarea tarea;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Tarea getTarea() {
        return tarea;
    }

    public void setTarea(Tarea tarea) {
        this.tarea = tarea;
    }

    public Pomodoro(Long id, Usuario usuario, Tarea tarea) {
        this.id = id;
        this.usuario = usuario;
        this.tarea = tarea;
    }

    public Pomodoro(Long id) {
        this.id = id;
    }

    public Pomodoro() {
    }

    public Pomodoro(Usuario usuario, Tarea tarea) {
        this.usuario = usuario;
        this.tarea = tarea;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pomodoro)) {
            return false;
        }
        Pomodoro other = (Pomodoro) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "objetosNegocio.Pomodoro[ id=" + id + " ]";
    }

}
