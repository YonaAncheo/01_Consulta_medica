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
public class VistaPricipalControlador {
    private VistaPrincipal vistaPrincipal;
    private VistaAtenciones vistaAtenciones;
    private VistaPacientes vistaPacientes;
    private VistaMedico vistaMedico;
    private VistaEspecialidades vistaEspecialidades;
    private VistaDiagnosticos vistaDiagnosticos;

    public VistaPricipalControlador(){
        
    }
    
    public VistaPricipalControlador(VistaPrincipal vistaPrincipal, 
            VistaAtenciones vistaAtenciones, VistaPacientes vistaPacientes,
            VistaMedico vistaMedico,VistaEspecialidades vistaEspecialidades,
            VistaDiagnosticos vistaDiagnosticos) {
        this.vistaPrincipal = vistaPrincipal;
        this.vistaAtenciones = vistaAtenciones;
        this.vistaPacientes = vistaPacientes;
        this.vistaMedico = vistaMedico;
        this.vistaEspecialidades = vistaEspecialidades;
        this.vistaDiagnosticos = vistaDiagnosticos;
        
        this.vistaPrincipal.setVisible(true);
        
        this.vistaPrincipal.getAtencionesBtn().addActionListener(e -> irVistaAtenciones());
        this.vistaPrincipal.getPacienteBtn().addActionListener(e -> irVistaPacientes());
        this.vistaPrincipal.getMedicoBtn().addActionListener(e -> irVistaMedico());
        this.vistaPrincipal.getEspecialidadesBtn().addActionListener(e -> irVistaEspecialidades());
        this.vistaPrincipal.getDiagnosticoBtn().addActionListener(e -> irVistaDiagnosticos());
    }
    
    public void irVistaAtenciones(){
        this.vistaPrincipal.setVisible(false);
        this.vistaAtenciones.setVisible(true);
    }
    
    public void irVistaPacientes(){
        this.vistaPrincipal.setVisible(false);
        this.vistaPacientes.setVisible(true);
    }
    
    public void irVistaMedico(){
        this.vistaPrincipal.setVisible(false);
        this.vistaMedico.setVisible(true);
    }
    
    public void irVistaEspecialidades(){
        this.vistaPrincipal.setVisible(false);
        this.vistaEspecialidades.setVisible(true);
    }
    
    public void irVistaDiagnosticos(){
        this.vistaPrincipal.setVisible(false);
        this.vistaDiagnosticos.setVisible(true);
    }
}
