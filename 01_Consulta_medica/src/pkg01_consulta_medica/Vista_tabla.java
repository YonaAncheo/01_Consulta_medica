/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg01_consulta_medica;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yonathanancheogonzalez
 */
public class Vista_tabla {
    private JFrame ventana_tabla;
    private JPanel contenidoPanel, botoneraSur;
    private JButton boton_listar_tabla, volverPrincipal;
    private JTable tabla_consultas;
    private DefaultTableModel table_model;

    public Vista_tabla() {
        ventana_tabla = new JFrame("Consultas");
        ventana_tabla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana_tabla.setSize(400,400);
        
        contenidoPanel = new JPanel(new BorderLayout());
        ventana_tabla.setContentPane(contenidoPanel);
        
        //Zona Central
        String[] columNames = {"Ingreso","Nombre", "Medico", "Especialidad", "Diagnostico", "Alta"};
        table_model = new DefaultTableModel(columNames,0);
        tabla_consultas = new JTable(table_model);
        JScrollPane scrollPane = new JScrollPane(tabla_consultas);
        contenidoPanel.add(scrollPane, BorderLayout.CENTER);
        
        //Zona sur
        botoneraSur = new JPanel(new GridLayout(1,2));
        
        boton_listar_tabla = new JButton("Listar Consultas");
        botoneraSur.add(boton_listar_tabla);
        
        volverPrincipal = new JButton("Volver Principal");
        botoneraSur.add(volverPrincipal);
        
        contenidoPanel.add(botoneraSur, BorderLayout.SOUTH);
    }
    
    public void set_visible(Boolean opcion){
        ventana_tabla.setVisible(opcion);
    }
    
    public void mostrar_atenciones(List<Atencion> atenciones){
        table_model.setRowCount(0);// limpiar todas las filas existentes
        for(Atencion atencion : atenciones){
            Object[] rowData = {atencion.getIngreso(),atencion.getNombre_pac(),atencion.getNombre_med(),
            atencion.getEspecialidad(),atencion.getDiagnostico(),atencion.getAlta()};
            table_model.addRow(rowData);
        }
    }

    public JFrame getVentana_tabla() {
        return ventana_tabla;
    }

    public void setVentana_tabla(JFrame ventana_tabla) {
        this.ventana_tabla = ventana_tabla;
    }

    public JPanel getContenidoPanel() {
        return contenidoPanel;
    }

    public void setContenidoPanel(JPanel contenidoPanel) {
        this.contenidoPanel = contenidoPanel;
    }

    public JPanel getBotoneraSur() {
        return botoneraSur;
    }

    public void setBotoneraSur(JPanel botoneraSur) {
        this.botoneraSur = botoneraSur;
    }

    public JButton getBoton_listar_tabla() {
        return boton_listar_tabla;
    }

    public void setBoton_listar_tabla(JButton boton_listar_tabla) {
        this.boton_listar_tabla = boton_listar_tabla;
    }

    public JButton getVolverPrincipal() {
        return volverPrincipal;
    }

    public void setVolverPrincipal(JButton volverPrincipal) {
        this.volverPrincipal = volverPrincipal;
    }

    public JTable getTabla_consultas() {
        return tabla_consultas;
    }

    public void setTabla_consultas(JTable tabla_consultas) {
        this.tabla_consultas = tabla_consultas;
    }

    public DefaultTableModel getTable_model() {
        return table_model;
    }

    public void setTable_model(DefaultTableModel table_model) {
        this.table_model = table_model;
    }
    
    
}
