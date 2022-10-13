import java.sql.*;

public class DBConn {
    public static final String DB_URL = "jdbc:mysql://localhost/university";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "password";

    public static void main(String[] args) {
        Connection connect = null;
        String insertSql = "INSERT INTO student (student_id, student_name, student_class) VALUES (3, 'Ali', 4)";
        String prSql = "INSERT INTO student (student_id, student_name, student_class) VALUES (?, ?, ?)";


        try {
            connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            //Statement st = connect.createStatement();
            //System.out.println(st.executeUpdate(insertSql));;

            PreparedStatement prSt = connect.prepareStatement(prSql);
            prSt.setInt(1, 4);
            prSt.setString(2, "Ahmet");
            prSt.setInt(3, 3);
            prSt.executeUpdate();
            prSt.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
