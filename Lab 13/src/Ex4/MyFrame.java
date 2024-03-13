package Ex4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame implements MouseListener{
    private JFrame fr;
    private MyClock clock;
    private Thread t;
    public MyFrame() {
        fr = new JFrame();
        clock = new MyClock();
        t = new Thread(clock);
        t.start();

        fr.add(clock, BorderLayout.CENTER);

        fr.setSize(500, 300);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);

        clock.addMouseListener(this);
    } 
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource().equals(clock)) {
            clock.toggleWait();
        }
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        
    }
    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    @Override
    public void mousePressed(MouseEvent e) {
        
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        
    }
    public static void main(String[] args) {
        new MyFrame();
    }
}
