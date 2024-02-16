import  javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame  {
    public MyFrame(){       //costruttore della classe myFrame
        super("Grid layout");   //titolo della finestra
        Container c = this.getContentPane();        //crea una un nuovo contenitore per inseritr degli oggetti;
        c.setLayout(new GridLayout(4,4)); // imposta un layout alla finestra, in questo caso a griglia;
        for(int i = 0; i <= 15; i++){   //for per creare più bottoni;
            c.add(new JButton(String.valueOf(i)));  //aggiunge alla griglia un nuovo bottone con dentro un valore int trasformato in string
        }
        pack();    //adatta la finestra ai componenti inseriti;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //quando la finestra viene chiusa e chiuso anche il processo;
        setVisible(true);

    }
}
