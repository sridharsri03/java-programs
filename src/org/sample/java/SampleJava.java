package org.sample.java;

public class SampleJava {
	private void saving() {
		System.out.println("savings 10000Rs");

	}
	private void deposit() {
		System.out.println("deposit 20000Rs");

	}
	private void withdraw() {
		System.out.println("withdraw 30000Rs");

	}
	private void checkBalance() {
		System.out.println("Current Balance 10000Rs");

	}
	private void currentAccount() {
		System.out.println("Current account balance 20000Rs");

	}
	public static void main(String[] args) {
		SampleJava j = new SampleJava();
		j.saving();
		j.deposit();
		j.withdraw();
		j.checkBalance();
		j.currentAccount();
	}

}
