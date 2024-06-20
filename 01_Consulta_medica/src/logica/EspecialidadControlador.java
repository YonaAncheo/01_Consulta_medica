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
public class EspecialidadControlador {
    private VistaPrincipal vistaPrincipal;
    private VistaEspecialidades vistaEspecialidades;

    public EspecialidadControlador() {
    }

    public EspecialidadControlador(VistaPrincipal vistaPrincipal, VistaEspecialidades vistaEspecialidades) {
        this.vistaPrincipal = vistaPrincipal;
        this.vistaEspecialidades = vistaEspecialidades;
        
        vistaEspecialidades.getBtnSalir().addActionListener(e -> salir());
        
    }
    
    public void salir(){
        vistaEspecialidades.setVisible(false);
        vistaPrincipal.setVisible(true);
    }
}
