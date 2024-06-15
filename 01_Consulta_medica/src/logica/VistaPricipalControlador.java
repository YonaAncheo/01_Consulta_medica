/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import igu.VistaAtenciones;
import igu.VistaPrincipal;

/**
 *
 * @author yonathanancheogonzalez
 */
public class VistaPricipalControlador {
    private VistaPrincipal vistaPrincipal;
    private VistaAtenciones vistaAtenciones;

    public VistaPricipalControlador(){
        
    }
    
    public VistaPricipalControlador(VistaPrincipal vistaPrincipal, VistaAtenciones vistaAtenciones) {
        this.vistaPrincipal = vistaPrincipal;
        this.vistaAtenciones = vistaAtenciones;
        
        this.vistaPrincipal.setVisible(true);
        
        this.vistaPrincipal.getAtencionesBtn().addActionListener(e -> irVistaAtenciones());
    }
    
    public void irVistaAtenciones(){
        this.vistaPrincipal.setVisible(false);
        this.vistaAtenciones.setVisible(true);
    }
    
    
}
