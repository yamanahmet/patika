import dao.TraineeDAO;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        TraineeDAO traineeDAO = new TraineeDAO();
        traineeDAO.createTrainee();
    }
}
