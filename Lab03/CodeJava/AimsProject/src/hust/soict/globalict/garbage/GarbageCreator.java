package hust.soict.globalict.garbage;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
    public static void main(String[] args) {
        try {
            String filename = "test.exe"; // File đầu vào (có thể là file lớn)
            byte[] inputBytes = Files.readAllBytes(Paths.get(filename));

            long startTime = System.currentTimeMillis();
            String outputString = "";

            for (byte b : inputBytes) {
                outputString += (char) b; // Nối chuỗi bằng toán tử +
            }

            long endTime = System.currentTimeMillis();
            System.out.println("Time taken: " + (endTime - startTime) + " ms");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
