import java.util.Arrays;

public class ReverseWords {
    public static void main(String[] args) {

        String s = "a good   example";
        System.out.println(reverseWords(s));

    }

    public static String reverseWords(String s) {
        String[] strArr = s.trim().split("\\s+");
        for (int start = 0, end = strArr.length - 1; start < end; start++, end--) {
            String temp = strArr[start];
            strArr[start] = strArr[end];
            strArr[end] = temp;
        }
        return String.join(" ",strArr);
    }
}

//String.join(delimiter,elements)