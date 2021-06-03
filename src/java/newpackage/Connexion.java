/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DellE5570
 */
public class Connexion {

    public static java.sql.Connection Seconnecter() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            java.sql.Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "123");
            System.out.println("Successfully connected to oracle database ");
            return conn;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static void main(String[] args) {
        Seconnecter();
    }

}
