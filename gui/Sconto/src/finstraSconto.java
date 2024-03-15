import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class finstraSconto extends JFrame implements ActionListener {
    private JPanel sconti = new JPanel();

    private JPanel inp = new JPanel();
    private JPanel inp2 = new JPanel();
    private JPanel out = new JPanel();

    private JTextField prezzIns = new JTextField(10);
    private JTextField scontoDaAppl = new JTextField(10);
    private JTextField prezzScont = new JTextField(10);
    private JLabel etichettaPrezzo = new JLabel("Prezzo da Scontare");
    private JLabel etichettaSconto = new JLabel("Sconto da Applicare");
    private JLabel etichettaRis = new JLabel("Prezzo Scontato");
    private JButton pulsanteSconto = new JButton("Applica Sconto");

    public finstraSconto(){
        super("Applicazione Sconto");
        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        sconti.setLayout(new GridLayout(3,1));

        prezzIns.setBackground(Color.GREEN);
        scontoDaAppl.setBackground(Color.blue);
        prezzScont.setBackground(Color.CYAN);

        inp.add(etichettaPrezzo);
        inp.add(prezzIns);

        inp2.add(etichettaSconto);
        inp2.add(scontoDaAppl);

        out.add(etichettaRis);
        out.add(prezzScont);

        sconti.add(inp);
        sconti.add(inp2);
        sconti.add(out);

        pulsanteSconto.setBackground(Color.RED);

        c.add(sconti, BorderLayout.NORTH);
        c.add(pulsanteSconto, BorderLayout.CENTER);

        pulsanteSconto.addActionListener((ActionListener) this);
    }

    public void actionPerformed(ActionEvent e ){
        double x, y;
        String n, scont;
        n = prezzIns.getText();
        scont = scontoDaAppl.getText();
        x = Double.parseDouble(n);
        y = Double.parseDouble(scont);
        x = x - (x/100 * y);
        prezzScont.setText(""+ x);
    }

}
