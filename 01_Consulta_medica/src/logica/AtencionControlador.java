/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import persistencia.AtencionesModelo;
import igu.VistaAtenciones;
import igu.VistaPrincipal;


/**
 *
 * @author yonathanancheogonzalez
 */
public class AtencionControlador {
    private VistaAtenciones vistaAtenciones;
    private VistaPrincipal vistaPrincipal;
    private AtencionesModelo atencionesModelo;

    public AtencionControlador() {
    }
    
    public AtencionControlador(VistaAtenciones vistaAtenciones,VistaPrincipal vistaPrincipal, AtencionesModelo atencionesModelo){
        this.vistaAtenciones = vistaAtenciones;
        this.vistaPrincipal = vistaPrincipal;
        this.atencionesModelo = atencionesModelo;
        
        //listar botones
        this.vistaAtenciones.getBotonListarTabla().addActionListener(e -> listar_atenciones());
        this.vistaAtenciones.getVolverPrincipal().addActionListener(e -> salir());
    }
    
    public void salir(){
        this.vistaAtenciones.setVisible(false);
        this.vistaPrincipal.setVisible(true);
    }
    public void listar_atenciones(){
        vistaAtenciones.mostrarAtenciones(atencionesModelo.listar_atenciones());
    }
}
