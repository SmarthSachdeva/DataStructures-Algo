public class SelectionSort {

    public static void main(String[] args){
        int[] arr = {8,19,4,0,-1,46,67};

        selectionSort(arr);

        for(int e : arr){
            System.out.print(e + "\t");
        }
    }

    private static void selectionSort(int[] arr) {

        for(int i = 0 ; i < arr.length-1 ; i++){
            int assumedMin = i;
            int actualMin = arr[assumedMin] ;
            int minIndex = i;
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[j] < actualMin){
                    actualMin = arr[j];
                    minIndex = j;
                }
            }
            int t = arr[assumedMin];
            arr[assumedMin] = arr[minIndex];
            arr[minIndex] = t;

        }
    }
}
