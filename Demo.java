package lesson1;

import org.hibernate.Session;

public class Demo {
    public static void main(String[] args) {
        Product product = new Product();
        product.setId(199);
        product.setName("Bred");
        product.setDescription("Some deskription");
        product.setPrice(20);

        save(product);

    }

    static void save(Product product){
        Session session = new HibernateUtils().createSessionFactory().openSession();
        session.getTransaction().begin();
        session.save(product);
        session.getTransaction().commit();
        System.out.println("Done");
        session.close();
    }
}
