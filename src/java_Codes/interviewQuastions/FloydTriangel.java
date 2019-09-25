package java_Codes.interviewQuastions;

import java.util.Scanner;

public class FloydTriangel {
    public static void main(String[] args) {
        int n,i,d;
        int num=1;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        System.out.println("Floyd Triangle");
        for( i=1; i<=n;i++){
            for(d=1; d<=i; d++){
                System.out.print(num+" ");
                num++;



            }
            System.out.println(" ");
        }
    }
}
