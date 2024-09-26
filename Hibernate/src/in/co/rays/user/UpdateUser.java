package in.co.rays.user;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateUser {

	public static void main(String[] args) {

		UserDTO dto = new UserDTO();

		dto.setId(1);
		dto.setFirstname("yogesh");
		dto.setLastname("sen");
		dto.setLogin("yogesh@gmail.com");
		dto.setPassword("yogesh123");
		dto.setDob(new Date());
		dto.setAddress("sagar");

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		session.update(dto);

		tx.commit();

		session.close();
	}

}
