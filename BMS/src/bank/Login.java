package bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JLabel label1, label2,label3;
    JTextField textField2;
    JPasswordField passwordField;
    JButton button1,button2,button3;

    Login(){
        super("Banking Management System");


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 =i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image);


        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image ii2 =ii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(630,350,100,100);
        add(iimage);

        label1 =new JLabel("Welcome ");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Calibri",Font.BOLD,35));
        label1.setBounds(330,100,450,60);
        add(label1);

        label2 =new JLabel("Enter Card number : ");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Calibri",Font.BOLD,35));
        label2.setBounds(150,190,375,40);
        add(label2);

        textField2 = new JTextField(20);
        textField2.setBounds(450,190,230,30);
        textField2.setFont(new Font("Arial",Font.BOLD, 14));
        add(textField2);

        label3 =new JLabel("Enter PIN :");
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Calibri",Font.BOLD,35));
        label3.setBounds(150,250,375,40);
        add(label3);

        passwordField = new JPasswordField(15);
        passwordField.setBounds(325,250,230,30);
        passwordField.setFont(new Font("Arial",Font.BOLD,14));
        add(passwordField);

        button1 = new JButton("Log in");
        button1.setFont(new Font("Aerial",Font.BOLD,14));
        button1.setForeground(Color.BLACK);
        button1.setBounds(300,300,100,30);
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("Clear");
        button2.setFont(new Font("Aerial",Font.BOLD,14));
        button2.setForeground(Color.BLACK);
        button2.setBounds(420,300,100,30);
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton("New User");
        button3.setFont(new Font("Aerial",Font.BOLD,14));
        button3.setForeground(Color.BLACK);
        button3.setBounds(360,350,100,30);
        button3.addActionListener(this);
        add(button3);


        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image iii2 =iii1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0,0,850,480);
        add(iiimage);


        setLayout(null);
        setSize(850,480);
        setLocation(400,200);
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if (e.getSource()==button1){

            }else if (e.getSource() == button2){
                textField2.setText("");
                passwordField.setText("");

            }else if (e.getSource() == button3){

            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Login();
    }
}