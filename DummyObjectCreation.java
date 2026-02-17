package BasicPractice;

import java.util.ArrayList;
import java.util.List;

public class DummyObjectCreation {
	
	public static void main(String[] args) {
		Coordinates coordinates = new Coordinates();
		coordinates.setLat("-77.16213");
		coordinates.setLng("-92.084824");
		
		Address address = new Address();
		address.setAddress("sfasdasd");
		address.setCity("chennai");
		address.setCountry("India");
		address.setPostalCode("600119");
		address.setState("TN");
		address.setCoordinates(coordinates);
		
		User user = new User();
		user.setId(1);
		user.setFirstName("vignesh");
		user.setLastName("kumar");
		user.setAddress(address);
		
		List<User> userlst = new ArrayList<>();
		userlst.add(user);
		
		UsersList list = new UsersList();
		list.setUsers(userlst);
		System.out.println(list);
	}

}
