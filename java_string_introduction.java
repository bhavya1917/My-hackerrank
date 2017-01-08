import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
       int c=A.length();
        int d=B.length();
        int e=c+d;
        System.out.println(""+e);
        if(A.compareTo(B)<0 || A.compareTo(B)==0)
            {
            System.out.println("No");
        }
        else if(A.compareTo(B)>0){
            System.out.println("Yes");
        }

       String z=A.substring(0,1).toUpperCase();
        String y=B.substring(0,1).toUpperCase();
        String x=z+A.substring(1);
        String w=y+B.substring(1);
        System.out.println(x+" "+w);

    }
}
