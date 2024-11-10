/**
 * The Dec2Hex class provides a method to convert a decimal number to its hexadecimal representation.
 */
public class Dec2Hex {

    /**
     * Converts a given decimal number to its hexadecimal representation.
     *
     * @param num The decimal number to be converted.
     * @return The hexadecimal representation of the given decimal number as a String.
     */
    public static String convert(int num) {
        // Array of hexadecimal characters from '0' to 'F'
        char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int rem; // Stores the remainder after division by 16
        StringBuilder hexadecimal = new StringBuilder(); // Stores the resulting hexadecimal representation

        // Loop until the number is reduced to zero
        while (num != 0) {
            rem = num % 16; // Get the remainder when dividing by 16
            hexadecimal.insert(0, ch[rem]); // Insert the corresponding hex character at the beginning
            num = num / 16; // Divide the number by 16 to continue converting
        }

        // If the input number was 0, set hexadecimal to "0"
        if (hexadecimal.length() == 0) {
            hexadecimal.append("0");
        }

        // Return the final hexadecimal representation
        return hexadecimal.toString();
    }
}

