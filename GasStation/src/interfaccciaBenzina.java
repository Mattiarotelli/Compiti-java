import javax.swing.*;
import java.awt.*;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class interfaccciaBenzina extends JFrame implements ActionListener {
    private distributoreBenzina b;
    private JPanel PanelloInfo = new JPanel();
    private JPanel InserireSezione = new JPanel();
    private JPanel SezioneBottoni = new JPanel();
    private JPanel primoPiano = new JPanel();
    private JPanel secondoPiano = new JPanel();
    private JTextField depositoPrint = new JTextField(10);
    private JTextField prezzoPrint = new JTextField(10);
    private JTextField inserire = new JTextField(10);
    private JButton Vendi = new JButton("Fai Benzina");
    private JButton Rifornimento = new JButton("Rifornisci pompa");
    private JButton Aggiornamento = new JButton("Cambia prezzo a litro");

    public interfaccciaBenzina(double prezzoLitro) {
        super("Finestra Benzina");

        // crea un oggetto distributore
        b = new distributoreBenzina(prezzoLitro);
        // crea Container
        Container c = this.getContentPane();
        // set Border
        PanelloInfo.setLayout(new GridLayout(1,2));
        PanelloInfo.add(depositoPrint);
        PanelloInfo.add(prezzoPrint);

        // deposito section
        depositoPrint.setText(String.valueOf(b.getDeposito()));
        depositoPrint.setEditable(false);


        // prezzoPerLitro section
        prezzoPrint.setText(String.valueOf(prezzoLitro));
        prezzoPrint.setEditable(false);

        InserireSezione.setLayout(new BorderLayout());

        InserireSezione.add(inserire, BorderLayout.CENTER);

        primoPiano.setLayout(new GridLayout(1, 2));
        primoPiano.add(Rifornimento);
        primoPiano.add(Vendi);

        secondoPiano.setLayout(new BorderLayout());
        secondoPiano.add(Aggiornamento, BorderLayout.CENTER);

        SezioneBottoni.setLayout(new GridLayout(2, 1));
        SezioneBottoni.add(primoPiano);
        SezioneBottoni.add(secondoPiano);

        c.setLayout(new BorderLayout());
        c.add(PanelloInfo, BorderLayout.NORTH);
        c.add(InserireSezione, BorderLayout.CENTER);
        c.add(SezioneBottoni, BorderLayout.SOUTH);

        Vendi.addActionListener((ActionListener) this);
        Rifornimento.addActionListener((ActionListener) this);
        Aggiornamento.addActionListener((ActionListener) this);

    }
    public void actionPerformed(ActionEvent e) {
        String button = e.getActionCommand();
        if (button.equals("Fai Benzina")) {
            b.vendi(Double.valueOf(inserire.getText()));
            depositoPrint.setText(String.valueOf(b.getDeposito()));
        } else if (button.equals("Rifornisci pompa")) {
            b.rifornisci(Double.valueOf(inserire.getText()));
            depositoPrint.setText(String.valueOf(b.getDeposito()));
        } else {
            b.aggiorna(Double.valueOf(inserire.getText()));
            prezzoPrint.setText(String.valueOf(b.getPrezzoPerLitro()));

        }

    }

}
