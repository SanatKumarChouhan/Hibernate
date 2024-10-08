package in.co.rays.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.co.rays.user.UserDTO;

public class TestUpdateMerge {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		UserDTO dto = (UserDTO) session.get(UserDTO.class, 2);

		session.close();

		dto.setFirstname("aaa");

		Session session2 = sf.openSession();

		Transaction tx = session2.beginTransaction();

		session2.merge(dto);

		// session2.update(dto);

		tx.commit();

		session2.close();

	}

}
