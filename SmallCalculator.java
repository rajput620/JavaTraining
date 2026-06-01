import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SmallCalculator extends JFrame implements ActionListener {

    JTextField display;
    double num1, num2;
    String op;

    public SmallCalculator() {

        setTitle("Calculator");
        setSize(250, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 20));
        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel(new GridLayout(4, 4));

        String[] buttons = {
                "7","8","9","+",
                "4","5","6","-",
                "1","2","3","*",
                "C","0","=","/"
        };

        for(String text : buttons) {
            JButton btn = new JButton(text);
            btn.addActionListener(this);
            panel.add(btn);
        }

        add(panel, BorderLayout.CENTER);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String cmd = e.getActionCommand();

        if(cmd.matches("[0-9]")) {
            display.setText(display.getText() + cmd);
        }
        else if(cmd.matches("[+\\-*/]")) {
            num1 = Double.parseDouble(display.getText());
            op = cmd;
            display.setText("");
        }
        else if(cmd.equals("=")) {
            num2 = Double.parseDouble(display.getText());

            if(op.equals("+"))
                display.setText("" + (num1 + num2));
            else if(op.equals("-"))
                display.setText("" + (num1 - num2));
            else if(op.equals("*"))
                display.setText("" + (num1 * num2));
            else if(op.equals("/"))
                display.setText("" + (num1 / num2));
        }
        else if(cmd.equals("C")) {
            display.setText("");
        }
    }

    public static void main(String[] args) {
        new SmallCalculator();
    }
}