import  java.util.Scanner;
public class SumOfNumbers {
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num;
        int sum = 0;

        System.out.print("Enter a number greater than 1: ");

        num = scanner.nextInt();

        for(int i = 1;i<=num;i++){
            sum+=i;

        }

        System.out.println(sum);


    }
}
