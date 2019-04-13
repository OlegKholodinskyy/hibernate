package lesson1;

import org.hibernate.Session;

public class Demo {
    public static void main(String[] args) {
         Session session = new HibernateUtils().createSessionFactory().openSession();
         session.getTransaction().begin();
         Product product = new Product();
         product.setId(99);
         product.setName("Milk");
         product.setDescription("Some deskription");
         product.setPrice(25);
         session.save(product);
         session.getTransaction().commit();
        System.out.println("Done");
        session.close();
    }
}
