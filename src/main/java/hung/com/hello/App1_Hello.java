package hung.com.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Spring context bản chất là 1 Factory Pattern. Nó áp dụng cả Prototype Pattern vào nữa
 *
 */
public class App1_Hello {
	public static void main(String[] args) {
		
		//================================= Spring Context quản lý memory ====================
		// src/main/java/Beans1.xml
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans1.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();
		//
		HelloWorld obj1 = (HelloWorld) context.getBean("bean_id");
		obj1.getMessage();
		
		
		//=============================== Tạo Spring contex khác ==============================
		// src/main/java/Beans1_2.xml
		ApplicationContext context2 = new ClassPathXmlApplicationContext("Beans1_2.xml");
		HelloWorld obj2 = (HelloWorld) context2.getBean("bean_id");
		obj2.getMessage();
	}
}
