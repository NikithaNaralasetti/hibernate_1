package com.klef.jfsd.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientDemo {
    public static void main(String[] args) {
        // Build SessionFactory
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        try {
            // Create and save Car object
            car car1 = new car();
            car1.setName("Sedan");
            car1.setType("Car");
            car1.setMaxSpeed(180);
            car1.setColor("Black");
            car1.setNumberOfDoors(4);

            // Create and save Truck object
            Truck truck = new Truck();
            truck.setName("Heavy Truck");
            truck.setType("Truck");
            truck.setMaxSpeed(100);
            truck.setColor("Blue");
            truck.setLoadCapacity(5000);

            // Save objects
            session.save(car1);
            session.save(truck);

            // Commit transaction
            transaction.commit();
            System.out.println("Data inserted successfully!");
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
            factory.close();
        }
    }
}
