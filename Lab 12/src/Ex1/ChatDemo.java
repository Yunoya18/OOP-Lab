package Ex1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.time.*;
import java.time.format.*;
import java.io.*;

public class ChatDemo implements ActionListener, WindowListener{
    private JFrame frame;
    private JPanel p, btn_p;
    private JTextArea ta;
    private JTextField txt;
    private JButton submit_btn, reset_btn;
    private File file;
    public ChatDemo() {
        frame = new JFrame();
        p = new JPanel();
        btn_p = new JPanel();
        ta = new JTextArea(20, 45);
        txt = new JTextField(45);
        submit_btn = new JButton("Submit");
        reset_btn = new JButton("Reset");

        ta.setEditable(false);

        p.setLayout(new BorderLayout());
        btn_p.setLayout(new FlowLayout());

        btn_p.add(submit_btn);
        btn_p.add(reset_btn);

        p.add(ta, BorderLayout.NORTH);
        p.add(txt, BorderLayout.CENTER);
        p.add(btn_p, BorderLayout.SOUTH);

        frame.add(p);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        submit_btn.addActionListener(this);
        reset_btn.addActionListener(this);

        frame.addWindowListener(this);

        file = new File("ChatDemo.dat");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(submit_btn)) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            ta.setText(ta.getText() + "\n" + dtf.format(LocalDateTime.now()) + " : " + txt.getText());
            txt.setText("");
        } else if (e.getSource().equals(reset_btn)) {
            ta.setText("");
        }
    }
    @Override
    public void windowOpened(WindowEvent e) {
        if (file.exists()) {
              try (FileReader fr = new FileReader(file)) {
                  String t = "";
                  int ch;
                  while ((ch=fr.read()) != -1) {
                      t += (char) ch;
                  }
                  ta.setText(t);
              } catch (IOException ex) {
                  ex.printStackTrace();
              }
          }
    }
    @Override
    public void windowClosing(WindowEvent e) {
        try (FileWriter fw = new FileWriter(file)) {
            fw.write(ta.getText());
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
