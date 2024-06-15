/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg01_consulta_medica;

import igu.VistaAtenciones;
import igu.VistaPrincipal;
import persistencia.AtencionesModelo;
import logica.AtencionControlador;
import logica.VistaPricipalControlador;

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
        // creamos la instancia del modelo
        AtencionesModelo atencionesModelo = new AtencionesModelo();
        // creamos la instacia del controlador, este requiere pasar por parametro
        // una instancia de la vista y del controlador.
        AtencionControlador atencionControlador = new AtencionControlador(vistaAtenciones,vistaPrincipal, atencionesModelo);
        VistaPricipalControlador vistaPricipalControlador = new VistaPricipalControlador(vistaPrincipal, vistaAtenciones);
    }
    
}
