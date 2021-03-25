package practice;

public class ExtractNumberFromText {
    public static void main(String[] args) {
        String str="aa12he333lkk55551";
        int finalnum=0;
        StringBuilder sb=new StringBuilder();
        sb.append("0");
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                sb=sb.append(str.charAt(i));
            }else{
                    if(Integer.valueOf(sb.toString())>finalnum ){
                        finalnum=Integer.valueOf(sb.toString());
                    }
                    sb.replace(0,sb.toString().length(),"0");
            }
        }
        System.out.println(finalnum);
    }
}
