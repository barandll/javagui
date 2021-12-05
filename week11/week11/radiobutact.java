package week11;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
  
public class radiobutact extends JFrame {
  
    
    JRadioButton jRadioButton1;
    JRadioButton jRadioButton2; 
    JRadioButton jRadioButton3;
    JRadioButton jRadioButton4;
    JButton jButton; 
    ButtonGroup G1;
    JLabel L1;
  
    public radiobutact()
    {
  
        this.setLayout(null);

        jRadioButton1 = new JRadioButton();
        jRadioButton2 = new JRadioButton();
        jRadioButton3 = new JRadioButton();
        jRadioButton4 = new JRadioButton();
        
        jButton = new JButton("Click");

        G1 = new ButtonGroup();
       
        L1 = new JLabel("Animal");

        jRadioButton1.setText("Dog");
  
        jRadioButton2.setText("Cat");

        jRadioButton3.setText("Pig");

        jRadioButton4.setText("Donkey");
  
       
        jRadioButton1.setBounds(120, 30, 80, 50);
  
        
        jRadioButton2.setBounds(250, 30, 80, 50);

        jRadioButton3.setBounds(380, 30, 80, 50);

        jRadioButton4.setBounds(510,30,80,50);
  
        jButton.setBounds(275, 90, 80, 30);

        L1.setBounds(20, 30, 150, 50);
  
        this.add(jRadioButton1);
  
        this.add(jRadioButton2);

        this.add(jRadioButton3);

        this.add(jRadioButton4);
  
        this.add(jButton);
        this.add(L1);
  
        G1.add(jRadioButton1);
        G1.add(jRadioButton2);
        G1.add(jRadioButton3);
        G1.add(jRadioButton4);
  
      
        jButton.addActionListener(new ActionListener() {
            
  
            public void actionPerformed(ActionEvent e)
            {
               
                String says = " ";
                String Animal = ""; 
  
                
                if (jRadioButton1.isSelected()) {
  
                    says = "Woof Woof";
                    Animal = "Dog Says";
                }
  
                else if (jRadioButton2.isSelected()) {
  
                    says = "Meow";
                    Animal = "Cat Says";
                }
                else if(jRadioButton3.isSelected()){

                    says = "Oink Oink";
                    Animal = "Pig Says";
                }
                else if(jRadioButton4.isSelected()){

                    says = "Ai Ai Ai";
                    Animal = "Donkey Says";
                }
                else {
  
                    says = "NO Button selected";
                }
  
                
                JOptionPane.showMessageDialog(radiobutact.this, says,Animal,JOptionPane.INFORMATION_MESSAGE);
                
            }
        });
    }
}
  
class RadioButton {
    
    public static void main(String args[])
    { 
        radiobutact gui = new radiobutact();
        gui.setSize(600, 200);
        gui.setTitle("RadioButtons");
        gui.setVisible(true);
    }
}