package foundation;
//https://www.codewars.com/kata/55f8a9c06c018a0d6e000132/train/java
public class ValidatePIN {
    public static boolean validatePin(String pin) {
        return (pin.length() == 4 || pin.length() == 6) && pin.chars().allMatch(Character::isDigit);
    }
}
