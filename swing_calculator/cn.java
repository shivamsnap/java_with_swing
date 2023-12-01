import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class myFrame1 extends JFrame implements ActionListener {
    private JTextField inputField1;
    private JTextField inputField2;
    private JButton myButton;
    private JTextField result;

    public myFrame1(){
        setTitle("Calculator");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        inputField1 = new JTextField(10);
        inputField2 = new JTextField(10);
        myButton = new JButton("Calculate");
        result = new JTextField(10);

        result.setEditable(false);

        add(inputField1);
        add(inputField2);
        add(myButton);
        add(result);

        myButton.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        try{
            String s1 = inputField1.getText();
            Double d1 = Double.parseDouble(s1);

            String s2 = inputField2.getText();
            Double d2 = Double.parseDouble(s2);
            Double resul = d1 + d2;

            result.setText(resul.toString());
        }
        catch(NumberFormatException ex){
            result.setText("Invalid input");
        }
    }
}
public class cn{
    public static void main(String[] args){
        myFrame1 mf = new myFrame1();
        mf.setVisible(true);
    }
}