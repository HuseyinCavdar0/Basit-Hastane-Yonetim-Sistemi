package hospital.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Department extends JFrame {

    Department(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,690,490);
        panel.setLayout(null);
        panel.setBackground(new Color(1,40,93));
        add(panel);

        JTable table = new JTable();
        table.setBounds(0,40,700,350);
        table.setBackground(new Color(1,40,93));
        table.setForeground(Color.white);
        table.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(table);

        JLabel label1 = new JLabel("Departman");
        label1.setBounds(145,11,105,20);
        label1.setFont(new Font("Tahoma", Font.BOLD, 14));
        label1.setForeground(Color.white);
        panel.add(label1);

        JLabel label2 = new JLabel("Telefon No");
        label2.setBounds(431,11,150,20);
        label2.setFont(new Font("Tahoma", Font.BOLD, 14));
        label2.setForeground(Color.white);
        panel.add(label2);

        JButton button = new JButton("GERİ");
        button.setBounds(400,410, 100,20);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.white);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        panel.add(button);

        try{
            conn c = new conn();
            String q = "select * from Department";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        }catch(Exception e){
            e.printStackTrace();
        }

        setUndecorated(true);
        setSize(700,500);
        setLayout(null);
        setLocation(350,250);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Department();
    }
}
