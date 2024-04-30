import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Key Listener Example");
        JTextField textField = new JTextField();

        textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                // Handle the key press (e.g., update UI or perform an action)
                System.out.println("Key typed: " + keyChar);
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // Not used in this example
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // Not used in this example
            }
        });

        frame.add(textField);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}