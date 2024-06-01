package com.reges.regesspring.rdn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection getConnection(){
    
        try{
            String USER = "root";
            String PASSWORD = "password";
            String URL = "jdbc:mysql://localhost:3306/db_supermercado_reges";
//            String URL = "jdbc:mysql://localhost:3306/db_supermercado_reges";
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }
        
        catch(SQLException ex){
            throw new RuntimeException(ex);
        
        }
    }

}
