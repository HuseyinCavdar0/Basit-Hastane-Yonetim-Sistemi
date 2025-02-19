package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame {

    Reception(){

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(5,160,1525,670);
        panel.setBackground(new Color(1,40,93));
        add(panel);

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5,5,1525,150);
        panel1.setBackground(new Color(1,40,93));
        add(panel1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/doctor.png"));
        Image image = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(image);
        JLabel label = new JLabel(i2);
        label.setBounds(1300,0,200,200);
        panel1.add(label);

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icon/ambulance.png"));
        Image image1 = i11.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon i22 = new ImageIcon(image1);
        JLabel label1 = new JLabel(i22);
        label1.setBounds(1000,50,300,100);
        panel1.add(label1);

        JButton button1 = new JButton("Yeni Hasta Ekle");
        button1.setBounds(30,15,200,30);
        button1.setBackground(new Color(255,179,0));
        panel1.add(button1);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new New_Patient();
            }
        });

        JButton button2 = new JButton("Oda");
        button2.setBounds(30,58,200,30);
        button2.setBackground(new Color(255,179,0));
        panel1.add(button2);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { new Room();

            }
        });

        JButton button3 = new JButton("Departman");
        button3.setBounds(30,100,200,30);
        button3.setBackground(new Color(255,179,0));
        panel1.add(button3);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { new Department();

            }
        });

        JButton button4 = new JButton("Bütün Çalışan Bilgisi");
        button4.setBounds(270,15,200,30);
        button4.setBackground(new Color(255,179,0));
        panel1.add(button4);
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Employee_Info();
            }
        });

        JButton button5 = new JButton("Hasta Bilgisi");
        button5.setBounds(270,58,200,30);
        button5.setBackground(new Color(255,179,0));
        panel1.add(button5);
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new All_Patient_Info();
            }
        });

        JButton button6 = new JButton("Hasta Boşalt");
        button6.setBounds(270,100,200,30);
        button6.setBackground(new Color(255,179,0));
        panel1.add(button6);
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Patient_Discharge();
            }
        });

        JButton button7 = new JButton("Hasta Detaylarını Güncelle");
        button7.setBounds(510,15,200,30);
        button7.setBackground(new Color(255,179,0));
        panel1.add(button7);
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Update_Patient_Details();
            }
        });

        JButton button8 = new JButton("Hastane Ambulansı");
        button8.setBounds(510,58,200,30);
        button8.setBackground(new Color(255,179,0));
        panel1.add(button8);
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Ambulance();
            }
        });

        JButton button9 = new JButton("Oda Ara");
        button9.setBounds(510,100,200,30);
        button9.setBackground(new Color(255,179,0));
        panel1.add(button9);
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Search_Room();
            }
        });

        JButton button10 = new JButton("Kullanıcı Çıkışı");
        button10.setBounds(750,15,200,30);
        button10.setBackground(new Color(255,179,0));
        panel1.add(button10);
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Login();
            }
        });




        setSize(1950,1090);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Reception();
    }
}
