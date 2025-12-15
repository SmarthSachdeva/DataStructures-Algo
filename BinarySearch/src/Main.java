//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int binarySearch(int[] arr , int tar){
        int lo = 0 , hi = arr.length-1;

        while(lo <= hi){
            int mid = (lo+hi)/2;

            if(tar == arr[mid]) return mid;
            else if(tar < arr[mid]){
                hi = mid-1;
            }
            else{
                lo = mid+1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[] = {1,3,5,6,7,8,9,14,16,17};
        System.out.println(binarySearch(arr , 90));
    }
}