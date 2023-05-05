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
        UserInput input;

        System.out.println("Enter you operation **encode** or **decode**");
        operation = scanner.nextLine();

        System.out.println("Enter your message");
        message = scanner.nextLine();

        System.out.println("Enter key (0-25)");
        key = scanner.nextInt();

        userInput.setKey(key);
        userInput.setMessage(message);
        userInput.setOperation(operation);

        input = userInput;

        boolean userInputIsValid = checks.isValid(userInput);

        if(userInputIsValid){
            CaesarCipher caesarCipher = new CaesarCipher();
         userInput = input;
         if (userInput.getOperation().equalsIgnoreCase("encode")){
             String cipherMessage = caesarCipher.encode(userInput.getMessage(), userInput.getKey());
             System.out.println(cipherMessage);
         }
//            else if (userInput.getOperation().equalsIgnoreCase("decode")){
////                String plainMessage = caesarCipher.decode(userInput.getMessage(), userInput.getKey());
//             System.out.println(plainMessage);
//            }
        }
        else{
            System.out.println("bad request, stop");
        }

        scanner.close();
    }
}