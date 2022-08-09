import dao.TraineeDAO;
import entity.Trainee;

import java.sql.*;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        TraineeDAO traineeDAO = new TraineeDAO();
        traineeDAO.createTrainee();
        //traineeDAO.traineeUpdate(2,"Mehmet", 27);
        //traineeDAO.traineeDelete(2);
        for (Trainee i : traineeDAO.traineeRead()
             ) {
            System.out.println(i.getId() + " " + i.getName() + " " + i.getAge());
        }
    }
}
