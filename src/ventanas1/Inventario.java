/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas1;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class Inventario extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inventario() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle(Conexion.nombreNegocio+": productos");
        transpareciaBoton();
        //setIconImage(new ImageIcon(getClass().getResource("imagenes1/LogoFamil.png")).getImage());
    }
    public Image getIconImage(){
       Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes1/icono.png"));
       return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonRegistrar = new javax.swing.JButton();
        jButtonIngreso1 = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jButtonIngreso = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonAtras = new javax.swing.JButton();
        jLabelLogo = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonRegistrar.setBackground(new java.awt.Color(0, 153, 51));
        jButtonRegistrar.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonRegistrar.setForeground(new java.awt.Color(51, 51, 51));
        jButtonRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/productos bien.png"))); // NOI18N
        jButtonRegistrar.setText("REPORTES");
        jButtonRegistrar.setBorderPainted(false);
        jButtonRegistrar.setFocusPainted(false);
        jButtonRegistrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonRegistrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, 240));

        jButtonIngreso1.setBackground(new java.awt.Color(255, 153, 51));
        jButtonIngreso1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonIngreso1.setForeground(new java.awt.Color(51, 51, 51));
        jButtonIngreso1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/icono_factura.png"))); // NOI18N
        jButtonIngreso1.setText("FACTURAS");
        jButtonIngreso1.setBorder(null);
        jButtonIngreso1.setBorderPainted(false);
        jButtonIngreso1.setContentAreaFilled(false);
        jButtonIngreso1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonIngreso1.setName(""); // NOI18N
        jButtonIngreso1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonIngreso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngreso1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonIngreso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 440, 160, 170));

        jButtonBuscar.setBackground(new java.awt.Color(102, 51, 255));
        jButtonBuscar.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonBuscar.setForeground(new java.awt.Color(51, 51, 51));
        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/buscar bien.png"))); // NOI18N
        jButtonBuscar.setText("EN BODEGA");
        jButtonBuscar.setBorderPainted(false);
        jButtonBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 270, -1));

        jButtonIngreso.setBackground(new java.awt.Color(255, 153, 51));
        jButtonIngreso.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonIngreso.setForeground(new java.awt.Color(51, 51, 51));
        jButtonIngreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/inventario bien.png"))); // NOI18N
        jButtonIngreso.setText("GASTOS");
        jButtonIngreso.setBorder(null);
        jButtonIngreso.setBorderPainted(false);
        jButtonIngreso.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonIngreso.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 320, 280, 250));

        jButtonModificar.setBackground(new java.awt.Color(255, 0, 51));
        jButtonModificar.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonModificar.setForeground(new java.awt.Color(51, 51, 51));
        jButtonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/facturar bien.png"))); // NOI18N
        jButtonModificar.setText("VENDIDO");
        jButtonModificar.setBorderPainted(false);
        jButtonModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 60, 280, 230));

        jButtonAtras.setBackground(new java.awt.Color(153, 153, 0));
        jButtonAtras.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonAtras.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/atrasBlanco.png"))); // NOI18N
        jButtonAtras.setBorderPainted(false);
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 80, 40));

        jLabelLogo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/cajon_1.png"))); // NOI18N
        getContentPane().add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, -1, -1));

        jLabelFondo.setBackground(new java.awt.Color(204, 204, 204));
        jLabelFondo.setOpaque(true);
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 0, 1310, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void transpareciaBoton(){
        jButtonAtras.setOpaque(false);
        jButtonAtras.setContentAreaFilled(false);
        jButtonAtras.setBorderPainted(false);
        jButtonModificar.setOpaque(false);
        jButtonModificar.setContentAreaFilled(false);
        jButtonModificar.setBorderPainted(false);
       jButtonIngreso.setOpaque(false);
        jButtonIngreso.setContentAreaFilled(false);
        jButtonIngreso.setBorderPainted(false);
        jButtonBuscar.setOpaque(false);
        jButtonBuscar.setContentAreaFilled(false);
       jButtonBuscar.setBorderPainted(false);
       jButtonRegistrar.setOpaque(false);
        jButtonRegistrar.setContentAreaFilled(false);
        jButtonRegistrar.setBorderPainted(false);
    }
    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        Reporte R = new Reporte();
        R.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        Bodega B = new Bodega();
        B.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresoActionPerformed
        Gastos In = new Gastos();
        In.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonIngresoActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        Vendido M = new Vendido();
        M.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        Inicio I = new Inicio();
        I.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jButtonIngreso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngreso1ActionPerformed
        Facturas f = new Facturas();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonIngreso1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonIngreso;
    private javax.swing.JButton jButtonIngreso1;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelLogo;
    // End of variables declaration//GEN-END:variables
}
