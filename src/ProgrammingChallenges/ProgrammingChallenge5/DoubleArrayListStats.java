package ProgrammingChallenges.ProgrammingChallenge5;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DoubleArrayListStats {
    private static ArrayList<Double> numbers = new ArrayList<>();
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
        double value = 0;
        try {
            value = commandReader.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("You didn't enter an integer value to add.");
            return;
        }
        numbers.add(value);
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
        if (numbers.size() == 0) {
            System.out.println("There are no numbers, so there is no minimum.");
            return;
        }
        if (!sorted) {
            System.out.println("The list isn't sorted, please sort first.");
            return;
        }
        System.out.println(numbers.get(0));
    }

    private static void interpretMaxCommand() {
        if (numbers.size() == 0) {
            System.out.println("There are no numbers, so there is no maximum.");
            return;
        }
        if (!sorted) {
            System.out.println("The list isn't sorted, please sort first.");
            return;
        }
        System.out.println(numbers.get(numbers.size()-1));
    }
    private static void interpretAverageCommand() {
        if (numbers.size() == 0) {
            System.out.println("There are no numbers, so there is no maximum.");
            return;
        }
        double average = 0;
        for(int i = 0; i < numbers.size(); i++)
            average += numbers.get(i);

        System.out.println(average/(double)numbers.size());
    }
    private static void interpretMedianCommand() {
        if (numbers.size() == 0) {
            System.out.println("There are no numbers, so there is no maximum.");
            return;
        }
        if (!sorted) {
            System.out.println("The list isn't sorted, please sort first.");
            return;
        }
        double median = 0;
        if (numbers.size() % 2 == 1 )
            median = numbers.get(numbers.size()/2);
        else{
            median = (numbers.get(numbers.size()/2 - 1) + numbers.get(numbers.size()/2)) / 2.0;
        }

        System.out.println(median);
    }

    private static void displayNumbers() {
        for(double n : numbers)
            System.out.println(n);
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
        String filePath = "C:\\Users\\mario\\OneDrive\\Desktop\\Mario\\Java\\ListTestDouble.txt"; // Replace with the path to your text file

        return new Scanner(new File(filePath));
    }

    private static void readNumbers() throws FileNotFoundException {
        Scanner scanner = establishScanner("testDouble.txt");
        while (scanner.hasNext()) {
            numbers.add(scanner.nextDouble());
        }
    }

    private static void swap(int i, int j){
        double temp = numbers.get(i);
        numbers.set(i,numbers.get(j));
        numbers.set(j,temp);
    }

    private static void bubbleSort(){
        for(int i = 0; i < numbers.size(); i = i + 1){
            for(int j = 1; j < (numbers.size() - i); j = j + 1){
                if(numbers.get(j-1) > numbers.get(j)){
                    swap(j, j-1);
                }
            }
        }
        sorted = true;
    }


}
