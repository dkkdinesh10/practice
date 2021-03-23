package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,8,9,11,14,15,16,19};
        binarySearch(arr,0,arr.length-1,16);
    }
    private static int binarySearch(int[] arr,int i,int len,int search){
        if(len>=i) {
            int mid = (len + i) / 2;
            if (search == arr[mid]) {
                System.out.println("found");
                return search;
            }
            if (search < arr[mid]) {
                binarySearch(arr, i, mid, search);
            } else {
                binarySearch(arr, mid + 1, len, search);
            }
        }
        return -1;
    }
}
