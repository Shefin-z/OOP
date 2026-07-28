import java.io.File;
import java.util.Date;

class FileDemo {

    public static void main(String args[]) {
        File f1 = new File("dir/sample.txt"); // Create a File object. Here, we are entering the path of a file from the current directory(where the src folder resides).

        System.out.println("File Name: " + f1.getName()); // Get the name of the file
        System.out.println("Path: " + f1.getPath()); // Get the path of the file
        System.out.println("Abs Path: " + f1.getAbsolutePath()); // Get the absolute path of the file
        System.out.println("Parent: " + f1.getParent()); // Get the parent directory of the file
        System.out.println(f1.exists() ? "exists" : "does not exist"); // Check if the file exists
        System.out.println(f1.canWrite() ? "is writeable" : "is not writeable"); // Check if the file can be written
        System.out.println(f1.canRead() ? "is readable" : "is not readable"); // Check if the file can be read
        System.out.println("is " + (f1.isDirectory() ? "" : "not" + " a directory")); // Check if the file is a directory or not
        System.out.println(f1.isFile() ? "is normal file" : "not a normal file"); // Check if the file is a normal file or not
        System.out.println("File last modified: " + f1.lastModified()); // Get the last modified time of the file
        Date date = new Date(f1.lastModified()); // Convert the last modified time to a Date object
        System.out.println(date.toString()); // Print the last modified time
        Date dt = new Date();
        System.out.println("Current Date: " + dt.toString()); // Print the current date
        System.out.println("File size: " + f1.length() + " Bytes"); // Get the size of the file
    }
}