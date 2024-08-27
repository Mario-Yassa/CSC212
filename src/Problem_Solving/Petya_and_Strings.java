package Problem_Solving;

import java.util.Scanner;
public class Petya_and_Strings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1, str2;
        str1 = sc.nextLine();
        str2 = sc.nextLine();
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();

        int n = str1.compareTo(str2);       // get the difference between the two chars as a.compareTo(c) is -2
                                            // as str2 - str1 gets the value from the ASCII code
        System.out.println(n);
        if (n == 0)
            System.out.println("0");
        else if (n > 0)
            System.out.println("1");
        else
            System.out.println("-1");
    }
}
