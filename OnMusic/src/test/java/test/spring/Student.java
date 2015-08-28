package test.spring;

public class Student implements Person{

	@Override
	public void sayBye () {
		System.out.println(".............................");
		System.out.println("今天是星期五...............sayBye");
		System.out.println(".............................");

		
	}

	@Override
	public void doExecute() {
		System.out.println(".............................");
		System.out.println("明天是星期六.............sayHello");
		System.out.println(".............................");
		
	}

}
