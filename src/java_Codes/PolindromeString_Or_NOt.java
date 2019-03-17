package java_Codes;

public class PolindromeString_Or_NOt {
    public static void main(String[] args) {
        String str = "oksana";
        String reverse ="";
        for(int i=str.length()-1;i>=0; i--) {
            reverse += str.charAt(i);
        }
            if(str.equals(reverse)){
                System.out.println("The string is Polindrome");
            }else{
                System.out.println("The String is not Polindrome");
            }
        }
    }

