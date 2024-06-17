/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package igu;

import java.awt.BorderLayout;

/**
 *
 * @author yonathanancheogonzalez
 */
public class VistaDiagnosticos extends VistaPacientes{

    public VistaDiagnosticos() {
        this.iniciarComponentes("Diagnosticos");
        String[] nombreBtnNorte = {"Agregar", "Actualizar","Buscar", "Borrar"};
        String[] nombreLabel = {"id", "Descripcion", "Id Paciente", "Id Medico",
        "Fecha Ingreso", "Fecha Alta"};
        this.contenidoPanel.add(this.zonaNorte(nombreBtnNorte, nombreLabel),
                BorderLayout.NORTH);
        this.contenidoPanel.add(this.zonaCentral(nombreLabel),
                BorderLayout.CENTER);
        this.contenidoPanel.add(this.botoneraSur("Listar Diagnosticos"),
                BorderLayout.SOUTH);
        this.ventana.add(contenidoPanel);
    }
    
}
