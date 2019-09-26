import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        System.out.println(factorial(n));
    }
   

    // Complete the factorial function below.
    static int factorial(int n) {
    if (n == 1) return 1;
        return factorial(n - 1) * n;
    }
}
 
