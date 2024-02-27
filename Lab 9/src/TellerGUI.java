import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TellerGUI implements ActionListener{
    private JFrame fr;
    private JPanel p1, p2;
    private JLabel balance, cash, amount;
    private JButton depo_btn, withdraw_btn, exit_btn;
    private JTextField txt;
    private Account acc;
    public TellerGUI() {
        fr = new JFrame("Teller GUI");
        p1 = new JPanel();
        p2 = new JPanel();
        txt = new JTextField();
        balance = new JLabel("Balance");
        acc = new Account();
        acc.balance = 6000;
        cash = new JLabel(String.valueOf(acc.balance));
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
        
        depo_btn.addActionListener(this);
        withdraw_btn.addActionListener(this);
        exit_btn.addActionListener(this);
        
    }
    @Override
    public void actionPerformed(ActionEvent ev) {
        if (ev.getSource().equals(depo_btn)) {
            acc.balance += Double.parseDouble(txt.getText());
            cash.setText(String.valueOf(acc.balance));
            txt.setText("");
        } else if (ev.getSource().equals(withdraw_btn)) {
            if (acc.balance - Double.parseDouble(txt.getText()) >= 0) {
                acc.balance -= Double.parseDouble(txt.getText());
                cash.setText(String.valueOf(acc.balance));
                txt.setText("");
            }
        } else if (ev.getSource().equals(exit_btn)) {
            System.exit(0);
        }
    }
}