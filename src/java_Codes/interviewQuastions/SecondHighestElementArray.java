package java_Codes.interviewQuastions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SecondHighestElementArray {
    public static void main(String[] args) {
        //1,20,5,6,16,10
        //First sort Array
        int [] array= {1,20,5,6,16,10};
        Arrays.sort(array);
        System.out.println(array[array.length-2]);

    }
}
