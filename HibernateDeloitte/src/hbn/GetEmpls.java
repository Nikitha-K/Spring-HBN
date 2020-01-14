package hbn;

//import java.awt.List;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;


public class GetEmpls {

	public static void main(String[] args) {
		
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure();
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session ssn = factory.openSession();
		
		Query query = ssn.createQuery("from Employee");
		List<Employee> emplist = query.list();
		
		
		for(Employee e :emplist)
		{
			/*System.out.println("The Employee code is : "+e.getEmpcode());
			System.out.println("The Employee name is : "+e.getEmpname());
			System.out.println("The Employee salary is : "+e.getSalary());
			*/
			System.out.println(e.getEmpcode()+"--"+e.getEmpname()+"--"+e.getSalary());
			
		}
		

	}

}
