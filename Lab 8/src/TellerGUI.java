import java.awt.*;
import javax.swing.*;
public class TellerGUI {
    private JFrame fr;
    private JPanel p, p_in1, p_in2, p_temp1, p_temp2, p_insert1, p_insert2;
    private JLabel txt_1, txt_2, txt_3;
    private JButton btn_1, btn_2, btn_3;
    private JTextField txt_f;
    public TellerGUI() {
        fr = new JFrame("Teller GUI");
        p = new JPanel();
        p_in1 = new JPanel();
        p_in2 = new JPanel();
        p_temp1 = new JPanel();
        p_temp2 = new JPanel();
        p_insert1 = new JPanel();
        p_insert2 = new JPanel();
        txt_f = new JTextField();
        txt_1 = new JLabel("Balance");
        txt_2 = new JLabel("6000");
        txt_3 = new JLabel("Amount");
        btn_1 = new JButton("Deposit");
        btn_2 = new JButton("Withdraw");
        btn_3 = new JButton("Exit");
        p.setLayout(new GridLayout(2, 1));
        p_in1.setLayout(new GridLayout(2, 2));
        p_in2.setLayout(new FlowLayout());
        p_temp1.setLayout(new BorderLayout());
        p_temp2.setLayout(new BorderLayout());
        p_temp1.add(txt_1, BorderLayout.CENTER);
        p_temp1.add(p_insert1, BorderLayout.WEST);
        p_temp2.add(txt_3, BorderLayout.CENTER);
        p_temp2.add(p_insert2, BorderLayout.WEST);
        p_in1.add(p_temp1);
        p_in1.add(txt_2);
        p_in1.add(p_temp2);
        p_in1.add(txt_f);
        p_in2.add(btn_1);
        p_in2.add(btn_2);
        p_in2.add(btn_3);
        p.add(p_in1);
        p.add(p_in2);
        fr.add(p);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setSize(260, 190);
        fr.setVisible(true);
    }
}
