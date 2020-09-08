package lesson1;
import java.util.Scanner;
public class weightOnTheMoon {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print("Enter your weight: ");
            double normalWeight = input.nextDouble();

            double weightOnMoon = normalWeight * 0.17;
            System.out.println("Your weight on moon is: "  + weightOnMoon );
        }
    }

