import java.util.Scanner;

public class Detention {
    public static void main(String[] args) {

        System.out.println("Hi Bart. I can write lines for you.\nWhat do you want me to write?");
        // See Learn the Part for the instructions.
        Scanner scan = new Scanner(System.in);
        String inputLine = scan.nextLine();
        for(int i =0 ;i < 99; i++)
        {
            System.out.println(inputLine);
        }

        scan.close();
    }
}
