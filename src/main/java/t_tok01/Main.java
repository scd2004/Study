package t_tok01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main2(String[] args) {
		HelloWorld hello = new HelloWorld();
		hello.setMessage("hello world");
		System.out.println(hello.getMessage());
	}
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld hello = (HelloWorld)context.getBean("helloWorld");
		System.out.println(hello.getMessage());		
	}
	
}
