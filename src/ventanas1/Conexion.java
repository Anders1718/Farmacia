/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas1;

/**
 *
 * @author User
 */
public class Conexion {
    static String user = "root";
    static String clave = "";
    static String url = "jdbc:mysql://localhost:3306/drogueria";
    
    static String nombreNegocio = "Droguería Ruiz";
    
    static String correo = " "; //
    static String contrasena = " "; //

    public static String getNombreNegocio() {
        return nombreNegocio;
    }

    public static void setNombreNegocio(String nombreNegocio) {
        Conexion.nombreNegocio = nombreNegocio;
    }
    
    
}
