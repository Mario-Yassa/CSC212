package Problem_Solving;

import java.util.Scanner;

public class Boy_or_Girl {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String temp = "";

        for (int i = 0 ; i < str.length(); i++ )
            if(!temp.contains(String.valueOf(str.charAt(i))))
                temp += str.charAt(i);


        if(temp.length()%2 == 1)
            System.out.println("IGNORE HIM");
        else
            System.out.println("CHAT WITH HERE");
    }
}
