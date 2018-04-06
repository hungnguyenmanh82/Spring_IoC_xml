package hung.com.autowire;

public class ParentBeanAutoWire {
	private ChildBeanAutoWire childBeanAutoWire;
	private String name;
	
	public void setChildBeanAutoWire(ChildBeanAutoWire childBeanAutoWire) {
		this.childBeanAutoWire = childBeanAutoWire;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void showMessage(){
		System.out.println("ParentBeanAutoWire is called");
		System.out.println("name="+ name);
		childBeanAutoWire.showMessage();
	}
}
