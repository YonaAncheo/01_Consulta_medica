/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import igu.*;

/**
 *
 * @author yonathanancheogonzalez
 */
public class DiagnosticoControlador {
    private VistaPrincipal vistaPrincipal;
    private VistaDiagnosticos vistaDiagnosticos;

    public DiagnosticoControlador() {
    }

    public DiagnosticoControlador(VistaPrincipal vistaPrincipal, VistaDiagnosticos vistaDiagnosticos) {
        this.vistaPrincipal = vistaPrincipal;
        this.vistaDiagnosticos = vistaDiagnosticos;
        
        this.vistaDiagnosticos.getBtnListar().addActionListener(e -> listarDiagnosticos());
        this.vistaDiagnosticos.getBtnSalir().addActionListener(e -> salir());
    }
    
    public void listarDiagnosticos(){
        
    }
    
    public void salir(){
        this.vistaDiagnosticos.setVisible(false);
        this.vistaPrincipal.setVisible(true);
    }
    
}
