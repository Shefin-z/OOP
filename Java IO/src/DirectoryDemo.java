import java.io.File;

class DirectoryDemo {
    public static void main(String args[]) {
        int directoryCount = 0;
        int fileCount = 0;
        String dirname = "dir";
        File f1 = new File(dirname);

        if (f1.isDirectory()) {
            System.out.println("Directory of " + dirname);
            String s[] = f1.list();


            for (int i = 0; i < s.length; i++)
                System.out.println(s[i]);

            for (int i = 0; i < s.length; i++) {
                File f = new File(dirname + "/" + s[i]);
                if (f.isDirectory()) {
                    System.out.println(s[i] + " is a directory");
                    directoryCount++;
                } else {
                    System.out.println(s[i] + " is a file");
                    fileCount++;
                }
            }
        } else {
            System.out.println(dirname + " is not a directory");
        }

        System.out.println("Number of directories: " + directoryCount);
        System.out.println("Number of files: " + fileCount);
    }
}
