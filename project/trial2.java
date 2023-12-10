package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class trial2 {
    public static void main(String[] args) {
        JFrame f = new JFrame("YouDo");
        f.setSize(800, 400);
        f.setLayout(new BorderLayout()); // Use BorderLayout for the main JFrame

        // Panel 1 - Welcome Message
        JPanel welcomePanel = new JPanel(new FlowLayout());
        JLabel welcomeLabel = new JLabel("Welcome to YouDo! \n");
        JLabel instructionLabel = new JLabel("Here, you have to do!!");
        welcomePanel.add(welcomeLabel);
        welcomePanel.add(instructionLabel);

        // Panel 2 - Task Input
        JPanel taskInputPanel = new JPanel(new GridLayout(2, 2));
        JLabel taskLabel = new JLabel("Enter your task here:");
        JTextField taskField = new JTextField(20);
        JLabel priorityLabel = new JLabel("Enter Priority:");
        JTextField priorityField = new JTextField( 20);
        taskInputPanel.add(taskLabel);
        taskInputPanel.add(taskField);
        taskInputPanel.add(priorityLabel);
        taskInputPanel.add(priorityField);

        // Panel 3 - Display Area and Submit Button
        JPanel displayPanel = new JPanel(new BorderLayout());
        JTextArea textArea = new JTextArea("Enter your task here", 5, 20);
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String task = taskField.getText();
                String priority = priorityField.getText();
                textArea.setText(task + " " + priority);
            }
        });
        displayPanel.add(textArea, BorderLayout.CENTER);
        displayPanel.add(submitButton, BorderLayout.SOUTH);

        // Add panels to the main frame
        f.add(welcomePanel, BorderLayout.NORTH);
        f.add(taskInputPanel, BorderLayout.CENTER);
        f.add(displayPanel, BorderLayout.SOUTH);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
