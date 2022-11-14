package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {1, 62, 6, 2, 7, 2, 98, 2, 8, 8, 4, 9, 2, 7, 7, 9, 6, 0, 3, 3, 5, 7, 7, 1, 1, 2, 2, 2, 8};
        Main m = new Main();
        m.rotate(arr);

    }
    // method to check whether array can be sorted by rotation
    public  boolean rotate(int arr[]){
        boolean flag=true;
        int count=0;
        for(int i=0;i+1<arr.length;i++){
            if(arr[i]>arr[i+1]){
                flag=false;
            }
            if(arr[i]>arr[i+1]){
                count++;
            }
        }
        if (flag||count==arr.length-1) {
            return true;
        }
        return false;
    }
}
