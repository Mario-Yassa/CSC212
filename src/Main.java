import CSC212.Exam_2_Q7;
import org.w3c.dom.ls.LSOutput;
import shapes.SSquare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//         my_fav = new double[];
//        double[] my_fav = new double[]{1.1, 2.2, 5.5};
//
//        for (int i = 0; i < my_fav.length; i++) {
//            System.out.println(my_fav[i]);
//        }

//    int[] arr = {1,6,43,67,24,8,3,-1};
//    int len = arr.length;
////    sort(arr,arr+arr.length);
//        Arrays.sort(arr);
//        for(int i =0; i < arr.length;i++)
//            System.out.println(arr[i]);
//    }

//        SSquare[] squares = {new SSquare(1.1), new SSquare(2.5), new SSquare(10),new SSquare(23.1)};
//        ArrayList<SSquare> squaresAL = new ArrayList<>();
//        squaresAL.add(new SSquare(1.1));

//        String[] str = {"Hi","how","are","you"};
//
//        System.out.println(str.length);

//        try {
//            int n = Integer.parseInt("3");
//            System.out.println(n+1);
//        } catch (NumberFormatException e) {
//            System.out.println("Invalid integer representation");
//        }
        // calling Question 7

//        Exam_2_Q7 triangle = new Exam_2_Q7(5);
//        System.out.println(triangle.perimeter());
//        System.out.println( Integer.valueOf("3"));

//        Random random = new Random();
//        for(int i=0 ;i < 5;i++ )
//            System.out.println(random.nextInt(6));


        fizzBuzz();


    }

    // CSC 241 lEC 2


                   /*
             Write a fizzBuzz method which takes no arguments
        - The methode should print the numbers from 1 to 100.
        - For multiples of 3, print "Fizz" instead of the number.
        - For multiples of 5, print "Buzz" instead of the number.
        - For multiples of both 3 and 5, print FizzBuzz" instead of the number.
                   */

    private static void fizzBuzz(){
        for (int i = 1 ; i <= 100 ; i++){
            if(i % 3 == 0 && i % 5 ==0) {
                System.out.println("FizzBuzz");
                continue;
            }
            if(i % 3 == 0) {
                System.out.println("Fizz");
                continue;
            }
            if(i % 5 == 0) {
                System.out.println("Buzz");
            }
            else
                System.out.println(i);
        }
    }

    // This block to show the user what to do when laying the mouth on a function from the methode.
    // it should be put before the methode.
    /**
     *
     */


    // public - access modifier ( others: private, protector )



}