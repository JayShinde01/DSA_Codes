import java.util.*;

public class CRCProgram {

    // XOR operation
    public static String xor(String a, String b) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < b.length(); i++) {
            result.append((a.charAt(i) == b.charAt(i)) ? '0' : '1');
        }
        return result.toString();
    }

    // Modulo-2 Division
    public static String mod2div(String dividend, String divisor) {
        int pick = divisor.length();
        String tmp = dividend.substring(0, pick);

        while (pick < dividend.length()) {
            if (tmp.charAt(0) == '1') {
                tmp = xor(divisor, tmp) + dividend.charAt(pick);
            } else {
                tmp = xor("0".repeat(pick), tmp) + dividend.charAt(pick);
            }
            pick += 1;
        }

        if (tmp.charAt(0) == '1') {
            tmp = xor(divisor, tmp);
        } else {
            tmp = xor("0".repeat(pick), tmp);
        }

        return tmp;
    }

    // Sender Function
    public static String sender(String data, String key) {
        int keyLength = key.length();
        String appendedData = data + "0".repeat(keyLength - 1);
        String crc = mod2div(appendedData, key);
        String codeword = data + crc;
        System.out.println("Sender Side:");
        System.out.println("Original Data     : " + data);
        System.out.println("CRC               : " + crc);
        System.out.println("Transmitted Frame : " + codeword);
        return codeword;
    }

    // Receiver Function
    public static void receiver(String receivedData, String key) {
        String remainder = mod2div(receivedData, key);
        System.out.println("\nReceiver Side:");
        System.out.println("Received Frame: " + receivedData);
        System.out.println("Remainder     : " + remainder);

        boolean hasError = remainder.contains("1");
        if (hasError) {
            System.out.println("Error Detected in Received Data!");
        } else {
            System.out.println("No Error Detected. Data is correct.");
        }
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = "1101011011"; // Bit stream
        String key = "10011";       // Generator polynomial (x⁴ + x + 1)

        // Sender
        String transmitted = sender(data, key);

        // Simulate transmission (you can change this to test errors)
        String received = transmitted; // You can manually flip a bit here to simulate error

        // Receiver
        receiver(received, key);
    }
}
