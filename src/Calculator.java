import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {

    private final JButton display;
    private final JButton[] buttons;
    private final String[] buttonLabels = {"MC", "MR", "M+", "M-", "MS", "M-", "CE", "C",
            "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "+"};
    private double memoryValue = 0.0;

    public Calculator() {
        super("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(300, 400));
        setResizable(false);
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        // Display
        display = new JButton("0");
        display.setFont(new Font("Arial", Font.BOLD, 16));
        display.setBackground(Color.WHITE);
        display.setEnabled(false);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridwidth = 4;
        c.insets = new Insets(10, 10, 10, 10);
        add(display, c);

        // Buttons with Action Listener (only 4 show up :angry:)
        buttons = new JButton[buttonLabels.length];
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            buttons[i].setFont(new Font("Arial", Font.BOLD, 14));
            buttons[i].addActionListener(this);
            c.gridy = (i + 1) / 4;
            c.gridx = i % 4;
            if (i % 4 == 0) {
                c.weightx = 0.25;
            } else {
                c.weightx = 0.75;
            }
            c.insets = new Insets(5, 5, 5, 5);
            add(buttons[i], c);
        }

        // Color Scheme (blank rn)
        getContentPane().setBackground(Color.LIGHT_GRAY);
        display.setBackground(Color.WHITE);
        for (JButton button : buttons) {
            button.setBackground(Color.WHITE);
            if (button.getText().equals("+") || button.getText().equals("-") ||
                    button.getText().equals("*") || button.getText().equals("/")) {
                button.setForeground(Color.RED);
            } else {
                button.setForeground(Color.BLACK);
            }
        }

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String buttonText = ((JButton) e.getSource()).getText();
        double currentNumber = 0.0;

        try {
            currentNumber = Double.parseDouble(display.getText());
        } catch (NumberFormatException ignored) {
        }

        switch (buttonText) {
            case "MC":
                memoryValue = 0.0;
                break;
            case "MR":
                display.setText(String.valueOf(memoryValue));
                break;
            case "M+":
                memoryValue += currentNumber;
                break;
            case "M-":
                memoryValue -= currentNumber;
                break;
            case "MS":
                memoryValue = currentNumber;
                break;
            case "CE":
                display.setText("0");
                break;
            case "C":
                display.setText("0");
                currentNumber = 0.0;
                break;
            default:
                if (buttonText.matches("[0-9.]")) {
                    display.setText(buttonText);
                } else {

                }
        }
    }

    //actually makes it run..........
    public static void main(String[] args) {
        new Calculator();
    }

}
