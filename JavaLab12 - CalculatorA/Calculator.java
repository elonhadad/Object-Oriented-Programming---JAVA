import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JPanel implements ActionListener {

    private JPanel frame;
    private JPanel center;
    private JPanel left;
    private JPanel right;
    private JPanel up;
    private JPanel down;

    private JButton add;
    private JButton clear;
    private JButton exit;

    private JTextField first;
    private JTextField second;
    private JTextField result;

    private JLabel L_first;
    private JLabel L_second;
    private JLabel L_result;

    public Calculator(){
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                init();
            }
        });
    }

    private void init(){
        Dimension D_frame = new Dimension(1000,900);
        Dimension D_left = new Dimension(1000,80);
        Dimension D_right = new Dimension(1000,200);
        Dimension D_side = new Dimension(80,600);
        Dimension D_button = new Dimension(160,60);

        Font small_f = new Font("Arial.ttf", 1,20);
        Font big_f = new Font("Arial.ttf", 0,30);

        L_first = new JLabel("First Number");
        L_first.setFont(small_f);

        first = new JTextField(18);
        first.setFont(big_f);
        first.setHorizontalAlignment(JTextField.RIGHT);
        first.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));

        L_second = new JLabel("Second Number");
        L_second.setFont(small_f);

        second = new JTextField(18);
        second.setFont(big_f);
        second.setHorizontalAlignment(JTextField.RIGHT);
        second.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));

        L_result = new JLabel("Result");
        L_result.setFont(small_f);

        result = new JTextField(18);
        result.setFont(big_f);
        result.setHorizontalAlignment(JTextField.RIGHT);
        result.setBorder(BorderFactory.createLineBorder(Color.blue, 2));
        result.setEditable(false);

        add = new JButton("Add");
        add.setPreferredSize(D_button);
        add.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        add.addActionListener(this);

        clear = new JButton("Clear");
        clear.setPreferredSize(D_button);
        clear.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        clear.addActionListener(this);

        center = new JPanel();
        center.setLayout(new FlowLayout(FlowLayout.RIGHT,72,60));
        center.setBorder(BorderFactory.createLineBorder(Color.red, 5));
        center.add(L_first);
        center.add(first);
        center.add(L_second);
        center.add(second);
        center.add(L_result);
        center.add(result);
        center.add(add);
        center.add(clear);

        left = new JPanel();
        left.setPreferredSize(D_left);

        up = new JPanel();
        up.setPreferredSize(D_side);

        down = new JPanel();
        down.setPreferredSize(D_side);

        exit = new JButton("Exit");
        exit.setPreferredSize(D_button);
        exit.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        exit.addActionListener(this);

        right = new JPanel(); // south panel
        right.setPreferredSize(D_right);
        right.setLayout( new FlowLayout(FlowLayout.RIGHT, 60, 60));
        right.add(exit);

        super.setLayout(new BorderLayout());
        super.setPreferredSize(D_frame);
        super.add(center, BorderLayout.CENTER);
        super.add(left, BorderLayout.NORTH);
        super.add(right, BorderLayout.SOUTH);
        super.add(up, BorderLayout.EAST);
        super.add(down, BorderLayout.WEST);

    }

    public void actionPerformed(ActionEvent ae)
    {
        try
        {
            if(ae.getSource() == add)
            {
                setValue(result,getValue(first) + getValue(second));
            }
            else if(ae.getSource() == clear)
            {
                clear();
            }
            else if(ae.getSource() == exit)
            {
                System.exit(0);
            }
        }
        catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(frame,
                    "Non-numeric input, please re-enter",
                    "input error",
                    JOptionPane.ERROR_MESSAGE);
            clear();
        }

    }
    private void clear()
    {
        first.setText(null);
        second.setText(null);
        result.setText(null);
    }

    private double getValue(JTextField tf)
    {
        return(Double.parseDouble(tf.getText()));
    }

    private void setValue(JTextField tf, double d)
    {
        tf.setText(Double.toString(d));
    }

}
