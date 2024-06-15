/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.*;

/**
 *
 * @author yonathanancheogonzalez
 */
public class Atencion {
    private Date ingreso;
    private String nombre_pac;
    private String nombre_med;
    private String especialidad;
    private String diagnostico;
    private Date alta;

    public Atencion() {
    }

    public Atencion(Date ingreso, String nombre_pac, String nombre_med, String especialidad, String diagnostico, Date alta) {
        this.ingreso = ingreso;
        this.nombre_pac = nombre_pac;
        this.nombre_med = nombre_med;
        this.especialidad = especialidad;
        this.diagnostico = diagnostico;
        this.alta = alta;
    }

    public Date getIngreso() {
        return ingreso;
    }

    public void setIngreso(Date ingreso) {
        this.ingreso = ingreso;
    }

    public String getNombre_pac() {
        return nombre_pac;
    }

    public void setNombre_pac(String nombre_pac) {
        this.nombre_pac = nombre_pac;
    }

    public String getNombre_med() {
        return nombre_med;
    }

    public void setNombre_med(String nombre_med) {
        this.nombre_med = nombre_med;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Date getAlta() {
        return alta;
    }

    public void setAlta(Date alta) {
        this.alta = alta;
    }

    @Override
    public String toString() {
        return "Atencion{" + "ingreso=" + ingreso + ", nombre_pac=" + nombre_pac + ", nombre_med=" + nombre_med + ", especialidad=" + especialidad + ", diagnostico=" + diagnostico + ", alta=" + alta + '}';
    }
    
}
