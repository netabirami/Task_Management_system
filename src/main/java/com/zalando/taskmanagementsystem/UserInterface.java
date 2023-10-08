package com.zalando.taskmanagementsystem;

import java.util.Scanner;

public class UserInterface {
    public void displayOptions() {
        System.out.println("Welcome to Task Management system ");
        Scanner scanner = new Scanner(System.in);
        TaskList taskList = new TaskList();
        while (true) {
            System.out.println("Would you like to Add, Display, Edit, Remove a task, please select the correct option.");
            System.out.println("Press 1 for Add a task");
            System.out.println("Press 2 for Display tasks");
            System.out.println("Press 3 for Edit a task");
            System.out.println("Press 4 for Remove a task");
            System.out.println("Press 0 to exit");
            int input = scanner.nextInt();
            if (input == 0) {
                System.out.println("Goodbye!");
                break;
            }

            switch (input) {
                case 1:
                    System.out.println("Please enter the ID & Name of the Task.");
                    int taskID = scanner.nextInt();
                    String taskName = scanner.nextLine();
                    Task newTask = new Task(taskID, taskName);
                    taskList.addTask(newTask);
                    break;
                case 2:
                    System.out.println("List of Tasks");
                    for (Task task : taskList.getTasks()) {
                        System.out.println("Task Id = " + task.getId());
                        System.out.println("Task Name = " + task.getName());
                    }
                    break;
                case 3:
                    System.out.println("You selected Option 3");
                    break;
                default:
                    System.out.println("Invalid choice! Please select a number between 1 and 3.");
                    break;
            }
        }
        scanner.close();
    }
}
