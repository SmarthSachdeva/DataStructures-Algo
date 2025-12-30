import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i <n; i++) {
            arr[i] = scn.nextInt();
        }

        int[] res = runningSum(arr);

        for(int e : res){
            System.out.print(e + " ");
        }
    }

    private static int[] runningSum(int[] arr) {

        int[] res = new int[arr.length];
        for(int i = 0 ; i < arr.length  ; i++){
            if(i == 0) res[i] = arr[i];
            else res[i] = res[i-1] + arr[i];
        }
        return res;
    }
}