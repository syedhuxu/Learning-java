import java.util.Scanner;
public class Multiplier {

    public static  void main(String[] args){

        // Basic multiplier from base to limit

        Scanner scanner = new Scanner(System.in);



        int base;
        int limit;

        System.out.print("Enter the number you want to multiply: ");
        base = scanner.nextInt();

        System.out.print("Enter the limit number: ");
        limit = scanner.nextInt();

        for(int i = 1; i <= limit; i++){

            System.out.println(base+" * "+i + " = "+ (base*i));

        }


        scanner.close();


    }
}
