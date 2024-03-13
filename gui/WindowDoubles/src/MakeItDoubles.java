import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MakeItDoubles extends JFrame implements ActionListener{
    private JPanel p1 = new JPanel();
    private JPanel inp = new JPanel();
    private JPanel out = new JPanel();
    private JButton radd = new JButton("Raddoppia");
    private JTextField num = new JTextField(10);
    private JTextField res = new JTextField(10);
    public MakeItDoubles(){
        super("raddopia");
        Container c = this.getContentPane();

        //setta i colori di sfondo dei segmenti di input
        num.setBackground(Color.GREEN);
        res.setBackground(Color.YELLOW);

        //imposta il layout a griglia
        p1.setLayout( new GridLayout(3,1));

        //aggiunge gli elementi al pannello inp
        inp.add(new Label("numero "));
        inp.add(num);

        //aggiunge gli elementi a out
        out.add(new Label("risultato"));
        out.add(res);

        //aggiunge gli elementi al pannello principale
        p1.add(inp);
        p1.add(radd);
        p1.add(out);

        //aggiunge il pannello al contenitore
        c.add(p1);

        //Aggiunge un actionListener
        radd.addActionListener((ActionListener) this);
    }
    //cosa fare se viene premuto il bottone
    public void actionPerformed(ActionEvent e){
        int x;
        x = Integer.parseInt(num.getText());    //converte il da String a int
        x = x * 2;
        res.setText(""+x);      //il testo viene inserito nell' casella del risultato
    }


}
