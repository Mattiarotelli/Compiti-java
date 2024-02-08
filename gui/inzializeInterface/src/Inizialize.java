import javax.swing.*;
import java.awt.*;

public class Inizialize {
    public static void main(String[] args){
        JFrame win = new JFrame("Prima finestra");      //create the window
        Container c = win.getContentPane();
        c.add(new JLabel("Buona lezione") );    //add a text
        win.setSize(400, 500);      //set the dimension of the window
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     //close the process when we close the window
        win.setVisible(true);   //to visualize the window



    }
}