public class BubbleSort {

    public static void main(String[] args){
        int[] arr = {8,19,4,0,-1,46,67};

        bubbleSort(arr);

        for(int e : arr){
            System.out.print(e + "\t");
        }
    }

    private static void bubbleSort(int[] arr) {

        for (int i = arr.length-1 ; i >= 1 ; i--){
            for(int j = 0 ; j < i ; j++){

                // already sorted - > skip
                if(arr[j] < arr[j+1]) continue;

                else{
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }

            }
        }
    }
}
