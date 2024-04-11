package bank;
import java.sql.*;
import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.*;

public class Signup extends JFrame  implements ActionListener {
    JRadioButton r1, r2, r3, m1, m2;
    JButton next;
    JTextField textName, FatherName, Email, Address, city, Pincode, state;
    JDateChooser dateChooser;
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9800L) + 1000L;
    String first = " " + Math.abs(first4);

    Signup() {
        super("New User Application");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);
        JLabel label1 = new JLabel("Application No. " + first4);
        label1.setBounds(250, 20, 600, 40);
        label1.setFont(new Font("Railway", Font.BOLD, 38));
        add(label1);

        JLabel label2 = new JLabel("Page 1 ");
        label2.setFont(new Font("Railway", Font.BOLD, 30));
        label2.setBounds(375, 70, 600, 37);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Railway", Font.BOLD, 22));
        label3.setBounds(340, 100, 400, 50);
        add(label3);

        JLabel labelName = new JLabel("Name: ");
        labelName.setFont(new Font("Railway", Font.BOLD, 22));
        labelName.setBounds(100, 150, 100, 30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Railway", Font.BOLD, 22));
        textName.setBounds(300, 150, 400, 30);
        add(textName);

        JLabel labelName1 = new JLabel("Father Name: ");
        labelName1.setFont(new Font("Railway", Font.BOLD, 22));
        labelName1.setBounds(100, 195, 200, 30);
        add(labelName1);

        FatherName = new JTextField();
        FatherName.setFont(new Font("Railway", Font.BOLD, 22));
        FatherName.setBounds(300, 195, 400, 30);
        add(FatherName);

        JLabel DOB = new JLabel("Date of Birth: ");
        DOB.setFont(new Font("Railway", Font.BOLD, 22));
        DOB.setBounds(100, 240, 200, 30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(300, 240, 400, 30);
        add(dateChooser);

        JLabel labelG = new JLabel("Gender : ");
        labelG.setFont(new Font("Railway", Font.BOLD, 22));
        labelG.setBounds(100, 285, 200, 30);
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Railway", Font.BOLD, 14));
        r1.setBounds(300, 285, 60, 30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Railway", Font.BOLD, 14));
        r2.setBounds(380, 285, 80, 30);
        add(r2);

        r3 = new JRadioButton("Other");
        r3.setFont(new Font("Railway", Font.BOLD, 14));
        r3.setBounds(480, 285, 80, 30);
        add(r3);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);

        JLabel labelEmail = new JLabel("Email Address : ");
        labelEmail.setFont(new Font("Railway", Font.BOLD, 20));
        labelEmail.setBounds(100, 330, 200, 30);
        add(labelEmail);

        Email = new JTextField();
        Email.setFont(new Font("Railway", Font.BOLD, 22));
        Email.setBounds(300, 330, 400, 30);
        add(Email);

        JLabel labelMarriage = new JLabel("Marriage status : ");
        labelMarriage.setFont(new Font("Railway", Font.BOLD, 20));
        labelMarriage.setBounds(100, 375, 200, 30);
        add(labelMarriage);

        m1 = new JRadioButton("Married");
        m1.setFont(new Font("Railway", Font.BOLD, 14));
        m1.setBounds(300, 375, 90, 30);
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setFont(new Font("Railway", Font.BOLD, 14));
        m2.setBounds(400, 375, 100, 30);
        add(m2);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);

        JLabel labelAddress = new JLabel("Address : ");
        labelAddress.setFont(new Font("Railway", Font.BOLD, 20));
        labelAddress.setBounds(100, 415, 200, 30);
        add(labelAddress);

        Address = new JTextField();
        Address.setFont(new Font("Railway", Font.BOLD, 22));
        Address.setBounds(300, 415, 400, 30);
        add(Address);

        JLabel labelCity = new JLabel("City : ");
        labelCity.setFont(new Font("Railway", Font.BOLD, 20));
        labelCity.setBounds(100, 460, 200, 30);
        add(labelCity);

        city = new JTextField();
        city.setFont(new Font("Raleway", Font.BOLD, 22));
        city.setBounds(300, 460, 400, 30);
        add(city);

        JLabel labelPincode = new JLabel("Pin Code : ");
        labelPincode.setFont(new Font("Railway", Font.BOLD, 20));
        labelPincode.setBounds(100, 510, 200, 30);
        add(labelPincode);

        Pincode = new JTextField();
        Pincode.setFont(new Font("Railway", Font.BOLD, 22));
        Pincode.setBounds(300, 510, 400, 30);
        add(Pincode);

        JLabel labelstate = new JLabel("State : ");
        labelstate.setFont(new Font("Railway", Font.BOLD, 20));
        labelstate.setBounds(100, 560, 200, 30);
        add(labelstate);

        state = new JTextField();
        state.setFont(new Font("Railway", Font.BOLD, 15));
        state.setBounds(300, 560, 400, 30);
        add(state);

        next = new JButton("Next");
        next.setFont(new Font("Railway ", Font.BOLD, 22));
        next.setBounds(300, 600, 100, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(184, 244, 248));
        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first;
        String name = textName.getText();
        String fathername = FatherName.getText();
        String DOB = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String labelG = null;
        if (r1.isSelected()) {
            labelG = "Male";
        } else if (r2.isSelected()) {
            labelG = "Female";
        } else if (r2.isSelected()) {
            labelG = "Other";
        }
        String labelEmail = Email.getText();
        String labelMarriage = null;
        if(m1.isSelected()) {
            labelMarriage = "Married";
        }  else if (m2.isSelected()){
                labelMarriage = "Unmarried";
            }
        String labeladdress = Address.getText();
        String labelcity = city.getText();
        String labelPincode = Pincode.getText();
        String labelState = state.getText();

        try{
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Name Field cannot be empty");
            }else{
                Connector con1 = new Connector();
                String q = "Insert into signup values('"+formno+"','"+name+"','"+fathername+"','"+DOB+"','"+labelG+"','"+labelEmail+"','"+labelMarriage+"','"+labeladdress+"','"+labelcity+"','"+labelPincode+"','"+labelState+"')";
                new Signup2(first);
                setVisible(false);

                }
            }catch(Exception E){
            E.printStackTrace();
            }
        }
    public static void main(String[] args) {
        new Signup();
    }

}




