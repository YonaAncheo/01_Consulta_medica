/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg01_consulta_medica;

import javax.swing.JFrame;

/**
 *
 * @author yonathanancheogonzalez
 */
public class Atencion_controlador {
    private Vista_tabla vista_tabla = new Vista_tabla();
    private Atenciones_modelo atenciones_modelo = new Atenciones_modelo();

    public Atencion_controlador() {
    }
    
    public Atencion_controlador(Vista_tabla vista_tabla, Atenciones_modelo atenciones_modelo){
        this.vista_tabla = vista_tabla;
        this.atenciones_modelo = atenciones_modelo;
        
        //listar botones
        vista_tabla.getBoton_listar_tabla().addActionListener(e -> listar_atenciones());
        vista_tabla.getVolverPrincipal().addActionListener(e -> salir());
    }
    
    public void salir(){
        vista_tabla.set_visible(false);
    }
    public void listar_atenciones(){
        vista_tabla.mostrar_atenciones(atenciones_modelo.listar_atenciones());
    }
}
