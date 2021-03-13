package practice;

import java.io.IOException;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        AnagramString();
        AnagramTwoString();
    }

    public static void AnagramString() {
        String str="nitin";
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+(str.charAt(i));
        }
        if(str.equalsIgnoreCase(rev)){
            System.out.println("YESSSSS");
        }else{
            System.out.println("NOOOO");
        }
    }

    public static void AnagramTwoString() {
        String str="nitin";
        String str1="nitin4";
        boolean flag=false;
        if(str.length()==str1.length()) {
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i)!=str1.charAt(i)){
                    flag=true;
                    break;
                }
            }
            if(flag){
                System.out.println("---NOOOO");
            }else{
                System.out.println("YESSSSS----");
            }
        }else{
            System.out.println("NOOOO---");
        }
    }

    public static class StringCompression {
        public static void main(String[] args) throws IOException {
            String str="ddaabbccddaabbccdda";
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            StringBuilder sb=new StringBuilder();
            for (char c : ch) {
                sb.append(c);
            }
            str=sb.toString();
            String res="";
            int i=0;
            while(str.length()>i){
                int counter=1;
                for(int j=i+1;j<str.length();j++){
                    if(str.charAt(i)==str.charAt(j)){
                        counter++;
                    }
                }
                res=res+str.charAt(i)+counter;
                str=str.replaceAll(String.valueOf(str.charAt(i)),"");
            }

            System.out.println(res);
        }
    }
}
