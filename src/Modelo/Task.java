package Modelo;

import java.sql.Timestamp;


public class Task {

    private Integer id_tarea;
    private String titulo;
    private Timestamp fecha_terminada;
    private Timestamp fecha_progreso;
    private String estado;
    private String descripcion;

    public Task() {
    }

    public Task(Integer id_tarea) {
        this.id_tarea = id_tarea;
    }

    public Task(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public Task(Integer id_tarea, String titulo, Timestamp fecha_terminada, String estado, String descripcion) {
        this.id_tarea = id_tarea;
        this.titulo = titulo;
        this.fecha_terminada = fecha_terminada;
        this.estado = estado;
        this.descripcion = descripcion;
    }

    public Task(String titulo, Timestamp fecha_terminada, String estado, String descripcion) {
        this.titulo = titulo;
        this.fecha_terminada = fecha_terminada;
        this.estado = estado;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getId_tarea() {
        return id_tarea;
    }

    public void setId_tarea(Integer id_tarea) {
        this.id_tarea = id_tarea;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Timestamp getFechaTerminada() {
        return fecha_terminada;
    }

    public void setFechaTerminada(Timestamp fecha) {
        this.fecha_terminada = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Timestamp getFechaProgreso() {
        return fecha_progreso;
    }

    public void setFechaProgreso(Timestamp fecha_progreso) {
        this.fecha_progreso = fecha_progreso;
    }
    
    

    @Override
    public String toString() {
        return "Titulo: " + titulo
                + "\nDescripcion: " + descripcion;
    }
}
