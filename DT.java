package thirdPhase;

import java.awt.event.*;
import javax.swing.*;

public class DT extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	JPanel Pan2 = new JPanel();
	JLabel T = new JLabel("ENTER THE ENCRYPTED MESSAGE YOU WANT TO DECRYPT BELOW :");
	JLabel D = new JLabel("DECRYPTED MESSAGE :");
	JTextArea G = new JTextArea();
	JTextArea En = new JTextArea();
	JButton Dec = new JButton("DECRYPT");
	JButton B = new JButton("BACK");
	
	DT(){
		
		super("Decryption Terminal");
		Pan2.setLayout(null);
		add(Pan2);
		setSize(1365,740);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Prop1();
	}
	
	void  Prop1() {
		
		Pan2.add(T);
		Pan2.add(D);
		Pan2.add(En);
		Pan2.add(G);
		Pan2.add(Dec);
		Pan2.add(B);
		
		T.setBounds(10,10,400,40);
		En.setBounds(10,50,1340,250);
		D.setBounds(10,300,300,40);
		G.setBounds(10,340,1340,250);
				
		Dec.setBounds(40,620,100,25);
		Dec.addActionListener(this);
		
		B.setBounds(270,620,100,25);
		B.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent cc) {
	
		int n=0, j=0, k=0;
		
		if(cc.getSource() == Dec) {
			
			char a[] = {',','0','9','8','7','6','5','4','3','2','1','.',' ','z','y','x','w','v','u','t','s','r','q','p','o','n','m','l','k','j','i','h','g','f','e','d','c','b','a','Z','Y','X','W','V','U','T','S','R','Q','P','O','N','M','L','K','J','I','H','G','F','E','D','C','B','A'};

			String s = En.getText();
			int l = s.length();
			char[] b = s.toCharArray();
			
			while(n != l){


				if(b[n] == a[j]){

					if(l < 7 ){

						if( j+l+13 > 65){
								int aa;
								aa = (j+l+13)%65;
								j = aa - l - 13;
							}
						b[k] = a[j+l+13];

					}else if(l == 26){

							if( j+l+1 > 65){
								int aa;
								aa = (j+l+1)%65;
								j = aa - l - 1;
							}
							b[k] = a[j+l+1];
					}else{
							if( j+l+1 > 65){
								int aa;
								aa = (j+l)%65;
								j = aa - l;
											}
							b[k] = a[j+l];
					}
							n = n+1;
							k = k+1;
							j = -1;

						}
						j = j+1;

			}
			
			String ss = String.valueOf(b);
			G.setText(ss);
			
		}
		
		if(cc.getSource() == B) {
			
			new Main();
			
			dispose();
			
		}
		
	}

}

