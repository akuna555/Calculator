package java_Codes.interviewQuastions;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsArray {
    public static void main(String[] args) {
        String duplicates[] = new String[]{"java","spring","hibernate","java"};
        Set nonDuplicatesSet = new HashSet();
        Set duplicatesSet = new HashSet();
        for(String string : duplicates){
            if(!nonDuplicatesSet.contains(string)){
                nonDuplicatesSet.add(string);
            }else{
                duplicatesSet.add(string);
            }

        }
        System.out.println(duplicatesSet);
    }
}
