package thirdPhase;

import java.awt.event.*;
import javax.swing.*;

public class ET extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	int valP = 0;
	JPanel Pan1 = new JPanel();
	JLabel T = new JLabel("ENTER THE MESSAGE YOU WANT TO ENCRYPT BELOW :");
	JLabel E = new JLabel("ENCRYPTED MESSAGE :");
	JTextArea En = new JTextArea();
	JTextArea G = new JTextArea();
	JButton Enc = new JButton("ENCRYPT");
	JButton B = new JButton("BACK");
	
	ET(){
		
		super("Encryption Terminal");
		Pan1.setLayout(null);
		add(Pan1);
		setSize(1365,740);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Prop1();
	}
	
	void  Prop1() {
		
		Pan1.add(T);
		Pan1.add(E);
		Pan1.add(En);
		Pan1.add(G);
		Pan1.add(Enc);
		Pan1.add(B);
		
		T.setBounds(10,10,400,40);
		G.setBounds(10,50,1340,250);
		E.setBounds(10,300,300,40);
		En.setBounds(10,340,1340,250);
		
		Enc.setBounds(40,620,100,25);
		Enc.addActionListener(this);
		
		B.setBounds(270,620,100,25);
		B.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent bb) {
		
		int n=0, j=0, k=0;
		
		if(bb.getSource() == Enc) {
			
			char a[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' ','.','1','2','3','4','5','6','7','8','9','0',','};
			
			String s = G.getText();
			int l = s.length(),  val = 0;
			
			System.out.println(valP+" "+val);
			
			for(int i = 0; i<100; i++) {
				val = (int) System.currentTimeMillis();
				val = val%1000;
				val = val%10 + val%100;
				if(val == valP) {
					val++;
				}
				valP = val;
				if(val>99) {
					val %= 100;
				}
				if(val<=9 || val == 0) {
					val += 10;
				}
			}
			
			System.out.println(">>"+valP+" "+val);
			
			char[] b = s.toCharArray();
			
			while(n != l){
				System.out.println(">> 1 "+val);
				
				if(k == l/2 || k == (l/2)+1){
					k++;
				}

				if(b[n] == a[j]){
					System.out.println(">> 2 "+val);

					if(l<20){
						System.out.println("ERROR!!\nMINIMUM CHARACTER LENGTH IS 20.\n");
						break;
					}else if(l == 26){
						if( j+l+val >= 65){
							int aa;
							aa = (j+l+val)%65;
							System.out.println(">> 3 "+val);
							j = aa - l - val;
							System.out.println(">>J = "+j);
						}
						b[k] = a[j+l+val];
					}else{
						if( j+l+13+val >= 65){
							System.out.println(">>J1 = "+j);
							int aa;
							aa = (j+l+13+val)%65;
							System.out.println(">> 3.1 "+val);
							j = aa - l - 13 - val;
							System.out.println(">>J = "+j);
						}
						b[k] = a[j+l+13+val];
					}
					n = n+1;
					k = k+1;
					j = -1;
				}
				j = j+1;

			}
			
			String ss = String.valueOf(b);
			En.setText(ss);
		}
		
		if(bb.getSource() == B) {
			
			new Main();
			
			dispose();
			
		}
		
	}

}