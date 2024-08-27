package CSC212;

import java.util.ArrayList;

public class Exam_2 {
    public static void main(String[] args) {

        // Question 1 : Strings and Things

        // a)
        String animal1 = "elephant";
        String first = animal1.substring(0, 1);
        char first1 = animal1.charAt(0);
        System.out.println(first);
        System.out.println(first1);

        // b)
        String animal2 = "lion";
        char last = animal2.charAt(animal2.length() - 1);
        System.out.println(last);

        // c)
        double average = (animal1.length() + animal2.length()) / 2.0;

        // d)
        String animal = "";
        if (animal1.length() > animal2.length())
            animal = animal1;
        else
            animal = animal2;

        // e)
        int index = animal.indexOf('a');

        // f)
        String before = animal.substring(0, index);
        System.out.println(before);

        // g)
        String after = animal.substring(index + 1);
        System.out.println(after);

//___________________________________________________________________________________________________________________\\

        // Question 2 : Arrays
        double[] numbers = {1.2, 2.1, 3.2, 4.0};

        // a)   What do you mean by real numbers?       ****************
        System.out.println("The length of the numbers array is " + numbers.length);

        // b)
        double first_number = numbers[0];

        // c)
        double last_number = numbers[numbers.length - 1];

        // d)   just printing the +ve numbers?      *********************
        for (double i : numbers)
            if (i > 0)
                System.out.println(i);

        // e)
        double temp = numbers[1];
        numbers[1] = numbers[3];
        numbers[3] = temp;

//___________________________________________________________________________________________________________________\\

        // Question 3 : ArrayLists
        ArrayList<String> words = new ArrayList<>();

        // a)
        System.out.println("The number of words in the Array List is " + words.size());

        // b)
        String first_word = words.get(0);

        // c)
        String last_word = words.get(words.size() - 1);

        // d)
        for (String str : words) {
            if (str.length() > 7) {
                System.out.println(str);
            }
        }
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() > 7) {
                System.out.println(words.get(i));
            }
        }
//___________________________________________________________________________________________________________________\\

        // Question 4 : Superficial Signatures
        // a) int ccx = [int]
        // b) while ([SCircle].radius() > [int]){
        // c) [SPainter].setColor([ArrayList].get([int]))
        // d) [SPainter].paint([SCircle])
        // e) [SCircle].shrink([int])
        // f) if( [int] == [ArrayList<Color>].size() ) { [int] = [int] }

//___________________________________________________________________________________________________________________\\

        // Question 5 : Translation from for to while

        /*for ( int x = words.length-1; x >= 0; x = x - 1 ) {
            String word = words[x];
            printer.println(word);
        }
        */

        /*int x = words.length - 1;
          while(x>=0){
            String word = words[x];
            printer.println(word);
            x--;
          }
         */

//___________________________________________________________________________________________________________________\\

        // calling Question 7

        Exam_2_Q7 triangle = new Exam_2_Q7(5);
        triangle.perimeter();
    }



//___________________________________________________________________________________________________________________\\

    //Question 6 Methods

    // a)       U need a method?
    private static ArrayList littleList(String s1,String s2,String s3){
        ArrayList<String> strings = new ArrayList<>();
        strings.add(s1);
        strings.add(s2);
        strings.add(s3);
        return strings;
    }

    // b)
    private static void interpretPrintCommand(int[] array, String str){
        if (str.equalsIgnoreCase("FIRST"))
            System.out.println(array[0]);
        else if (str.equalsIgnoreCase("LAST"))
            System.out.println(array[array.length - 1]);
        else{
//            int n = Integer.parseInt(str);
            int n = Integer.valueOf(str);
            System.out.println(array[n-1]);

        }

        //      what to do in the rest of the question?
        //      scanner to change from string to int

    }



}

