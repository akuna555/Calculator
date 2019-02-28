public class Polindrome_number {
    public static void main(String[] args) {
        int n= 134;
        int r=0;
        int rev=0;
        int temp=n;
        while(n>0){
            r=n%10;
            n=n/10;
            rev=rev*10+r;
        }
        if(temp==rev){
            System.out.println("Polindrome");
        }else{
            System.out.println("Not Polindrome");

        }
    }
}
