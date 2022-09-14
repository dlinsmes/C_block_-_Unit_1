import java.util.Scanner;

public class CashRegisterFix {
    public static void main(String [] args) {
        System.out.println("Enter a money amount");
        Scanner s = new Scanner(System.in);
        double amt = s.nextDouble();

        System.out.println("amt is " + amt);

        double cents = amt % 1;
        System.out.println("cents: " + cents);

        cents *= 100;
        //same as cents = cents * 100
        System.out.println("cents: " + cents);

        int coins = (int)(cents + 0.5);
        System.out.println("coins: " + coins);



    }

}