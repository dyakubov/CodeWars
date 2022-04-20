package foundation;

//https://www.codewars.com/kata/5168bb5dfe9a00b126000018/train/java
public class ReversedStrings {
    public static String solution(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    public static String solution2(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
