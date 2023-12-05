package project;

import javax.swing.*;

public class trial {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("YouDo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label1 = new JLabel("Welcome to YouDo!");
        JLabel label2 = new JLabel("Here, you have to do!!");
        frame.getContentPane().add(label1);
        frame.getContentPane().add(label2);

        frame.pack();
        frame.setVisible(true);
    }
}


