import java.awt.*;
import javax.swing.*;
public class TellerGUI {
    private JFrame fr;
    private JPanel p1, p2;
    private JLabel balance, cash, amount;
    private JButton depo_btn, withdraw_btn, exit_btn;
    private JTextField txt;
    public TellerGUI() {
        fr = new JFrame("Teller GUI");
        p1 = new JPanel();
        p2 = new JPanel();
        txt = new JTextField();
        balance = new JLabel("Balance");
        cash = new JLabel("6000");
        amount = new JLabel("Amount");
        depo_btn = new JButton("Deposit");
        withdraw_btn = new JButton("Withdraw");
        exit_btn = new JButton("Exit");

        fr.setLayout(new GridLayout(2, 1));
        p1.setLayout(new GridLayout(2, 1));
        p2.setLayout(new FlowLayout());

        p1.add(balance);
        p1.add(cash);
        p1.add(amount);
        p1.add(txt);

        p2.add(depo_btn);
        p2.add(withdraw_btn);
        p2.add(exit_btn);

        fr.add(p1);
        fr.add(p2);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setSize(260, 190);
        fr.setVisible(true);
    }
}
