import java.util.Scanner;

public class Main {

    public static  void  main (String[] args){

        // Calculate the area of a rectangle

        Scanner scanner = new Scanner(System.in);

        double height;
        double width;
        double area;

        System.out.print("Enter Height: ");
        height = scanner.nextDouble();

        System.out.print("Enter Width: ");
        width = scanner.nextDouble();

        area = height * width;

        System.out.println("The area is: "+ area + " cm²");



    }
}
