package week11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class guitogglebutton extends JFrame{

    JToggleButton Tbtn;
    JPanel Top;
    JFrame frame;

    public guitogglebutton(){

        setLayout(new GridLayout(1,1));
        Container pane = this.getContentPane();

        JPanel top = new JPanel();
        top.setLayout(new GridLayout(1,1));

        Tbtn = new JToggleButton("Toggle");
        top.add(Tbtn);
        pane.add(top);

        event e = new event();
        Tbtn.addActionListener(e);


    }

    public class event implements ActionListener{

        public void actionPerformed(ActionEvent e){

            String option = e.getActionCommand();

            if(Tbtn.isSelected()){

                frame = new JFrame();
                JOptionPane.showMessageDialog(frame,"Selected");


            }else{

                frame = new JFrame();
                JOptionPane.showMessageDialog(frame,"Unselected");
            }
        }
    }

    public static void main(String[] args) {
        
        guitogglebutton gui = new guitogglebutton();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.setSize(300,150);
        gui.setTitle("Toggle program");
    }
}