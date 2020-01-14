		package mvchbnemp;
		
		
		
		import java.util.List;
		
		import org.hibernate.Session;
		import org.hibernate.SessionFactory;
		import org.hibernate.Transaction;
		import org.springframework.beans.factory.annotation.Autowired;
		import org.springframework.stereotype.Repository;
		
		@Repository
		public class EmployeeDao {
		@Autowired
		SessionFactory sessionFactory;
		public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
		}
		
		public void addEmployee(Employee emp){
		Session session =sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(emp);
		tx.commit();
		session.close();
		}
		
		public List<Employee> getEmployee(){
		Session session = sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<Employee> customerList = session.createQuery("from Employee").list();
		return customerList;
		}

		public void updateemp(Employee emp){
			Session session =sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.update(emp);
			tx.commit();
			session.close();
			}

		public void deleteemp(Employee emp){
			Session session =sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.delete(emp);
			tx.commit();
			session.close();
			}
		
		
		
		
		
			
		}
			
			
			
			
		
		
