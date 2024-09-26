package in.co.rays.user;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetUser {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		UserDTO dto = (UserDTO) session.get(UserDTO.class, 1);

		System.out.println("\t" + dto.getId());
		System.out.println("\t" + dto.getFirstname());
		System.out.println("\t" + dto.getLastname());
		System.out.println("\t" + dto.getLogin());
		System.out.println("\t" + dto.getPassword());
		System.out.println("\t" + dto.getDob());
		System.out.println("\t" + dto.getAddress());

		session.close();
	}

}
