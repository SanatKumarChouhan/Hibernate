package in.co.rays.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.co.rays.user.UserDTO;

public class TestFlush {
	
	public static void main(String[] args) {

		UserDTO dto = new UserDTO();

		dto.setFirstname("uday");
		dto.setLastname("singh");
		dto.setLogin("uday@gmail.com");
		dto.setPassword("123");
		dto.setDob(new Date());
		dto.setAddress("indore");

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		session.save(dto);

		session.flush();

		System.out.println("id = " + dto.getId());

		dto = (UserDTO) session.get(UserDTO.class, 2);

		System.out.println("first name = " + dto.getFirstname());

		tx.commit();

		session.close();

	}

}
