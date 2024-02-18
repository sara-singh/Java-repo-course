public class LogicalOperators {
    public static void main(String[] args) {

        /**********************AND OPERATOR**********************/

        boolean hasDrivingLicense = true;
        boolean hasInsurance = true;

        // has License and Insurance: System.out.println("You can legally drive.");
        // otherwise: System.out.println("You cannot legally drive.");
        if(hasDrivingLicense && hasInsurance)
        {
            System.out.println("You can legally drive.");
        }
        else
        {
            System.out.println("You cannot legally drive.");
        }

        int age = 25;
        double income = 45000;

        // is at least 21 and has an income of at least 40000 : System.out.println("You are eligible for a loan.");
        // otherwise: System.out.println("You are not eligible for a loan.");
        if(age>=21 && income>=40000)
        {
            System.out.println("You are eligible for a loan.");
        }
        else
        {
            System.out.println("You are not eligible for a loan.");
        }

        String inputUsername = "JohnDoe";
        String inputPassword = "password123";

        String correctUsername = "JohnDoe";
        String correctPassword = "password123";

        // the inputted username and password are correct: System.out.println("Access granted!");
        // otherwise: System.out.println("Invalid username or password");
        if(inputPassword.equals(correctPassword) && inputUsername.equals(correctUsername))
        {
            System.out.println("Access granted!");
        }
        else
        {
            System.out.println("Invalid username or password");
        }

        /**********************OR OPERATOR**********************/

        boolean hasGoodPerformance = true;
        boolean isLongTermEmployee = false;

        // good performance or is a long term employee: System.out.println("The user is eligible for a promotion.");
        // otherwise: System.out.println("The user is not eligible for a promotion.");
        if(hasGoodPerformance || isLongTermEmployee)
        {
            System.out.println("The user is eligible for a promotion.");
        }
        else
        {
            System.out.println("The user is not eligible for a promotion.");
        }

        int userAge = 17;
        boolean isParentPresent = true;

        // at least 18 or if parent is present: System.out.println("You can enter the venue.");
        // otherwise: System.out.println("You cannot enter the venue.");
        if(userAge >= 18 || isParentPresent)
        {
            System.out.println("You can enter the venue.");
        }
        else
        {
            System.out.println("You cannot enter the venue.");
        }


        int memberAge = 16;
        boolean hasMembership = false;

        // at least 18 or has a membership: System.out.println("The user can access the service.");
        // otherwise: System.out.println("The user cannot access the service.");
        if(memberAge >=18 || hasMembership)
        {
            System.out.println("The user can access the service.");
        }
        else
        {
            System.out.println("The user cannot access the service.");
        }
        /**********************NOT OPERATOR**********************/

        String option = "cash";

        //boolean cashOrCredit = option.equals("cash") || option.equals("credit");
        boolean notCashOrCredit = !(option.equals("cash") || option.equals("credit"));
        if (notCashOrCredit)
        {
            System.out.println("Please choose another payment option");
        }
        else 
        {
            System.out.println("Sold. Pleasure doing business with you!");
        }
        // if payment option is NOT cash or credit: System.out.println("Please choose another payment option");
        // otherwise: System.out.println("Sold. Pleasure doing business with you!");

        char letter = 'A';

        //boolean isVowel = (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U');
        boolean isNotVowel = !(letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U');
        // if letter is NOT a vowel: System.out.println("The letter " + letter + " is a consonant");
        // otherwise: System.out.println("The letter " + letter + " is a vowel");
        if(isNotVowel)
        {
            System.out.println("The letter " + letter + " is a consonant");
        }
        else
        {
            System.out.println("The letter " + letter + " is a vowel");
        }

        String move = "stay";
        //boolean isHitOrStay = move.equals("hit") || move.equals("stay");
        boolean notIsHitOrStay = !(move.equals("hit") || move.equals("stay"));
        if(notIsHitOrStay)
        {
            System.out.println("Please choose a valid move");
        }
        else
        {
            System.out.println("You win 10 bucks!");
        }
        // if move is NOT hit or stay: System.out.println("Please choose a valid move");
        // otherwise: System.out.println("You win 10 bucks!");

    }
}
