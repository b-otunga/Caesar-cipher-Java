package org.bill;

import org.bill.model.UserInput;
import org.bill.service.CaesarCipher;
import org.bill.util.Checks;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operation;
        String message;
        int key;
        UserInput userInput = new UserInput();
        Checks checks = new Checks();

        System.out.println("Enter you operation **encode** or **decode**");
        operation = scanner.nextLine();

        System.out.println("Enter your message");
        message = scanner.nextLine();

        System.out.println("Enter key (0-25)");
        key = scanner.nextInt();

        userInput.setKey(key);
        userInput.setMessage(message);
        userInput.setOperation(operation);

        boolean userInputIsValid = checks.isValid(userInput);

        if(userInputIsValid){
         System.out.println();
        }
        else{
            System.out.println("bad request, stop");
        }

        scanner.close();
    }
}