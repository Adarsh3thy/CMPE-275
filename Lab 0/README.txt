Name: Adarsh Narasimha Murthy
SJSU ID: 014952275
email: adarsh.narasimhamurthy@sjsu.edu


Creation steps:

1. Create a new Maven Project 
2. Edit the pom.xml file and add the spring dependencies.
3. Create the Greeter interface
	 interface Greeter {
	void setName(String name); // name of the author
	String getGreeting();
  }
4. Create class HelloBean that implements the method getGreeting from Greeter interface.
5. Create beans.xml file, and create bean for HelloBean
	  <bean id="greeter" class="springcore_example.HelloBean">
        <property name="name" value="Alice"/>
    </bean>
6. Create Main class that implementsthe bean

Steps to run:

Compile and run Main.java
