package practice;

public class DecToBinary {
    private static String bin="";
    public static void main(String[] args) {
        int num=11;
        int rem;
        while (num!=0 && num!=1){
            rem=num%2;
            num=num/2;
            bin=bin+rem;
            if(num==0 || num==1){
                bin=bin+num;
            }
        }
        String s="";
        for(int i=bin.length()-1;i>=0;i--){
            s=s+bin.charAt(i);
        }
        System.out.println(bin);
    System.out.println(s);
    }

}
