package in.co.rays.user;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestInsert {
	
	public static void main(String[] args) {
		
		UserDTO dto = new UserDTO();
		
		//dto.setId(1);
		dto.setFirstname("rahul");
		dto.setLastname("chouhan");
		dto.setLogin("rahul@gmail.com");
		dto.setPassword("rahul123");
		dto.setDob(new Date());
		dto.setAddress("indore");
		
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(dto);
		
		tx.commit();
		
		session.close();
	}

}
