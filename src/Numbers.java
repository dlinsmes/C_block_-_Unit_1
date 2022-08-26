import java.util.Scanner;

public class Numbers {

    public static void main(String [] args) {
        //to save numbers as data, we'll use the types
        //int and double

        //int - integers (positive or neg whole numbers)
        //doubles - numbers that have decimals

        //declare and initial an int variable
        //initialize means to give the first value
        int num = 7;
        System.out.println("num is " + num);


        // = is an assignment operator
        // evaluate (solve) what's on the right
        // THEN assign to the left
        num = num + 3;
        System.out.println("new value of num is " + num);

        // - subtraction
        // * multiplication
        // / division
        // % modulo (mod) - remainder after division

        //same as num = num + 2
        //can use for -, *, /, %
        num += 2;

        //same as num += 1 and num = num + 1
        // only ++ and --
        num++;
        System.out.println("num after adding 2 and 1: " + num);

        num = 7;

        int quotient = 8 / 2;
        System.out.println("8 / 2 is " + quotient);

        //when you divide integers - java only evaluates
        //the whole number part of the quotient
        quotient = num / 2;
        System.out.println("7 / 2 is " + quotient);

        //any decimals in a int division quoient just get
        //truncated (cut off)
        //truncation IS NOT rounding
        quotient = 99 / 100;
        System.out.println("99 / 100 is " + quotient);

        //to get the expected decimals in division, use doubles
        double quotient2 = 99.0 / 100;
        System.out.println("99.0 / 100 is " + quotient2);

        double a = 99/100.0;
        System.out.println("99 / 100.0 is " + a);

        double b = 99.0/100.0;
        System.out.println("99.0 / 100.0 is " + b);

        //if both parts of the division are ints (no decimals)
        //it's evaluated as int division
        double c = 99/100;
        System.out.println("99 / 100 is " + c);

        //normal rounding rules -
        //if the decimal is .5 or higher, round to the
        //next whole number
        //otherwise stay on the current whole number
        // (truncate the decimal)

        double toRound = 3.7;

        //to cast (convert) a double to an int:
        //casting a double truncates the decimal
        int n = (int)(3.7);
        System.out.println("3.7 casted to an int is " + n);

        // this works because with the assignment operator (=)
        //FIRST the right-hand side is evaluated so .5 is added
        //to toRound's value and then that sum is casted to an int
        //THEN that casted sum is saved to the rounded int variable
        int rounded = (int)(toRound + .5);

        System.out.println( toRound + " rounded is " + rounded);

        //prompt the user for a decimal number to round,
        //save the value, and output the rounded number

        System.out.println("Enter a number to round");

        Scanner input = new Scanner(System.in);

        //get a double from the Scanner object and save to
        //userNum
        double userNum = input.nextDouble();

        //calculate the rounded version of userNum and output it
        int userRounded = (int)(userNum + 0.5);
        System.out.println(userNum + " rounded is " + userRounded);


    }
}
