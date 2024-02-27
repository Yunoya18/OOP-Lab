import java.awt.*;
import javax.swing.*;
public class MDIFromGUI {
    private JFrame fr;
    private JMenuBar mb;
    private JMenu m_1, m_2, m_3, ms_1;
    private JMenuItem mi_2, mi_3, mi_4, msi_1, msi_2;
    private JDesktopPane desktopPane;
    private JInternalFrame f1, f2, f3; 
    public MDIFromGUI() {
        try {
           UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        fr = new JFrame("SubMenuItem Demo");
        mb = new JMenuBar();
        m_1 = new JMenu("File");
        m_2 = new JMenu("Edit");
        m_3 = new JMenu("View");
        ms_1 = new JMenu("New");
        mi_2 = new JMenuItem("Open");
        mi_3 = new JMenuItem("Save");
        mi_4 = new JMenuItem("Exit");
        msi_1 = new JMenuItem("Window");
        msi_2 = new JMenuItem("Message");
        desktopPane = new JDesktopPane();
        f1 = new JInternalFrame("Application 01", true, true, true, true);
        f2 = new JInternalFrame("Application 02", true, true, true, true);
        f3 = new JInternalFrame("Application 03", true, true, true, true);

        f1.setBounds(50, 240, 240, 120);
        f1.setVisible(true);

        f2.setBounds(200, 50, 220, 150);
        f2.setVisible(true);

        f3.setBounds(450, 180, 300, 220);
        f3.setVisible(true);

        desktopPane.setBackground(Color.BLACK);
        desktopPane.add(f1);
        desktopPane.add(f2);
        desktopPane.add(f3);
        
        mb.add(m_1);
        mb.add(m_2);
        mb.add(m_3);

        m_1.setMnemonic('F');
        m_1.add(ms_1);
        m_1.add(mi_2);
        m_1.addSeparator();
        m_1.add(mi_3);
        m_1.addSeparator();
        m_1.add(mi_4);

        ms_1.add(msi_1);
        ms_1.addSeparator();
        ms_1.add(msi_2);

        fr.setJMenuBar(mb);
        fr.add(desktopPane);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setSize(1280, 920);
        fr.setVisible(true);
    }
}
