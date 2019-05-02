import java.util.*;
import java.io.*;

class Main {
    public static int FactorialRecursive(int num) {

        return (num == 1 ? 1 : num * FactorialRecursive(num--));

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(FactorialRecursive(Integer.parseInt(s.nextLine())));
    }

}
