import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CalculatorSample implements ActionListener {
    private JFrame fr;
    private JPanel p;
    private JTextField txt;
    private JButton btn_0, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, sum_btn, minus_btn, times_btn, divide_btn, equal_btn, c_btn;
    private double num_1, num_2, ans;
    private String op, num;
    public CalculatorSample() {
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
        
        btn_0.addActionListener(this);
        btn_1.addActionListener(this);
        btn_2.addActionListener(this);
        btn_3.addActionListener(this);
        btn_4.addActionListener(this);
        btn_5.addActionListener(this);
        btn_6.addActionListener(this);
        btn_7.addActionListener(this);
        btn_8.addActionListener(this);
        btn_9.addActionListener(this);
        sum_btn.addActionListener(this);
        minus_btn.addActionListener(this);
        times_btn.addActionListener(this);
        divide_btn.addActionListener(this);
        equal_btn.addActionListener(this);
        c_btn.addActionListener(this);

    }
    @Override
    public void actionPerformed(ActionEvent ev) {
        if (ev.getSource().equals(sum_btn)) {
            num_1 = Double.parseDouble(txt.getText());
            txt.setText("");
            op = "+";
        } else if (ev.getSource().equals(minus_btn)){
            num_1 = Double.parseDouble(txt.getText());
            txt.setText("");
            op = "-";
        } else if (ev.getSource().equals(times_btn)){
            num_1 = Double.parseDouble(txt.getText());
            txt.setText("");
            op = "x";
        } else if (ev.getSource().equals(divide_btn)){
            num_1 = Double.parseDouble(txt.getText());
            txt.setText("");
            op = "/";
        } else if (ev.getSource().equals(equal_btn)){
            num_2 = Double.parseDouble(txt.getText());
            switch (op) {
                case "+":
                    ans = num_1 + num_2;
                    break;
                case "-":
                    ans = num_1 - num_2;
                    break;
                case "x":
                    ans = num_1 * num_2;
                    break;
                case "/":
                    ans = num_1 / num_2;
                    break;
                default:
                    break;
            }
            if (ans - (int) ans == 0) {
                txt.setText(String.valueOf( (int) ans));
            } else {
                txt.setText(String.valueOf(ans));
            }
        } else if (ev.getSource().equals(c_btn)){
            num_1 = num_2 = ans = 0;
            op = "";
            txt.setText("");
        } else {
            if (ev.getSource().equals(btn_1)) {
                num = txt.getText() + "1";
            } else if (ev.getSource().equals(btn_2)) {
                num = txt.getText() + "2";
            } else if (ev.getSource().equals(btn_3)) {
                num = txt.getText() + "3";
            } else if (ev.getSource().equals(btn_4)) {
                num = txt.getText() + "4";
            } else if (ev.getSource().equals(btn_5)) {
                num = txt.getText() + "5";
            } else if (ev.getSource().equals(btn_6)) {
                num = txt.getText() + "6";
            } else if (ev.getSource().equals(btn_7)) {
                num = txt.getText() + "7";
            } else if (ev.getSource().equals(btn_8)) {
                num = txt.getText() + "8";
            } else if (ev.getSource().equals(btn_9)) {
                num = txt.getText() + "9";
            } else if (ev.getSource().equals(btn_0)) {
                num = txt.getText() + "0";
            }
            txt.setText(String.valueOf(Integer.parseInt(num)));
        }
    }
}
