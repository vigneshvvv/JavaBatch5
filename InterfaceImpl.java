package BasicPractice;

public class InterfaceImpl implements sampleInterface, objectInterface {

	@Override
	public void createObject() {
		User user = new User();
		user.setFirstName("vignesh");
		System.out.println(user);
		
	}

	@Override
	public void userDetailsObject() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printFunction() {
		// TODO Auto-generated method stub
		
	}

}
