package com.tutorialspoint;

public class HelloWorld5 {

	
	private String messageOriginal;

	private String messageNew;
	
	public void setMessage (String messageOriginal) {
		this.messageOriginal = messageOriginal;
	}
	
	
	public void setMessage2 (String messageNew) {
		this.messageNew = messageNew;
	}
	
	
	public void getMessage() {
		System.out.println("Earth's call: " + messageOriginal);
	}
	
	
	
	public void getMessage2() {
		System.out.println("Mars' call: " + messageNew);
	}
	
	
}
