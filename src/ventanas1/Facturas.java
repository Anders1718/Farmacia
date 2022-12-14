/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas1;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author User
 */
public class Facturas extends javax.swing.JFrame {

    String user = Conexion.user;
    String clave = Conexion.clave;
    String url = Conexion.url;
    Connection con;
    Statement stmt;
    ResultSet rs;
    String datos[] = new String[5];
    DefaultTableModel modelo = new DefaultTableModel();

    /**
     * Creates new form Inicio
     */
    public Facturas() {

        initComponents();
        this.setTitle(Conexion.nombreNegocio + ": facturas");
        this.setLocationRelativeTo(null);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Facturas.class.getName()).log(Level.SEVERE, null, ex);
        }
        modelo.addColumn("ID");
        modelo.addColumn("FECHA");
        modelo.addColumn("MARCA");
        modelo.addColumn("NÚMERO");
        modelo.addColumn("VALOR");
        buscarProducto("");
        jTextFieldFecha.setText(fecha());
        jTextFieldBuscar.setText(fecha());
        sumarDatosNeto();

    }

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes1/icono.png"));
        return retValue;
    }

    void buscarProducto(String buscar) {
        modelo.setRowCount(0);

        //TablaDatos.setModel(modelo);
        try {
            con = DriverManager.getConnection(url, user, clave);
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM facturas WHERE fecha LIKE '%" + buscar + "%'");
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);

                modelo.addRow(datos);

            }
            TablaDatos.setModel(modelo);
            TableColumn columna = TablaDatos.getColumn("ID");
            TableColumn columna1 = TablaDatos.getColumn("VALOR");
            TableColumn columna2 = TablaDatos.getColumn("FECHA");
            columna.setMinWidth(38);
            columna.setMaxWidth(38);
            columna1.setMinWidth(75);
            columna1.setMaxWidth(75);
            columna2.setMinWidth(85);
            columna2.setMaxWidth(85);
        } catch (SQLException ex) {
            Logger.getLogger(BuscarProducto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    void refrescarPagina(String refrescar) {
        try {
            con = DriverManager.getConnection(url, user, clave);
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM facturas ");
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);

                modelo.addRow(datos);
            }
            TablaDatos.setModel(modelo);
            TableColumn columna = TablaDatos.getColumn("ID");
            columna.setMinWidth(38);
            columna.setMaxWidth(38);
        } catch (SQLException ex) {
            Logger.getLogger(BuscarProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldBuscar = new javax.swing.JTextField();
        jLabelIdListo = new javax.swing.JLabel();
        jLabelId = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabelPrecio5 = new javax.swing.JLabel();
        jButtonCancelar2 = new javax.swing.JButton();
        jTextFieldNumero = new javax.swing.JTextField();
        jTextMarca = new javax.swing.JTextField();
        jTextFieldFecha = new javax.swing.JTextField();
        jLabelNombres = new javax.swing.JLabel();
        jTextFieldMonto = new javax.swing.JTextField();
        jButtonListo = new javax.swing.JButton();
        jButtonCancelar1 = new javax.swing.JButton();
        jLabelTotal = new javax.swing.JLabel();
        jLabelPrecio3 = new javax.swing.JLabel();
        jLabelPrecio4 = new javax.swing.JLabel();
        jLabelPrecio2 = new javax.swing.JLabel();
        jButtonAtras = new javax.swing.JButton();
        jButtonInicio = new javax.swing.JButton();
        jScrollPaneProducto = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        jLabelLogo = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();
        jLabelSumas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldBuscar.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jTextFieldBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0)));
        jTextFieldBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuscarActionPerformed(evt);
            }
        });
        jTextFieldBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldBuscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldBuscarKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 260, -1));

        jLabelIdListo.setBackground(new java.awt.Color(102, 255, 102));
        jLabelIdListo.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelIdListo.setOpaque(true);
        getContentPane().add(jLabelIdListo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 520, 90, 30));

        jLabelId.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelId.setForeground(new java.awt.Color(51, 51, 51));
        jLabelId.setText("ID:");
        getContentPane().add(jLabelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, -1, -1));

        jButton3.setText("BUSCAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, -1, -1));

        jLabel5.setBackground(new java.awt.Color(204, 0, 51));
        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("BUSCAR POR FECHA:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        jLabelPrecio5.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelPrecio5.setForeground(new java.awt.Color(51, 51, 51));
        jLabelPrecio5.setText("NÚMERO:");
        getContentPane().add(jLabelPrecio5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 120, -1));

        jButtonCancelar2.setBackground(new java.awt.Color(204, 0, 0));
        jButtonCancelar2.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonCancelar2.setForeground(new java.awt.Color(51, 51, 51));
        jButtonCancelar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/x cancelar.png"))); // NOI18N
        jButtonCancelar2.setText("ELIMINAR");
        jButtonCancelar2.setBorderPainted(false);
        jButtonCancelar2.setContentAreaFilled(false);
        jButtonCancelar2.setDefaultCapable(false);
        jButtonCancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelar2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 570, 230, 50));

        jTextFieldNumero.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jTextFieldNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroActionPerformed(evt);
            }
        });
        jTextFieldNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNumeroKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 240, -1));

        jTextMarca.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jTextMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMarcaActionPerformed(evt);
            }
        });
        jTextMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextMarcaKeyTyped(evt);
            }
        });
        getContentPane().add(jTextMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 240, -1));

        jTextFieldFecha.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jTextFieldFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldFechaKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 240, -1));

        jLabelNombres.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelNombres.setForeground(new java.awt.Color(51, 51, 51));
        jLabelNombres.setText("MARCA:");
        getContentPane().add(jLabelNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 110, -1));

        jTextFieldMonto.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jTextFieldMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMontoActionPerformed(evt);
            }
        });
        jTextFieldMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldMontoKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 240, -1));

        jButtonListo.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonListo.setForeground(new java.awt.Color(51, 51, 51));
        jButtonListo.setText("REGISTRAR FACTURA");
        jButtonListo.setContentAreaFilled(false);
        jButtonListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonListo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, -1, 40));

        jButtonCancelar1.setBackground(new java.awt.Color(204, 0, 0));
        jButtonCancelar1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonCancelar1.setForeground(new java.awt.Color(51, 51, 51));
        jButtonCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/x cancelar.png"))); // NOI18N
        jButtonCancelar1.setText("CANCELAR");
        jButtonCancelar1.setBorderPainted(false);
        jButtonCancelar1.setContentAreaFilled(false);
        jButtonCancelar1.setDefaultCapable(false);
        jButtonCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelar1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 230, 50));

        jLabelTotal.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTotal.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelTotal.setOpaque(true);
        getContentPane().add(jLabelTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 580, 250, 30));

        jLabelPrecio3.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelPrecio3.setForeground(new java.awt.Color(51, 51, 51));
        jLabelPrecio3.setText("TOTAL FACTURAS:");
        getContentPane().add(jLabelPrecio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 580, 220, -1));

        jLabelPrecio4.setBackground(new java.awt.Color(0, 0, 0));
        jLabelPrecio4.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelPrecio4.setForeground(new java.awt.Color(51, 51, 51));
        jLabelPrecio4.setText("FECHA:");
        getContentPane().add(jLabelPrecio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 90, -1));

        jLabelPrecio2.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelPrecio2.setForeground(new java.awt.Color(51, 51, 51));
        jLabelPrecio2.setText("MONTO:");
        getContentPane().add(jLabelPrecio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 100, -1));

        jButtonAtras.setBackground(new java.awt.Color(153, 153, 0));
        jButtonAtras.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonAtras.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/atrasBlanco.png"))); // NOI18N
        jButtonAtras.setBorderPainted(false);
        jButtonAtras.setContentAreaFilled(false);
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 90, 40));

        jButtonInicio.setBackground(new java.awt.Color(153, 0, 153));
        jButtonInicio.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonInicio.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/inicio.png"))); // NOI18N
        jButtonInicio.setBorderPainted(false);
        jButtonInicio.setContentAreaFilled(false);
        jButtonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInicioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 30, -1, -1));

        TablaDatos = new javax.swing.JTable(){
            public boolean isCellEditable(int riwIndex, int colIndex){
                return false;
            }
        };
        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TablaDatos.getTableHeader().setReorderingAllowed(false);
        TablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDatosMouseClicked(evt);
            }
        });
        jScrollPaneProducto.setViewportView(TablaDatos);

        getContentPane().add(jScrollPaneProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 650, 350));

        jLabelLogo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/cajon_1.png"))); // NOI18N
        getContentPane().add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, -1, -1));

        jLabelFondo.setBackground(new java.awt.Color(204, 204, 204));
        jLabelFondo.setOpaque(true);
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 1310, 650));

        jLabelSumas.setText("jLabel1");
        getContentPane().add(jLabelSumas, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 470, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static String fecha() {
        Date fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatofecha.format(fecha);
    }

    void sumarDatosNeto() {
        int cont = 0;
        int filas = TablaDatos.getRowCount();
        for (int i = 0; i < filas; i++) {
            cont += Integer.parseInt((String) TablaDatos.getValueAt(i, 4));
        }
        jLabelTotal.setText(String.valueOf(cont));
    }

    void eliminar() {
        try {
            con = DriverManager.getConnection(url, user, clave);
            stmt = con.createStatement();

            stmt.executeUpdate("DELETE FROM facturas WHERE id = '"
                    + jLabelIdListo.getText() + "'");
        } catch (SQLException ex) {
            Logger.getLogger(Registrar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    private void jTextMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextMarcaKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_jTextMarcaKeyTyped

    private void jTextFieldMontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMontoKeyTyped
        char n = evt.getKeyChar();
        if (n < '0' || n > '9')
            evt.consume();
    }//GEN-LAST:event_jTextFieldMontoKeyTyped

    private void jTextFieldMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMontoActionPerformed

    private void jButtonListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListoActionPerformed
        boolean sw2 = false;
        if (jTextMarca.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No ingresó la descripción del gasto");
            sw2 = true;
        } else if (jTextFieldMonto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No ingresó el precio del gasto");
            sw2 = true;
        } else if (jTextFieldFecha.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No ingresó la fecha");
            sw2 = true;
        } else if (sw2 == false) {

            try {
                con = DriverManager.getConnection(url, user, clave);
                stmt = con.createStatement();
                stmt.executeUpdate("INSERT INTO facturas VALUES('0', '" + jTextFieldFecha.getText() + "' , "
                        + "'" + jTextMarca.getText() + "', '" + jTextFieldNumero.getText() + "' , "
                        + "'" + jTextFieldMonto.getText() + "')");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "error");
                Logger.getLogger(Facturas.class.getName()).log(Level.SEVERE, null, ex);
            }

            JOptionPane.showMessageDialog(null, "Registro exitoso");
            modelo.setRowCount(0);

            jTextFieldMonto.setText("");
            jTextMarca.setText("");

            jLabelSumas.setText("");

            refrescarPagina("");
            sumarDatosNeto();
        }
    }//GEN-LAST:event_jButtonListoActionPerformed

    private void jButtonCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelar1ActionPerformed
        jTextMarca.setText("");
        jTextFieldMonto.setText("");
    }//GEN-LAST:event_jButtonCancelar1ActionPerformed

    private void jTextMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextMarcaActionPerformed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        Inventario I = new Inventario();
        I.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jButtonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicioActionPerformed
        Inicio I = new Inicio();
        I.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonInicioActionPerformed

    private void jTextFieldFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFechaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFechaKeyTyped

    private void jTextFieldNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumeroActionPerformed

    private void jTextFieldNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNumeroKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumeroKeyTyped

    private void jTextFieldBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuscarActionPerformed
        buscarProducto(jTextFieldBuscar.getText());
        sumarDatosNeto();
    }//GEN-LAST:event_jTextFieldBuscarActionPerformed

    private void jTextFieldBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscarKeyReleased

    }//GEN-LAST:event_jTextFieldBuscarKeyReleased

    private void jTextFieldBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscarKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_jTextFieldBuscarKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        buscarProducto(jTextFieldBuscar.getText());
        sumarDatosNeto();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonCancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelar2ActionPerformed
        if (jLabelIdListo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No seleccionó el producto");
        } else {
            int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar el producto?", "Alerta!", JOptionPane.YES_NO_OPTION);
            if (resp == 0) {
                eliminar();
                buscarProducto(jTextFieldBuscar.getText());
                sumarDatosNeto();
            }
        }

    }//GEN-LAST:event_jButtonCancelar2ActionPerformed

    private void TablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDatosMouseClicked
        int seleccionar = TablaDatos.rowAtPoint(evt.getPoint());

        jLabelIdListo.setText(String.valueOf(TablaDatos.getValueAt(seleccionar, 0)));
    }//GEN-LAST:event_TablaDatosMouseClicked

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
            java.util.logging.Logger.getLogger(Facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Facturas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable TablaDatos;
    private javax.swing.JButton jButton3;
    public javax.swing.JButton jButtonAtras;
    public javax.swing.JButton jButtonCancelar1;
    public javax.swing.JButton jButtonCancelar2;
    private javax.swing.JButton jButtonInicio;
    private javax.swing.JButton jButtonListo;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelId;
    public static javax.swing.JLabel jLabelIdListo;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelNombres;
    private javax.swing.JLabel jLabelPrecio2;
    private javax.swing.JLabel jLabelPrecio3;
    private javax.swing.JLabel jLabelPrecio4;
    private javax.swing.JLabel jLabelPrecio5;
    private javax.swing.JLabel jLabelSumas;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JScrollPane jScrollPaneProducto;
    public javax.swing.JTextField jTextFieldBuscar;
    private javax.swing.JTextField jTextFieldFecha;
    public javax.swing.JTextField jTextFieldMonto;
    public javax.swing.JTextField jTextFieldNumero;
    public javax.swing.JTextField jTextMarca;
    // End of variables declaration//GEN-END:variables
}
