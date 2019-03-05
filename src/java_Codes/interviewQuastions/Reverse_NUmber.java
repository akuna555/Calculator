package java_Codes.interviewQuastions;

public class Reverse_NUmber {
    public static void main(String[] args) {
        int num = 153;
        int r =0;
        int rev=0;
        System.out.println(num);
        while(num>0){
            r=num%10;
            rev=rev*10+r;
            num=num/10;
        }
        System.out.println(rev);
    }
}
