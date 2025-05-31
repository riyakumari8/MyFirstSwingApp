import javax.swing.*; //All swing gui components
import java.awt.*; //for layouts
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFirstSwingApp {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("First App"); //This is the main window
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(); //a section inside the frame where we can place buttons, labels etc.
        frame.add(panel);
        panel.setLayout(new FlowLayout());

        JLabel label = new JLabel("Click the button");
        panel.add(label);

        JButton button = new JButton("Click me");
        panel.add(button);

        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button Clicked");
            }
            
        });

        frame.setVisible(true);

    }
}