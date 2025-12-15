import java.util.Arrays;

public class MainTwo {

    public static int maxSubArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            int sum = arr[i];
            max = Math.max(sum , max);
            for(int j = i+1 ; j < arr.length ; j++) {
                sum+=arr[j];
                max = Math.max(sum , max);
            }
        }

        return max;
    }
    public static void main(String[] args) {

        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(Arrays.toString(arr));
        System.out.println(maxSubArray(arr));
    }

//    private static void printAllSubarraysSum(int[] arr) {
//        int ans = 0;
//        for(int i = 0 ; i < arr.length ; i++){
//            for(int j = i ; j < arr.length ; j++){
//                int sum = 0;
//                for(int k = i ; k <= j ; k++) {
//
//                    sum+=arr[k];
//                    System.out.print(sum + "\t");
//                }
//                ans = Math.max(ans , sum);
//                System.out.print("\n temp answer" + ans +"\n");
//            }
//        }
//        System.out.println("Answer : " + ans);
//    }
}
