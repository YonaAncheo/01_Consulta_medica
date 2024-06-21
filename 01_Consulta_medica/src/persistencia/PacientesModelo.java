/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import logica.Paciente;

/**
 *
 * @author yonathanancheogonzalez
 */
public class PacientesModelo {
    
    public List<Paciente> buscarPaciente(int id){
        List<Paciente> pacientes = new ArrayList<>();
        try (Connection conn = Conexion.getConnection()){
            String sql = "SELECT * FROM `consulta_medica_epe2_app_java`.`pacientes`"
                    + "WHERE `id_paciente`="+id;
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {                
                Paciente paciente = new Paciente();
                paciente.setId(resultSet.getInt("id_paciente"));
                paciente.setNombrePaciente(resultSet.getString("nombre_pac"));
                paciente.setFechaNacimiento(resultSet.getDate("fecha_nacimiento"));
                pacientes.add(paciente);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pacientes;
    }
    public void agregarPaciente(int id, String nombrePaciente, String fechaNacimiento){
        try (Connection conn = Conexion.getConnection()){
            String sql = "INSERT INTO `consulta_medica_epe2_app_java`.`pacientes` "
                    + "(`id_paciente`, `nombre_pac`, `fecha_nacimiento`) "
                    + "VALUES (?,?,?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, id);
            statement.setString(2, nombrePaciente);
            statement.setString(3, fechaNacimiento);
            statement.execute();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void borrarPaciente(int id){
        try (Connection conn = Conexion.getConnection()){
            String sql = "DELETE FROM `consulta_medica_epe2_app_java`.`pacientes` "
                    + "WHERE id_paciente = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, id);
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List<Paciente> listarPacientes(){
        List<Paciente> listaPacientes = new ArrayList<>();
        try (Connection conn = Conexion.getConnection()){
            String sql = "SELECT * FROM `consulta_medica_epe2_app_java`.`pacientes`";
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {                
                Paciente paciente = new Paciente();
                paciente.setId(resultSet.getInt("id_paciente"));
                paciente.setNombrePaciente(resultSet.getString("nombre_pac"));
                paciente.setFechaNacimiento(resultSet.getDate("fecha_nacimiento"));
                listaPacientes.add(paciente);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaPacientes;
    }
    
    public void actualizarPaciente(int id, String nombrePaciente, String fechaNacimiento){
        try (Connection conn = Conexion.getConnection()){
            String sql = "UPDATE `consulta_medica_epe2_app_java`.`pacientes` "
                    + "SET nombre_pac = ?, fecha_nacimiento = ? "
                    + "WHERE id_paciente = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, nombrePaciente);
            statement.setString(2, fechaNacimiento);
            statement.setInt(3, id);
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
