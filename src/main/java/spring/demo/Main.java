package spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("mybean-context.xml");
		System.out.println(context.getBean("myBean"));
		System.out.println(context.getBean("myBean2"));
	}

}
