package practice;
/*
 * Applet:- The process of binding java byte code into HTML code is known as applet
 * programming.
 * Applet=java byte code+HTML code.
 * we use "JApplet" class from javax.swing package
 *                       or
 * Applet class from java.awt package to design applets.
 *
 * Hierarchy of Applet:
 * -------------------
 * 1> init() - initiates the applet
 * 2> start() - starts the applet
 * 3> stop() - stops the applet
 * 4> destroy() - Terminates the applet
 *
 * Life-Cycle of Applet:-
 * --------
 * |init()| <---------
 * --------           |
 *    |               |
 *    |               |
 * start()            |
 *    |               |
 *    |               |
 * stop()---------destroy()
 * */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyAppletCalculateSum extends JApplet implements ActionListener {
    private String str = "";
    private String str1 = "";
    private String str2 = "";
    private JLabel n, a, n1, lb1;
    private JTextField name, name1;
    private JTextField addr;
    private JButton b1, b2;
    private Container c;

    public void init() {
        JFrame jf = new JFrame();//object
        c = jf.getContentPane();
        c.setBackground(Color.yellow);
        c.setLayout(null);
        jf.setSize(500, 400);
        jf.setTitle("Calculate Sum");
        jf.setVisible(true);
        Font f = new Font("Dialog", Font.BOLD, 30);
        lb1 = new JLabel();
        lb1.setFont(f);
        lb1.setForeground(Color.red);
        lb1.setText("Calculate Sum");
        lb1.setBounds(200, 10, 500, 50);
        c.add(lb1);
        n = new JLabel("Num1:", JLabel.LEFT);
        n.setFont(f);
        n.setForeground(Color.red);
        name = new JTextField(30);
        n.setBounds(50, 100, 100, 30);
        name.setBounds(150, 100, 200, 30);
        c.add(n);
        c.add(name);
        n1 = new JLabel("Num2:", JLabel.LEFT);
        n1.setFont(f);
        n1.setForeground(Color.red);
        name1 = new JTextField(200);
        n1.setBounds(500, 100, 100, 30);
        name1.setBounds(600, 100, 200, 30);
        c.add(n1);
        c.add(name1);
        a = new JLabel("", JLabel.LEFT);
        a.setFont(f);
        a.setForeground(Color.red);
        addr = new JTextField(100);
        a.setBounds(150, 150, 200, 50);
        addr.setBounds(150, 150, 200, 50);
        c.add(a);
        c.add(addr);
        b1 = new JButton("CALCULATE");
        b2 = new JButton("Cancel");
        b1.setBounds(200, 300, 100, 30);
        b2.setBounds(350, 300, 100, 30);
        c.add(b1);
        c.add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        str = e.getActionCommand();
        if (str.equals("CALCULATE")) {
            str1 = name.getText();
            str2 = name1.getText();
            int a = Integer.parseInt(str1);
            int b = Integer.parseInt(str2);
            float totSum = a + b;
            addr.setText(String.valueOf(totSum));
        } else {
            name.setText("");
            name1.setText("");
            addr.setText("");
        }
    }
}
