

import java.util.Arrays;

class ArraysQuestionBasic{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        
        /// Swap the elements at the 2 indices
        System.out.println("Old Array: " +Arrays.toString(arr));
        ElementIndexSwapper(arr, 1, 4);
        System.out.println("ElementIndexSwapper: " + Arrays.toString(arr));
        // ElementIndexSwapper: [1, 5, 3, 4, 2, 6, 7]

        
        /// returns max element of the array
        System.out.println("\nMax Element of Array: " + MaxArrayElement(arr) + "\n");
        // Max Element of Array: 7
        
        
        /// Reverse the array
        int[] arr1 = {1,2,3,4,5,6};
        System.out.println("Old Array: " +Arrays.toString(arr1));
        ReverseTheArray(arr1);
        System.out.println("Reversed Array: " + Arrays.toString(arr1));
        /// Old Array: [1, 2, 3, 4, 5, 6]
        /// Reversed Array: [6, 5, 4, 3, 2, 1]
        
    }
    static void ReverseTheArray(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    static int MaxArrayElement(int[] arr){
        int max = arr[0];
        if(arr.length ==0 ){
            return -1;
        }
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    static void ElementIndexSwapper(int[] arr, int index1, int index2){
        int temp = arr[index2];
        arr[index2] = arr[index1];
        arr[index1] = temp;
    }
}
