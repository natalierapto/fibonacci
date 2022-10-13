import java.util.Scanner;

public class Fibonacci {
    public static void main (String[ ] args) {
      System.out.println("How many terms from the fibonacci series would you like? Enter a whole integer please. "); 
      
      Scanner scanner = new Scanner(System.in);
      
      int i = scanner.nextInt();
     
      fiboPrint(i);
    }
public static final void fiboPrint(long n){
      
   int f0 = 0;
   int f1 = 1;

   for (int i = 0; i < n; ++i) {
      System.out.println(f0 + " ");

      final int temp = f1;
      f1= f1+ f0;
      f0 = temp;
} 
    } 
}
