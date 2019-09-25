package java_Codes;

import java.util.*;

public class practice222 {
    public static void main(String[] args) {
        String [] names = {"Java","JavaScript","Ruby","C", " Python","Java","C"};
        //1. compare each elemnt:
        for( int i = 0; i< names.length;i++){
            for( int j= i+1; j< names.length;j++){
                if(names[i].equals(names[j])){
                    System.out.println("duplicate element is:: "+ names[i]);
                }

            }}
            System.out.println("=============================");
            //2.using HashSet : Java Collection: it stores unique values:
            Set<String> store = new HashSet<String>();
            for(String name : names){
                if(store.add(name)== false){
                    System.out.println("dupliccate element is ::" + name);


            }
        }
        System.out.println("*******************************");
     //3.using HasMap
        Map<String,Integer> storeMap = new HashMap<String,Integer>();
            for(String name : names){
               Integer count =  storeMap.get(name);
               if(count == null){
                   storeMap.put(name,1);
               }else{
                   storeMap.put(name,++count);
               }
            }
            //get the values from thiss HashMap
      Set<Map.Entry<String,Integer>> entrySet =   storeMap.entrySet();
            for(Map.Entry<String,Integer> entry : entrySet){
                if(entry.getValue()>1){
                    System.out.println("duplicate element is : "+ entry.getKey());
                }
            }
    }


    }

