import java.awt.*;
import javax.swing.*;
public class CalculatorOneGUI {
    private JFrame fr;
    private JPanel p;
    private JPanel p_insert;
    private JTextField txt1, txt2, txt3;
    private JButton btn_1, btn_2, btn_3, btn_4;
    public CalculatorOneGUI() {
        fr = new JFrame("เครื่องคิดเลข");
        p = new JPanel();
        p_insert = new JPanel();
        txt1 = new JTextField();
        txt2 = new JTextField();
        txt3 = new JTextField();
        btn_1 = new JButton("บวก");
        btn_2 = new JButton("ลบ");
        btn_3 = new JButton("คูณ");
        btn_4 = new JButton("หาร");
        p_insert.setLayout(new FlowLayout());
        p_insert.add(btn_1);
        p_insert.add(btn_2);
        p_insert.add(btn_3);
        p_insert.add(btn_4);
        p.setLayout(new GridLayout(4,1));
        p.add(txt1);
        p.add(txt2);
        p.add(p_insert);
        p.add(txt3);
        fr.add(p);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setSize(400, 190);
        fr.setVisible(true);
    }
}
