/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.Date;

/**
 *
 * @author yonathanancheogonzalez
 */
public class Diagnosticos {
    private int id;
    private String descripcion_diag;
    private int id_pac;
    private int id_med;
    private Date fecha_ingreso;
    private Date fecha_alta;

    public Diagnosticos() {
    }

    public Diagnosticos(int id, String descripcion_diag, int id_pac, int id_med, Date fecha_ingreso, Date fecha_alta) {
        this.id = id;
        this.descripcion_diag = descripcion_diag;
        this.id_pac = id_pac;
        this.id_med = id_med;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_alta = fecha_alta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion_diag() {
        return descripcion_diag;
    }

    public void setDescripcion_diag(String descripcion_diag) {
        this.descripcion_diag = descripcion_diag;
    }

    public int getId_pac() {
        return id_pac;
    }

    public void setId_pac(int id_pac) {
        this.id_pac = id_pac;
    }

    public int getId_med() {
        return id_med;
    }

    public void setId_med(int id_med) {
        this.id_med = id_med;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public Date getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(Date fecha_alta) {
        this.fecha_alta = fecha_alta;
    }
    
    
}
