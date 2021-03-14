package problems;

import java.util.Arrays;

public class MyClassMaxFrequency {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 5, 5, 5, 5, 6, 6, 67, 7, 7, 7, 7, 7, 7, 7, 7, 77, 7, 7, 7};
        Arrays.sort(arr);
        int maxcount = 1, currentcount = 1;
        int num = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                currentcount++;
            } else {
                if (currentcount > maxcount) {
                    maxcount = currentcount;
                    num = arr[i - 1];
                }
                currentcount = 1;
            }
        }
        System.out.println("c" + maxcount + "num" + num);
    }
}
