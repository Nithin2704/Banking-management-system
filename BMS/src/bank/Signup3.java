package bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup3  extends JFrame implements ActionListener {
    JButton s,c;
    JComboBox Accty,ChqBook;
    String formno;


    Signup3(String formno) {
        this.formno = formno;
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(5 ,10, 100, 100);
        add(image);

        JLabel l1 = new JLabel(" Page 3 ");
        l1.setFont(new Font("Raleway",Font.BOLD,35));
        l1.setBounds(270,3,600,65);
        add(l1);

        JLabel l2 = new JLabel(" Account Details");
        l2.setFont(new Font("Raleway",Font.BOLD,26));
        l2.setBounds(235,50,600,55);
        add(l2);

        JLabel l3 = new JLabel(" Account Type : ");
        l3.setFont(new Font("Raleway",Font.BOLD,26));
        l3.setBounds(50,150,600,55);
        add(l3);

        String Acctype[] = {"Savings Account","Current Account","Fixed Deposit Account","PPF Account","OverDraft Account"};
        Accty = new JComboBox(Acctype);
        Accty.setBackground(new Color(255, 255, 255));
        Accty.setFont(new Font("Railway", Font.BOLD, 20));
        Accty.setBounds(350, 160, 250, 30);
        add(Accty);

        JLabel l4 = new JLabel(" Card Number : ");
        l4.setFont(new Font("Raleway",Font.BOLD,26));
        l4.setBounds(50,200,600,55);
        add(l4);

        JLabel l5 = new JLabel(" (Your 16-digit Card Number)");
        l5.setFont(new Font("Raleway",Font.BOLD,10));
        l5.setBounds(60,220,600,55);
        add(l5);

        JLabel l6 = new JLabel(" XXXX - XXXX - XXXX - 4841 ");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(340,200,600,55);
        add(l6);

        JLabel l7 = new JLabel("(For security purposes Card Number and PIN can only be requested via SMS)");
        l7.setFont(new Font("Raleway",Font.BOLD,10));
        l7.setBounds(300,220,600,55);
        add(l7);

        JLabel l8 = new JLabel(" PIN : ");
        l8.setFont(new Font("Raleway",Font.BOLD,26));
        l8.setBounds(50,260,600,55);
        add(l8);

        JLabel l9 = new JLabel(" XXXX");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(340,260,600,55);
        add(l9);

        JLabel l10 = new JLabel(" Cheque Book Required : ");
        l10.setFont(new Font("Raleway",Font.BOLD,22));
        l10.setBounds(50,300,600,55);
        add(l10);

        String Chequerec[] = {"Yes","No"};
        ChqBook = new JComboBox(Chequerec);
        ChqBook.setBackground(new Color(255, 255, 255));
        ChqBook.setFont(new Font("Railway", Font.BOLD, 20));
        ChqBook.setBounds(350, 310, 250, 30);
        add(ChqBook);

        JLabel l11 = new JLabel("(For new accounts debit card will be issued and dispatched to the residential address automatically) ");
        l11.setFont(new Font("Raleway",Font.ITALIC,12));
        l11.setBounds(70,400,600,55);
        add(l11);

        s = new JButton("Submit" );
        s.setFont(new Font("Railway ", Font.BOLD, 15));
        s.setBounds(320, 380, 100, 30);
        add(s);

        c = new JButton("Clear" );
        c.setFont(new Font("Railway ", Font.BOLD, 15));
        c.setBounds(200, 380, 80, 30);
        add(c);

        JLabel l13 = new JLabel("Form No: " );
        l13.setFont(new Font("Raleway", Font.BOLD, 14));
        l13.setBounds(7, 105, 600, 30);
        add(l13);

        setSize(700,500);
        setVisible(true);
        setLocation(450,80);
        getContentPane().setBackground(new Color(255, 250, 209, 255));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){

    }
        public static void main(String[] args){
        new Signup3("");

        }
    }

