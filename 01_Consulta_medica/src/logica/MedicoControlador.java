/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import igu.VistaMedico;
import igu.VistaPrincipal;

/**
 *
 * @author yonathanancheogonzalez
 */
public class MedicoControlador {
    VistaPrincipal vistaPrincipal;
    VistaMedico vistaMedico;

    public MedicoControlador() {
    }

    public MedicoControlador(VistaPrincipal vistaPrincipal, VistaMedico vistaMedico) {
        this.vistaPrincipal = vistaPrincipal;
        this.vistaMedico = vistaMedico;
        
        this.vistaMedico.getBtnSalir().addActionListener(e -> salir());
    }
    
    public void salir(){
        vistaMedico.setVisible(false);
        vistaPrincipal.setVisible(true);
    }
}
