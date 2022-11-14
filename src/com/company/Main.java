package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {1, 62, 6, 2, 7, 2, 98, 2, 8, 8, 4, 9, 2, 7, 7, 9, 6, 0, 3, 3, 5, 7, 7, 1, 1, 2, 2, 2, 8};
        Main m = new Main();
        m.rotate(arr);
        m.longestConsecutiveSequence(arr);

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
 // longest Consecutive Sequence
 public  void longestConsecutiveSequence(int[] arr){
     int c=1;
     int maxLength=0;
     int end=-1;
     for(int i=0;i+1<arr.length;i++){

         if(arr[i]<=arr[i+1]){
             c++;
         }else{
             maxLength=maxLength<c?c:maxLength;
             c=1;
             end=i;
         }

     }
     if(arr[arr.length-1]>=arr[arr.length-2]){

         maxLength=maxLength<c?c:maxLength;

         end=arr.length-1;

     }
     System.out.println(maxLength+","+end);
     int f=end-c+1;
     while(f<=end){
         System.out.print(arr[f]+" ");
         f++;
     }
 }
}
