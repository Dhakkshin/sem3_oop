import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a string:");
        String input = reader.readLine();

        System.out.println("You entered: " + input);

        reader.close();
    }
}
