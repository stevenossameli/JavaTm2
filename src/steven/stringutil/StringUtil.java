package steven.stringutil;

public class StringUtil {


    public static String rpad(String s, char c, int n){

        if(s.length()==n){
            return s;
        }

        // se añaden a la derecha
        return s + replicate(c, n - s.length());
    }


    public static String replicate(char c, int n) {
        String rep = "";
        for (int i = 0; i < n; i++) {
            rep += c;
        }
        return rep;
    }

    public static String ltrim(String s){

        char[] chars = s.toCharArray();
        int index = 0;

        for (int i = 0; i < chars.length; i++) {
            if(chars[i]!= ' '){
                index = i;
                break;
            }
        }

        return s.substring(index);

    }

    public static String rtrim(String s) {

        char[] chars = s.toCharArray();
        int index = 0;

        for (int i = chars.length-1; i >= 0; i--) {
            if(chars[i]!= ' '){
                index = i;
                break;
            }
        }

        return s.substring(0, index);

    }

    public static String trim(String s){
        return rtrim(ltrim(s));
    }

    public static int indexOfN(String s, char c, int n){
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c){
                count++;
            }

            if(count == n){
                return i;
            }
        }

        return -1;
    }
}