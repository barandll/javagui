package week11;

import java.awt.*;
import java.awt.font.*;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.util.Map;
import javax.swing.*;

public class jcheckbox extends JFrame implements ItemListener{

    private JLabel tag;
    private JCheckBox kalın;
    private JCheckBox yatık;
    private JCheckBox altcizgi;
    private JCheckBox ustcizgi;
    private Font org;

    public jcheckbox(){

        setLayout(new GridLayout(1,5));

        tag = new JLabel("Message",SwingConstants.CENTER);
        tag.setFont(org);
        add(tag);
        
        kalın = new JCheckBox("Bold");
        add(kalın);
        kalın.addItemListener(this);

        yatık = new JCheckBox("Posture");
        add(yatık);
        yatık.addItemListener(this);

        altcizgi = new JCheckBox("Underline");
        add(altcizgi);
        altcizgi.addItemListener(this);

        ustcizgi = new JCheckBox("Strikethrough");
        add(ustcizgi);
        ustcizgi.addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {

        Font fnt = tag.getFont();
        Map atribute = fnt.getAttributes();

        if(ie.getItemSelectable() == kalın){
            if(kalın.isSelected()){
            atribute.put(TextAttribute.WEIGHT,TextAttribute.WEIGHT.WEIGHT_BOLD);
            fnt = fnt.deriveFont(atribute);
            tag.setFont(fnt);
          }else{
            atribute.put(TextAttribute.WEIGHT, TextAttribute.WEIGHT_REGULAR);
            fnt = fnt.deriveFont(atribute);
            tag.setFont(fnt);
          }

    }else if(ie.getItemSelectable() == yatık){
        if(yatık.isSelected()){
            atribute.put(TextAttribute.POSTURE,TextAttribute.POSTURE_OBLIQUE);
            fnt = fnt.deriveFont(atribute);
            tag.setFont(fnt);
        }else{
            atribute.put(TextAttribute.POSTURE,TextAttribute.POSTURE_REGULAR);
            fnt = fnt.deriveFont(atribute);
            tag.setFont(fnt);
        }

    }else if(ie.getItemSelectable() == altcizgi){
        if(altcizgi.isSelected()){
            atribute.put(TextAttribute.UNDERLINE,TextAttribute.UNDERLINE_ON);
            fnt = fnt.deriveFont(atribute);
            tag.setFont(fnt);
        }else{
            atribute.put(TextAttribute.UNDERLINE,-1);
            fnt = fnt.deriveFont(atribute);
            tag.setFont(fnt);
        }

    }else if(ie.getItemSelectable() == ustcizgi){
        if(ustcizgi.isSelected()){
            atribute.put(TextAttribute.STRIKETHROUGH,TextAttribute.STRIKETHROUGH_ON);
            fnt = fnt.deriveFont(atribute);
            tag.setFont(fnt);
        }else{
            atribute.put(TextAttribute.STRIKETHROUGH,-1);
            fnt = fnt.deriveFont(atribute);
            tag.setFont(fnt);
        }

   }

}  
    public static void main(String[] args) {
        
        jcheckbox gui = new jcheckbox();
        gui.setVisible(true);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(600,200);
        gui.setTitle("Chekcbox Program");
    }
    
}
