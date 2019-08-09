package info.java.tips.form;

import org.apache.struts.action.ActionForm;

public class HelloForm extends ActionForm {
	private String name;
    private int age;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
