package ProgrammingChallenges.ProgrammingChallenge5;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayStats {

    // Initially, we will assume we're only reading 10 numbers.
    private static int[] numbers = new int[10];
    private static int numberOfNumbers = 0;
    private static boolean sorted = false;

    public static void main(String[] args) {
        try {
            interpretHelpCommand();
            readNumbers();
            interpreter(new Scanner(System.in));
        } catch (FileNotFoundException e) {
            System.out.println("The file was not found. Please think again.");
            System.exit(-1);
        }
    }

    private static void interpreter(Scanner commandReader) {
        System.out.print(">>> ");
        String command = commandReader.next();
        if (command.equalsIgnoreCase("DISPLAY")) {
            interpreterDisplayCommand();
        } else if (command.equalsIgnoreCase("SORT")) {
            interpretSortCommand();
        } else if (command.equalsIgnoreCase("ADD")) {
            interpretAddCommand(commandReader);
        } else if (command.equalsIgnoreCase("MIN")) {
            interpretMinCommand();
        } else if (command.equalsIgnoreCase("MAX")) {
            interpretMaxCommand();
        } else if (command.equalsIgnoreCase("AVERAGE")) {
            interpretAverageCommand();
        } else if (command.equalsIgnoreCase("MEDIAN")) {
            interpretMedianCommand();
        } else if (command.equalsIgnoreCase("HELP")) {
            interpretHelpCommand();
        } else if (command.equalsIgnoreCase("EXIT")) {
            System.exit(0);
        } else {
            System.out.println("### Unrecognizable command: " + command);
        }
        interpreter(commandReader);
    }

    private static void interpreterDisplayCommand() {
        displayNumbers();
    }

    private static void interpretAddCommand(Scanner commandReader) {
        int value = 0;
        try {
            value = commandReader.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("You didn't enter an integer value to add.");
            return;
        }
        ensureCapacity();
        numbers[numberOfNumbers] = value;
        numberOfNumbers = numberOfNumbers + 1;
        sorted = false;
    }

    private static void interpretSortCommand() {
        bubbleSort();
    }

    private static void interpretHelpCommand() {
        System.out.println("DISPLAY - display the list of numbers");
        System.out.println("SORT    - sort the numbers");
        System.out.println("ADD     - add a number to the end of the list");
        System.out.println("MIN     - print the minimum value, requires a sorted list");
        System.out.println("MAX     - print the maximum value, requires a sorted list");
        System.out.println("AVERAGE - print the average value, requires a sorted list");
        System.out.println("MEDIAN  - print the median value, requires a sorted list");
        System.out.println("HELP    - display a menu of commands");
        System.out.println("EXIT    - terminate execution of the program");
    }

    private static void interpretMinCommand() {
        if (numberOfNumbers == 0) {
            System.out.println("There are no numbers, so there is no minimum.");
            return;
        }
        if (!sorted) {
            System.out.println("The list isn't sorted, please sort first.");
            return;
        }
        System.out.println(numbers[0]);
    }

    private static void interpretMaxCommand() {
        if (numberOfNumbers == 0) {
            System.out.println("There are no numbers, so there is no maximum.");
            return;
        }
        if (!sorted) {
            System.out.println("The list isn't sorted, please sort first.");
            return;
        }
        System.out.println(numbers[numberOfNumbers-1]);
    }
    private static void interpretAverageCommand() {
        if (numberOfNumbers == 0) {
            System.out.println("There are no numbers, so there is no maximum.");
            return;
        }
        double average = 0;
        for(int i = 0; i < numberOfNumbers; i++)
            average += numbers[i];

        System.out.println(average/(double)numberOfNumbers);
    }
    private static void interpretMedianCommand() {
        if (numberOfNumbers == 0) {
            System.out.println("There are no numbers, so there is no maximum.");
            return;
        }
        if (!sorted) {
            System.out.println("The list isn't sorted, please sort first.");
            return;
        }
        double median;
        if (numberOfNumbers % 2 == 1 )
            median = numbers[numberOfNumbers/2];
        else{
            median = (numbers[numberOfNumbers/2 - 1] + numbers[numberOfNumbers/2]) / 2.0;
        }

        System.out.println(median);
    }

    private static void displayNumbers() {
        for (int x = 0; x < numberOfNumbers; x = x + 1)
            System.out.println(numbers[x]);
    }

    // Assuming that the data file will be found in the public_html/data
    // subdirectory of the user’s home directory.
//    private static Scanner establishScanner(String fileName) throws IOException {
//        String separator = File.separator;
//        String homeDirectory = System.getProperty("user.home");
//        String path = homeDirectory + separator + "public_html" + separator + "data" + separator;
//        String fullFileName = path + fileName;
//        return new Scanner(new File(fullFileName));

    private static Scanner establishScanner(String str) throws FileNotFoundException {
        String filePath = "C:\\Users\\mario\\OneDrive\\Desktop\\Mario\\Java\\test.txt"; // Replace with the path to your text file

        return new Scanner(new File(filePath));
    }

    private static void readNumbers() throws FileNotFoundException {
        Scanner scanner = establishScanner("test.txt");
        while (scanner.hasNext()) {
            ensureCapacity();
            numbers[numberOfNumbers] = scanner.nextInt();
            numberOfNumbers = numberOfNumbers + 1;
        }
    }

    // Ensures the numbers array has room for a next element.
    // If not, it makes a new array twice the size,
    // and copies over the old array to the new one.
    private static void ensureCapacity(){
        if (numberOfNumbers == numbers.length){
            int[] newNumbers = new int[numbers.length * 2];
            for (int i = 0; i < numbers.length; i = i + 1){
                newNumbers[i] = numbers[i];
            }
            numbers = newNumbers;
        }
    }

    private static void swap(int i, int j){
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    private static void bubbleSort(){
        for(int i = 0; i < numberOfNumbers; i = i + 1){
            for(int j = 1; j < (numberOfNumbers - i); j = j + 1){
                if(numbers[j-1] > numbers[j]){
                    swap(j, j-1);
                }
            }
        }
        sorted = true;
    }

}