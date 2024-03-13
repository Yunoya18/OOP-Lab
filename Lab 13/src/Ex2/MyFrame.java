package Ex2;

import java.awt.*;
import javax.swing.*;

public class MyFrame {
    private JFrame fr;
    private MyClock clock;
    public MyFrame() {
        fr = new JFrame();
        clock = new MyClock();
        Thread t = new Thread(clock);
        t.start();

        fr.add(clock, BorderLayout.CENTER);
        
        fr.setSize(500, 300);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
    public static void main(String[] args) {
        new MyFrame();
    }
}
