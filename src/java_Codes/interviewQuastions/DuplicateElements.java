package java_Codes.interviewQuastions;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {
    public static void main(String[] args) {
        String names[] = {"Java","JavaScript","Ruby","C","Python","Java","C"};
        //1.compare each element:
/*
   for (int i =0;i<names.length;i++){
            for(int j= i+1;j<names.length;j++){
                if(names[i].equals(names[j])){
                    System.out.println("DuplicTE ELEMENT IS ->  "+ names[i]);
                } } }
*/
                //TODO:   2. using HashSet:JavaCollection;it stores unique value.
        Set<String> store = new HashSet<String>();
         for(String name : names){
            if(store.add(name)== false){
                System.out.println("duplicTE ELEMENT IS --> "+ name);
            }
         }


    }
}
