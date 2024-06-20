/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package igu;

import logica.Atencion;
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
public class VistaAtenciones {
    private JFrame ventanaTabla;
    private JPanel contenidoPanel, botoneraSur;
    private JButton botonListarTabla, volverPrincipal;
    private JTable tablaConsultas;
    private DefaultTableModel tableModel;

    public VistaAtenciones() {
        ventanaTabla = new JFrame("Atenciones");
        ventanaTabla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaTabla.setSize(400,400);
        
        contenidoPanel = new JPanel(new BorderLayout());
        ventanaTabla.setContentPane(contenidoPanel);
        
        //Zona Central
        String[] columNames = {"Ingreso","Nombre", "Medico", "Especialidad", "Diagnostico", "Alta"};
        tableModel = new DefaultTableModel(columNames,0);
        tablaConsultas = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(tablaConsultas);
        contenidoPanel.add(scrollPane, BorderLayout.CENTER);
        
        //Zona sur
        botoneraSur = new JPanel(new GridLayout(1,2));
        
        botonListarTabla = new JButton("Listar Atenciones");
        botoneraSur.add(botonListarTabla);
        
        volverPrincipal = new JButton("Volver Principal");
        botoneraSur.add(volverPrincipal);
        
        contenidoPanel.add(botoneraSur, BorderLayout.SOUTH);
    }
    
    public void setVisible(Boolean opcion){
        ventanaTabla.setVisible(opcion);
    }
    
    public void mostrarAtenciones(List<Atencion> atenciones){
        tableModel.setRowCount(0);// limpiar todas las filas existentes
        for(Atencion atencion : atenciones){
            Object[] rowData = {atencion.getIngreso(),atencion.getNombre_pac(),atencion.getNombre_med(),
            atencion.getEspecialidad(),atencion.getDiagnostico(),atencion.getAlta()};
            tableModel.addRow(rowData);
        }
    }

    public JFrame getVentanaTabla() {
        return ventanaTabla;
    }

    public void setVentanaTabla(JFrame ventanaTabla) {
        this.ventanaTabla = ventanaTabla;
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

    public JButton getBotonListarTabla() {
        return botonListarTabla;
    }

    public void setBotonListarTabla(JButton botonListarTabla) {
        this.botonListarTabla = botonListarTabla;
    }

    public JButton getVolverPrincipal() {
        return volverPrincipal;
    }

    public void setVolverPrincipal(JButton volverPrincipal) {
        this.volverPrincipal = volverPrincipal;
    }

    public JTable getTablaConsultas() {
        return tablaConsultas;
    }

    public void setTablaConsultas(JTable tablaConsultas) {
        this.tablaConsultas = tablaConsultas;
    }

    public DefaultTableModel getTableModel() {
        return tableModel;
    }

    public void setTableModel(DefaultTableModel tableModel) {
        this.tableModel = tableModel;
    }
    
    
}
