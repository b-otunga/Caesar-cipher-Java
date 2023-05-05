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
            char temp = shiftChar(item, key, String ops);
            encodedMessage = encodedMessage + temp;
        }

        return encodedMessage;

    }
    public String decode(){


        return encodedMessage;
    }
    int newIndex;
    private char shiftChar (char charFromMessage, int key, String ops){

        int originalIndex = lowerAlphabets.indexOf(charFromMessage);
        if(ops == "e"){
            newIndex = (originalIndex + key) % 26;
        } else if(ops == "d"){
           newIndex = (originalIndex - key) % 26;
        }
        int position;
        char newChar;
        if(originalIndex == -1){
            return charFromMessage;
        }
        if(newIndex > 25){
            position = newIndex -26;
            newChar = lowerAlphabets.charAt(position);
        }else if(newIndex < 0){
            position = newIndex + 26;
            newChar = lowerAlphabets.charAt(position);
        }else{
            position = newIndex;
            newChar = lowerAlphabets.charAt(position);
        }
        return newChar;
    }
}
