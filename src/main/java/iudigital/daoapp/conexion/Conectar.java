/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iudigital.daoapp.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author SOPORTE
 */
public class Conectar {

    public static final String URL = "jdbc:sqlserver://;serverName=localhost\\IUDIGITAL;databaseName=RRHH-IUDIGITAL";
    public static final String USER = "user=sa";
    public static final String PASSWORD = "password=Lagp2022";    

    public static final String strConexionDB = "jdbc:sqlserver://;serverName=localhost\\IUDIGITAL;databaseName=RRHH-IUDIGITAL;user=sa;password=Lagp2022;";
    
    /**
     *
     * @return
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
        
        return DriverManager.getConnection(strConexionDB);   
        
    } 
}
