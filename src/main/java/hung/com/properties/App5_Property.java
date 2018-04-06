package hung.com.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App5_Property {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		ParentBean parentBean = (ParentBean) context.getBean("ParentBean");
		parentBean.showMessage();
	}
}
