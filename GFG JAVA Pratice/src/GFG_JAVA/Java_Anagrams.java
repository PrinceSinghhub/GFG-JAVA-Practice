package GFG_JAVA;
import java.util.Arrays;

public class Java_Anagrams {
    public static void main(String[] args) {

        String name1 = "anagramm";
        String name2 = "marganaa";

        String res = AnagrameOrNot(name1,name2);
        System.out.println(res);
    }

    static String  AnagrameOrNot(String name1, String name2) {

        if(name1.length()==name2.length()){

            char[] arrSt1 = name1.toCharArray();
            char[] arrSt2 = name2.toCharArray();

            Arrays.sort(arrSt1);
            Arrays.sort(arrSt2);

            if(Arrays.equals(arrSt1, arrSt2)){
                return "Anagrams";
            }else {
                return "Not Anagrams";
            }
        }else {
            return "Not Anagrams";
        }

    }
}
