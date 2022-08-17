package com.sunglowsys;

public class InsertionSort {
    public static  void InsertionSort(int arr[]){
        for (int turn = 0; turn< arr.length-1;turn++){
            for (int j = 0; j< arr.length;j++){
                if (arr[j] < arr[j+1]){

                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printArr(int arr[]){
        for (int i = 0; i< arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
    public static void Selection(int arr[]){
        for (int i = 0;i<= arr.length-1;i++){
            int minPos = i;
            for (int j = 1;j< arr.length;i++){
                if (arr[minPos] < arr[i]){
                    minPos = i;
                }

            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void InsertionOrder(int arr[]){
        for (int i = 1; i< arr.length;i++){
            int curr = arr[i];
            int pre = i-1;
//            finding out the correct position to insert
            while (pre>=0 && arr[pre] > arr[curr]){
                arr[pre+1] = arr[pre];
                pre--;

            }
//            inserted
            arr[pre+1] = curr;

        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        InsertionOrder(arr);
        printArr(arr);


    }
}
