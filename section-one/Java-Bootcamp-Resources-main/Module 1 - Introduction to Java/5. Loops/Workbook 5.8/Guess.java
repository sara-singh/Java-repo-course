import java.util.Scanner;

public class Guess  {
    public static void main(String[] args) {

       System.out.print("I chose a number between 1 and 5. Try to guess it: ");
       int secretNumber = 4;

        
       Scanner scan = new Scanner(System.in);
       int youNumber = scan.nextInt();

       while(secretNumber!=youNumber)
       {
            System.out.print("Guess again ");
            youNumber=scan.nextInt();
       }
       System.out.println("You got it!");
       
       //See Learn the Part for detailed instructions.
        
        scan.close();
    }

}
