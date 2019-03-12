package java_Codes;

public class Count_Number_Of_Words {
    public static void main(String[] args) {
        String str = " I love my family very , very much";
        int count =0;
        for(int i=0; i< str.length()-1;i++){
            if(str.charAt(i)==' ' && str.charAt(i+1)!= ' '){
                count++;
            }}
            System.out.println("Total number of words in a String : "+ count);
        System.out.println("+++++++++++++++++++++++++++++++++");
        String str1 = "Java programming question";
        System.out.println(  str.split("\\s+ ").length);


    }
}
