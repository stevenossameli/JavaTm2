package steven.stringutil;


public class StringUtilMain {
    public static void main(String[] args) {

        //steven.stringutil.StringUtil

        System.out.println(StringUtil.rpad("31", '0', 5) + "\n");

        String hola = "       ¡HOLA MUNDO!        ";
        System.out.println(StringUtil.ltrim(hola) + ":)");
        System.out.println(StringUtil.rtrim(hola) + ":)");
        System.out.println(StringUtil.trim(hola)  + ":)\n");

        System.out.println(StringUtil.indexOfN("John|Paul|George|Ringo", '|', 2));

    }
}
