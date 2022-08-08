import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            // driver
            Class.forName("org.postgresql.Driver");
            // get connection
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "password");
            // is success
            System.out.println("connection success");

            //String query = "CREATE TABLE trainee(" +
            //        "id Integer primary key, " +
            //        "name varchar(255)," +
            //        "age integer)";

            //String query =
            //        "INSERT INTO trainee(id, name, age) VALUES (1, 'ahmet',22);"+
            //        "INSERT INTO trainee(id, name, age) VALUES (2, 'mehmet',24);";

            //String query = "DELETE FROM traninee WHERE age > 23;";

            String query = "SELECT * FROM trainee";

            // statement
            Statement statement = connection.createStatement();
            // execute query
            ResultSet resultSet = statement.executeQuery(query);
            // close
            connection.close();

            while (resultSet.next()){
                System.out.println(
                        "id:" + resultSet.getInt("İd") + ", " +
                        "name" + resultSet.getString("name") + ", " +
                        "age" + resultSet.getString("age")
                );
            }


        } catch (Exception e) {
            System.out.println(e.getMessage());
            }

    }
}
