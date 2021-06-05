package Base;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution 03
 *  Copyright 2021 Ivedent Lloyd III
 */

import java.util.Scanner;

public class Solution {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        String quote = quoteString();
        String author = authorName();
        String outputString = generateoutputString(author, quote);
        printOutput(outputString);
    }

    private static String authorName(){

        System.out.println("Who said it?");
        String author = in.nextLine();
        return author;
    }

    private static String quoteString(){

        System.out.println("What is the quote?");
        String quote = in.nextLine();
        return quote;
    }

    private static void printOutput(String outputString){

        System.out.println(outputString);
    }

    private static String generateoutputString(String author, String quote){

       return author+ " says, "+'"' +quote+ "."+'"'; 

    }

}
