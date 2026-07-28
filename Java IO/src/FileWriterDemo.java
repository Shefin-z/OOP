import java.io.FileWriter;
import java.io.Writer;

class FileWriterDemo {
    public static void main(String args[]) throws Exception {
        String source = "Now is the time for all good men\n"
                + " to come to the aid of their country\n"
                + " and pay their due taxes.";

        char buffer[] = new char[source.length()];
//        source.getChars(0, source.length(), buffer, 0);

        for (int i = 0; i < source.length(); i += 1) {
            buffer[i] = source.charAt(i);
        }

        FileWriter f0 = new FileWriter("file1.txt");

        for (int i = 0; i < buffer.length; i += 1) {
            f0.write(buffer[i]);
        }
        f0.close();

        FileWriter f1 = new FileWriter("file2.txt");
        f1.write(buffer);
        f1.close();

        FileWriter f2 = new FileWriter("file3.txt");
        for (int i = 0; i < source.length(); i += 1) {
            f2.write(source.charAt(i));
        }
        f2.close();
    }
}
