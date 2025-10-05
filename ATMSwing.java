import javax.swing.*;

public class ATMSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ATM");
        JLabel l1 = new JLabel("Enter PIN:");
        JPasswordField pf = new JPasswordField();
        JButton login = new JButton("Login");
        JLabel msg = new JLabel("");
        l1.setBounds(30,30,80,20); pf.setBounds(120,30,100,20); login.setBounds(90,70,70,30); msg.setBounds(60,110,160,20);

        frame.add(l1); frame.add(pf); frame.add(login); frame.add(msg);
        frame.setSize(300,200); frame.setLayout(null); frame.setVisible(true);

        login.addActionListener(e -> {
            String pin = new String(pf.getPassword());
            if(pin.equals("1234")){
                msg.setText("PIN correct! Choose option:");
                JButton check = new JButton("Check Balance");
                JButton dep = new JButton("Deposit");
                JButton wit = new JButton("Withdraw");
                check.setBounds(30,140,120,30); dep.setBounds(160,140,100,30); wit.setBounds(90,180,100,30);
                frame.add(check); frame.add(dep); frame.add(wit); frame.repaint();
            } else {
                msg.setText("Incorrect PIN!");
            }
        });
    }
}
