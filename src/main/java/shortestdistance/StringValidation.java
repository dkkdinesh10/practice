package shortestdistance;

import java.util.Stack;
import java.util.regex.Pattern;

public class StringValidation {
    public static void main(String[] args) {
        String str="{Hi,<This is [ what means ()]>}";
        System.out.println(validateString(str));
    }


    public static  boolean validateString(String str) {
        //Pattern p=new Pattern();
        Stack<String> stack=new Stack<String>();
        for(int i=0;i<str.length();i++){
            if(String.valueOf(str.charAt(i)).equals("{")
                    || String.valueOf(str.charAt(i)).equals("(")
                         ||   String.valueOf(str.charAt(i)).equals("[")
                               || String.valueOf(str.charAt(i)).equals("<")){
                    stack.push(String.valueOf(str.charAt(i)));
            }else if(String.valueOf(str.charAt(i)).equals("}")
                        || String.valueOf(str.charAt(i)).equals(")")
                            ||   String.valueOf(str.charAt(i)).equals("]")
                                || String.valueOf(str.charAt(i)).equals(">")){

                if(!isValidPop(stack.pop(),String.valueOf(str.charAt(i)))){
                    System.out.println("not valid");
                    return false;
                }

            }
        }
        return true;
    }

    private static boolean isValidPop(String sPopped,String current){
        boolean flag=false;
        if(sPopped.equals("{") && current.equals("}")){
            flag=true;
        } else if(sPopped.equals("(") && current.equals(")")){
            flag=true;
        } else if(sPopped.equals("[") && current.equals("]")){
            flag=true;
        } else if(sPopped.equals("<") && current.equals(">")){
            flag=true;
        }
        return flag;
    }
}
