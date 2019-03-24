package java_Codes.interviewQuastions;

public class Find_MIssing_Number_In_Array {

    public static void main(String[] args) {
        int[] arr1 = {8,9,7,5,6,1,4,2};
       System.out.println("Missing number from Array arr1:"+ missingNumber(arr1));
        System.out.println("===============");
        int[]arr2 = {5,3,1,2,4,7};
        System.out.println("MIssing number from Array is: "+ missingNumber(arr2));
    }
    public static int missingNumber(int[] arr){
        int n= arr.length +1;
        int sum = n * (n+1) / 2;
        int restSum =0;
        for(int i=0; i< arr.length;i++){
            restSum+=arr[i];
        }
        int missingNumber = sum -restSum;
        return missingNumber;
    }
}
