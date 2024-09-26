package in.co.rays.user;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteUser {

	public static void main(String[] args) {

		UserDTO dto = new UserDTO();

		dto.setId(3);

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();
		
		session.delete(dto);
		
		tx.commit();
		
		session.close();

	}

}
