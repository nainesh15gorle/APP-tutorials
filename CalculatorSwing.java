import javax.swing.*;
import java.awt.event.*;

public class CalculatorSwing {
    public static void main(String[] args) {
        JFrame f = new JFrame("Calculator");
        JTextField tf = new JTextField();
        JButton[] b = new JButton[10];
        for(int i=0; i<10; i++) b[i] = new JButton(""+i);
        JButton add = new JButton("+"), sub = new JButton("-"), mul = new JButton("*"), div = new JButton("/"), eq = new JButton("=");
        tf.setBounds(30,20,180,30);
        int x=30, y=60;
        for(int i=1; i<=9; i++){ b[i].setBounds(x,y,50,30); x+=60; if(i%3==0){x=30; y+=40;} }
        b[0].setBounds(30,180,50,30);
        add.setBounds(150,60,50,30); sub.setBounds(150,100,50,30); mul.setBounds(150,140,50,30); div.setBounds(150,180,50,30); eq.setBounds(90,180,50,30);

        f.add(tf); for(JButton btn : b) f.add(btn);
        f.add(add); f.add(sub); f.add(mul); f.add(div); f.add(eq);
        f.setLayout(null); f.setSize(250,260); f.setVisible(true);

        final String[] op = {""}; final int[] val = {0};
        for(int i=0; i<10; i++){
            int finalI = i;
            b[i].addActionListener(e -> tf.setText(tf.getText()+finalI));
        }
        add.addActionListener(e -> { val[0]=Integer.parseInt(tf.getText()); op[0] = "+"; tf.setText(""); });
        sub.addActionListener(e -> { val[0]=Integer.parseInt(tf.getText()); op[0] = "-"; tf.setText(""); });
        mul.addActionListener(e -> { val[0]=Integer.parseInt(tf.getText()); op[0] = "*"; tf.setText(""); });
        div.addActionListener(e -> { val[0]=Integer.parseInt(tf.getText()); op[0] = "/"; tf.setText(""); });
        eq.addActionListener(e -> {
            int val2 = Integer.parseInt(tf.getText());
            int res = 0;
            switch(op[0]){
                case "+": res=val[0]+val2;break;
                case "-": res=val[0]-val2;break;
                case "*": res=val[0]*val2;break;
                case "/": res=val[0]/val2;break;
            }
            tf.setText(""+res);
        });
    }
}
