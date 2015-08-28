package test.spring;

public class Student2 implements Person{

	@Override
	public void sayBye () {
		System.out.println("第二个学生不被spring管理...........");
		System.out.println("今天是星期五...............sayBye");
		System.out.println(".............................");

		
	}

	@Override
	public void doExecute() {
		System.out.println("第二个学生不被spring管理...........");
		System.out.println("明天是星期六.............sayHello");
		System.out.println(".............................");
		
	}

}
