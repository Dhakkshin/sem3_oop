import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q6 {
    public static void main(String[] args) throws IOException {
        String sourceFilePath = "Exp12\\sample.txt";
        String destinationFilePath = "Exp12\\destination.txt";

        FileReader reader = new FileReader(sourceFilePath);
        FileWriter writer = new FileWriter(destinationFilePath);

        int character;
        while ((character = reader.read()) != -1) {
            writer.write(character);
        }

        System.out.println("File copied successfully!");

        reader.close();
        writer.close();    
    }
}
