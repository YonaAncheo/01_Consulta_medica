/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg01_consulta_medica;

import igu.*;
import persistencia.*;
import logica.*;

/**
 *
 * @author yonathanancheogonzalez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // creamos la instancia de la vista
        VistaAtenciones vistaAtenciones = new VistaAtenciones();
        VistaPrincipal vistaPrincipal = new VistaPrincipal();
        VistaPacientes vistaPacientes = new VistaPacientes();
        VistaMedico vistaMedico = new VistaMedico();
        VistaEspecialidades vistaEspecialidades = new VistaEspecialidades();
        VistaDiagnosticos vistaDiagnosticos = new VistaDiagnosticos();
        
        // creamos la instancia del modelo
        AtencionesModelo atencionesModelo = new AtencionesModelo();
        PacientesModelo pacientesModelo = new PacientesModelo();
        
        // creamos la instacia del controlador, este requiere pasar por parametro
        // una instancia de la vista y del controlador.
        AtencionControlador atencionControlador = new AtencionControlador(vistaAtenciones,vistaPrincipal, atencionesModelo);
        PacientesControlador pacientesControlador = new PacientesControlador(vistaPrincipal, vistaPacientes,pacientesModelo);
        MedicoControlador medicoControlador = new MedicoControlador(vistaPrincipal, vistaMedico);
        EspecialidadControlador especialidadControlador = new EspecialidadControlador(vistaPrincipal, vistaEspecialidades);
        DiagnosticoControlador diagnosticoControlador = new DiagnosticoControlador(vistaPrincipal, vistaDiagnosticos);
        VistaPricipalControlador vistaPricipalControlador = new VistaPricipalControlador(vistaPrincipal, 
                vistaAtenciones,vistaPacientes, vistaMedico, vistaEspecialidades,
                vistaDiagnosticos);
    }
    
}
