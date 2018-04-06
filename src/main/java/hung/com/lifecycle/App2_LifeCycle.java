package hung.com.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import hung.com.hello.HelloWorld;

public class App2_LifeCycle {
	public static void main(String[] args) {
		AbstractApplicationContext  context = new ClassPathXmlApplicationContext("Beans.xml");
		BeanLifeCycle obj = (BeanLifeCycle) context.getBean("BeanLifeCycle");
		obj.getMessage();
		
		//giải phóng context và memory của nó
		context.registerShutdownHook();
	}
}
