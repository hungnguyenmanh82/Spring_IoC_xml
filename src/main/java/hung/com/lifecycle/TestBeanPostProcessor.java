package hung.com.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * BeanPostProcessor sẽ bắt tất cả các sự kiện liên quan tới init đối tượng
 *
 */
public class TestBeanPostProcessor implements BeanPostProcessor {
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

		System.out.println("BeforeInitialization : " + beanName);
		return bean;  // you can return any other object as well
	}
	public Object postProcessAfterInitialization(Object bean, String beanName) 	throws BeansException {

		System.out.println("AfterInitialization : " + beanName);
		return bean;  // you can return any other object as well
	}
}
