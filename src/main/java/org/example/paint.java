package org.example;
import java.util.Scanner;

public class paint {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("What is the length of the room in feet? ");
        double length = input.nextDouble();
        System.out.print("What is the width of the room in feet? ");
        double width = input.nextDouble();

        double ceilArea = length * width;
        int numGal = 0;

        //while loop to add +1 to number of gallons variable each time you subtract 350 from area variable.
        while(ceilArea > 0) {
            ceilArea = ceilArea - 350;
            numGal++;
        }

        //reinitialize the area to be length times width after while loop altered the variable
        ceilArea = length * width;
        System.out.println("You will need to purchase " + numGal + " gallons of paint to cover " + ceilArea +
                " square feet");
    }
}
