/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas1;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
/**
 *
 * @author User
 */
public class Clientes extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Clientes() {
        initComponents();
        this.setTitle(Conexion.nombreNegocio+": clientes");
        transpareciaBoton();
        this.setLocationRelativeTo(null);
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

        jButtonClientes = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonAtras = new javax.swing.JButton();
        jButtonBuscarCliente = new javax.swing.JButton();
        jButtonClienteModificar = new javax.swing.JButton();
        jLabelLogo = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonClientes.setBackground(new java.awt.Color(0, 153, 153));
        jButtonClientes.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonClientes.setForeground(new java.awt.Color(51, 51, 51));
        jButtonClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/productos bien.png"))); // NOI18N
        jButtonClientes.setText("REGISTRAR");
        jButtonClientes.setBorderPainted(false);
        jButtonClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonClientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClientesActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 190, 210));

        jButtonModificar.setBackground(new java.awt.Color(255, 0, 51));
        jButtonModificar.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonModificar.setForeground(new java.awt.Color(51, 51, 51));
        jButtonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/facturar bien.png"))); // NOI18N
        jButtonModificar.setText("SEPARADOS");
        jButtonModificar.setBorderPainted(false);
        jButtonModificar.setContentAreaFilled(false);
        jButtonModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 330, 280, 230));

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
        getContentPane().add(jButtonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, 120, 40));

        jButtonBuscarCliente.setBackground(new java.awt.Color(172, 172, 16));
        jButtonBuscarCliente.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonBuscarCliente.setForeground(new java.awt.Color(51, 51, 51));
        jButtonBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/buscar bien.png"))); // NOI18N
        jButtonBuscarCliente.setText("BUSCAR");
        jButtonBuscarCliente.setBorderPainted(false);
        jButtonBuscarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonBuscarCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 190, -1));

        jButtonClienteModificar.setBackground(new java.awt.Color(255, 0, 51));
        jButtonClienteModificar.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonClienteModificar.setForeground(new java.awt.Color(51, 51, 51));
        jButtonClienteModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/modificar bien.png"))); // NOI18N
        jButtonClienteModificar.setText("MODIFICAR");
        jButtonClienteModificar.setBorderPainted(false);
        jButtonClienteModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonClienteModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonClienteModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClienteModificarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonClienteModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 40, 200, 210));

        jLabelLogo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/cajon_1.png"))); // NOI18N
        getContentPane().add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, -1, -1));

        jLabelFondo.setBackground(new java.awt.Color(204, 204, 204));
        jLabelFondo.setOpaque(true);
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, -10, 1310, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void transpareciaBoton(){
    jButtonAtras.setOpaque(false);
        jButtonAtras.setContentAreaFilled(false);
        jButtonAtras.setBorderPainted(false);
        jButtonClientes.setOpaque(false);
        jButtonClientes.setContentAreaFilled(false);
        jButtonClientes.setBorderPainted(false);
       jButtonBuscarCliente.setOpaque(false);
        jButtonBuscarCliente.setContentAreaFilled(false);
        jButtonBuscarCliente.setBorderPainted(false);
        jButtonClienteModificar.setOpaque(false);
        jButtonClienteModificar.setContentAreaFilled(false);
       jButtonClienteModificar.setBorderPainted(false);
       
    }
    private void jButtonClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClientesActionPerformed
        RegistrarCliente R = new RegistrarCliente();
        R.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonClientesActionPerformed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        Inicio I = new Inicio();
        I.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jButtonBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarClienteActionPerformed
        BuscarCliente B = new BuscarCliente();
        B.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonBuscarClienteActionPerformed

    private void jButtonClienteModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClienteModificarActionPerformed
        ModificarCliente M = new ModificarCliente();
        M.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonClienteModificarActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        Separado M = new Separado();
        M.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonModificarActionPerformed

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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonBuscarCliente;
    private javax.swing.JButton jButtonClienteModificar;
    private javax.swing.JButton jButtonClientes;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelLogo;
    // End of variables declaration//GEN-END:variables
}
