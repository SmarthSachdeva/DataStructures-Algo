public class Main {

    public static void reverse(int[] arr) {
        /*
            Understanding Time Complexity :
                Number of times this loop will run -> length/2
                n = length
                Thus,  TC  = O(n/2) = -> O(n)
         */
        int i = 0;
        for(i = 0 ; i < arr.length/2 ; i++){
            int t = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = t;
        }

        for(int e : arr){
            System.out.print(e + "\t ");
        }
    }

    public static int[] twoSum(int[] arr , int tar){
        /*
            Time Complexity :
                outer-loop with "i" will run from 0 -> n-1 times
                inner-loop with "j" will run from 1 -> n times

                TC = O((n-1)*(n-1)) = -> O(n^2)
         */
        int[] res = new int[2];

        for(int i = 0 ; i < arr.length-1 ; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[i] + arr[j] == tar){
                    return new int[]{arr[i] , arr[j]};
                }
                else continue;
            }
        }

        return res;
    }

//    BRUTE FORCE
    public static int[] productExceptSelf(int[] arr) {
        /*

         */
        int[] res = new int[arr.length];

        for(int i = 0 ; i < arr.length ; i++){
            int prod = 1;
            for(int j = 0 ; j < arr.length ; j++){
                if(i==j) continue;

                prod *= arr[j];
            }
            res[i] = prod;
        }

        return res;
    }

//    OPTIMIZED APPROACH -> EXTRA SPACE
    public static int[] productExceptSelfOptimized(int[] arr) {
        /*

         */
        int n = arr.length;

        int[] left = new int[n];
        int[] right = new int[n];

//        FILLING LEFT
        for(int i = 0 ; i < n ; i++){
            if(i == 0) {
                left[i] = 1;
                continue;
            }

            left[i] = left[i-1]*arr[i-1];
        }

//        FILLING RIGHT
        for(int i = n-1 ; i >= 0 ; i--){
            if(i == n-1) {
                right[i] = 1;
                continue;
            }

            right[i] = right[i+1]*arr[i+1];
        }

//        FINDING FINAL ANS
        int[] res = new int[n];
        for(int i = 0 ; i < n ; i++){
            res[i] = left[i]*right[i];
        }

        return res;
    }

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5};

//        reverse(arr);
//        int[] twoSumArr = twoSum(arr , 9);
        int[] res = productExceptSelfOptimized(arr);
        for(int e : res){
            System.out.print(e + "\t");
        }


    }
}
