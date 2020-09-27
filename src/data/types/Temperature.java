
package data.types;

import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a degree in Fahrenheit: ");
        if (scanner.hasNextInt()) {
            float input = scanner.nextInt();
            float result = 5 * ( input - 32 ) / 9;
            System.out.println(input + " degree Fahrenheit is equal to " + result + " in Celsius");
        } else {
            System.out.printf("invalid input");
        }
    }
}