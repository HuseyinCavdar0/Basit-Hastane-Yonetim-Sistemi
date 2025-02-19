package hospital.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Employee_Info extends JFrame {

    Employee_Info(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,990,590);
        panel.setBackground(new Color(1,40,93));
        panel.setLayout(null);
        add(panel);

        JTable table = new JTable();
        table.setBounds(10,34,980,450);
        table.setBackground(new Color(1,40,93));
        table.setForeground(Color.white);
        table.setFont(new Font("Tahoma", Font.BOLD,12));
        panel.add(table);

        try{
            conn c = new conn();
            String q = "select * from Employee_Info";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        }catch(Exception e){
            e.printStackTrace();
        }

        JLabel label1 = new JLabel("Ad");
        label1.setBounds(41,9,70,20);
        label1.setFont(new Font("Tahoma", Font.BOLD,14));
        label1.setForeground(Color.white);
        panel.add(label1);

        JLabel label2 = new JLabel("Yaş");
        label2.setBounds(180,9,70,20);
        label2.setFont(new Font("Tahoma", Font.BOLD,14));
        label2.setForeground(Color.white);
        panel.add(label2);

        JLabel label3 = new JLabel("Telefon No");
        label3.setBounds(350,9,150,20);
        label3.setFont(new Font("Tahoma", Font.BOLD,14));
        label3.setForeground(Color.white);
        panel.add(label3);

        JLabel label4 = new JLabel("Maaş");
        label4.setBounds(550,9,150,20);
        label4.setFont(new Font("Tahoma", Font.BOLD,14));
        label4.setForeground(Color.white);
        panel.add(label4);

        JLabel label5 = new JLabel("Gmail");
        label5.setBounds(720,9,150,20);
        label5.setFont(new Font("Tahoma", Font.BOLD,14));
        label5.setForeground(Color.white);
        panel.add(label5);

        JLabel label6 = new JLabel("Kimlik No");
        label6.setBounds(830,9,150,20);
        label6.setFont(new Font("Tahoma", Font.BOLD,14));
        label6.setForeground(Color.white);
        panel.add(label6);

        JButton button = new JButton("GERİ");
        button.setBounds(350,500,120,30);
        button.setBackground(Color.black);
        button.setForeground(Color.white);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        panel.add(button);



        setUndecorated(true);
        setSize(1000,600);
        setLocation(350,230);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Employee_Info();
    }
}
