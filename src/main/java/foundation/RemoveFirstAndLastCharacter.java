package foundation;

public class RemoveFirstAndLastCharacter {
    public static String remove(String str) {
        return str.subSequence(1, str.length() - 1).toString();
    }
}
