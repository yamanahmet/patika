package dao;

import util.DBConnection;

import java.sql.Connection;
import java.sql.Statement;

public class TraineeDAO {

    private Connection db;

    public Connection getDb() {

        if (this.db == null){
            DBConnection dbConnection = new DBConnection();
            this.db = dbConnection.connection();
        }
        return db;
    }

    public void createTrainee(){

        try{
            // create statement - connect
            Statement statement = this.getDb().createStatement();

            // prepare query
            String query =
                    "CREATE TABLE trainee (" +
                            "id serial primary key," +
                    "name varchar(255)," +
                    "age Integer)";

            statement.executeQuery(query);



        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
