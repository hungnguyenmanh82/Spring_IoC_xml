package hung.com.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App6_Collection {

	public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("Beans6.xml");
	      JavaCollection jc=(JavaCollection)context.getBean("javaCollection");

	      jc.getAddressList();
	      jc.getAddressSet();
	      jc.getAddressMap();
	      jc.getAddressProp();

	}

}
