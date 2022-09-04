public class Booleans {
    public static void main(String [] args) {

        //booleans are another data type whose values can only
        //be true or false
        boolean b = true;
        System.out.println(b);

        // ! is the negation operator, flips the boolean value
        //articulated as "not" - as in "not b"
        b = !b;
        System.out.println(b);

        //this will evaluate whether 5 > 3 is true or false, then assign
        //that true/false value to outcome
        boolean outcome = 5 > 3;
        System.out.println("5 > 3: " + outcome);

        //comparisons are >, <, >=, <=, !=, ==
        //single = is the assignment operator - changing a value
        //double == is for comparison - checking if two values are equal
        outcome = 9 == 4*2;
        System.out.println("9 is equal to 4*2: " + outcome);

        //to check String equality, don't use ==
        //instead use .equals() method
        String fruit = "apple";
        outcome = fruit.equals("orange");
        System.out.println(fruit + " is the same as orange: " + outcome);
        outcome = "grape".equals(fruit);
        System.out.println("grape is the same as " + fruit + ": " + outcome);
        String fruit2 = "apple";
        outcome = fruit2.equals(fruit);
        System.out.println(fruit2 + " is the same as " + fruit + ": " + outcome);


        //&& is and, || is or
        //for an && evaluation to be true, both sides need to be true
        //for an ||, one or both sides need to be true
        outcome = 9==4*2 || 8 < 5*3;
        System.out.println("9 is equal to 4*2 OR 8 is less than 5*3: " + outcome);


        //! negates an expression
        // (evaluate the opposite boolean)
        // the opposite of < is >=, opposite of <= is >, opposite of == is !=
        // the opposite of AND (&&) is OR (||)
        outcome = ! ( 7 < 4+2);
        //this is the same as 7 >= 4*2
        System.out.println("the opposite of 7 < 4*2: " + outcome);




    }
}
