import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

class BufferedReaderDemo {
    public static void main(String args[]) throws Exception {
        FileReader fr = new FileReader("TestFile.java");
        BufferedReader br = new BufferedReader(fr); //constructer will take an object of FileReader class as an argument.

        while (true) {
            String s = br.readLine();
            if (s == null) break;
            System.out.println(s);
        }


        br.close();
        fr.close();

    }
}