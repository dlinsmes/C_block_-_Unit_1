//an import statement lets you use different
//program components
//-Scanner is a component that lets you
//get input from the user
import java.util.Scanner;

public class Input {
    public static void main(String [] args) {

        //prompt the user to enter their name
        //and get the name as input
        System.out.println("What is your name?");

        //declare a Scanner object called input
        //input is just the variable name -
        //you can call it what you want
        Scanner input = new Scanner(System.in);

        //wait for input from the user
        //any following code won't run until
        //the user enters something
        String name = input.nextLine();

        //the input should be saved to a variable
        //if it needs to be used later in the
        //program

        System.out.println("Nice to meet you");

        System.out.println("I have a friend named " + name);

    }
}
