package thirdPhase;

import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	JPanel Pan = new JPanel();
	JLabel First = new JLabel("Welcome to Encryption & Decryption Terminal");
	JLabel Second = new JLabel("1. Encryption Terminal.");
	JLabel Third = new JLabel("2. Decryption Terminal.");
	JLabel Fourt = new JLabel("3. Exit.");
	JButton S = new JButton("Enter"); 
	JButton T = new JButton("Enter");
	JButton F = new JButton("Exit");
	
	Main(){
		
		super("CRYPTOGRAPHY");
		Pan.setLayout(null);
		add(Pan);
		setLocation(500,200);
		setSize(290,220);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Prop();
		
	}
	
	void Prop() {
		
		Pan.add(First);
		Pan.add(Second);
		Pan.add(Third);
		Pan.add(Fourt);
		Pan.add(S);
		Pan.add(T);
		Pan.add(F);
		
		First.setBounds(10,10,800,30);
		Second.setBounds(20,70,500,25);
		Third.setBounds(20,100,500,25);
		Fourt.setBounds(20,130,300,25);
		
		S.setBounds(190,70,70,25);
		S.addActionListener(this);
		S.setToolTipText("Enter Encryption Terminal");
		
		T.setBounds(190,100,70,25);
		T.addActionListener(this);
		T.setToolTipText("Enter Decryption Terminal");
		
		F.setBounds(190,130,70,25);
		F.addActionListener(this);
		F.setToolTipText("Exit E&D Terminal");
		
	}
	
	public static void main(String[] args) {
		
		new Main();
		
	}

	public void actionPerformed(ActionEvent a) {

		
		if(a.getSource() == S) {
			
			new ET();
			dispose();
			
		}else if(a.getSource() == T) {
			
			new DT();
			dispose();
			
		}else if(a.getSource() == F) {
			
			dispose();
			
		}
	}

}
