package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JTextField textField;
    JPasswordField jPasswordField;
    JButton button1,button2;

    Login(){

        JLabel nameLabel = new JLabel("Kullanıcı Adı");
        nameLabel.setBounds(40,20,150,30);
        nameLabel.setFont(new Font("Tahoma",Font.BOLD,16));
        nameLabel.setForeground(Color.WHITE);
        add(nameLabel);

        JLabel password = new JLabel("Şifre");
        password.setBounds(40,70,100,30);
        password.setFont(new Font("Tahoma",Font.BOLD,16));
        password.setForeground(Color.WHITE);
        add(password);

        textField = new JTextField();
        textField.setBounds(150,20,150,30);
        textField.setFont(new Font("Tahoma",Font.PLAIN,15));
        textField.setBackground(new Color(255,179,0));
        add(textField);

        jPasswordField = new JPasswordField();
        jPasswordField.setBounds(150,70,150,30);
        jPasswordField.setFont(new Font("Tahoma",Font.PLAIN,15));
        jPasswordField.setBackground(new Color(255,179,0));
        add(jPasswordField);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/login.png"));
        Image i1 = imageIcon.getImage().getScaledInstance(400,400,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(i1);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(300,-30,400,300);
        add(label);

        button1 = new JButton("GİRİŞ");
        button1.setBounds(40,140,120,30);
        button1.setFont(new Font("Serif",Font.BOLD,15));
        button1.setBackground(Color.BLACK);
        button1.setForeground(Color.white);
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("ÇIKIŞ");
        button2.setBounds(180,140,120,30);
        button2.setFont(new Font("Serif",Font.BOLD,15));
        button2.setBackground(Color.BLACK);
        button2.setForeground(Color.white);
        button2.addActionListener(this);
        add(button2);



        getContentPane().setBackground(new Color(1,40,93));
        setSize(750,300);
        setLocation(400,270);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1){
            try{
                conn c = new conn();
                String user = textField.getText();
                String Pass = jPasswordField.getText();

                String q = "select * from Login where ID = '"+user+"' and PW = '"+Pass+"'";
                ResultSet resultSet = c.statement.executeQuery(q);

                if(resultSet.next()){
                    new Reception();
                    setVisible(false);
                }else{
                   JOptionPane.showMessageDialog(null,"Invalid");
                }

            }catch(Exception E){
                E.printStackTrace();
            }
        }else{
            System.exit(10);
        }

    }

    public static void main(String[] args) {
        new Login();
    }

}
