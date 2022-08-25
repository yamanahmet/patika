package config;


import entity.onetoone.Person;
import entity.onetoone.Vehicle;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
    private final static Configuration configuration =
            new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Vehicle.class)
                    .addAnnotatedClass(Person.class);

private static SessionFactory sessionFactory = null;

public static SessionFactory getSessionFactory(){
    if(sessionFactory == null){
        sessionFactory = configuration.buildSessionFactory();
    }

    return sessionFactory;
}
}
