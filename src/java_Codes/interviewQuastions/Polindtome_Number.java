package java_Codes.interviewQuastions;

public class Polindtome_Number {
    public static void main(String[] args) {
        int n=445;
        int r =0;
        int rev =0;
        int temp=n;
        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n = n/10;

        }
        if(temp==rev){
            System.out.println("Polindrome number");
        }else{
            System.out.println("Not a Polindrom number");
        }
    }
}
