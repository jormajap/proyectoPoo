/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Config;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Conexion {

    public Connection getConexion(){
       
        String url = "jdbc:mysql://localhost:3306/bdbus";
        String user = "root";
        String pass = "akemi@sebas";
        System.out.println("Conectando…");
        
         try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                System.out.println("Error al registrar el driver de MySQL: " + ex);
            }
        
        try {            
            
            //Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdbus?" +
                                   "user=root&password=akmei@sebas"+"&serverTimezone=UTC"); 
            
            System.out.println("Conectado!!");
            return con;
            /// Resto del codigo aqui
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
        return null;
    }
    
}

