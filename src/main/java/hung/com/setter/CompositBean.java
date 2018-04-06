package hung.com.setter;

public class CompositBean {
	
	private ChildBean child; //biến này sẽ đc tự động khởi tạo.

	// a setter method to inject the dependency.
	public void setChild(ChildBean child) {
		System.out.println("Inside setChild()" );  
		this.child = child;
	}
	// a getter method to return spellChecker
	public ChildBean getChildBean() {
		return child;
	}
	public void spellCheck() {
		child.checkSpelling();
	}
}
