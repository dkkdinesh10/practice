package problems;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoField;

public class ArrayMamSum{

    public static void main(String[] args) throws java.io.IOException {

    } 

    private static int findMaxSum(int[] A, int B) {
        int finalSum = 0;
        int len = A.length;
        for (int i = 0; i <= B; i++) {
            int currentSum = 0;
            for (int k = 0; k < i; k++) {
                currentSum = currentSum + A[k];
            }
            for (int j = len - 1; j > len - (B - i)-1; j--) {
                currentSum = currentSum + A[j];
            }
            if (i==0) {
                finalSum = currentSum;
            }else if(finalSum < currentSum){
                finalSum = currentSum;
            }
        }
        return finalSum;
    }
}
