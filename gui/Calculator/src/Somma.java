

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Somma extends JFrame {
    private JPanel p1 = new JPanel();
    private JPanel p2 = new JPanel();
    private JTextField add1 = new JTextField(); // Per aggiungere gli addendo
    private JTextField add2 = new JTextField();
    private JTextField tot = new JTextField();  //aggiunge il totale
    private JButton b1 =  new JButton("somma");
    private JButton b2 = new JButton("cancella");

    public Somma(){
        super("somma");
        Container c = this.getContentPane();
        p1.setLayout( new GridLayout(3,1));
        p1.add(new Label("primo addendo", Label.RIGHT));
        add1.setBackground(Color.LIGHT_GRAY);
        p1.add(add1);

        p1.add(new Label("secondo addendo", Label.RIGHT));
        add2.setBackground(Color.CYAN);
        p1.add(add2);
        p1.add(new Label("somma: ", Label.RIGHT));
        tot.setBackground(Color.RED);
        p1.add(tot);
        p2.add(b1);
        p2.add(b2);
        c.setLayout(new BorderLayout());
        c.add(p1, BorderLayout.NORTH);
        c.add(p2, BorderLayout.CENTER);
        b1.addActionListener((ActionListener) this);
        b2.addActionListener((ActionListener) this);
    }
    public void actionPerformed(ActionEvent e){
        String button = e.getActionCommand();
        double x, y;
        if(button.equals("somma")){
            try{
                String n1 = add1.getText();
                String n2 = add2.getText();
                x = Double.valueOf(n1).doubleValue();
                y = Double.valueOf(n2).doubleValue();
                x+=y;
                tot.setText(""+x);
            }catch (Exception exc){
                add1.setText("");
                add2.setText("");
            }
        }
        if(button.equals("cancella")){
            try{
                add1.setText("");
                add2.setText("");
                tot.setText("");
            }catch (Exception exc){}
        }
    }
}
