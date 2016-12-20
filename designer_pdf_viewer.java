import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 26;
        int max=0;

        int h[] = new int[n];
        for(int h_i=0; h_i < n; h_i++){
            h[h_i] = in.nextInt();
            
        }
            String word = in.next();

        int s=word.length();
        for(int i=0;i<s;i++){
            int w=(int)(word.charAt(i));
            w=w-97;
            int b=h[w];
            if(max<b)max=b;
        }
        System.out.println(max*s);





    }
}
