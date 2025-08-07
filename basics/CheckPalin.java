import java.util.regex.Pattern;

class Solution {   
    public static boolean isPalindrome(String s) {
        s=  Pattern.compile("[^ a-z 0-9 A-Z ]").matcher(s).replaceAll("").toLowerCase();
        return Solution.rec(s);
    }


    public static boolean rec(String s){
        if (s.length()<=1) return true;
        int li =s.length()-1;

        if(s.charAt(0) == s.charAt(li)){
        return rec(s.substring(1,li));
        }
        return false;

    }


    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
    }
}