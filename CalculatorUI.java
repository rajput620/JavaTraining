import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculator");
        frame.setSize(500, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);

        // Labels
        JLabel num1Label = new JLabel("First Number:");
        num1Label.setBounds(50, 40, 120, 25);
        panel.add(num1Label);

        JLabel num2Label = new JLabel("Second Number:");
        num2Label.setBounds(50, 90, 120, 25);
        panel.add(num2Label);

        JLabel opLabel = new JLabel("Operator:");
        opLabel.setBounds(50, 140, 120, 25);
        panel.add(opLabel);

        // Text Fields
        JTextField num1Field = new JTextField();
        num1Field.setBounds(180, 40, 200, 25);
        panel.add(num1Field);

        JTextField num2Field = new JTextField();
        num2Field.setBounds(180, 90, 200, 25);
        panel.add(num2Field);

        JTextField opField = new JTextField();
        opField.setBounds(180, 140, 200, 25);
        panel.add(opField);

        // Button
        JButton calculateBtn = new JButton("Calculate");
        calculateBtn.setBounds(50, 200, 150, 35);
        calculateBtn.setBackground(new Color(0, 153, 204));
        calculateBtn.setForeground(Color.WHITE);
        panel.add(calculateBtn);

        // Result Field
        JTextField resultField = new JTextField();
        resultField.setBounds(220, 200, 160, 35);
        resultField.setEditable(false);
        panel.add(resultField);

        // Button Logic
        calculateBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try {
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());

                    String op = opField.getText();

                    double result = 0;

                    if (op.equals("+")) {
                        result = num1 + num2;
                    }
                    else if (op.equals("-")) {
                        result = num1 - num2;
                    }
                    else if (op.equals("*")) {
                        result = num1 * num2;
                    }
                    else if (op.equals("/")) {
                        if (num2 == 0) {
                            resultField.setText("Cannot divide by 0");
                            return;
                        }
                        result = num1 / num2;
                    }
                    else {
                        resultField.setText("Invalid Operator");
                        return;
                    }

                    resultField.setText(String.valueOf(result));

                } catch (Exception ex) {
                    resultField.setText("Invalid Input");
                }
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}