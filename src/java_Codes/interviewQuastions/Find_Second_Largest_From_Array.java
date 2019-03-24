package java_Codes.interviewQuastions;

public class Find_Second_Largest_From_Array {
    public static void main(String[] args) {
        int[] arr1 = {7,5,6,1,4,2,45,78,43};
        int secondHighest = findSecondLargestNumberInTheArray(arr1);
        System.out.println("Second Largest element in the Array: " + secondHighest);
    }
    public static int findSecondLargestNumberInTheArray(int arr[]) {
        //Initialize these to the smallest value possible
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            //If current element is greater than highest
            if (arr[i] > highest) {
                //assing second highest element to highest element
                secondHighest = highest;
                //highest element to current element
                highest = arr[i];
            } else if (arr[i] > secondHighest) {
                secondHighest = arr[i];

            }}
            return secondHighest;
        }

    }
