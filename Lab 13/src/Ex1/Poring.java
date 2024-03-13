package Ex1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Poring implements Runnable, MouseListener{
    private JFrame fr;
    private JLabel lb_img, lb_count;
    @Override
    public void run() {
        fr = new JFrame();
        lb_img = new JLabel(new ImageIcon("src/Ex1/p.png"));
        lb_count = new JLabel(String.valueOf(PoringConstructor.count));

        fr.setLayout(new FlowLayout());

        fr.add(lb_img);
        fr.add(lb_count);

        fr.setResizable(false);
        fr.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
        
        lb_img.addMouseListener(this);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource().equals(lb_img)) {
            fr.dispose();
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
}
