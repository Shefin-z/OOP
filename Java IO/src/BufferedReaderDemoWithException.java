import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class BufferedReaderDemoWithException {
    public static void main(String args[]) {
        try {
            FileReader fr = new FileReader("TestFile.java");
            BufferedReader br = new BufferedReader(fr);

            while (true) {
                String s = br.readLine();
                if (s == null) break;
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}