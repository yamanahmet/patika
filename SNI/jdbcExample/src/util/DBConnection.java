package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public Connection connection(){



        Connection connection = null;

        try{
            Class.forName("org.postgresql.Driver");

            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "password");

        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        return connection;
    }
}
