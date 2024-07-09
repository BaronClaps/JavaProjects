package Spam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class TaskReminderGUI extends JFrame {

    private volatile boolean running = false;
    private int remindersCount;
    private double intervalInSeconds;
    private String reminderMessage;

    private JTextField remindersField;
    private JTextField intervalField;
    private JTextField messageField;
    private JButton startButton;
    private JButton stopButton;

    public TaskReminderGUI() {
        setTitle("Task Reminder");
        setSize(400, 140);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame on the screen
        getContentPane().setBackground(new Color(30, 144, 255)); // Sea colored background

        JPanel inputPanel = new JPanel(new GridLayout(4, 2));
        inputPanel.setBackground(new Color(255, 215, 0)); // Gold color for the input panel

        JLabel remindersLabel = new JLabel("Number of reminders:");
        remindersField = new JTextField();
        JLabel intervalLabel = new JLabel("Reminder interval (seconds):");
        intervalField = new JTextField();
        JLabel messageLabel = new JLabel("Reminder message:");
        messageField = new JTextField();
        startButton = new JButton("Start");
        stopButton = new JButton("Stop");

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startReminders();
            }
        });

        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stopReminders();
            }
        });

        inputPanel.add(remindersLabel);
        inputPanel.add(remindersField);
        inputPanel.add(intervalLabel);
        inputPanel.add(intervalField);
        inputPanel.add(messageLabel);
        inputPanel.add(messageField);
        inputPanel.add(startButton);
        inputPanel.add(stopButton);

        add(inputPanel, BorderLayout.NORTH);
    }

    private void startReminders() {
        try {
            remindersCount = Integer.parseInt(remindersField.getText());
            intervalInSeconds = Double.parseDouble(intervalField.getText());
            reminderMessage = messageField.getText();

            if (running) {
                return;
            }
            running = true;

            double typingSpeed = reminderMessage.length() / intervalInSeconds;

            new Thread(() -> {
                try {
                    Robot robot = new Robot();

                    for (int i = 0; i < remindersCount && running; i++) {
                        robotDelay(robot, reminderMessage, typingSpeed);
                        Thread.sleep((long) (intervalInSeconds * 1000));
                    }
                } catch (AWTException | InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    running = false;
                }
            }).start();

            remindersField.setEditable(false);
            intervalField.setEditable(false);
            messageField.setEditable(false);
            startButton.setEnabled(false);
            stopButton.setEnabled(true);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers for reminders count and interval.");
        }
    }

    private void stopReminders() {
        running = false;
        remindersField.setEditable(true);
        intervalField.setEditable(true);
        messageField.setEditable(true);
        startButton.setEnabled(true);
        stopButton.setEnabled(false);
    }

    private void robotDelay(Robot robot, String message, double typingSpeed) {
        for (char c : message.toCharArray()) {
            int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
            robot.keyPress(keyCode);
            robot.keyRelease(keyCode);
            robot.delay((int) (500.0 / typingSpeed)); // Reduce delay for faster typing
        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                TaskReminderGUI gui = new TaskReminderGUI();
                gui.setVisible(true);
                gui.setResizable(true);
            }
        });
    }
}