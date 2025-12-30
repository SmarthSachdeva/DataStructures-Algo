package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        transponse(arr);
        for(int[] a : arr){
            for(int e : a){
                System.out.print("\t" + e);
            }
            System.out.println();
        }
    }

    private static void transponse(int[][] arr) {

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j <= i; j++){
                int t = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = t;
            }
        }
    }

}