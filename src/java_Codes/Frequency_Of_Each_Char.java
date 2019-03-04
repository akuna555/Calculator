package java_Codes;

public class Frequency_Of_Each_Char {
    public static void main(String[] args) {
        String str="jjkukttaa";
        char[] ch = str.toCharArray();
        for(int i=0; i<ch.length;i++){
            int index =i;
            int count =0;
            for(int j=0;j<ch.length;j++){
                if(j<i && (ch[j]==ch[i])){
                    break;
                }
                if(ch[index]==ch[j]){
                    count++;
                }
            }
            if(count>0){
                System.out.println(ch[i]+ " is "+ count+ " times");
            }
        }

    }
}
