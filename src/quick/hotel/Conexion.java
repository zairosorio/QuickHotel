/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quick.hotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexion {

    static String usuario = "root";
    static String clave = "";
    static String url = "jdbc:mysql://localhost:3306/quick_hotel";
    static Connection con = null;

    private static Connection preparardb() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url, usuario, clave);
            if (con != null) {
                System.out.println("se ha establecido una conexion a la base de datos ");
            }
        } catch (SQLException | ClassNotFoundException e) {

            System.out.print("No se establecio conexion a la BD");
        }
        return con;
    }

    public static Connection getConnection() {
        if (con == null) {
            con = preparardb();
        }
        return con;
    }

}
