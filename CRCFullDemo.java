import java.util.Scanner;

public class CRCFullDemo {

    // XOR operation for CRC
    static String xor(String a, String b) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < b.length(); i++) {
            result.append(a.charAt(i) == b.charAt(i) ? '0' : '1');
        }
        return result.toString();
    }

    // Modulo-2 Division
    static String mod2div(String dividend, String divisor) {
        int pick = divisor.length();
        String tmp = dividend.substring(0, pick);

        while (pick < dividend.length()) {
            if (tmp.charAt(0) == '1') {
                tmp = xor(divisor, tmp) + dividend.charAt(pick);
            } else {
                tmp = xor("0".repeat(pick), tmp) + dividend.charAt(pick);
            }
            pick++;
        }

        if (tmp.charAt(0) == '1') {
            tmp = xor(divisor, tmp);
        } else {
            tmp = xor("0".repeat(pick), tmp);
        }

        return tmp;
    }

    // Encoding data
    static String encodeData(String data, String key) {
        int keyLen = key.length();
        String appendedData = data + "0".repeat(keyLen - 1);
        String remainder = mod2div(appendedData, key);
        return data + remainder;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== TRANSMITTER ===");
        System.out.print("Enter binary data to transmit: ");
        String data = scanner.nextLine(); // example: 10011101100
        System.out.print("Enter generator polynomial (e.g. 1001): ");
        String key = scanner.nextLine(); // example: 1001

        String encodedData = encodeData(data, key);
        System.out.println("Transmitted Data (Data + CRC): " + encodedData);

        System.out.println("\n=== RECEIVER ===");
        System.out.println("Received Data: " + encodedData);
        System.out.println("Using Generator: " + key);

        String remainder = mod2div(encodedData, key);

        if (remainder.contains("1")) {
            System.out.println("Error detected in received data.");
        } else {
            System.out.println("No error detected. Data is correct.");
        }

        scanner.close();
    }
}