import javax.swing.*;
import java.awt.event.*;

public class ShoppingCartSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Shopping Cart");
        JCheckBox cb1 = new JCheckBox("Laptop - ₹50000");
        JCheckBox cb2 = new JCheckBox("Phone - ₹20000");
        JCheckBox cb3 = new JCheckBox("Headphones - ₹2000");
        JButton button = new JButton("Generate Bill");
        JLabel label = new JLabel("");

        cb1.setBounds(50,50,200,20);
        cb2.setBounds(50,80,200,20);
        cb3.setBounds(50,110,200,20);
        button.setBounds(50,150,120,30);
        label.setBounds(50,200,300,30);

        frame.add(cb1); frame.add(cb2); frame.add(cb3);
        frame.add(button); frame.add(label);
        frame.setSize(350,300); frame.setLayout(null); frame.setVisible(true);

        button.addActionListener(e -> {
            int total = 0;
            String items = "";
            if(cb1.isSelected()){total += 50000; items += "Laptop "; }
            if(cb2.isSelected()){total += 20000; items += "Phone "; }
            if(cb3.isSelected()){total += 2000; items += "Headphones "; }
            label.setText("Items: " + items + " Total: ₹" + total);
        });
    }
}
