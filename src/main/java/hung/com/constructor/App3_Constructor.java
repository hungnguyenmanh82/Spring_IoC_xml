package hung.com.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * constructor có tham số đầu vào là các class bean. 
 * VD này ko thưc tế chỉ dành cho test thôi. 
 * Vì thực tế là thiết lập Động, ko biết trc để add vào XML
 *
 */
public class App3_Constructor {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		TextEditor te = (TextEditor) context.getBean("textEditor");
		te.spellCheck();
	}
}
