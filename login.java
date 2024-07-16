package LoginWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login implements ActionListener {
    private static JFrame frame;
    private static JLabel label,label1;
    private static JTextField userText;
    private static JPasswordField passwordField;
    private static JButton button;

    private static JLabel success;


    public static void main(String[] args)  {

        frame =new JFrame();
        frame.setLayout(null);
        frame.setSize(250,250);

        label = new JLabel("username");
        label.setBounds(30,30,100,50);
        frame.add(label);

        userText= new JTextField();
        userText.setBounds(100,40,100,30);
        frame.add(userText);

         label1 =new JLabel("password");
        label1.setBounds(30,60,100,50);
        frame.add(label1);

         passwordField= new JPasswordField();
        passwordField.setBounds(100,75,100,30);
        frame.add(passwordField);

         button = new JButton("Submit");
        button.setBounds(30,120,75,50);
        frame.add(button);
        button.addActionListener(new login());

//        JButton button1 = new JButton("reset");
//        button1.setBounds(120,120,75,50);
//        frame.add(button1);
        success=new JLabel();
        success.setBounds(50,150,150,70);
        frame.add(success);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
       String user =userText.getText();
       String pass = passwordField.getText();
        //System.out.println("user ="+user+"\npassword ="+pass);
        if(e.getSource()==button){
            newWindow window;
            if(user.equals("Evans")&&pass.equals("evans123")){
                 window =new newWindow("login successful");
          // success.setText("login Successful");
       }
       else {
           window=new newWindow("login failed");
//           success.setText("login fail");
       }
        }


    }
}
