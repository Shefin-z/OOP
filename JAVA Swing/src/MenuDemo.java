import javax.swing.*;

class MenuFrame extends JFrame {
    String msg = "";
    JCheckBoxMenuItem debug, test;

    MenuFrame(String title) {
        super(title);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // create menu bar and add it to frame
        JMenuBar mbar = new JMenuBar();
        setJMenuBar(mbar);

        // create the menu items add to the menubar
        JMenu file = new JMenu("File");
        JMenuItem item1 = new JMenuItem("New...");
        JMenuItem item2 = new JMenuItem("Open...");
        JMenuItem item3 = new JMenuItem("Close");
        JMenuItem item5 = new JMenuItem("Quit...");
        file.add(item1);
        file.add(item2);
        file.add(item3);
        file.addSeparator();
        file.add(item5);
        mbar.add(file);

        // Adding another menu item
        JMenu edit = new JMenu("Edit");
        JMenuItem item6 = new JMenuItem("Cut");
        JMenuItem item7 = new JMenuItem("Copy");
        JMenuItem item8 = new JMenuItem("Paste");
        edit.add(item6);
        edit.add(item7);
        edit.add(item8);
        edit.addSeparator();
        JMenu sub = new JMenu("Special");
        JMenuItem item10 = new JMenuItem("First");
        JMenuItem item11 = new JMenuItem("Second");
        JMenuItem item12 = new JMenuItem("Third");
        sub.add(item10);
        sub.add(item11);
        sub.add(item12);
        edit.add(sub);

        // these are checkable menu items
        debug = new JCheckBoxMenuItem("Debug");
        edit.add(debug);
        test = new JCheckBoxMenuItem("Testing");
        edit.add(test);
        mbar.add(edit);
        setVisible(true);
    }
}

public class MenuDemo {
    public static void main(String[] args){
        MenuFrame m = new MenuFrame("Test Menu");
    }
}



