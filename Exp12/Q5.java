import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q5 {
    public static void main(String[] args) throws IOException {
        String filePath = "Exp12\\sample.txt"; 

        BufferedReader reader = new BufferedReader(new FileReader(filePath)); 
        char character;
        while ((character = (char) reader.read()) != -1) {
            System.out.print(character);
        }
        reader.close();
    }
}
