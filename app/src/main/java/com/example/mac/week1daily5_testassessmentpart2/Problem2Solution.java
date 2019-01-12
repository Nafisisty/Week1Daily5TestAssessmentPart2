package com.example.mac.week1daily5_testassessmentpart2;

import java.util.Scanner;

public class Problem2Solution {

    public static void main(String[] args){

        String userInput;

        userInput = new Scanner(System.in).nextLine();

        String[][] frequencyTable = frequecycounter(userInput);

        for(int i = 0; i < 26; i++){

            for(int j =0; j < 2; j++){

                System.out.print("" + frequencyTable[i][j]);

            }
            System.out.println();
        }
    }

    public static String[][] frequecycounter(String string){

        String[][] alphabetCouterArray = new String[26][2];

        string = string.toLowerCase();
        char[] userInput = string.toCharArray();
        int row = 0;
        for(char c = 'a'; c <= 'z'; c++)
        {
            alphabetCouterArray[row][0] = "" + c;
            int count = 0;

            for (int i = 0; i <= userInput.length -1; i++)
            {
                if(c == userInput[i])
                    count++;

            }
            alphabetCouterArray[row][1] = "" + count;
            row++;
        }

        return alphabetCouterArray;
    }
}
