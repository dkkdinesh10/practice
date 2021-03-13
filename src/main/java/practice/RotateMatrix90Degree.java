package practice;

public class RotateMatrix90Degree {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int arr1[][] = new int[3][3];

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                arr1[j][i]=arr[i][j];
            }
        }
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
}
