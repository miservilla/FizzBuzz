/**
 * @author Michael Servilla
 * @version date 2017-01-18
 *
 * Simple command line run of FizzBuzz concept, with 3 arguments (limit, 1st
 * multiple, and 2nd multiple).
 */
public class FizzBuzz {

    public static void main (String[] args) {
        //error handling for inappropriate number of arguments
        if (args.length != 3) {
            System.out.println("Incorrect number of arguments!");

        } else {
            //input arguments
            int limit = Integer.parseInt(args[0]);
            int fizz = Integer.parseInt(args[1]);
            int buzz = Integer.parseInt(args[2]);

            //outputs "Fizz" if number is multiple of 1st argument; "Buzz" if
            //is multiple of 2nd argument; and "FizzBuzz" is number is multiple
            //of both arguments. Otherwise, will output number.
            for (int i = 1; i <= limit; i++) {
                if (i % fizz == 0 && i % buzz == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % fizz == 0) {
                    System.out.println("Fizz");
                } else if (i % buzz == 0) {
                    System.out.println("Buzz");
                } else System.out.println(i);
            }
        }

    }
}
