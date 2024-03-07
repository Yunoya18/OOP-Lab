package Ex2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class StudentView implements ActionListener, WindowListener {
    private JFrame fr;
    private JPanel p1, p2;
    private JLabel id_label, name_label, money_label, money;
    private JTextField id, name;
    private JButton depo_btn, withdraw_btn;
    private Student std;
    public StudentView() {
        std = new Student();
        fr = new JFrame();
        p1 = new JPanel();
        p2 = new JPanel();
        id_label = new JLabel("ID :");
        name_label = new JLabel("Name :");
        money_label = new JLabel("Money :");
        money = new JLabel(String.valueOf(std.getMoney()));
        id = new JTextField();
        name = new JTextField();
        depo_btn = new JButton("Deposit");
        withdraw_btn = new JButton("Withdraw");

        fr.setLayout(new BorderLayout());
        p1.setLayout(new GridLayout(3, 2));
        p2.setLayout(new FlowLayout());

        p1.add(id_label);
        p1.add(id);
        p1.add(name_label);
        p1.add(name);
        p1.add(money_label);
        p1.add(money);
        p2.add(depo_btn);
        p2.add(withdraw_btn);

        fr.add(p1, BorderLayout.CENTER);
        fr.add(p2, BorderLayout.SOUTH);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);

        depo_btn.addActionListener(this);
        withdraw_btn.addActionListener(this);
        fr.addWindowListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(depo_btn)) {
            std.setMoney(std.getMoney() + 100);
            money.setText(String.valueOf(std.getMoney()));
        } else if (e.getSource().equals(withdraw_btn)) {
            std.setMoney(std.getMoney() - 100);
            money.setText(String.valueOf(std.getMoney()));
        }
    }
    @Override
    public void windowOpened(WindowEvent e) {
        if (new File("StudentM.dat").exists()) {
            try {
                FileInputStream fIn = new FileInputStream("StudentM.dat");
                ObjectInputStream oIn = new ObjectInputStream(fIn);
                std = (Student) oIn.readObject();
                oIn.close();
                fIn.close();
            } catch (IOException | ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            id.setText(String.valueOf(std.getID()));
            name.setText(std.getName());
            money.setText(String.valueOf(std.getMoney()));
        }
    }
    @Override
    public void windowClosing(WindowEvent e) {
        std.setID(Integer.parseInt(id.getText()));
        std.setName(name.getText());
        std.setMoney(Integer.parseInt(money.getText()));
        try (FileOutputStream fOut = new FileOutputStream("StudentM.dat");
            ObjectOutputStream oOut = new ObjectOutputStream(fOut);) {
            oOut.writeObject(std);
            oOut.close();
            fOut.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
     @Override
    public void windowClosed(WindowEvent e) {
        
    }
    @Override
    public void windowIconified(WindowEvent e) {
        
    }
    @Override
    public void windowDeiconified(WindowEvent e) {
        
    }
    @Override
    public void windowActivated(WindowEvent e) {
        
    }
    @Override
    public void windowDeactivated(WindowEvent e) {
        
    }
}
