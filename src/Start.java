public class Start {

   public static void main(String[] args) {
       One a1 = new One();
       One a2 = new One();

       a1.x = 100;
       a2.x=45;

       System.out.println(a2.x);
       a2 = a1;
       System.out.println(a2.x);
       a1.hlp();
       System.out.println(One.y);


    }
}
