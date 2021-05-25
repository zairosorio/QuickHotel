
package quick.hotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.commons.codec.digest.DigestUtils;

import static quick.hotel.Conexion.con;

/**
 *
 * @author zair.osorio
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    
    public void user(){
     MenuPrincipal.UserLogin.setText(CampoUsuario.getText());
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        btnlogo = new javax.swing.JButton();
        etiuser = new javax.swing.JLabel();
        etipassword = new javax.swing.JLabel();
        CampoUsuario = new javax.swing.JTextField();
        btningresar = new javax.swing.JButton();
        btncerrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        camporpassword = new javax.swing.JPasswordField();

        jTextField2.setText("jTextField2");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 153));

        btnlogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/acceso.png"))); // NOI18N
        btnlogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoActionPerformed(evt);
            }
        });

        etiuser.setBackground(java.awt.Color.lightGray);
        etiuser.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        etiuser.setText("USER");

        etipassword.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        etipassword.setText("PASSWORD");

        btningresar.setBackground(java.awt.Color.lightGray);
        btningresar.setText("INGRESAR");
        btningresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresarActionPerformed(evt);
            }
        });

        btncerrar.setBackground(java.awt.Color.lightGray);
        btncerrar.setText("CERRAR");
        btncerrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Datos De Usuarios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(33, 33, 33))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(34, 34, 34)
                                    .addComponent(etipassword)
                                    .addGap(22, 22, 22))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(etiuser, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(CampoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                .addComponent(camporpassword))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btningresar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnlogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiuser))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etipassword)
                    .addComponent(camporpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btningresar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnlogo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void validarusuario() throws SQLException, ClassNotFoundException {
       
    String rol = "";
    int resultado = 0;

    String usuario = CampoUsuario.getText();
    String clave = String.valueOf(camporpassword.getPassword());
    String user = "";
    String pass = "";
    String Encripclave = DigestUtils.md5Hex(clave);
    System.out.println("md5:" + Encripclave);
    try {
        Connection con = null;

        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quick_hotel", "root", "");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from  usuarios_login where usuario='" + usuario + "'and contrasena='" + Encripclave + "'");

        if (rs.next()) {
            user = (rs.getString(1));
            pass = (rs.getString(2));
            rol = (rs.getString(3));

            
             ////System.out.println("md5:" + Encripclave);

            if (usuario.equals(user) & Encripclave.equals(pass) & rol.equals("admin")) {
                MenuPrincipal M = new MenuPrincipal();
                M.setVisible(true);
                JOptionPane.showMessageDialog(null, "::::BIENVENIDO A QUICK HOTEL:::::" + usuario);
                M.rolAdmin();
                this.setVisible(false);
                user();

            }
            if (usuario.equals(user) & Encripclave.equals(pass) & rol.equals("estandar")) {
                MenuPrincipal M = new MenuPrincipal();
                M.setVisible(true);
                M.rolEstandar();
                JOptionPane.showMessageDialog(null, ":::::BIENVENIDO A QUICK HOTEL::::" + usuario);
                this.setVisible(false);
                user();
            }

            return;
        } else {
            JOptionPane.showMessageDialog(null, "Usuario O Contraseña incorrecto");
            CampoUsuario.setText("");
            camporpassword.setText("");
        }
    } catch (Exception e) {
        Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, e);
    }
    }

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO 

    }//GEN-LAST:event_jTextField2ActionPerformed

    private void btnlogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnlogoActionPerformed

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btncerrarActionPerformed

    private void btningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresarActionPerformed
        if (CampoUsuario.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Ingrese usuario y contraseña para ingresar");
            CampoUsuario.requestFocus();
            return;
        }
        try {
            validarusuario();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "MENSAJE" + ex);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "MENSAJE1" + ex);
        }
    }//GEN-LAST:event_btningresarActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField CampoUsuario;
    private javax.swing.JButton btncerrar;
    private javax.swing.JButton btningresar;
    private javax.swing.JButton btnlogo;
    public static javax.swing.JPasswordField camporpassword;
    private javax.swing.JLabel etipassword;
    private javax.swing.JLabel etiuser;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
