/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quick.hotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import static quick.hotel.Registro.combociudad;
import static quick.hotel.Registro.combodpto;
import static quick.hotel.Registro.combopais;


/**
 *
 * @author ALIENWARE
 */
public final class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        reporte();
     
      
          
    }
    public void rolEstandar() {
        JACTIVOS.setEnabled(false);
        JFACTURA.setEnabled(false);
        JCONSULTA.setEnabled(false);
        J_OPERACIONES.setEnabled(false);
        JESTADO.setEnabled(false);
        JUSUARIOS.setEnabled(false);
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    public void rolAdmin() {
        JACTIVOS.setEnabled(true);
        JFACTURA.setEnabled(true);
        JCONSULTA.setEnabled(true);
        J_OPERACIONES.setEnabled(true);
        JESTADO.setEnabled(true);
        JUSUARIOS.setEnabled(true);
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        rSLabelFecha1 = new rojeru_san.RSLabelFecha();
        jLabel3 = new javax.swing.JLabel();
        UserLogin = new javax.swing.JLabel();
        rSLabelHora1 = new rojeru_san.RSLabelHora();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar3 = new javax.swing.JMenuBar();
        itemcrear = new javax.swing.JMenu();
        JRESERVA = new javax.swing.JMenu();
        JREPORTES = new javax.swing.JMenu();
        JFACTURA = new javax.swing.JMenu();
        J_OPERACIONES = new javax.swing.JMenu();
        JCONSULTA = new javax.swing.JMenu();
        JESTADO = new javax.swing.JMenu();
        JACTIVOS = new javax.swing.JMenu();
        JUSUARIOS = new javax.swing.JMenu();
        Jcerrar = new javax.swing.JMenu();

        jLabel1.setText("jLabel1");

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenu5.setText("File");
        jMenuBar4.add(jMenu5);

        jMenu8.setText("Edit");
        jMenuBar4.add(jMenu8);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);

        jTextField1.setText("jTextField1");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/imagen.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("USUARIO :");

        UserLogin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("FECHA:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("HORA:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UserLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSLabelFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSLabelHora1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rSLabelHora1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(rSLabelFecha1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(UserLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3)))
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2))
        );

        jMenuBar3.setAlignmentX(9.0F);
        jMenuBar3.setAlignmentY(9.0F);

        itemcrear.setText("REGISTROS");
        itemcrear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        itemcrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemcrearMouseClicked(evt);
            }
        });
        itemcrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemcrearActionPerformed(evt);
            }
        });
        jMenuBar3.add(itemcrear);

        JRESERVA.setText("RECERVACIONES");
        JRESERVA.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JRESERVA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JRESERVAMouseClicked(evt);
            }
        });
        jMenuBar3.add(JRESERVA);

        JREPORTES.setText("REPOSTES");
        JREPORTES.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JREPORTES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JREPORTESMouseClicked(evt);
            }
        });
        jMenuBar3.add(JREPORTES);

        JFACTURA.setText("FACTURACION");
        JFACTURA.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuBar3.add(JFACTURA);

        J_OPERACIONES.setText("OPERACIONES");
        J_OPERACIONES.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuBar3.add(J_OPERACIONES);

        JCONSULTA.setText("CONSULTAS");
        JCONSULTA.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuBar3.add(JCONSULTA);

        JESTADO.setText("ESTADO HABITACION");
        JESTADO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuBar3.add(JESTADO);

        JACTIVOS.setText("ACTIVOS");
        JACTIVOS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuBar3.add(JACTIVOS);

        JUSUARIOS.setText("USUARIOS");
        JUSUARIOS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuBar3.add(JUSUARIOS);

        Jcerrar.setText("CERRAR");
        Jcerrar.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        Jcerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JcerrarMouseClicked(evt);
            }
        });
        Jcerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcerrarActionPerformed(evt);
            }
        });
        jMenuBar3.add(Jcerrar);

        setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JcerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcerrarActionPerformed
        // TODO add your handling code here:
     
      
    }//GEN-LAST:event_JcerrarActionPerformed

    private void JcerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JcerrarMouseClicked
        // TODO add your handling code here:
        System.exit(0);
        
       
    }//GEN-LAST:event_JcerrarMouseClicked

    private void itemcrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemcrearActionPerformed
        // TODO add your handling code here:
       Registro r=new Registro();
           r.setVisible(true);
    }//GEN-LAST:event_itemcrearActionPerformed

    private void itemcrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemcrearMouseClicked
        Registro r = new Registro();
        r.setVisible(true);
        r.setLocationRelativeTo(this);
    }//GEN-LAST:event_itemcrearMouseClicked

    private void JRESERVAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JRESERVAMouseClicked
        Reservas R = new Reservas();
        R.setVisible(true);
        R.setLocationRelativeTo(this);
        R.setTitle(".....::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::SISTEMA DE RESERVAS::::::::::..............");
    }//GEN-LAST:event_JRESERVAMouseClicked

    private void JREPORTESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JREPORTESMouseClicked
        // TODO add your handling code here:
        
        reporte();
        
        
        
    }//GEN-LAST:event_JREPORTESMouseClicked

    /**
     * @param args the command line arguments
     */
    void reporte (){
        Conexion cc = new Conexion();
        Connection cn = cc.getConnection();
        try {
            
       String  Reporte = System.getProperty("user.dir") + "/src/Reporte/ReporteReservas.jasper";
            JasperReport jasperReport = (JasperReport) JRLoader.loadObjectFromFile(Reporte);
            JasperPrint print = JasperFillManager.fillReport(jasperReport, null, cn);
            JasperViewer view = new JasperViewer(print, false);
            view.setVisible(true);

        } catch (Exception e) {
            System.err.println("Error al generar el reporte -> " + e.getMessage());
        }
    }
    void cargar(){
        try {
            Connection con = null;

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quick_hotel", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from INFORMACION ");

            while (rs.next()) {
                combopais.addItem(rs.getString(1));
                combodpto.addItem(rs.getString(2));
                combociudad.addItem(rs.getString(3));

            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }   
    
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JACTIVOS;
    private javax.swing.JMenu JCONSULTA;
    private javax.swing.JMenu JESTADO;
    private javax.swing.JMenu JFACTURA;
    private javax.swing.JMenu JREPORTES;
    private javax.swing.JMenu JRESERVA;
    private javax.swing.JMenu JUSUARIOS;
    private javax.swing.JMenu J_OPERACIONES;
    private javax.swing.JMenu Jcerrar;
    public static javax.swing.JLabel UserLogin;
    private javax.swing.JMenu itemcrear;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private rojeru_san.RSLabelFecha rSLabelFecha1;
    private rojeru_san.RSLabelHora rSLabelHora1;
    // End of variables declaration//GEN-END:variables
}
