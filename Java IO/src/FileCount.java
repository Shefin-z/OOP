import java.io.File;

public class FileCount {
    public static void main(String[] args) {
        int count = 0;
        File f = new File("dir");
        String[] s = f.list();

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

        for (int i = 0; i < s.length; i++) {
            File f1 = new File("dir/" + s[i]);
            if (f1.isFile()) {
                count++;
            }
        }
        System.out.println("Number of files: " + count);
    }
}
