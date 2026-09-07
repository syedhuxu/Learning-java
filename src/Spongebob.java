import java.util.Scanner;
public class Spongebob {
   public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       String name = "SpongeBob";
       char firstLetter = 'S';
       int age = 22;
       double height = 55.6;
       boolean isEmployed = true;

       System.out.printf("Hello %s\n",name);
       System.out.printf("Your name starts with an %c\n",firstLetter);
       System.out.printf("You are %d Years old\n",age);
       System.out.printf("You are %.1f inches tall\n",height);
       System.out.printf("Employed:%b\n",isEmployed);

       System.out.printf("%s is %d years old",name,age);



       scanner.close();



    }
}
