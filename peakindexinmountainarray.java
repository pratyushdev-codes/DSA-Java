 import java.util.*;
 public class peakindexinmountainarray{
    public static void main(String[] args) {
        System.out.println("hello");
    }public int peakindexinmountainarray(int [] arr){
        int start =0 ;
        int end=arr.length-1;
         while(start<end){
            int mid= start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){ //you are int decreasing part of the array, this may be the answer, but look at the left part of the array
                end = mid;
         }else{
             start = mid+1;
         }
    }
    //in the end , start == end and pointing to the largest number because of the 2 checks above
    return start;
 }

}
