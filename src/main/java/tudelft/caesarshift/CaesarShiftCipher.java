package tudelft.caesarshift;

public class CaesarShiftCipher {

    public String CaesarShiftCipher(String message, int shift){
        if (message == null || message.isEmpty()) {
            return "invalid";
        }
        StringBuilder sb = new StringBuilder();
        char currentChar;
        int length = message.length();

        shift = shift%26;

        for (int i = 0; i < length; i++) {
            currentChar = message.charAt(i);

            if (currentChar == ' ') {
                sb.append(currentChar);
            } else if (currentChar < 'a' || currentChar > 'z') {
                return "invalid";
            } else {
                currentChar = (char) (currentChar + shift);
                if (currentChar > 'z') {
                    currentChar = (char) (currentChar - 26);
                } else if (currentChar < 'a') {
                    currentChar = (char) (currentChar + 26);
                }
                sb.append(currentChar);
            }
        }
        return sb.toString();
    }
}