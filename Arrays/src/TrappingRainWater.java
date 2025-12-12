public class TrappingRainWater {

    public static int answer(int[] arr){

        int n = arr.length;

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        int[] ans = new int[n];

        // filing left
        for(int i = 0 ; i < n ; i++){
            if(i==0){
                leftMax[i] = 0;
                continue;
            }

            leftMax[i] = Math.max(arr[i-1] , leftMax[i-1]);
        }

        // filling right
        for(int i = n-1 ; i >= 0 ; i--){
            if(i==n-1){
                rightMax[i] = 0;
                continue;
            }

            rightMax[i] = Math.max(arr[i+1] , rightMax[i+1]);
        }

        // filling answer

        int sum = 0;
        for(int i = 0; i < n; i++){
            int water = Math.min(leftMax[i], rightMax[i]) - arr[i];
            if(water > 0) sum += water;
        }

        return sum;
    }

    public static void main(String[] args) {

        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.print("Answer = " + answer(arr));
    }
}
