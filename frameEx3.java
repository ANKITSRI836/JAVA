import javax.swing.*;
import java.awt.event.*;
public class frameEx3 implements ActionListener {
    JFrame jf;
    JLabel l1,l2,l3;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2;
    frameEx3(){
    
        jf=new JFrame("LOGIN");
        jf.setLocation(50, 50);
        jf.setSize(400,400);
        l1=new JLabel("LOGIN");
        l2=new JLabel("USER NAME");
        l3=new JLabel("PASSWORD");
        t1=new JTextField(20);
        t2=new JPasswordField(20);
        b1=new JButton("LOGIN");
        b2=new JButton("RESET");
        jf.setLayout(null);
        l1.setBounds(150,50,100,50);
        l2.setBounds(50,100,100,50);
        t1.setBounds(150,100,200,50);
        l3.setBounds(50,150,100,50);
        t2.setBounds(150,150,200,50);
        b1.setBounds(50,250,80,50);
        b2.setBounds(150,250,80,50);
        
        jf.add(l1);
        jf.add(l2);
        jf.add(t1);
        jf.add(l3);
        jf.add(t2);
        jf.add(b1);
        jf.add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        jf.setVisible(true);
    }
    public static void main(String[] args) {
        new frameEx3();
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1)
        {
            String usr=t1.getText();
            char ch[]=t2.getPassword();
            String pwd=new String(ch);
            if(usr.equals("admin")&&pwd.equals("manager"))
            {
                welcome w=new welcome();
                    w.setVisible(true);
                    jf.setVisible(false);
            }
        }
    }
}
