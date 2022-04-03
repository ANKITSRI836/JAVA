import javax.swing.*;
public class welcome extends JFrame{
    welcome()
    {
     JLabel l1,l2;
        
        setLocation(50, 50);
        setSize(400,400);
        l1=new JLabel("WELCOME");
        l2=new JLabel("Hello Folks");
        setLayout(null);
        l1.setBounds(150,50,100,50);
        l2.setBounds(150,100,100,100);
        add(l1);
        add(l2);
    }
    
}
