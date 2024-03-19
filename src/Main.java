import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        JFrame f = new JFrame("Calculator");

        JLabel n1Label = new JLabel("First number:");
        JLabel n2Label = new JLabel("Second number:");
        JLabel resultLabel = new JLabel("Result:");

        JTextField n1Field = new JTextField();
        JTextField n2Field = new JTextField();
        JTextField resultField = new JTextField();

        JButton addButton = new JButton("Add");
        JButton subtractButton = new JButton("Subtract");

        n1Label.setBounds(50, 50, 100, 30);
        n2Label.setBounds(50, 100, 100, 30);
        n1Field.setBounds(150, 50, 200, 30);
        n2Field.setBounds(150, 100, 200, 30);
        resultLabel.setBounds(50, 150, 100, 30);
        resultField.setBounds(150, 150, 200, 30);
        addButton.setBounds(150, 200, 100, 30);
        subtractButton.setBounds(250, 200, 100, 30);


        f.add(n1Label);
        f.add(n2Label);
        f.add(n1Field);
        f.add(n2Field);
        f.add(resultLabel);
        f.add(resultField);
        f.add(addButton);
        f.add(subtractButton);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);

//        addButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                String n1 = n1Field.getText();
//                String n2 = n2Field.getText();
//                int result = Integer.parseInt(n1) + Integer.parseInt(n2);
//                resultField.setText(String.valueOf(result));
//
//            }
//        });

        addButton.addActionListener(e -> {
            String n1 = n1Field.getText();
            String n2 = n2Field.getText();
            try {
                int result = Integer.parseInt(n1) + Integer.parseInt(n2);
                resultField.setText(String.valueOf(result));
            } catch (NumberFormatException ex) {
                // Handle the case where the input is not a valid integer
                resultField.setText("Invalid input");
            }
        });

        subtractButton.addActionListener(e -> {
            String n1 = n1Field.getText();
            String n2 = n2Field.getText();
            try {
                int result = Integer.parseInt(n1) - Integer.parseInt(n2);
                resultField.setText(String.valueOf(result));
            } catch (NumberFormatException ex) {
                // Handle the case where the input is not a valid integer
                resultField.setText("Invalid input");
            }
        });


    }






    }
