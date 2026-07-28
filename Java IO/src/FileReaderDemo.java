import java.io.File;
import java.io.FileReader;
import java.io.Reader;

class FileReaderDemo {
    public static void main(String args[]) throws Exception {
        File f = new File("TestFile.java");
        FileReader fr = new FileReader(f);

        char data[] = new char[(int) f.length()];
        fr.read(data); // read() reads characters from the file and stores them in the array data.
        System.out.println(new String(data));
        fr.close();

    }
}