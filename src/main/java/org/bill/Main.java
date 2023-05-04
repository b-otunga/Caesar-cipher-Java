package org.bill;

import org.bill.model.UserInput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operation;
        String message;
        int key;
        UserInput userInput = new UserInput();

        System.out.println("Enter you operation **encode** or **decode**");
        operation = scanner.nextLine();
        System.out.println("Enter you message");
        message = scanner.nextLine();
        System.out.println("Enter key (0-25)");
        key = scanner.nextInt();

        userInput.setKey(key);
        userInput.setMessage(message);
        userInput.setMessage(operation);

        scanner.close();
    }
}