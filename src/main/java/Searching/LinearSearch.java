package Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,8,8,9,9,0,0,0};
        linearSearching(arr,41);
    }
    private static int linearSearching(int[] arr,int s){
        for (Integer i:arr) {
            if(i==s){
                System.out.println("found");
                return s;
            }
        }
        System.out.println(" not found");
        return -1;
    }

}
