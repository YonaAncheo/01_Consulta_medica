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
public class Paciente {
    private int id;
    private String nombrePaciente;
    private Date fechaNacimiento;

    public Paciente() {
    }

    public Paciente(int id, String nombrePaciente, Date fechaNacimiento) {
        this.id = id;
        this.nombrePaciente = nombrePaciente;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Paciente{" + "id=" + id + ", nombrePaciente=" + nombrePaciente + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
    
    
}
