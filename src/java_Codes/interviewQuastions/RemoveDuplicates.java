package java_Codes.interviewQuastions;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str ="javaaai";
        System.out.println(removeDuplicates(str));


    }
    public static String removeDuplicates(String str){
        Set<Character> set = new HashSet<>();
        StringBuffer sb = new StringBuffer();
       // char [] chars = str.toCharArray();
        for(int i=0; i<str.length();i++){
            Character c = str.charAt(i);
            if(!set.contains(c)){
                set.add(c);
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
