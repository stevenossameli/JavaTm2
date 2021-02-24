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
        return s.replaceAll("^\\s+", "");
    }

    public static String rtrim(String s) {
        return s.replaceAll("\\s+$", "");
    }

    public static String trim(String s){
        return s.trim();
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