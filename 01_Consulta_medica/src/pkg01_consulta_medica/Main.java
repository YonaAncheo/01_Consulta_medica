/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg01_consulta_medica;

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
        Vista_tabla vista_tabla = new Vista_tabla();
        // creamos la instancia del modelo
        Atenciones_modelo atenciones_modelo = new Atenciones_modelo();
        // creamos la instacia del controlador, este requiere pasar por parametro
        // una instancia de la vista y del controlador.
        Atencion_controlador atencion_controlador = new Atencion_controlador(vista_tabla,atenciones_modelo);
        
        vista_tabla.set_visible(true);
    }
    
}
