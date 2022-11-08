package Modelo;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.*;


@Entity
@Table(name = "tareas")
public class Tarea implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id_tarea")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo", nullable = false)
    private String titulo;
    
    @Column(name = "fecha", nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Calendar fecha;
    
    @Column(name = "descripcion", nullable = false, length = 100)
    private String descripcion;
    
    @Column(name = "estado", nullable = false)
    private String estado;
    
    @ManyToOne()
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    public Tarea() {
    }

    public Tarea(Long id, String titulo, Calendar fecha, String descripcion, String estado, Usuario usuario) {
        this.id = id;
        this.titulo = titulo;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.estado = estado;
        this.usuario = usuario;
    }

    public Tarea(String titulo, Calendar fecha, String descripcion, String estado, Usuario usuario) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.estado = estado;
        this.usuario = usuario;
    }

    public Tarea(Long id) {
        this.id = id;
    }

    public Tarea(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
    }
    
    public Tarea(String titulo, Calendar fecha, String descripcion, String estado) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.estado = estado;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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
        if (!(object instanceof Tarea)) {
            return false;
        }
        Tarea other = (Tarea) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    
    
    
    @Override
    public String toString() {
        return "Tarea{" + "titulo=" + titulo + ", descripcion=" + descripcion + '}';
    }



}
