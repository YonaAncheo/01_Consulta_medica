/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import igu.VistaPacientes;
import igu.VistaPrincipal;
import java.util.Date;
import javax.swing.JOptionPane;
import persistencia.PacientesModelo;

/**
 *
 * @author yonathanancheogonzalez
 */
public class PacientesControlador {
    private VistaPrincipal vistaPrincipal;
    private VistaPacientes vistaPacientes;
    private PacientesModelo pacienteM;

    public PacientesControlador() {
    }

    public PacientesControlador(VistaPrincipal vistaPrincipal, 
            VistaPacientes vistaPacientes, PacientesModelo pacienteM) {
        this.vistaPrincipal = vistaPrincipal;
        this.vistaPacientes = vistaPacientes;
        this.pacienteM = pacienteM;
        
        
        this.vistaPacientes.getBtnListar().addActionListener(e -> listarPacientes());
        this.vistaPacientes.getBtnSalir().addActionListener(e -> salir());
        this.vistaPacientes.getBtnNorte()[0].addActionListener(e -> agregarPaciente());
        this.vistaPacientes.getBtnNorte()[1].addActionListener(e -> actualizarPaciente());
        this.vistaPacientes.getBtnNorte()[2].addActionListener(e -> buscarPaciente());
        this.vistaPacientes.getBtnNorte()[3].addActionListener(e -> borrarPaciente());
    }
    
    public void listarPacientes(){
        vistaPacientes.mostrarInformacion(pacienteM.listarPacientes());
    }
    
    public void buscarPaciente(){
        JOptionPane.showMessageDialog(null, "boton correspondiente al numero "+vistaPacientes.getBtnNorte()[2].getText());
        int id = Integer.parseInt(vistaPacientes.getTxtFields()[0].getText());
        vistaPacientes.mostrarInformacion(pacienteM.buscarPaciente(id));
        
    }

    public void agregarPaciente(){
        JOptionPane.showMessageDialog(null, "boton correspondiente al numero "+vistaPacientes.getBtnNorte()[0].getText());
        int id = Integer.parseInt(vistaPacientes.getTxtFields()[0].getText());
        String nombrePaciente = vistaPacientes.getTxtFields()[1].getText();
        String fechaNacimiento = vistaPacientes.getTxtFields()[2].getText();
        //paciente = vistaPacientes.paciente();
        pacienteM.agregarPaciente(id, nombrePaciente,fechaNacimiento);
        JOptionPane.showMessageDialog(null, "se ha agregado paciente: "+nombrePaciente);
        listarPacientes();
    }
    
    public void actualizarPaciente(){
        JOptionPane.showMessageDialog(null, "boton correspondiente al numero "+vistaPacientes.getBtnNorte()[1].getText());
        int id = Integer.parseInt(vistaPacientes.getTxtFields()[0].getText());
        String nombre = vistaPacientes.getTxtFields()[1].getText();
        String fecha = vistaPacientes.getTxtFields()[2].getText();
        pacienteM.actualizarPaciente(id, nombre, fecha);
        buscarPaciente();
    }
    
    public void borrarPaciente(){
        JOptionPane.showMessageDialog(null, "boton correspondiente al numero "+vistaPacientes.getBtnNorte()[3].getText());
        int id = Integer.parseInt(vistaPacientes.getTxtFields()[0].getText());
        pacienteM.borrarPaciente(id);
        listarPacientes();
    }
    public void salir(){
        this.vistaPacientes.setVisible(false);
        this.vistaPrincipal.setVisible(true);
        this.vistaPacientes.resetInformacion();
    }
    
}
