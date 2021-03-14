package problems;

public class StringCompression {

    private int i=10;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public static void main(String[] args) {
        String str="aaabbbbcccc";
        String res="";
        int counter=1;
        int i=0;
        while(str.length()>i){
            counter=1;
            for(int j=1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    counter++;
                }
            }
            res=res+str.charAt(i)+counter;
            str=str.replaceAll(String.valueOf(str.charAt(i)),"");
        }
        System.out.println("Final String :"+res);
    }
}
