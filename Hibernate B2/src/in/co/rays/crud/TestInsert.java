package in.co.rays.crud;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.co.rays.crud.UserDTO;

public class TestInsert {
	
	public static void main(String[] args) {
		
		UserDTO dto = new UserDTO();
		
		//dto.setId(1);
		dto.setFirstname("priya");
		dto.setLastname("mabdal");
		dto.setLogin("priya@gmail.com");
		dto.setPassword("priyal123");
		dto.setDob(new Date());
		dto.setAddress("kolkataS");
		
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(dto);
		
		tx.commit();
		
		session.close();
	}

}
