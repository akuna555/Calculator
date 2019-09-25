package java_Codes.interviewQuastions;

import java.util.*;

public class Day17 {
    public static void main(String[] args) {
       int n= 10;
       int n2 = 40;
       int temp =0;
        System.out.println("Before swapping -->"+ n + " before swapping n2 -> "+ n2);

        n=n+n2;
        n2= n-n2;
        n= n-n2;
        System.out.println("================");
        System.out.println( n  );
        System.out.println(n2);

    }

}