package com.zalando.taskmanagementsystem;

public class TaskmanagementsystemApplication {

	public static void main(String[] args) {
		System.out.println("#### Task Management System #####");
		UserInterface ui = new UserInterface();
		ui.displayOptions();
	}
}
