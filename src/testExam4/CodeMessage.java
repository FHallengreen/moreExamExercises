package testExam4;

import java.util.ArrayList;
import java.util.Arrays;

public class CodeMessage {

    private String plainText;
    private int[] ciphers;
    private int shiftValue;

    public CodeMessage(String plainText) {
        this.plainText = plainText;
    }

    public int convertToNumber(Character character) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for (int i = 0; i < alphabet.length; i++) {
            if (character == alphabet[i]) {
                return i + 1;
            }
        }
        return 0;
    }

    public void convertText() {
        ciphers = new int[plainText.length()];
        for (int i = 0; i < plainText.length(); i++) {
            ciphers[i] = convertToNumber(plainText.charAt(i));
        }
        System.out.println(Arrays.toString(ciphers));
    }

    public static void main(String[] args) {
        CodeMessage message = new CodeMessage("fed");
        message.convertText();
    }
}
