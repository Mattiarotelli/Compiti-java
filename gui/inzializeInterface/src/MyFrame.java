import javax.swing.*;
import java.awt.*;
public class MyFrame extends JFrame {
    JLabel jl=  new JLabel("Buona lezione");
    MyFrame(){
        super("Prima finestra");
        Container c = this.getContentPane();
        c.add(jl);
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
