/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg01_consulta_medica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author yonathanancheogonzalez
 */
public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:3306/consulta_medica_epe2_app_java";
    private static final String USER = "Yona";
    private static final String PASS = "ipchile";
    
    public static Connection getConnection(){
        try {
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
