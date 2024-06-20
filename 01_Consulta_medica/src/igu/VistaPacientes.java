/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package igu;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import logica.Paciente;

/**
 *
 * @author yonathanancheogonzalez
 */
public class VistaPacientes {
    protected JFrame ventana;
    protected JPanel contenidoPanel, contenidoNorte, botoneraSur;
    protected JLabel[] campoJLabels;
    protected JTextField[] txtFields;
    protected JButton[] btnNorte;
    protected JButton btnListar, btnSalir;
    protected JTable tablaPaciente;
    protected DefaultTableModel tableModel;
    protected JScrollPane scrollPane;

    public VistaPacientes() {
        this.iniciarComponentes("Pacientes");
        String[] nombreLabel = {"RUT","Nombre","Fecha de nacimiento"};
        String[] nombreBtnNorte = {"Agregar", "Actualizar","Buscar","Borrar"};
        this.contenidoPanel.add(this.zonaNorte(nombreBtnNorte,nombreLabel),BorderLayout.NORTH);
        String[] columnNames = {"RUT","Nombre","Fecha de Nacimiento"};
        this.contenidoPanel.add(this.zonaCentral(columnNames),BorderLayout.CENTER);
        this.contenidoPanel.add(this.botoneraSur("Listar Pacientes"),BorderLayout.SOUTH);
        this.ventana.add(this.contenidoPanel);
        
    }

    protected void iniciarComponentes(String titulo){
        ventana = new JFrame(titulo);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400,400);
        contenidoPanel = new JPanel(new BorderLayout());
        
        botoneraSur = new JPanel(new GridLayout(1, 2));
        
    }
    
    protected JPanel zonaNorte(String[] nombreBtnNorte, String[] nombreLabel){
        contenidoNorte = new JPanel(new GridLayout(nombreLabel.length + 2, 2));
        campoJLabels = new JLabel[nombreLabel.length];
        txtFields = new JTextField[nombreLabel.length];
        
        campoJLabels = new JLabel[nombreLabel.length];
        for (int i = 0; i < campoJLabels.length; i++) {
            JLabel campo = new JLabel(nombreLabel[i]);
            JTextField txtcampo = new JTextField();
            txtFields[i] = txtcampo;
            contenidoNorte.add(campo);
            contenidoNorte.add(txtcampo);
        }
        /*
        for (JLabel campo : campoJLabels) {
            int i = 0;
            campo = new JLabel(nombreLabel[i]);
            
            contenidoNorte.add(campo);
            contenidoNorte.add(txtFields[i]);
            i++;
        }
        */
        /*
        // fila 1
        campo1 = new JLabel("Agregar");
        contenidoNorte.add(campo1);
        txtCampo1 = new JTextField();
        contenidoNorte.add(txtCampo1);
        //fila2
        campo2 = new JLabel("Nombre:");
        contenidoNorte.add(campo2);
        txtCampo2 = new JTextField();
        contenidoNorte.add(txtCampo2);
        //fila 3
        campo3 = new JLabel("Fecha Nacimiento:");
        contenidoNorte.add(campo3);
        txtCampo3 = new JTextField();
        contenidoNorte.add(txtCampo3);
        */
        // botones
        //String[] nombreBtnNorte = {"Agregar", "Actualizar","Buscar"};
        btnNorte = new JButton[nombreBtnNorte.length];
        for (int i = 0; i < btnNorte.length; i++) {
            JButton btn = new JButton(nombreBtnNorte[i]);
            btnNorte[i] = btn;
            contenidoNorte.add(btn);
        }
        
        return contenidoNorte;
    }
    
    protected JScrollPane zonaCentral(String[] columnNames){       
        tableModel = new DefaultTableModel(columnNames, 0);
        tablaPaciente = new JTable(tableModel);
        scrollPane = new JScrollPane(tablaPaciente);
        return scrollPane;
    }
    
    protected JPanel botoneraSur(String listar){
        botoneraSur = new JPanel(new GridLayout(1, 2));
        btnListar = new JButton(listar);
        botoneraSur.add(btnListar);
        
        btnSalir = new JButton("Volver Principal");
        botoneraSur.add(btnSalir);
        
        return botoneraSur;
    }
    
    public void mostrarInformacion(List<Paciente> pacientes){
        tableModel.setRowCount(0);// limpiar todas las filas existentes
        for(Paciente paciente : pacientes){
            Object[] rowData = {paciente.getId(),paciente.getNombrePaciente(),paciente.getFechaNacimiento()};
            tableModel.addRow(rowData);
        }
    }
    
    public void resetInformacion(){
        for (JTextField txtField : txtFields) {
            txtField.setText("");
        }
        tableModel.setRowCount(0);
    }
    
    public Paciente paciente(){
        //int id = t
        //Paciente paciente = new Paciente(0, nombrePaciente, FechaNacimiento)
        return null;
    }
    
    public void setVisible(boolean opcion){
        ventana.setVisible(opcion);
    } 

    public JButton getBtnListar() {
        return btnListar;
    }

    public void setBtnListar(JButton btnListar) {
        this.btnListar = btnListar;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public void setBtnSalir(JButton btnSalir) {
        this.btnSalir = btnSalir;
    }    

    public JButton[] getBtnNorte() {
        return btnNorte;
    }

    public void setBtnNorte(JButton[] btnNorte) {
        this.btnNorte = btnNorte;
    }

    public JTextField[] getTxtFields() {
        return txtFields;
    }

    public void setTxtFields(JTextField[] txtFields) {
        this.txtFields = txtFields;
    }
    
}
