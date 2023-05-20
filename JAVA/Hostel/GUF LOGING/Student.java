import javax.swing.*;    


public class Student extends JFrame
{
    ImageIcon img;
	
	JPanel panel;
	JButton viewBtn,resultBtn,noticeBtn,sBtn,paymentBtn,s2Btn,lBtn,bBtn; 
	public Student()
	{
		super("Student");
		this.setSize(800, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setLayout(null);
		JLabel background;
		
		viewBtn = new JButton("View Profile");
		viewBtn.setBounds(700, 220, 220, 30);
		
		panel.add(viewBtn);
		
		
		resultBtn = new JButton("Result");
		resultBtn.setBounds(700, 270, 220, 30);
		
		panel.add(resultBtn);
		
		noticeBtn = new JButton("Notice");
		noticeBtn.setBounds(700, 320, 220, 30);
		
		panel.add(noticeBtn);
		
		sBtn = new JButton("Class Schedule");
		sBtn.setBounds(700, 370, 220, 30);
		
		panel.add(sBtn);
		
		paymentBtn = new JButton("Payment");
		paymentBtn.setBounds(700, 420, 220, 30);
		
		panel.add(paymentBtn);
		
		
		lBtn = new JButton("Logout");
		lBtn.setBounds(1400, 30, 80, 30);
		
		panel.add(lBtn);
		
		bBtn = new JButton("Back");
		bBtn.setBounds(30, 750, 80, 30);
		
		panel.add(bBtn);
		
		background = new JLabel(" ",img,JLabel.CENTER);
		background.setBounds(200,45,1200,700);
		add(background);
		
		this.add(panel);
	}
	public static void main(String[] args)
	{
		new Student();
	}
}