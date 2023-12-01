import javax.swing.*;
//import javax.swing.JFrame;
//import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 class myFrame extends JFrame implements ActionListener {
    private JButton button;
    public myFrame(){
        setTitle(" Button Example");
        setSize(200, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button = new JButton("Click Me");
        add(button);
        button.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        System.out.println("Button clicked");
    }
}
public class SwingApplication{
    public static void main(String[] args){
        myFrame frame = new myFrame();
        frame.setVisible(true);
    }
}
