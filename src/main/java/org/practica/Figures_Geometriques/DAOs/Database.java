package org.practica.Figures_Geometriques.DAOs;

import org.practica.Figures_Geometriques.utils.Myproperties;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Database {
    Myproperties myproperties = new Myproperties();

    public Connection getConnection(){
        try{
            Class.forName("org.sqlite.JDBC");

            Properties properties = myproperties.getProps();
            String jdbcStr = properties.getProperty("jdbcString");

            Connection con = DriverManager.getConnection(jdbcStr);
            return con;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
