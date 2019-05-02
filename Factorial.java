import java.util.*;
import java.io.*;

class Main {
    public static int Factorial(int num) {

        // code goes here
    /* Note: In Java the return type of a function and the
       parameter types being passed are defined, so this return
       call must match the return type of the function.
       You are free to modify the return type. */
        int result = 1;
        for(int i = num; i > 0; i--){
            result = i * result;
        }

        return result;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(Factorial(Integer.parseInt(s.nextLine())));
    }

}
