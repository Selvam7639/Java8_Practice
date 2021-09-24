package com;

interface Phone
{
	void call();
	default void message()
	{
		System.out.println("Sending");
	}
}

class Apple
{
	public void message() {
		System.out.println("Apple");
	}
	
	public void call() {
		System.out.println("Calling from Apple");
	}
}


/*Default method is less priority than normal method*/
class AndroidPhone extends Apple implements Phone 
{
	public void call() {
		System.out.println("Calling from Android");
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {	
		Phone p = new AndroidPhone();
		p.call();
		p.message();
	}
}
