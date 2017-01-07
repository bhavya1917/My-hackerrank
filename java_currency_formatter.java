import java.util.*;
import java.text.*;
import java.lang.Object;
import java.io.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
       NumberFormat usd=NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat inr=NumberFormat.getCurrencyInstance(new Locale("en","in"));
        NumberFormat china=NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france=NumberFormat.getCurrencyInstance(Locale.FRANCE);


        // Write your code here.

        System.out.println("US: " + usd.format(payment));
        System.out.println("India: " + inr.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}
