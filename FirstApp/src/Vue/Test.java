package Vue;

import javax.swing.*;

public class Test extends JFrame{
    private JPanel Panel1;

    public Test(){
        add(Panel1);
        setTitle("Test");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.setVisible(true);
    }
}
