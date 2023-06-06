import javax.swing.*;
import java.awt.*;

public class Lab12Test {

    public static void main(String[] args) {
        Calculator c = new Calculator();
        JFrame frame = new JFrame();
        frame.getContentPane().setPreferredSize(new Dimension(1000,900));
        frame.add(c);
        frame.pack();
        frame.setVisible( true );
        frame.setResizable( false );
    }
}
