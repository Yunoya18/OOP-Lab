import java.awt.*;
import javax.swing.*;
public class CalculatorOneGUI {
    private JFrame fr;
    private JPanel p;
    private JTextField txt1, txt2, txt3;
    private JButton sum_btn, minus_btn, times_btn, divide_btn;
    public CalculatorOneGUI() {
        fr = new JFrame("เครื่องคิดเลข");
        p = new JPanel();
        txt1 = new JTextField();
        txt2 = new JTextField();
        txt3 = new JTextField();
        sum_btn = new JButton("บวก");
        minus_btn = new JButton("ลบ");
        times_btn = new JButton("คูณ");
        divide_btn = new JButton("หาร");

        p.setLayout(new FlowLayout());
        fr.setLayout(new GridLayout(4,1));

        p.add(sum_btn);
        p.add(minus_btn);
        p.add(times_btn);
        p.add(divide_btn);

        fr.add(txt1);
        fr.add(txt2);
        fr.add(p);
        fr.add(txt3);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setSize(400, 190);
        fr.setVisible(true);
    }
}
