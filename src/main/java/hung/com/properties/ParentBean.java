package hung.com.properties;

public class ParentBean {
	private PropertyBean propertyBean;
	public void showMessage(){
		System.out.println("ParentBean is called");
		propertyBean.showMessage();
	}
	public void setPropertyBean(PropertyBean propertyBean) {
		this.propertyBean = propertyBean;
	}
	
}
