package Ex3;

import java.awt.*;
import javax.swing.*;

public class MyClock extends JLabel implements Runnable{
    int sec = 0;
    int min = 0;
    int hour = 0;
    @Override
    public void run() {
        while (true) {
            if (sec > 59) {
                sec = 0;
                min += 1;
            }
            if (min > 59) {
                min = 0;
                hour += 1;
            }
            setFont(new Font("Calibri", Font.PLAIN, 90));
            setText(String.format("%02d:%02d:%02d", hour, min, sec));
            setHorizontalAlignment(JLabel.CENTER);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sec += 1;
        }
    }
}
