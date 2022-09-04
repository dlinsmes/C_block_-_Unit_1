public class RandomNumbers {
    public static void main(String [] args) {

        //generate a random double whose value is inclusive of 0
        //and exclusive of 1 - basically you will get 0.something
        double r = Math.random();
        System.out.println(r);

        //increase the range of values by multiplying
        //print a random number in the range [0, 5)
        System.out.println(Math.random() * 5);


        //cast the result to get a random int - min is 0, max is 4
        //max is 4 because the highest Math.random()*5 will produce is 4.something
        int randInt = (int)(Math.random() * 5);
        System.out.println("random [0, 4]: " + randInt);

        //modify the range by adding 1 - now min is 1, max is 5
        randInt = (int)(Math.random() * 5) + 1;
        System.out.println("random [1, 5]: " + randInt);

        //simulate rolling a die - generate a random num between 1 and 6 inclusive
        int roll = (int)(Math.random() * 6 ) + 1;
        System.out.println("die roll: " + roll);

        //why does this always produce zero?
        int alwaysZero = (int)(Math.random()) * 100;
        System.out.println("Trust me, this will always be zero... " + alwaysZero);


    }
}
