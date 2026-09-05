import java.util.Scanner;
public class Statements {
    public static void main(String[] args){

        // Number classifier

        Scanner scanner = new Scanner(System.in);

        int n ;
        System.out.print("Enter any number: ");
        n = scanner.nextInt();



        if(n < 0 && n % 2 == 0)
        {
            System.out.println("Number  is negative and even");
        }
        else if (n < -1 && n % 2 != 0)
        {
            System.out.println("Number is negative and odd");
        }
        else if (n > 1 && n % 2 == 0)
        {
            System.out.println("Number is positive and even");

        }
        else if (n > 1 && n % 2 != 0){
            System.out.println("Number is positive and odd");
        }
        else{
            System.out.println(n==0?"your number is zero":n==-1?"your number is -1":n==1?"your number is 1":"invalid number");
        }
        scanner.close();

        }






    }

