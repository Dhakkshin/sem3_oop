import java.io.IOException;

public class Q1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter characters (press 'q' to quit):");

        while (true) {
            char input = (char) System.in.read();

            if (input == 'q') {
                System.out.println("Exiting program...");
                break;
            }

            if (input != '\n' && input != '\r') {
                System.out.println("Read character: " + input);
            }
        }
    }
}
