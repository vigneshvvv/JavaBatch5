package BasicPractice;

public class MainMethodForAbstract {
	
	public static void main(String[] args) {
		SampleAbstractImpl abstractImpl = new SampleAbstractImpl();
		abstractImpl.createObject();
		abstractImpl.printFunction();
		
		InterfaceImpl impl = new InterfaceImpl();
		impl.createObject();
	}

}
