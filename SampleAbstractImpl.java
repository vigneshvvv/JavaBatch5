package BasicPractice;

public class SampleAbstractImpl extends sampleAbstract{
	
	@Override
	public void createObject() {
		Address address = new Address();
		address.setAddress("adasadsdadsadad");
		address.setCity("chennai");
		System.out.println(address);
		
	}
	
	@Override
	public void printFunction() {
		System.out.println("The abstract implementation class is working fine");
	}

}
