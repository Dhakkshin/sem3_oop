package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class trial2 {
    public static void main(String[] args) {
        JFrame f = new JFrame("YouDo");
        f.setVisible(true);
        f.setSize(800,400);

        f.setLayout(new FlowLayout());

        JPanel p = new JPanel(new GridLayout(2,1));
        // p.setBorder(BorderFactory.createLineBorder(Color.black));
        JLabel l1 =  new JLabel("Welcome to YouDo! ");
        p.add(l1);
        JLabel l2 = new JLabel("Here, you have to do!!");
        p.add(l2);

        JPanel p2 = new JPanel(new GridLayout(2,2));
        // p2.setBorder(BorderFactory.createLineBorder(Color.black));
        JLabel l3 = new JLabel("Enter your task here:");
        p2.add(l3);
        JTextField t1 = new JTextField("Enter your task here", 20);
        p2.add(t1);
        JLabel l4 = new JLabel("Enter Priority:");
        p2.add(l4);
        JTextField t2 = new JTextField("Enter Priority", 20);
        p2.add(t2);

        JTextArea testArea = new JTextArea("Enter your task here", 5, 20);
        JButton b = new JButton("Submit");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String task = t1.getText();
                String priority = t2.getText();
                testArea.setText(task + " " + priority);
            }
        });

        f.add(p);
        f.add(p2);
        f.add(testArea);
        f.add(b);
    }
}
