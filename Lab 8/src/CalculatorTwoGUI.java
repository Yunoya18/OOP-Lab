import java.awt.*;
import javax.swing.*;
public class CalculatorTwoGUI {
    private JFrame fr;
    private JPanel p;
    private JTextField txt;
    private JButton btn_0, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, sum_btn, minus_btn, times_btn, divide_btn, equal_btn, c_btn;
    public CalculatorTwoGUI() {
        fr = new JFrame("My Calculator");
        p = new JPanel();
        txt = new JTextField();
        btn_0 = new JButton("0");
        btn_1 = new JButton("1");
        btn_2 = new JButton("2");
        btn_3 = new JButton("3");
        btn_4 = new JButton("4");
        btn_5 = new JButton("5");
        btn_6 = new JButton("6");
        btn_7 = new JButton("7");
        btn_8 = new JButton("8");
        btn_9 = new JButton("9");
        sum_btn = new JButton("+");
        minus_btn = new JButton("-");
        times_btn = new JButton("x");
        divide_btn = new JButton("/");
        equal_btn = new JButton("=");
        c_btn = new JButton("c");

        fr.setLayout(new BorderLayout());
        p.setLayout(new GridLayout(4,4));

        p.add(btn_7);
        p.add(btn_8);
        p.add(btn_9);
        p.add(sum_btn);
        p.add(btn_4);
        p.add(btn_5);
        p.add(btn_6);
        p.add(minus_btn);
        p.add(btn_1);
        p.add(btn_2);
        p.add(btn_3);
        p.add(times_btn);
        p.add(btn_0);
        p.add(c_btn);
        p.add(equal_btn);
        p.add(divide_btn);

        fr.add(txt, BorderLayout.NORTH);
        fr.add(p, BorderLayout.CENTER);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setSize(300, 300);
        fr.setVisible(true);
    }
}
