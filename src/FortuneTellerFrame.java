import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;

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
        textArea = new JTextArea("fortunes",10,40);
        textArea.setEditable(false);
        textArea.setFont(serif);
        pane = new JScrollPane(textArea);
        middle = new JPanel();
        middle.add(pane);
        mainPnl.add(middle);

        sans = new Font(Font.SANS_SERIF, Font.BOLD, 18);
        readBtn = new JButton("Read my fortune!");
        readBtn.setFont(sans);
        readBtn.addActionListener((ActionEvent ae) ->
        {});
        quitBtn = new JButton("Quit");
        quitBtn.setFont(sans);
        quitBtn.addActionListener((ActionEvent ae) ->
        {});
        bottom = new JPanel();
        bottom.add(readBtn);
        bottom.add(quitBtn);
        mainPnl.add(bottom);

        add(mainPnl);

        setTitle("Fortune Teller");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
