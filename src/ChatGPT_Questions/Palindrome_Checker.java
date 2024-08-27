/*
 * Write a Java program to check if a given string is a palindrome.
 * A palindrome is a word, phrase, number, or other sequences of characters that reads the same forward and backward.
 * Example:
 * radar --> The string "radar" is a palindrome
 * hello --> The string "hello" is not a palindrome.
 */
package ChatGPT_Questions;

import java.util.Scanner;

public class Palindrome_Checker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int counter = 0;
        int i = 0, j = word.length()-1;
        for( ; i < word.length()/2 ; i++){
            if(word.charAt(i) == word.charAt(j))
                counter ++;
            j--;
        }
        if(word.length()/2 == counter)
            System.out.println("The string \"" + word + "\" is a palindrome");
        else
            System.out.println("The string \"" + word + "\" is NOT a palindrome");
    }
}
