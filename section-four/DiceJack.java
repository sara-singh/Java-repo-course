import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.print("Enter three numbers between 1 and 6: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        boolean firstResult = areLessThan1(num1, num2, num3);
        boolean secondResult = areGreaterThan6(num1, num2, num3);

        if(firstResult || secondResult)
        {
            System.out.println("You entered numbers outside the valid range");
            System.exit(0);
        }
        System.out.println("Your sum is "+ (num1 + num2 + num3) );
        System.out.println("Computer's sum is " + (roll1+roll2+roll3));
        if(userWon(num1 + num2 + num3, roll1+roll2+roll3))
        {
            System.out.println("\nCongratulations, you won!");
        }
        else
        {
            System.out.println("\nBetter luck next time");
        }
        scan.close();
    }
    public static boolean areLessThan1(int num1, int num2, int num3)
    {
        return (num1 < 1 || num2 < 1 || num3 < 1 );
    }
    public static boolean areGreaterThan6(int num1, int num2, int num3)
    {
        return (num1 > 6 || num2 > 6 || num3 > 6);
    }
    public static int rollDice()
    {
        double randNumber = Math.random() *6; //0 - 5.9999999999
        randNumber += 1;                      //1 - 6.999999999
        return (int)randNumber;               //1 - 6
    }
    public static boolean userWon(int sumNumbers, int sumDiceRolls)
    {
        return (sumNumbers > sumDiceRolls && (sumNumbers - sumDiceRolls)<3);
    }
}
