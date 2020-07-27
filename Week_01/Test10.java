package com.test.suanfa;

public class Test10 {

    private static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void printArr(int[] arrs){
        for(int arr : arrs){
            System.out.print(arr + " ");
        }
    }

    private static void  selectSort(int[] arr){
        if (null == arr){
            return;
        }
        for(int i=0;i<arr.length -1;i++){
            int min = i;
            for(int j =i+1;j<arr.length -1;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            if(min != i){
                swap(arr,min,i);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 4, 5, 6, 7, 8, 9};
        selectSort(arr);
        printArr(arr);
    }
}
