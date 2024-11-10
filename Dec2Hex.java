public class Dec2Hex {

    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        System.out.println("Converting the Decimal Value " + num + " to Hex...");
        System.out.println("Hexadecimal representation is: " + convert(num));
    }

    // Method to convert decimal to hexadecimal
    public static String convert(int num) {
        char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int rem;
        String hexadecimal = "";

        while (num != 0) {
            rem = num % 16;
            hexadecimal = ch[rem] + hexadecimal;
            num = num / 16;
        }

        if (hexadecimal.equals("")) {
            hexadecimal = "0";
        }

        return hexadecimal;
    }
}
