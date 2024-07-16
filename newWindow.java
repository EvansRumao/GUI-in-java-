package LoginWindow;

import javax.swing.*;

public class newWindow {
    JFrame frame;
    JLabel label;
    public newWindow(String str) {
        frame =new JFrame();
        frame.setLayout(null);
        frame.setSize(250,250);
        label=new JLabel(str);
        label.setBounds(67,68,100,50);
        frame.add(label);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
