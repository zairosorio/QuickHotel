
package quick.hotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author ALIENWARE
 */
public class principal {

    
    public static void main(String[] args) throws SQLException {
      
/////////////conexion Bd//////////////////////////////
        Conexion cc = new Conexion();
        Connection cn = cc.getConnection();
        
        
        Login L = new Login();

        Login.CampoUsuario.requestFocus();
        Login.camporpassword.nextFocus();
        L.setLocationRelativeTo(null);
        L.setDefaultCloseOperation(L.EXIT_ON_CLOSE);
        L.setVisible(true);
        L.setTitle(":::::::::::::::::............ACCESO AL SISTEMA QUICK HOTEL::::::::::::::::::::");

    }

}
