import java.util.Scanner;

public class Dec2Hex {
    public static int Arg1;

    public static void main(String args[]) {
        if (args.length == 0) {
            System.out.println("Error: No input argument provided.");
            return;
        }
        try {
            Arg1 = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Error: Input is not a valid integer.");
            return;
        }
        System.out.println("Hexadecimal representation is: " + convert(Arg1));
    }

    // Method to convert decimal to hexadecimal
    public static String convert(int num) {
        char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
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



