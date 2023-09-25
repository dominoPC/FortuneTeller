import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class FortuneTellerFrame extends JFrame{
    JPanel mainPnl;
    ImageIcon ball;
    JLabel imageLbl;
    Font mono;
    JScrollPane pane;
    JTextArea textArea;
    JPanel top;
    JPanel middle;
    JPanel bottom;
    Font serif;
    Font sans;
    JButton readBtn;
    JButton quitBtn;
    String[] fortunes = {"You look upside-down through this thing","I forsee a restaurant disaster","You will forget why you entered a room","I see great success in fishing","You will meet your doppelgaenger","30% chance of scattered showers today","Your sense of smell will reward you","ERROR 404: Lucky number not found","You will close this window","You will read this fortune","History will repeat itself","Someone you know will tell you hello"};
    short i = 12;
    public FortuneTellerFrame() {

        mainPnl = new JPanel();
        mainPnl.setLayout(new GridLayout(3,1));
        ball = new ImageIcon(".\\src\\ball.jpg");
        imageLbl = new JLabel("Fortune Telling",ball,SwingConstants.CENTER);
        mono = new Font(Font.MONOSPACED, Font.PLAIN, 36);
        imageLbl.setFont(mono);
        top = new JPanel();
        top.add(imageLbl);
        mainPnl.add(top);


        serif = new Font(Font.SERIF, Font.PLAIN, 18);
        textArea = new JTextArea("",10,45);
        textArea.setEditable(false);
        textArea.setFont(serif);
        pane = new JScrollPane(textArea);
        middle = new JPanel();
        middle.add(pane);
        mainPnl.add(middle);

        sans = new Font(Font.SANS_SERIF, Font.BOLD, 18);
        readBtn = new JButton("Read my fortune!");
        readBtn.setFont(sans);
        readBtn.addActionListener((ActionEvent ae) -> {
            if(i==12){ //first time through just pick a random fortune
                i = (short)(Math.random()*12);
                textArea.append(fortunes[i]);
            }
            else { //pick a fortune 0-10 and if it's the same or higher than the last one, add 1
                short j = (short)(Math.random()*11);
                if(j>=i){j++;}
                i=j;
                textArea.append("\n"+fortunes[i]);
            }
        });
        quitBtn = new JButton("Quit");
        quitBtn.setFont(sans);
        quitBtn.addActionListener((ActionEvent ae) -> {System.exit(0);});
        bottom = new JPanel();
        bottom.add(readBtn);
        bottom.add(quitBtn);
        mainPnl.add(bottom);

        add(mainPnl);

        setTitle("Fortune Teller");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
