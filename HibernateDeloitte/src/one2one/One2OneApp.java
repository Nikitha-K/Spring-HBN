package one2one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class One2OneApp {
	
	public static void main(String[] args){
		
		AnnotationConfiguration config = new AnnotationConfiguration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Student std = new Student();
		std.setRno(127);
		std.setName("Shree");
		
		Address addr = new Address();
		addr.setAddressid(1829);
		addr.setCity("Delhi");
		addr.setStudent(std);
		
		session.save(addr);
		tx.commit();
		session.close();
		
	}
	
	
	
}
