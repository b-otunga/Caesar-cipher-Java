package org.bill.service;

import org.bill.model.UserInput;

public class CaesarCipher {
//    UserInput userInput = new UserInput();
//    String message = userInput.getMessage();
//    int key = userInput.getKey();
//    int originalIndex;
    private final String lowerAlphabets = "abcdefghijklmnopqrstuvwxyz";

    private final String upperAlphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    String encodedMessage = "";
    public String encode(String message, int key){
        char [] messageArray = message.toCharArray();
        for(char item: messageArray){
            char temp = shiftChar(item, key);
            encodedMessage = encodedMessage + temp;
        }

        char cipherChar = shiftChar();

        return encodedMessage;

    }
    public String decode(){
        return "";
    }
}
