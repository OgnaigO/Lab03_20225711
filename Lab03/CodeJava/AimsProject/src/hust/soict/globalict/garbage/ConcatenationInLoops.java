package hust.soict.globalict.garbage;

import java.util.Random;

public class ConcatenationInLoops {
    public static void main(String[] args) {
        // Sử dụng toán tử +
        Random r = new Random(123);
        long start = System.currentTimeMillis();

        String s = "";
        for (int i = 0; i < 65536; i++) {
            s += r.nextInt(2); // Nối chuỗi bằng toán tử +
        }
        System.out.println("Time using + operator: " + (System.currentTimeMillis() - start) + " ms");

        // Sử dụng StringBuilder
        r = new Random(123);
        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 65536; i++) {
            sb.append(r.nextInt(2)); // Nối chuỗi bằng StringBuilder
        }
        s = sb.toString();
        System.out.println("Time using StringBuilder: " + (System.currentTimeMillis() - start) + " ms"); 
    }
}
