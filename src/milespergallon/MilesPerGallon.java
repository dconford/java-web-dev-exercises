package milespergallon;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of miles driven:");
        float milesDriven = input.nextFloat();

        System.out.println("Enter the gallons of gas used:");
        float gallonsUsed = input.nextFloat();
        input.close();

        float milesPerGallon = milesDriven/gallonsUsed;
        System.out.println("the Miles per Gallon are " + milesPerGallon);

    }
}
