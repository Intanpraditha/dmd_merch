/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dmd_merh;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author INTAN
 */
public class koneksi {
    Connection con;
    Statement stm;
    
    public void config(){
        try {
          Class.forName("com.mysql.jdbc.Driver");
          con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/merch1","root","");
          stm = (Statement) con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "koneksi gagal"+e.getMessage());
        }
    }
    
}
