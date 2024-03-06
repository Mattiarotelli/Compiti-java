

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Somma extends JFrame implements ActionListener {
    private JPanel p1 = new JPanel();
    private JPanel p2 = new JPanel();
    private JTextField add1 = new JTextField(); // Per aggiungere gli addendi
    private JTextField add2 = new JTextField();
    private JTextField tot = new JTextField();  //aggiunge il totale
    private JButton b1 =  new JButton("somma");     //aggiunge il bottone per la somma
    private JButton b2 = new JButton("cancella");   //elimina i numeri i valori inseriti

    public Somma(){
        super("somma");
        Container c = this.getContentPane();
        //crea un tabella in cui veranno inseriti i valori al primo pannello
        p1.setLayout( new GridLayout(3,1));
        add1.setBackground(Color.LIGHT_GRAY);
        //assegna un testo per gli adddendi
        p1.add(add1);
        add2.setBackground(Color.CYAN);
        //assegna un testo per gli addeendi
        p1.add(add2);
        tot.setBackground(Color.RED);
        //assegna la var tot al terzo spazio
        p1.add(tot);
        // aggiungei due bottoni per la somma nel secondo pannello
        p2.add(b1);
        p2.add(b2);
        c.setLayout(new BorderLayout());
        c.add(p1, BorderLayout.NORTH);
        c.add(p2, BorderLayout.CENTER);
        //assegna la capacità di fare qualcosa quando si verifica un interazione con questi pulsanti
        b1.addActionListener((ActionListener) this);
        b2.addActionListener((ActionListener) this);
    }
    public void actionPerformed(ActionEvent e){
        //assegna al bottone di fare delle azioni scritte nella sua etichetta
        String button = e.getActionCommand();
        double x, y;
        //se il bottone si chiama somma fai questo
        if(button.equals("somma")){
            //prova a fare questo
            try{
                String n1 = add1.getText();
                String n2 = add2.getText();
                x = Double.valueOf(n1); 
                y = Double.valueOf(n2);
                x=x+y;
                tot.setText(""+x);
            }//se non va fai questo
            catch (Exception exc){
                add1.setText("");
                add2.setText("");
            }
        }
        if(button.equals("cancella")){
            try{
                add1.setText("");
                add2.setText("");
                tot.setText("");
            }catch (Exception ignored){}
        }
    }
}
