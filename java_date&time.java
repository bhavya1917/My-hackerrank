import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private static final String[] DAYS = {"SUNDAY", "MONDAY","TUESDAY", "WEDNESDAY", "THURSDAY","FRIDAY","SATURDAY"};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int day = in.nextInt();
        int year = in.nextInt();

        int a = (14 - month) / 12;
        int y = year - a;
        int m = month + 12 * a - 2;

        int d = (day + y + y/4 - y/100 + y/400 + (31*m)/12) % 7;
        System.out.println(DAYS[d]);
    }
}
