import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

class FileCopyDemo {
    public static void main(String args[]) throws Exception {
        int size = 0;
        String source = "src.mp4";
        String destination = "copy.mp4";
        FileInputStream in = new FileInputStream(source);
        FileOutputStream out = new FileOutputStream(destination);

        System.out.println("File size is : " + (size = in.available()));

        int copiedBytes = 0;

        while (true) {
            int c = in.read();
            if (c == -1) break;
            out.write(c);

            copiedBytes++;
            double progress = (copiedBytes * 100.0) / size;
            System.out.printf("File copied %.2f%%\n", progress);
        }

        in.close();
        out.close();
    }
}
