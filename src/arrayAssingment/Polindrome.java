package arrayAssingment;


@SuppressWarnings("ALL")
public class Polindrome {
    public static void main(String[] args) {
        String name2 = "civic";
        System.out.println(isPalindrome(name2));
    }
    public static boolean isPalindrome(String name) {
        String str = "";
        for (int i = name.length() - 1; i >= 0; i--) {
               str += name.charAt(i);

        }
        if(!str.equals(name)){
            System.out.println("NOt a polindrome");
            return false;
        }else{
            System.out.println("Polindrome");
            return true;
        }

    }}
