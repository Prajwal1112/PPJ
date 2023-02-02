package springEx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SimpleSpringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		
		ApplicationContext appContex;
		String filePath = "./src/main/resources/hibernate.cfg.xml";
		
		appContex=new FileSystemXmlApplicationContext(filePath);
		
		String beanId = "firstgreeting";
		
		Object obj= appContex.getBean(beanId);
		
		GreetingService gs = (GreetingService)obj;
		
		String reply=gs.sayGreeting();
		System.out.println(reply);
		
		
	}

}
