public class RegexValidatePin {
    public static boolean validatePin(String pin) {
        return pin.matches("[0-9]{4}|[0-9]{6}");
    }
}