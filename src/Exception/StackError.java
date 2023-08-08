package Exception;

public class StackError {
	public void findA() {
		findB();
	}
	public void findB() {
		findA();
	}

	public static void main(String[] args) {
		StackError se=new StackError();
		se.findA();

	}

}
