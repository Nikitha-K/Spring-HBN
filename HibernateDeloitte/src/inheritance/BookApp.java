package inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;


public class BookApp {

	public static void main(String[] args) {
		
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure();
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session ssn = factory.openSession();
		Transaction tx = ssn.beginTransaction();
		
		Book book = new Book();
		book.setBookid(1002);
		book.setTitle("Oracle");
		book.setAuthor("XYZ");
		book.setPrice(600);
		
		DotnetBook dotnet = new DotnetBook();
		dotnet.setAuthor("ABCD");
		dotnet.setBookid(2001);
		dotnet.setTitle("asp.net");
		dotnet.setPrice(500);
		dotnet.setCds(3);
		
		JavaBook java = new JavaBook();
		java.setAuthor("James Gosling");
		java.setBookid(3002);
		java.setTitle("JAVA Reference");
		java.setPrice(700);
		java.setDiscount(30);
		
		ssn.save(book);
		ssn.save(java);
		ssn.save(dotnet);
		tx.commit();
		ssn.close();
		
		
		

	}

}
