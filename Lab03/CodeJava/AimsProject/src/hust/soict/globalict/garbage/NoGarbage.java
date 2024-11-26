package hust.soict.globalict.garbage;

import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void main(String[] args) {
        try {
            String filename = "test.exe"; // File đầu vào (có thể là file lớn)
            byte[] inputBytes = Files.readAllBytes(Paths.get(filename));

            long startTime = System.currentTimeMillis();
            StringBuilder outputStringBuilder = new StringBuilder();

            for (byte b : inputBytes) {
                outputStringBuilder.append((char) b); // Sử dụng StringBuilder thay cho +
            }

            String outputString = outputStringBuilder.toString(); // Chuyển đổi sang String nếu cần
            long endTime = System.currentTimeMillis();
            System.out.println("Time taken: " + (endTime - startTime) + " ms");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
