package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void run(){
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        final String name = scanner.nextLine();
        System.out.printf("Hello, %s! \n", name);
    }
}
