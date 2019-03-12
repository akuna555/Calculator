package java_Codes;

import java.util.HashMap;
import java.util.Map;

public class Occurrences_Of_Characters_In_String {
    public static void main(String[] args) {
       String str ="Programming";
        Map<Character,Integer> charMapCount = new HashMap<>();
        for(Character c: str.toCharArray()){
            if(charMapCount.containsKey(c)){
                charMapCount.put(c,charMapCount.get(c)+1);
            }else{
                charMapCount.put(c,1);
            }
        }
        System.out.println(charMapCount);
    }
}
