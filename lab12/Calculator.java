package lab12;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Calculator extends JFrame {
    private JTextField txtOperand1;
    private JTextField txtOperand2;
    private JTextField txtResult;

    public Calculator() {
        setTitle("Тооны машин");
        setSize(350, 180);
         
        
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(3, 1, 5, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel inputPanel = new JPanel(new GridLayout(1, 2, 10, 0));
        
        JPanel pnlOp1 = new JPanel(new BorderLayout());
        pnlOp1.add(new JLabel("Нэгдүгээр операнд"), BorderLayout.NORTH);
        txtOperand1 = new JTextField();
        pnlOp1.add(txtOperand1, BorderLayout.CENTER);

        JPanel pnlOp2 = new JPanel(new BorderLayout());
        pnlOp2.add(new JLabel("Хоёрдугаар операнд"), BorderLayout.NORTH);
        txtOperand2 = new JTextField();
        pnlOp2.add(txtOperand2, BorderLayout.CENTER);

        inputPanel.add(pnlOp1);
        inputPanel.add(pnlOp2);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 4, 10, 0));
        JButton btnAdd = new JButton("+");
        JButton btnSub = new JButton("-");
        JButton btnMul = new JButton("*");
        JButton btnDiv = new JButton("/");

        buttonPanel.add(btnAdd);
        buttonPanel.add(btnSub);
        buttonPanel.add(btnMul);
        buttonPanel.add(btnDiv);

        txtResult = new JTextField("Хариу: ");
        txtResult.setEditable(false); 
        txtResult.setBackground(new Color(230, 235, 240));

        mainPanel.add(inputPanel);
        mainPanel.add(buttonPanel);
        mainPanel.add(txtResult);

        add(mainPanel);

        btnAdd.addActionListener(e -> calculate('+'));
        btnSub.addActionListener(e -> calculate('-'));
        btnMul.addActionListener(e -> calculate('*'));
        btnDiv.addActionListener(e -> calculate('/'));
    }


    private void calculate(char operator) {
        try {

            double num1 = Double.parseDouble(txtOperand1.getText());
            double num2 = Double.parseDouble(txtOperand2.getText());
            double result = 0;


            switch (operator) {
                case '+': result = add(num1, num2); break;
                case '-': result = subtract(num1, num2); break;
                case '*': result = multiply(num1, num2); break;
                case '/': result = divide(num1, num2); break;
            }
            txtResult.setText("Хариу: " + result);
        } catch (NumberFormatException ex) {
          
            txtResult.setText("Хариу: Алдаа (Зөвхөн тоо оруулна уу!)");
        }
    }
    private double add(double a, double b) {
        return a + b;
    }

    private double subtract(double a, double b) {
        return a - b;
    }

    private double multiply(double a, double b) {
        return a * b;
    }

    private double divide(double a, double b) {
        return a / b;
    }
}
