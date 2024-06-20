/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author yonathanancheogonzalez
 */
public class Medicos {
    private int id;
    private String nombre_med;
    private int id_esp;

    public Medicos() {
    }

    public Medicos(int id, String nombre_med, int id_esp) {
        this.id = id;
        this.nombre_med = nombre_med;
        this.id_esp = id_esp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_med() {
        return nombre_med;
    }

    public void setNombre_med(String nombre_med) {
        this.nombre_med = nombre_med;
    }

    public int getId_esp() {
        return id_esp;
    }

    public void setId_esp(int id_esp) {
        this.id_esp = id_esp;
    }
    
    
}
