import java.util.Scanner;
public class Hypotenuse {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;

        System.out.print("Enter first side: ");
        a = scanner.nextDouble();

        System.out.print("Enter second side: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println(c);


    }
}
