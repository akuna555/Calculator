package java_Codes.interviewQuastions;

import java.util.*;

public class ArrayListToSet {
    public static void main(String args[]){
        ArrayList alist = new ArrayList<>();
        alist.add(12);
        alist.add(23);
        alist.add(54);
        alist.add(12);
        alist.add(54);
        alist.add(124);
        alist.add(98);
        alist.add(98);
        System.out.println(alist);
        //Convert ArrayList to Set
        Set set = new HashSet(alist);
        System.out.println("Removed Duplicate : "+set);
        //Sort ArrayList
        Collections.sort(alist);
        System.out.println("Sorted ArrayList: "+ alist);
        //Remove Duplicate & Sort
        TreeSet tset = new TreeSet(alist);
        System.out.println("Sorted and Unique: "+ tset);

    }
}
