package bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    JButton next;
    JTextField AadhaarNumber,PANNumber;
    JComboBox combox,boxOcc;

    String formno;
    Signup2(String first){
        super("New User Application");
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
            Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel image = new JLabel(i3);
            image.setBounds(25, 10, 100, 100);
            add(image);

            this.formno = first;
            JLabel l1 = new JLabel("Page 2 ");
            l1.setFont(new Font("Raleway",Font.BOLD,35));
            l1.setBounds(300,20,600,60);
            add(l1);

            JLabel l2 = new JLabel("Additional Details");
            l2.setFont(new Font("Raleway",Font.BOLD,26));
            l2.setBounds(250,70,600,60);
            add(l2);

            JLabel l3 = new JLabel(" Enter Aadhaar Number: ");
            l3.setFont(new Font("Raleway",Font.BOLD,26));
            l3.setBounds(50,150,500,60);
            add(l3);

            AadhaarNumber = new JTextField();
            AadhaarNumber.setFont(new Font("Railway", Font.BOLD, 22));
            AadhaarNumber.setBounds(400, 165, 250, 30);
            add(AadhaarNumber);

            JLabel l4 = new JLabel(" Enter PAN Number: ");
            l4.setFont(new Font("Raleway",Font.BOLD,26));
            l4.setBounds(49,205,500,60);
            add(l4);

            PANNumber = new JTextField();
            PANNumber.setFont(new Font("Railway", Font.BOLD, 22));
            PANNumber.setBounds(400, 220, 250, 30);
            add(PANNumber);


            JLabel l5 = new JLabel(" Enter Annual Income:");
            l5.setFont(new Font("Raleway",Font.BOLD,26));
            l5.setBounds(49,260,500,60);
            add(l5);

            String AnnualIncome[] = {"Upto 200000 ","200000 to 500000","500000 to 1000000","more than 1000000"};
            combox = new JComboBox(AnnualIncome);
            combox.setBackground(new Color(255, 255, 255));
            combox.setFont(new Font("Railway", Font.BOLD, 22));
            combox.setBounds(400, 275, 250, 30);
            add(combox);


        JLabel l6 = new JLabel(" Enter Occupation:");
        l6.setFont(new Font("Raleway",Font.BOLD,26));
        l6.setBounds(49,315,500,60);
        add(l6);

        String Occupation[] = {"Student","Private Employee","Government Employee","Business Individual"};
        boxOcc = new JComboBox(Occupation);
        boxOcc.setBackground(new Color(255, 255, 255));
        boxOcc.setFont(new Font("Railway", Font.BOLD, 22));
        boxOcc.setBounds(400, 325, 250, 30);
        add(boxOcc);

        JLabel l7 = new JLabel("Form No : " + first);
        l7.setFont(new Font("Raleway", Font.BOLD, 14));
        l7.setBounds(20, 105, 600, 30);
        add(l7);


        next = new JButton("Next");
        next.setFont(new Font("Railway ", Font.BOLD, 22));
        next.setBounds(300, 380, 100, 30);
        next.addActionListener(this);
        add(next);

        setLayout(null);
            setSize(700,500);
            setVisible(true);
            setLocation(450,80);
            getContentPane().setBackground(new Color(253, 187, 187));
            setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String pan = PANNumber.getText();
        String aad = AadhaarNumber.getText();
        String Anninc = (String) combox.getSelectedItem();
        String Occ = (String) boxOcc.getSelectedItem();

        try {
            if (pan.equals("") || aad.equals("")) {
                JOptionPane.showMessageDialog(null, "This field cannot be empty");
            } else {
                Connector c1 = new Connector();
                String q = "Insert into signup values('" + aad + "','" + pan + "','" + Anninc + "','" + Occ + "')";
                c1.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[]args){
        new Signup2("");
    }
}
