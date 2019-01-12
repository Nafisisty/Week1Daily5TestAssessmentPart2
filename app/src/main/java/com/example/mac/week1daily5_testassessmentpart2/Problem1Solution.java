package com.example.mac.week1daily5_testassessmentpart2;

import java.util.Base64;
import java.util.Scanner;

public class Problem1Solution {

    public static void main(String[] args){


        String userInput = new Scanner(System.in).nextLine();
        String[] splitStr = userInput.split("\\s+");
        String encodedString = "";

        for (String str: splitStr)
        {
            encodedString = encodedString + stringEncoder(str) + " ";
        }

        System.out.println(encodedString);
    }

    public static String stringEncoder(String userString){

        char[] lowerCaseAlphabetArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] upperCaseAlphabetArray = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] inputArray = userString.toCharArray();

        String encodedString = "";

        for (int i = 0; i <= inputArray.length-1; i++){
            for(int j = 0; j <= lowerCaseAlphabetArray.length-1; j++){

                if(inputArray[i] == lowerCaseAlphabetArray[j]){
                    int temp = (lowerCaseAlphabetArray.length - 1) - j;
                    encodedString = encodedString + lowerCaseAlphabetArray[temp];
                    break;
                }
                else if (inputArray[i] == upperCaseAlphabetArray[j]){
                    int temp = (upperCaseAlphabetArray.length -1) - j;
                    encodedString = encodedString + upperCaseAlphabetArray[temp];
                    break;
                }

            }

        }

        return encodedString;

    }

}
