package week11;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.*;

public class guiweek301 extends JFrame implements ActionListener {
	
	private ImageIcon img;
    private JButton btn;
    private JButton btn2;
    
    private ImageIcon ImageIconReturn(String str){ 
    	
      return new ImageIcon(guiweek301.class.getResource(str));	
    	
    }

    
    public guiweek301(){
    	
        setLayout(new FlowLayout(FlowLayout.LEFT));
        btn= new JButton("Activate other",ImageIconReturn("image/image.png"));
        btn.setMnemonic(KeyEvent.VK_D);
        btn.setActionCommand("btn1");
        btn.setToolTipText("Activates other");
        btn.addActionListener(this);

        btn2 = new JButton("Activate other",ImageIconReturn("image/image.png"));
        btn2.addActionListener(this);
        btn2.setMnemonic(KeyEvent.VK_D);
        btn2.setActionCommand("btn2");
        btn2.setToolTipText("Activates other");
        btn2.setEnabled(false);
        setTitle("button activation ");
        add(btn);
        add(btn2);
        setSize(200,200);
        setVisible(true);

    }

    public static void main(String[] args) {
        
        JFrame gui = new guiweek301();
    }

    public void actionPerformed(ActionEvent e){

        if("btn1".equals(e.getActionCommand())){
            btn.setEnabled(false);
            btn2.setEnabled(true);

            getRootPane().setDefaultButton(btn2);

        }else if("btn2".equals((e.getActionCommand()))){
            btn.setEnabled(true);
            btn2.setEnabled(false);
        }
    }
    

}
