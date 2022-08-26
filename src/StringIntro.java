//a java class is a program file
//the class name MUST start with a capital letter
//and have no spaces

//the class name must match the file name exactly

//all code we write will go in the curly braces
//for the class
public class StringIntro {

    //for now, all code will go in the main()
    //method
    public static void main(String [] args) {
        System.out.print("Hi");
        //"Hi" is a string
        //Strings have text and numbers and symbols
        //that can be used as data or printed
        //Strings don't get interpreted as code

        //without quotes, java thinks Hi is a variable
        //and an error occurs
//        System.out.print(Hi);

        //declare a variable
        //-reference a var for the first time so that
        //the program knows it's a variables
        String lunch = "sandwich";

        System.out.println();
        //println() - print line
        //puts a line break AFTER whatever you're printing
        //print() keeps everything on the same line
        System.out.println(lunch);

        System.out.println("I have a " + lunch + " for lunch today");



    }

}
