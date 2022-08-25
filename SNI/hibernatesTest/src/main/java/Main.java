import config.HibernateUtils;
import crud.TestConnection;
import entity.onetoone.Person;
import entity.onetoone.Vehicle;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {
        //TestConnection testConnection = new TestConnection();
        //testConnection.test();

        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

        Session currentSession = sessionFactory.getCurrentSession();

        currentSession.beginTransaction();

        Person person = new Person();
        person.setName("Beyza");
        person.setSurname("Mücahit");

        Vehicle vehicle = new Vehicle();
        vehicle.setBrand("Toyota");
        vehicle.setModel("X");

        person.setVehicle(vehicle);
        try{
            currentSession.save(vehicle);
            currentSession.save(person);
            currentSession.getTransaction().commit();
        }catch (HibernateException hibernateException){
            currentSession.getTransaction().rollback();
        }finally {
            currentSession.close();
        }
    }
}

