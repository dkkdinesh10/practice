package practice;

public class Swap2Arrays {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[] arr2={9,8,7,6};

        for(int i=0;i<arr1.length;i++){
                arr1[i]=arr1[i]+arr2[i];
                arr2[i]=arr1[i]-arr2[i];
                arr1[i]=arr1[i]-arr2[i];
        }

        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]);
        }

        for(int i=0;i<arr2.length;i++){
            System.out.print(+arr2[i]);
        }

     }
}
