package hung.com.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * vi du về dùng hàm Setter ở trong XML (là các biến tĩnh)
 * VD này ko thưc tế chỉ dành cho test thôi. 
 * Vì thực tế là thiết lập Động, ko biết trc để add vào XML
 *
 */

public class App4_Setter {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans4.xml");

		CompositBean parent = (CompositBean) context.getBean("CompositBean");
		parent.spellCheck();
	}

}
