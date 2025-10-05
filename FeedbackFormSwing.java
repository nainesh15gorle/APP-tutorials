import javax.swing.*;

public class FeedbackFormSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Feedback Form");
        JLabel l1 = new JLabel("Rate Service:");
        JRadioButton[] rb = new JRadioButton[5];
        ButtonGroup bg = new ButtonGroup();
        for(int i=0;i<5;i++){ rb[i]=new JRadioButton(""+(i+1)); bg.add(rb[i]); rb[i].setBounds(110+i*40,20,40,30); frame.add(rb[i]); }
        JTextArea ta = new JTextArea(); ta.setBounds(20,60,200,50);
        JButton submit = new JButton("Submit"); submit.setBounds(20,120,100,30);
        JLabel msg = new JLabel(""); msg.setBounds(20,170,200,30);
        frame.add(l1); frame.add(ta); frame.add(submit); frame.add(msg);
        l1.setBounds(20,20,80,30);
        frame.setSize(300,250); frame.setLayout(null); frame.setVisible(true);

        submit.addActionListener(e -> {
            msg.setText("Thank you for your feedback!");
        });
    }
}
