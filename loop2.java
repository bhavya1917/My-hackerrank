import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t--!=0){
            int z=1;
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int i=0;i<n;i++){
                a=a+z*b;
                System.out.print(a+" ");
                z=z*2;
            }
            System.out.println();

        }



    }
}
