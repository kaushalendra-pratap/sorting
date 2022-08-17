package com.sunglowsys;

public class Sort {
    public static void Sort(int arr[]){
        for (int turn = 0; turn < arr.length-1;turn++){
            for (int j = 0;j< arr.length-1-turn;turn++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
    }
    public static void printArr(int arr[]){
        for (int i = 0;i< arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void Selection(int arr[]){
        for (int i = 0;i< arr.length;i++){
            int minPos = i;
            for (int j = 0;j< arr.length-1;j++){
                if (arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        Selection(arr);
        printArr(arr);
        

    }
}
