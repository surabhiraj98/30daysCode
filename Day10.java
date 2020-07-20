import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();

        int sum = 0, max = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                sum++;
             
                if (sum > max) {
                    max = sum;
                }
            } else {
                sum = 0;
            }
            n = n / 2;
        }
        System.out.println(max);
    }
}

