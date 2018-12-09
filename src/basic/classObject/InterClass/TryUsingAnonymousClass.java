package basic.classObject.InterClass;

interface Myinterface{
	void doSomething();
}

public class TryUsingAnonymousClass {
	public void useMyinterface() {
		final Integer number =123;
		System.out.println(number);
		Myinterface  myInterface = new Myinterface() {
			@Override
			public void doSomething() {
				System.out.println(number);
			}
		};
		myInterface.doSomething();
		System.out.println(number);
	}
	
	
}
