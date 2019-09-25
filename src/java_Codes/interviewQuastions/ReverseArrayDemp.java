package java_Codes.interviewQuastions;

import java.util.Scanner;

public class ReverseArrayDemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the elements-->");
        int num = sc.nextInt();
        //Create an array with size num
        int [] arr = new int [num];
        //Read the elements in to array
        System.out.println("Enter the elements in to the array");
        for(int i=0; i<num;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Printing the revese elements in the array");
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
