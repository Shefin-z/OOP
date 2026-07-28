import java.io.FileOutputStream;
import java.io.OutputStream;

class FileOutputStreamDemo {
    public static void main(String args[]) throws Exception {
        String source = "Now is the time for all good men\n"
                + " to come to the aid of their country\n"
                + " and pay their due money.";

        byte buf[] = source.getBytes();

        OutputStream f0 = new FileOutputStream("file1.txt");

        for (int i = 0; i < buf.length; i += 1) {
            f0.write(buf[i]);
        }
        f0.close();

        OutputStream f1 = new FileOutputStream("file2.txt");
        f1.write(buf);
        f1.close();

        OutputStream f2 = new FileOutputStream("file3.txt");
        for (int i = 0; i < source.length(); i += 1) {
            f2.write(source.charAt(i));
        }
        f2.close();

    }
}