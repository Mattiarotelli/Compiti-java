import javax.swing.*;
import java.awt.*;


public class BorderLayout extends JFrame {
    JButton nord = new JButton("Nord");     //sono gli attributi dela classe e si creano i 4 bottoni
    JButton center = new JButton("center");
    JButton sud = new JButton("Sud");
    JButton est = new JButton("Est");
    JButton ovest = new JButton("Ovest");
    public BorderLayout(){
        super("Border layout");     //titolo finestra
        Container c = this.getContentPane();       //crea un contenitore
        c.setLayout(new java.awt.BorderLayout());
        c.add(nord, java.awt.BorderLayout.NORTH );
        c.add(center, java.awt.BorderLayout.CENTER);
        c.add(sud, java.awt.BorderLayout.SOUTH);
        c.add(est, java.awt.BorderLayout.EAST);
        c.add(ovest, java.awt.BorderLayout.WEST);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


    }

}
