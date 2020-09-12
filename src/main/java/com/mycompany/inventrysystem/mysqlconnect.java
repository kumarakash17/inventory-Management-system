/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.inventrysystem;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author KIIT
 */
public class mysqlconnect {
    Connection con;
    public  Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","2222");
           // JOptionPane.showMessageDialog(null, "DataBase connection is "+"succussfull... ");
        }
        catch(Exception e){
            System.out.print( "Error in mysql connection... "+e);
        }
        return con;
        
    }
    public static void main(String[] args) {
        Connection connection = new mysqlconnect().getConnection();
        System.out.println(connection);
        
    }
    
    
}
