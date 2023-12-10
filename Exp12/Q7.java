import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q7 {
    public static void main(String[] args) {
        String filePath = "Exp12\\sample.txt"; 

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
