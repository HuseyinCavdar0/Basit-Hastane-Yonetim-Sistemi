package hospital.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Ambulance extends JFrame {

    Ambulance() {
        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,590);
        panel.setBackground(new Color(1,40,93));
        panel.setLayout(null);
        add(panel);

        JTable table = new JTable();
        table.setBounds(10,50,900,450);
        table.setBackground(new Color(1,40,93));
        table.setForeground(Color.white);
        table.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel.add(table);

        try{
            conn c = new conn();
            String q = "select * from Ambulance";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        }catch(Exception e){
            e.printStackTrace();
        }

        JLabel label1 = new JLabel("Ad");
        label1.setBounds(31,11,100,20);
        label1.setFont(new Font("Tahoma", Font.BOLD,14));
        label1.setForeground(Color.white);
        panel.add(label1);

        JLabel label2 = new JLabel("Cinsiyet");
        label2.setBounds(230,11,100,20);
        label2.setFont(new Font("Tahoma", Font.BOLD,14));
        label2.setForeground(Color.white);
        panel.add(label2);

        JLabel label3 = new JLabel("Araç Adı");
        label3.setBounds(400,11,100,20);
        label3.setFont(new Font("Tahoma", Font.BOLD,14));
        label3.setForeground(Color.white);
        panel.add(label3);

        JLabel label4 = new JLabel("Müsaitlik");
        label4.setBounds(570,11,100,20);
        label4.setFont(new Font("Tahoma", Font.BOLD,14));
        label4.setForeground(Color.white);
        panel.add(label4);

        JLabel label5 = new JLabel("Yer");
        label5.setBounds(800,11,100,20);
        label5.setFont(new Font("Tahoma", Font.BOLD,14));
        label5.setForeground(Color.white);
        panel.add(label5);

        JButton button = new JButton("GERİ");
        button.setBounds(450,510,120,30);
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
        setSize(900,600);
        setLayout(null);
        setLocation(300,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ambulance();
    }
}
