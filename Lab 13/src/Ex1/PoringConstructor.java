package Ex1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class PoringConstructor implements ActionListener {
    private JFrame fr;
    private JButton btn;
    private ArrayList<Thread> mon;
    public static int count = 0;
    public PoringConstructor() {
        fr = new JFrame();
        btn = new JButton("Add");
        mon = new ArrayList<>();

        fr.setLayout(new FlowLayout());

        fr.add(btn);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);

        btn.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        PoringConstructor.count += 1;
        Poring p = new Poring();
        Thread t = new Thread(p);
        t.start();

        mon.add(t);
    }
}
