package java_Codes.interviewQuastions;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromStirng {
    public static void main(String[] args) {
       String str="java";
        System.out.println(remove(str));

    }
    public static String remove (String str){
        Set<Character> set = new HashSet<>();
        StringBuffer sf= new StringBuffer();
        for(int i=0; i<=str.length()-1;i++){
            Character c =str.charAt(i);//str.charAt(0) -> s
            if(!set.contains(c)){//if s is not present in hashset
                set.add(c);      //Add s to the set
                sf.append(c);     //s
            }
        }
return sf.toString();
    }
}
