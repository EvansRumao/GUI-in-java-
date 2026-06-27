package LoginWindow;

// Import Swing components (JFrame, JLabel, JTextField, etc.)
import javax.swing.*;

// Import ActionEvent and ActionListener for button click events
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Class that implements ActionListener to handle button clicks
public class login implements ActionListener {

    // Declare GUI components
    private static JFrame frame;
    private static JLabel label, label1;
    private static JTextField userText;
    private static JPasswordField passwordField;
    private static JButton button;
    private static JLabel success;

    // Main method - program starts here
    public static void main(String[] args) {

        // Create a new JFrame (window)
        frame = new JFrame();

        // Disable default layout manager (using absolute positioning)
        frame.setLayout(null);

        // Set window size
        frame.setSize(250, 250);

        // Create username label
        label = new JLabel("username");

        // Set label position (x, y, width, height)
        label.setBounds(30, 30, 100, 50);

        // Add label to frame
        frame.add(label);

        // Create text field for username
        userText = new JTextField();

        // Set position and size of username field
        userText.setBounds(100, 40, 100, 30);

        // Add username field to frame
        frame.add(userText);

        // Create password label
        label1 = new JLabel("password");

        // Set password label position
        label1.setBounds(30, 60, 100, 50);

        // Add password label to frame
        frame.add(label1);

        // Create password field
        passwordField = new JPasswordField();

        // Set password field position and size
        passwordField.setBounds(100, 75, 100, 30);

        // Add password field to frame
        frame.add(passwordField);

        // Create Submit button
        button = new JButton("Submit");

        // Set button position and size
        button.setBounds(30, 120, 75, 50);

        // Add button to frame
        frame.add(button);

        // Register ActionListener for button click
        button.addActionListener(new login());

        // Reset button (currently commented out)
//        JButton button1 = new JButton("reset");
//        button1.setBounds(120,120,75,50);
//        frame.add(button1);

        // Label to display login status
        success = new JLabel();

        // Set position of success label
        success.setBounds(50, 150, 150, 70);

        // Add success label to frame
        frame.add(success);

        // Make the window visible
        frame.setVisible(true);

        // Close application when window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // This method is automatically called whenever the button is clicked
    @Override
    public void actionPerformed(ActionEvent e) {

        // Get text entered in username field
        String user = userText.getText();

        // Get password entered in password field
        String pass = passwordField.getText();

        // Print username and password to console (currently commented)
//        System.out.println("user =" + user + "\npassword =" + pass);

        // Check if the Submit button was clicked
        if (e.getSource() == button) {

            // Declare object of newWindow class
            newWindow window;

            // Validate username and password
            if (user.equals("Evans") && pass.equals("evans123")) {

                // Open a new window with success message
                window = new newWindow("login successful");

                // Display success message on current window (optional)
//                success.setText("Login Successful");

            } else {

                // Open a new window with failure message
                window = new newWindow("login failed");

                // Display failure message on current window (optional)
//                success.setText("Login Failed");
            }
        }
    }
}
