package java_Codes.interviewQuastions;

public class Leap_Year {
    public static void main(String[] args) {
        int year =2020;
        if(year%400 ==0 || year %4 ==0 &&year%100 !=0){
            System.out.println("Leap year");
        }else{
            System.out.println("Not a Leap year");
        }
    }
}
