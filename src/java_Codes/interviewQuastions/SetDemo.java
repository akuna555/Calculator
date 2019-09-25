package java_Codes.interviewQuastions;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        String s = "hello world";
        char[] charArray = s.toCharArray();
        Set<Character> set = new HashSet<Character>();
        int count=0;
        for(int i=0; i<charArray.length;i++){
            if(!set.add(charArray[i])){
                System.out.println("Index/position of duplicate characters: "+ i);
                count++;

            }
        }
    }
}
