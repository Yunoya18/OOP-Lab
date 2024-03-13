package Ex2;

import java.awt.*;
import javax.swing.*;
import java.util.Calendar;

public class MyClock extends JLabel implements Runnable{
    @Override
    public void run() {
        while (true) {
            Calendar d = Calendar.getInstance();
            int sec = d.get(Calendar.SECOND);
            int min = d.get(Calendar.MINUTE);
            int hour = d.get(Calendar.HOUR_OF_DAY);
            setFont(new Font("Calibri", Font.PLAIN, 90));
            setText(String.format("%02d:%02d:%02d", hour, min, sec));
            setHorizontalAlignment(JLabel.CENTER);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
