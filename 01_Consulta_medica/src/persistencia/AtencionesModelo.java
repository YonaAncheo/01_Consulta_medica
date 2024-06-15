/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import logica.Atencion;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author yonathanancheogonzalez
 */
public class AtencionesModelo {
    public List<Atencion> listar_atenciones(){
        List<Atencion> lista_atenciones = new ArrayList<>();
        
        try (Connection conn = Conexion.getConnection()){
            String sql = """
                         select diag.fecha_ingreso, p.nombre_pac, m.nombre_med, e.nombre_especialidad, diag.descripcion_diag, diag.fecha_alta 
                         from diagnosticos_medicos as diag 
                         inner join pacientes as p on diag.id_pac=p.id_paciente 
                         inner join medicos as m on diag.id_med=m.id_medicos 
                         inner join especialidades_medicas as e on m.id_esp=e.id_especialidades""";
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Atencion atencion = new Atencion();
                atencion.setIngreso(resultSet.getDate("fecha_ingreso"));
                atencion.setNombre_pac(resultSet.getString("nombre_pac"));
                atencion.setNombre_med(resultSet.getString("nombre_med"));
                atencion.setEspecialidad(resultSet.getString("nombre_especialidad"));
                atencion.setDiagnostico(resultSet.getString("descripcion_diag"));
                atencion.setAlta(resultSet.getDate("fecha_alta"));
                lista_atenciones.add(atencion);}
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
        return lista_atenciones;
        
    }
        
}
