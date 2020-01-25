package com.tutorialspoint;

public class HelloMars {

	
	private String messageOriginal;

	private String messageNew;
	private String messageNew2;
	
	public void setMessage (String messageOriginal) {
		this.messageOriginal = messageOriginal;
	}
	
	
	public void setMessage2 (String messageNew) {
		this.messageNew = messageNew;
	}
	
	public void setMessage3 (String messageNew2) {
		this.messageNew2 = messageNew2;
	}
	
	
	
	public void getMessage() {
		System.out.println("Earth's call: " + messageOriginal);
	}
	
	
	
	public void getMessage2() {
		System.out.println("Mars' call: " + messageNew);
	}
	
	public void getMessage3() {
		System.out.println("Mars' call: " + messageNew2);
	}
	
	
}
