package dao;

import entity.Trainee;
import util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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
            /*String query =
                    "CREATE TABLE trainee (" +
                    "id serial primary key," +
                    "name varchar(255)," +
                    "age Integer)";

            statement.executeQuery(query); */

            String insertQuery =
                    "INSERT INTO trainee(id, name, age) VALUES (1, 'Ahmet', 25);"+
                    "INSERT INTO trainee(id, name, age) VALUES (2,'Ozan', 22);";

            statement.executeQuery(insertQuery);


        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void traineeUpdate(int id, String name, int age){

        String updateQuery = "UPDATE trainee SET" +
                " name = ?," +
                " age = ?" +
                " WHERE id = ?";

        try (PreparedStatement preparedStatement = this.getDb().prepareStatement(updateQuery)) {
            preparedStatement.setInt(3,id);
            preparedStatement.setInt(2,age);
            preparedStatement.setString(1,name);

            int rows =  preparedStatement.executeUpdate();
            if (rows > 0){
                System.out.println("rows " + rows);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }

    }

    public void traineeDelete(int id){
        String deleteQuery = "DELETE FROM trainee" +
                " WHERE id = ?";
        try (PreparedStatement preparedStatement = this.getDb().prepareStatement(deleteQuery)){
            preparedStatement.setInt(1,id);
            preparedStatement.execute();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }



    }

    public List<Trainee> traineeRead(){
        String readQuery = "SELECT * FROM trainee";

        // statement
        Statement statement = null;

        int id, age;
        String name;
        List<Trainee> traineeList = new ArrayList<>();

        try {
            statement = this.getDb().createStatement();
            // execute query
            ResultSet resultSet = statement.executeQuery(readQuery);
            // close
            getDb().close();



            while (resultSet.next()){

                id =  resultSet.getInt("id");
                name = resultSet.getString("name");
                age =  resultSet.getInt("age");

                traineeList.add(new Trainee(id, name, age));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return traineeList;

    }

}
