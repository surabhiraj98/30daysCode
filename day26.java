import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner s = new Scanner(System.in);

        int d = s.nextInt();
        int m = s.nextInt();
        int y = s.nextInt();

        int d1 = s.nextInt();
        int m1 = s.nextInt();
        int y1 = s.nextInt();

        int fine = 0;

        if (y > y1) fine = 10000;
        else if (y == y1) {
            if (m > m1) fine = (m - m1) * 500;
            else if (m == m1 && d > d1) fine = (d - d1) * 15;
        }

        System.out.println(fine);
    }
}

