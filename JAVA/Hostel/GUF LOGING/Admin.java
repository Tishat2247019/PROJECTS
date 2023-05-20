import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;  
import java.awt.event.ItemListener;
public class Admin extends JFrame implements ItemListener {
	
	JLabel h;
	private static JDialog d;
	
	private JToggleButton button;
	private Object b1;  
    
	Admin() { 
		 
    setTitle("Premium Alcazaba Hostel"); 
    setLayout(null); 
	h =new JLabel("Premium Alcazaba Hostel");
	h.setBounds(225,50,400,100);
	h.setFont(new Font("Arial", Font.PLAIN, 24));		
	add(h);
	
	setJToggleButton();  
    setAction();
		
		
		
	JButton b1 = new JButton("New Profile");  
	b1.setBounds(300, 250, 220, 50); 
	
	JButton b2 = new JButton("Empoloy"); 
	b2.setBounds(300, 330, 220, 50); 
	JButton b3 = new JButton("Student"); 
	//b3.setColor(Color.white);
	b3.setBounds(300, 410, 220, 50); 
	JButton b4 = new JButton("Room");
    b4.setBounds(300, 490, 220, 50); 	
	JButton b5 = new JButton("Logout");
    b5.setBounds(480, 20, 120, 30); 	
	
	add(b1); add(b2); add(b3); add(b4); add(b5);
	
	JButton btn=new JButton(new ImageIcon("hostelLog.png"));    
    btn.setBounds(20,20,180, 180); 
	add(btn);
	
	setSize(800, 700);  
    setVisible(true);
	Image icon = Toolkit.getDefaultToolkit().getImage("hostel-sign-.jpg");
	setIconImage(icon);
		
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);}
	
	private void setJToggleButton() {  
        button = new JToggleButton("evsjv"); 
		button.setBounds(630,20,100,30);
		button.setFont(new Font("SutonnyMJ", Font.PLAIN, 20));
        add(button);  
    }  
    private void setAction() {  
        button.addItemListener(this);  
    }  
    public void itemStateChanged(ItemEvent eve) {  
        if (button.isSelected()){  
            button.setText("English");  
		button.setFont(new Font("Arial", Font.PLAIN, 14));}
        else  {
            button.setText("evsjv"); 
		button.setFont(new Font("SutonnyMJ", Font.PLAIN, 20));}			
    }  

	

	public static void main(String[] args) {
			new Admin();
		 }   
	
	}
      
	
	
	
    