/*
 * Create a Java program that generates prime numbers up to a given limit.
 * Allow the user to input the limit, and then print all prime numbers up to that limit.
 */
package ChatGPT_Questions;

import java.util.Scanner;

public class Prime_Generator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        for(int i = 2 ; i <= limit; i++){
            if(isPrime(i))
                System.out.println(i + " ");
        }
    }
    private static boolean isPrime(int number){
        for(int j = 2; j <= number/2 ; j++){
            if(number%j == 0){
                return false;
            }
        }
        return true;
    }
}
