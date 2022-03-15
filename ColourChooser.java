import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class ColourChooser extends JFrame implements ActionListener{
    JButton button;
    JLabel label;

    ColourChooser(){
        button = new JButton("What is your favourite colour?");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button.addActionListener(this);
        this.setLayout(new FlowLayout());
        label = new JLabel();
        label.setText("COLOURS :)");
        label.setFont(new Font("MV Boli", Font.BOLD, 83));

        this.add(button);
        label.setBackground(Color.white);
        this.add(label);
        label.setOpaque(true);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            JColorChooser colorChooser = new JColorChooser();
            Color color = JColorChooser.showDialog(null, "Best colour of all time?",Color.black);
            label.setForeground(color);
            //label.setBackground(color);
        }
    }
}