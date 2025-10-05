import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class EmployeeFormSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Employee Management");
        JTextField name = new JTextField(); JTextField dept = new JTextField(); JTextField salary = new JTextField();
        JButton add = new JButton("Add");
        DefaultTableModel model = new DefaultTableModel();
        JTable table = new JTable(model);

        model.addColumn("Name"); model.addColumn("Dept"); model.addColumn("Salary");
        name.setBounds(20,20,100,20); dept.setBounds(140,20,100,20); salary.setBounds(260,20,80,20);
        add.setBounds(360,20,70,20);
        JScrollPane pane = new JScrollPane(table); pane.setBounds(20,60,410,150);

        frame.add(name); frame.add(dept); frame.add(salary); frame.add(add); frame.add(pane);
        frame.setSize(460,270); frame.setLayout(null); frame.setVisible(true);

        add.addActionListener(e -> {
            model.addRow(new Object[]{name.getText(), dept.getText(), salary.getText()});
            name.setText(""); dept.setText(""); salary.setText("");
        });
    }
}
