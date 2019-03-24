package arrayAssingment;

public class Array {
    public static void main(String[] args) {

      String []fruits = new String[] {"apple","melon","banana"};
      String print = fruits[0];
      for(String f: fruits){
          if(f.length()>print.length()){
              print=f;
          }
      }
        System.out.println(print);
      }
      }





