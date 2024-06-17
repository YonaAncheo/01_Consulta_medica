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
public class VistaMedico extends VistaPacientes{

    public VistaMedico() {
        iniciarComponentes("Medicos");
        String[] nombreBtnNorte = {"Agregar", "Actualizar", "Buscar"};
        String[] nombreLabel = {"id", "nombre","Id especialidad"};
        contenidoPanel.add(zonaNorte(nombreBtnNorte, nombreLabel),BorderLayout.NORTH);
        contenidoPanel.add(zonaCentral(nombreLabel),BorderLayout.CENTER);
        contenidoPanel.add(botoneraSur("Listar Medicos"),BorderLayout.SOUTH);
        ventana.add(contenidoPanel);
    }
    
}
