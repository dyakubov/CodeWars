package foundation;

//https://www.codewars.com/kata/5899dc03bc95b1bf1b0000ad/train/java
public class InvertValues {
    public static int[] invert(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = -array[i];
        }
        return array;
    }
}
