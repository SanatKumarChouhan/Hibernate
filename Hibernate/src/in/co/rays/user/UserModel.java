package in.co.rays.user;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UserModel {

	public void add(UserDTO dto) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		session.save(dto);

		tx.commit();

		session.close();
	}

	public void delete(UserDTO dto) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		session.delete(dto);

		tx.commit();

		session.close();

	}

	public UserDTO findByPk(int pk) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		UserDTO dto = (UserDTO) session.get(UserDTO.class, pk);

		session.close();

		return dto;
	}
	
	public UserDTO authenticate(String login, String password) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();
		
		Query q = session.createQuery("from UserDTO where login=? and password=?");
		
		
		return null;
		
		
	}

}
