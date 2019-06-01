package java_Codes.interviewQuastions;

public class Practice {
    public static void main(String[] args) {
        String str = "oksana";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
            if(rev.equals(str)){
                System.out.println("Polindrome");
            }else{
                System.out.println("Not polindrome");
            }

        }
    }
