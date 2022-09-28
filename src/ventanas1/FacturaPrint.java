/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas1;



import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;
import static ventanas1.FacturaPanel.TablaSeleccionados;

/**
 *
 * @author User
 */
public class FacturaPrint extends javax.swing.JDialog {
    String user = Conexion.user;
    String clave = Conexion.clave;
    String url = Conexion.url;
    Connection con ;
    Statement stmt;
    ResultSet rs;

    /**
     * Creates new form FacturaPrint
     * @param parent
     */
    public FacturaPrint(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Registrar.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    private FacturaPrint() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        facturaPanel1 = new ventanas1.FacturaPanel();
        jButton2 = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(170, 1));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(51, 204, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/guardar.png"))); // NOI18N
        jButton3.setText("ENVIAR");
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 120, 60));

        facturaPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facturaPanel1MouseClicked(evt);
            }
        });
        getContentPane().add(facturaPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, -20, 940, 821));

        jButton2.setBackground(new java.awt.Color(51, 204, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/impresoraBlanca.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 80, 50));

        Fondo.setBackground(new java.awt.Color(204, 204, 204));
        Fondo.setOpaque(true);
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    

    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        
        
        
       
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(facturaPanel1);

        if(job.printDialog()){
            try {
                job.print();
            } catch (PrinterException ex) {
            }
        }else{
            JOptionPane.showMessageDialog(this, "La impresión se canceló");
        } 
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void facturaPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facturaPanel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_facturaPanel1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(facturaPanel1);

        if(job.printDialog()){
            try {
                job.print();
            } catch (PrinterException ex) {
            }
        }else{
            JOptionPane.showMessageDialog(this, "La impresión se canceló");
        } 
        
        
        
        //Subir Pdf a MySql
        
        
        
        
        
        // ENVIAR CORREO 
        Properties propiedad = new Properties();
        propiedad.setProperty("mail.smtp.host", "smtp.gmail.com");
        propiedad.setProperty("mail.smtp.starttls.enable", "true");
        propiedad.setProperty("mail.smtp.port", "587");
        propiedad.setProperty("mail.smtp.auth", "true");
        
        
        Session sesion = Session.getDefaultInstance(propiedad);
        
        String correoEnvia = "paratodosoutlet@gmail.com";
        String contrasena = "gvxvggkzhzjfazaz";
        String destinatario = FacturaPanel.jTextFieldCorreo.getText();//cambiar por el correo del cliente a enviar 
        String asunto = "Envío factura Outlet Jeans de: "+FacturaPanel.jLabelPresentado1.getText()+" fecha: "+FacturaPanel.jLabelFecha1.getText()+"";
        String mensaje = "Muchas gracias por su compra, buen día.";
        
        BodyPart texto = new MimeBodyPart();
        try {
            texto.setText("Buen día, hago envío de la factura.\nMuchas gracias por su compra. ");
        } catch (MessagingException ex) {
            Logger.getLogger(FacturaPrint.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        BodyPart adjunto = new MimeBodyPart();
        try {
            adjunto.setDataHandler(new DataHandler(new FileDataSource("c:/Facturas/Factura.pdf")));//"c:/Users/User/Desktop/facturaFamil.jpg"
        } catch (MessagingException ex) {
            Logger.getLogger(FacturaPrint.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            adjunto.setFileName("Factura.pdf");//
        } catch (MessagingException ex) {
            Logger.getLogger(FacturaPrint.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        MimeMessage mail = new MimeMessage(sesion);
        MimeMultipart multiParte = new MimeMultipart();

        try {
            multiParte.addBodyPart(texto);
        } catch (MessagingException ex) {
            Logger.getLogger(FacturaPrint.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            multiParte.addBodyPart(adjunto);
        } catch (MessagingException ex) {
            Logger.getLogger(FacturaPrint.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            mail.setFrom(new InternetAddress (correoEnvia));
            mail.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
            mail.setSubject(asunto);
            mail.setText(mensaje);
            mail.setContent(multiParte);
            
            Transport transporte = sesion.getTransport("smtp");
            transporte.connect(correoEnvia, contrasena);
            transporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
            transporte.close();
            
            JOptionPane.showMessageDialog(null, "Correo enviado"); 
        } catch (AddressException ex) {
            Logger.getLogger(FacturaPrint.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(FacturaPrint.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
      
        
    
        
        
        
        //Subir vendido
        String precioCompra = null, cantidad = null;
        String talla = null, coleccion = null, sexo = null, marca = null , caracter=null;
        int fila = TablaSeleccionados.getRowCount();
        String datos[] = new String [6]; 
        if(fila>0){
            for(int i=0;i<fila ; i++){
                
                if("CRÉDITO".equals(FacturaPanel.jComboBoxTerminos.getSelectedItem().toString())){
                    try {
                        con = DriverManager.getConnection(url, user, clave);
                        stmt = con.createStatement();
                        stmt.executeUpdate("INSERT INTO separado VALUES('0','"+FacturaPanel.TablaSeleccionados.getValueAt(i, 1)+"', '"+FacturaPanel.jLabelPresentado1.getText()+"', "
                                + "'"+FacturaPanel.jLabelId.getText()+"' , '"+FacturaPanel.jLabelCedula1.getText()+"', "
                                        + "'"+FacturaPanel.jLabelFecha1.getText()+"', '"+FacturaPanel.TablaSeleccionados.getValueAt(i, 3)+"',"
                                + " '"+FacturaPanel.TablaSeleccionados.getValueAt(i, 4)+"',"
                                + " '0')");
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "error");
                        Logger.getLogger(Registrar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    double deuda =0;
                    
                    try {
                        con = DriverManager.getConnection(url, user, clave);
                        stmt = con.createStatement();
                        ResultSet rs = stmt.executeQuery("SELECT * FROM cliente"
                                + " WHERE cedula LIKE '%"+FacturaPanel.jLabelCedula1.getText()+"%' ");
                        while(rs.next()){
                            deuda = Double.parseDouble(rs.getString(7));
                        }

                    } catch (SQLException ex) {
                        Logger.getLogger(BuscarProducto.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    deuda += Double.parseDouble(FacturaPanel.jTextFieldTotal.getText()); 
                    
                    try {
                        con = DriverManager.getConnection(url, user, clave);
                        stmt = con.createStatement();
                        stmt.executeUpdate("UPDATE cliente SET deudas = '"+deuda+"' WHERE cedula = '"
                                +FacturaPanel.jLabelCedula1.getText()+"'");

                    } catch (SQLException ex) {
                        Logger.getLogger(Registrar.class.getName()).log(Level.SEVERE, null, ex);

                    }
                    
                    if(FacturaPanel.jTextFieldAbono.getText().isEmpty()){
                    
                    }else{
                        double abono = 0;

                        try {
                        con = DriverManager.getConnection(url, user, clave);
                        stmt = con.createStatement();
                        ResultSet rs = stmt.executeQuery("SELECT * FROM cliente WHERE cedula"
                                + " LIKE '%"+FacturaPanel.jLabelCedula1.getText()+"%' ");
                        while(rs.next()){
                            abono = Double.parseDouble(rs.getString(6));

                        }
                        abono += Double.parseDouble(FacturaPanel.jTextFieldAbono.getText());


                        } catch (SQLException ex) {
                            Logger.getLogger(BuscarProducto.class.getName()).log(Level.SEVERE, null, ex);
                        }

                        try {
                            con = DriverManager.getConnection(url, user, clave);
                            stmt = con.createStatement();
                            stmt.executeUpdate("UPDATE cliente SET favor = '"+abono+"' WHERE cedula = '"
                                +FacturaPanel.jLabelCedula1.getText()+"'");
                            } catch (SQLException ex) {
                                JOptionPane.showMessageDialog(null, "error");
                                Logger.getLogger(Registrar.class.getName()).log(Level.SEVERE, null, ex);
                            }
                    }
                   
                }else{
                
                try {
                con = DriverManager.getConnection(url, user, clave);
                stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM usuario WHERE codigo LIKE '%"+FacturaPanel.TablaSeleccionados.getValueAt(i, 1)+"%' ");
                while(rs.next()){
                    precioCompra = rs.getString(4);
                    marca = rs.getString(8);
                    talla = rs.getString(9);
                    coleccion = rs.getString(10);
                    sexo = rs.getString(11);
                    cantidad  = rs.getString(7);
                    caracter = rs.getString(3);

                }

                } catch (SQLException ex) {
                    Logger.getLogger(BuscarProducto.class.getName()).log(Level.SEVERE, null, ex);
                }
            
                int gananciaTotal = Integer.parseInt((String) FacturaPanel.TablaSeleccionados.getValueAt(i, 4)) - Integer.parseInt(precioCompra) ;
                int total = gananciaTotal * Integer.parseInt((String) FacturaPanel.TablaSeleccionados.getValueAt(i, 3));
                int quedan = Integer.parseInt(cantidad) - Integer.parseInt((String) FacturaPanel.TablaSeleccionados.getValueAt(i, 3));
                try {
                    con = DriverManager.getConnection(url, user, clave);
                    stmt = con.createStatement();
                    stmt.executeUpdate("INSERT INTO ventas VALUES('0','"+FacturaPanel.TablaSeleccionados.getValueAt(i, 1)+"', '"+precioCompra+"', "
                    + "'"+FacturaPanel.TablaSeleccionados.getValueAt(i, 4)+"', '"+gananciaTotal+"', '"+FacturaPanel.TablaSeleccionados.getValueAt(i, 3)+"', '"+marca+"',"
                            + "'"+talla+"', '"+coleccion+"', '"+sexo+"', '"+FacturaPanel.jLabelPresentado1.getText()+"',"
                                    + " '"+FacturaPanel.jLabelFecha1.getText()+"', '"+total+"' , '"+caracter+"' )");
                    
                    stmt.executeUpdate("UPDATE usuario SET cantidad = '"+quedan+"' WHERE codigo = '"
                    +FacturaPanel.TablaSeleccionados.getValueAt(i, 1)+"'");
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "error");
                        Logger.getLogger(Registrar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
         
        }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private ventanas1.FacturaPanel facturaPanel1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    // End of variables declaration//GEN-END:variables

    private void printerRecord(FacturaPanel facturaPanel1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
