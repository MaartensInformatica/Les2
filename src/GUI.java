import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {

    JTextField field1;                             // Declaratie TextField
    JButton button1;                               // Declaratie Button
    JPanel panel;


    public static void main(String[] args) {
        GUI frame = new GUI();
        frame.setSize(400, 400);
        frame.createGUI();
        frame.setVisible(true);


    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setBackground(Color.CYAN);
        window.setLayout(new FlowLayout());
        field1 = new JTextField("onzin");           // initialisatie van TextField
        window.add(field1);                         // Toevoegen van TextField
        button1 = new JButton("Klik op mij");  // initialisatie van Button
        button1.addActionListener(this);          // Koppelen van button aan actie
        window.add(button1);                        // initialisatie van Button
        panel = new JPanel();                       // initialisatie van Panel
        panel.setPreferredSize(new Dimension(300, 300));
        panel.setBackground(Color.GREEN);
        window.add(panel);

    }
    @Override
    public void actionPerformed(ActionEvent e){
        Graphics paper = panel.getGraphics();
        paper.setColor(Color.red);
        paper.drawOval(100, 100, 50, 50);
        paper.setColor(Color.PINK);
        paper.fillOval(200, 200, 70, 70);

        field1.setText("Hello world");
        field1.setBackground(Color.yellow);
        button1.setBackground(Color.blue);

    }
}
//test