import java.io.FileInputStream;
import java.io.InputStream;

class FileInputStreamDemo {
    public static void main(String args[]) throws Exception {
        int size;
        FileInputStream f = new FileInputStream("TestFile.java");
        size = f.available(); //f.available() returns an estimate of the number of bytes that can be read from the file.
        System.out.println("Total Available Bytes: " + size);

        while (f.available() > 0) {
            System.out.print((char)f.read()); // f.read() reads a byte of data from the file. It returns -1 when it reaches the end of the file.
        }


        f.close();

    }
}
