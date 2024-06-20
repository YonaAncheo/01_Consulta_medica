/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author yonathanancheogonzalez
 */
public class Especialidades {
    private int id;
    private String nombre_especialidad;

    public Especialidades() {
    }

    public Especialidades(int id, String nombre_especialidad) {
        this.id = id;
        this.nombre_especialidad = nombre_especialidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_especialidad() {
        return nombre_especialidad;
    }

    public void setNombre_especialidad(String nombre_especialidad) {
        this.nombre_especialidad = nombre_especialidad;
    }
    
    
}
