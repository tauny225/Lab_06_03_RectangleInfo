
import java.util.Scanner;

public class Main {

    public static <string> void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double height = 0;
        double length = 0;
        double area;
        double perimeter;
        double diagonal;
        String trash = "";

        System.out.print("Enter the length of rectangle: ");
        if(in.hasNextDouble())
        {
            length= in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("The number you entered is invalid: " + trash);
        }

        System.out.print("Enter the height of rectangle: ");
        if(in.hasNextDouble())
        {
            height = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("The number you entered is invalid: " + trash);
        }

        area = length * height;
        perimeter = 2 * (length + height);
        diagonal = Math.sqrt(length * length + height * height);

        System.out.println("The area of rectangle is: " + area);
        System.out.println("The perimeter of rectangle is: " + perimeter);
        System.out.println("The diagonal of rectangle is: " + diagonal);

    // write your code here
    }
}
