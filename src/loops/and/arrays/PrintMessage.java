package loops.and.arrays;

import java.util.Scanner;

public class PrintMessage {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int currentInput;

        do {
            System.out.println("Please enter how many time to print message or -1 to exit");
            currentInput = scanner.nextInt();
            printMessage(currentInput);

        } while (currentInput != -1);
    }

    public static void printMessage(int times) {
        for (int count = 0; count < times; count++) {
            System.out.println("Hello world");
        }
    }
}
