package shortestdistance;

public class MaxContiSum {
    public static void main(String[] args) {
        int arr[] ={3,2,1,2,3,4,2};
        int finalSum=0;
        int sum=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                sum=sum+arr[i];
            }else{
                sum=sum+arr[i];
                if(sum>finalSum){
                    finalSum=sum;
                }
                sum=0;
            }
        }
        System.out.println("---"+finalSum);
    }
}
