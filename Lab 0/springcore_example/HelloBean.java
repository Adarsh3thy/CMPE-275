package springcore_example;

public class HelloBean implements Greeter{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getGreeting() {
        return "Hello world from " + name + "!";
    }
	

}
