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
public class VistaEspecialidades extends VistaPacientes{

    public VistaEspecialidades() {
        this.iniciarComponentes("Especialidades Médicas");
        String[] nombreBtnNorte = {"Buscar"};
        String[] nombreLabel = {"id", "Nombre Especialidad"};
        contenidoPanel.add(this.zonaNorte(nombreBtnNorte, nombreLabel), BorderLayout.NORTH);
        contenidoPanel.add(this.zonaCentral(nombreLabel), BorderLayout.CENTER);
        contenidoPanel.add(this.botoneraSur("Listar Especialidades"), BorderLayout.SOUTH);
        this.ventana.add(contenidoPanel);
    }
    
}
