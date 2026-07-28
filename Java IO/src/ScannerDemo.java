import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        File f = new File("input.txt");
        int vowelCount = 0;

        try {
            Scanner sc = new Scanner(f);

            while (sc.hasNextLine()) {
//                System.out.println(sc.nextLine());
                String line = sc.nextLine();
//                for (int i = 0; i<line.length(); i++) {
//                    if (line.charAt(i) == 'a' || line.charAt(i) == 'e' || line.charAt(i) == 'i' || line.charAt(i) == 'o' || line.charAt(i) == 'u') {
//                        System.out.println(line.charAt(i));
//                        vowelCount++;
//                    }
//                }
                System.out.println(line);
            }
            sc.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Number of vowels: " + vowelCount);
    }
}
