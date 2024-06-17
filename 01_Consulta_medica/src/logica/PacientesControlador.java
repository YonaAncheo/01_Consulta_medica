/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import igu.VistaPacientes;
import igu.VistaPrincipal;

/**
 *
 * @author yonathanancheogonzalez
 */
public class PacientesControlador {
    private VistaPrincipal vistaPrincipal;
    private VistaPacientes vistaPacientes;

    public PacientesControlador() {
    }

    public PacientesControlador(VistaPrincipal vistaPrincipal, VistaPacientes vistaPacientes) {
        this.vistaPrincipal = vistaPrincipal;
        this.vistaPacientes = vistaPacientes;
        
        this.vistaPacientes.getBtnListar().addActionListener(e -> listarPacientes());
        this.vistaPacientes.getBtnSalir().addActionListener(e -> salir());
    }
    
    public void listarPacientes(){
        
    }
    
    public void salir(){
        this.vistaPacientes.setVisible(false);
        this.vistaPrincipal.setVisible(true);
    }
    
}
