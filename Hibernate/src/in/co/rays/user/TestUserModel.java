package in.co.rays.user;

import java.util.Date;

public class TestUserModel {

	public static void main(String[] args) {

//		testAdd();
//		testDelete();
		testGet();

	}

	public static void testAdd() {

		UserDTO dto = new UserDTO();

//		dto.setId(1);
		dto.setFirstname("uday");
		dto.setLastname("daabi");
		dto.setLogin("uday@gmail.com");
		dto.setPassword("uday123");
		dto.setDob(new Date());
		dto.setAddress("devas");

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
}
