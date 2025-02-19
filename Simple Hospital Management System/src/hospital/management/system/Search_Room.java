package hospital.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Search_Room extends JFrame {

    Choice choice;
    JTable table;

        Search_Room(){

            JPanel panel = new JPanel();
            panel.setBounds(5,5,690,490);
            panel.setBackground(new Color(1,40,93));
            panel.setLayout(null);
            add(panel);

            JLabel For = new JLabel("Oda Bulmak İçin Ara"); //Search For Room
            For.setBounds(250,11,250,31);
            For.setForeground(Color.white);
            For.setFont(new Font("Tahoma", Font.BOLD, 20));
            panel.add(For);

            JLabel status = new JLabel("Durum");
            status.setBounds(70,70,80,20);
            status.setForeground(Color.white);
            status.setFont(new Font("Tahoma", Font.BOLD, 14));
            panel.add(status);

            choice = new Choice();
            choice.setBounds(170,70,120,20);
            choice.add("Müsait");
            choice.add("Dolu");
            panel.add(choice);

            table = new JTable();
            table.setBounds(0,187,700,210);
            table.setBackground(new Color(1,40,93));
            table.setForeground(Color.white);
            panel.add(table);

            try{
                conn c = new conn();
                String q = "select * from room";
                ResultSet resultSet = c.statement.executeQuery(q);
                table.setModel(DbUtils.resultSetToTableModel(resultSet));

            }catch (Exception e){
                e.printStackTrace();
            }

            JLabel roomno = new JLabel("Oda No");
            roomno.setBounds(23,162,150,20);
            roomno.setForeground(Color.white);
            roomno.setFont(new Font("Tahoma", Font.BOLD, 14));
            panel.add(roomno);

            JLabel availability = new JLabel("Müsaitlik");
            availability.setBounds(175,162,150,20);
            availability.setForeground(Color.white);
            availability.setFont(new Font("Tahoma", Font.BOLD, 14));
            panel.add(availability);

            JLabel price = new JLabel("Ücret");
            price.setBounds(458,162,150,20);
            price.setForeground(Color.white);
            price.setFont(new Font("Tahoma", Font.BOLD, 14));
            panel.add(price);

            JLabel bed = new JLabel("Yatak Tipi");
            bed.setBounds(580,162,150,20);
            bed.setForeground(Color.white);
            bed.setFont(new Font("Tahoma", Font.BOLD, 14));
            panel.add(bed);

            JButton button1 = new JButton("ARA");
            button1.setBounds(200,420,120,25);
            button1.setBackground(Color.BLACK);
            button1.setForeground(Color.white);
            panel.add(button1);
            button1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String q = "select * from Room where Availability = '"+choice.getSelectedItem()+"' ";
                    try{
                        conn c = new conn();
                        ResultSet resultSet = c.statement.executeQuery(q);
                        table.setModel(DbUtils.resultSetToTableModel(resultSet));
                    } catch (Exception E) {
                        E.printStackTrace();
                    }
                }
            });

            JButton button2 = new JButton("GERİ");
            button2.setBounds(380,420,120,25);
            button2.setBackground(Color.black);
            button2.setForeground(Color.white);
            button2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    setVisible(false);
                }
            });
            panel.add(button2);



            setUndecorated(true);
            setSize(700,500);
            setLayout(null);
            setLocation(450,250);
            setVisible(true);
        }

    public static void main(String[] args) {
        new Search_Room();
    }
}
