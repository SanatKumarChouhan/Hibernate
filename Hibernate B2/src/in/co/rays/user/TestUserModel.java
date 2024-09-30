package in.co.rays.user;

import java.util.Date;

public class TestUserModel {

	public static void main(String[] args) {

//		testAdd();
//		testDelete();
//		testGet();
//		testAuth();
		testAuthByCri();

	}

	public static void testAdd() {

		UserDTO dto = new UserDTO();

//		dto.setId(1);
		dto.setFirstname("priya");
		dto.setLastname("mandal");
		dto.setLogin("priya@gmail.com");
		dto.setPassword("priya123");
		dto.setDob(new Date());
		dto.setAddress("kolkata");

		UserModel model = new UserModel();

		model.add(dto);
	}

	public static void testDelete() {

		UserDTO dto = new UserDTO();

		dto.setId(3);

		UserModel model = new UserModel();

		model.delete(dto);
	}

	public static void testGet() {

//		UserDTO dto = null;

		UserModel model = new UserModel();

//		UserDTO dto = (UserDTO) model.findByPk(1);

		UserDTO dto = model.findByPk(1);

		System.out.print(dto.getId());
		System.out.print("\t" + dto.getFirstname());
		System.out.print("\t" + dto.getLastname());
		System.out.print("\t" + dto.getLogin());
		System.out.print("\t" + dto.getPassword());
		System.out.print("\t" + dto.getDob());
		System.out.println("\t" + dto.getAddress());

	}

	public static void testAuth() {

		UserModel model = new UserModel();

		UserDTO dto = model.authenticate("yogesh@gmail.com", "yogesh123");

		if (dto != null) {

			System.out.print(dto.getId());
			System.out.print("\t" + dto.getFirstname());
			System.out.print("\t" + dto.getLastname());
			System.out.print("\t" + dto.getLogin());
			System.out.print("\t" + dto.getPassword());
			System.out.print("\t" + dto.getDob());
			System.out.println("\t" + dto.getAddress());

		} else {

			System.out.println("record not found exception......!");
		}

	}

	public static void testAuthByCri() {

		UserModel model = new UserModel();

		UserDTO dto = model.authenticate("yogesh@gmail.com", "yogesh123");

		if (dto != null) {

			System.out.print(dto.getId());
			System.out.print("\t" + dto.getFirstname());
			System.out.print("\t" + dto.getLastname());
			System.out.print("\t" + dto.getLogin());
			System.out.print("\t" + dto.getPassword());
			System.out.print("\t" + dto.getDob());
			System.out.println("\t" + dto.getAddress());

		} else {

			System.out.println("record not found exception......!");
		}

	}
}
