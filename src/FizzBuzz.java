/**
 * @author Michael Servilla
 * @version date 2017-01-18
 *
 * Simple command line run of FizzBuzz concept, with 3 arguments (limit, 1st
 * multiple, and 2nd multiple).
 */
public class FizzBuzz {

    public static void main (String[] args) {
        //Error handling for inappropriate number of arguments.
        if (args.length != 3) {
            System.out.println("Incorrect number of arguments!");

        } else {
            //Input arguments
            int limit = Integer.parseInt(args[0]);
            int fizz = Integer.parseInt(args[1]);
            int buzz = Integer.parseInt(args[2]);

            /*Outputs "Fizz" if 2nd argument is amultiple of number(i); "Buzz" if
            3rd argument is a multiple of number(i); and "FizzBuzz" if both 2nd and 3rd
            arguments are a multiple of number(i). Otherwise, will output number.*/
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
