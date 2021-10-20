package spring.demo;

public class MyBean {
	private String name = "I am Default Bean";

	public MyBean() {
	}

	public MyBean(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MyBean [name=" + name + "]";
	}

}
