import javax.swing.JOptionPane;

public class SolveEquations {

	public static void main(String[] args) {
		String strMode;
		int mode;
		strMode = JOptionPane.showInputDialog(null, 
				"Please input mode number (1: first-degree, 2: system of first-degree,"
				+ " 3: second-degree) : ","Choose mode",
				JOptionPane.INFORMATION_MESSAGE);
		mode = Integer.parseInt(strMode);
		
		if (mode==1) {
			String strA,strB;
			double a,b;
			String strNotification = "";
			
			strA = JOptionPane.showInputDialog(null, 
					"Please input a: ","Input a",
					JOptionPane.INFORMATION_MESSAGE);
			a = Double.parseDouble(strA);
			
			strB = JOptionPane.showInputDialog(null, 
					"Please input b: ","Input b",
					JOptionPane.INFORMATION_MESSAGE);
			b = Double.parseDouble(strB);
			
			if (a==0) {
				if (b==0) strNotification = "Infinite solutions";
				else strNotification = "No solutions";
			}
			else strNotification = "One solution: x = " + (-b/a);
			
			JOptionPane.showMessageDialog(null, strNotification,
					"Show Result", JOptionPane.INFORMATION_MESSAGE);
		}
		else if (mode==2) {
			String strA11,strA12,strB1,strA21,strA22,strB2;
			double a11,a12,b1,a21,a22,b2;
			String strNotification = "";
			
			strA11 = JOptionPane.showInputDialog(null, 
					"Please input a11: ","Input a11",
					JOptionPane.INFORMATION_MESSAGE);
			a11 = Double.parseDouble(strA11);
			
			strA12 = JOptionPane.showInputDialog(null, 
					"Please input a12: ","Input a12",
					JOptionPane.INFORMATION_MESSAGE);
			a12 = Double.parseDouble(strA12);
			
			strB1 = JOptionPane.showInputDialog(null, 
					"Please input b1: ","Input b1",
					JOptionPane.INFORMATION_MESSAGE);
			b1 = Double.parseDouble(strB1);
			
			strA21 = JOptionPane.showInputDialog(null, 
					"Please input a21: ","Input a21",
					JOptionPane.INFORMATION_MESSAGE);
			a21 = Double.parseDouble(strA21);
			
			strA22 = JOptionPane.showInputDialog(null, 
					"Please input a22: ","Input a22",
					JOptionPane.INFORMATION_MESSAGE);
			a22 = Double.parseDouble(strA22);
			
			strB2 = JOptionPane.showInputDialog(null, 
					"Please input b2: ","Input b2",
					JOptionPane.INFORMATION_MESSAGE);
			b2 = Double.parseDouble(strB2);
			
			double D = a11*a22-a21*a12;
			double D1 = b1*a22-b2*a12;
			double D2 = a11*b2-a21*b1;
			
			if (D!=0) strNotification += "One solution: x = " + D1/D + " and y = " + D2/D;
			else if (D1==0&&D2==0) strNotification += "Infinite solutions";
			else strNotification += "No solutions";
			
			JOptionPane.showMessageDialog(null, strNotification,
					"Show Result", JOptionPane.INFORMATION_MESSAGE);
		}
		else if (mode==3) {
			String strA,strB,strC;
			double a,b,c;
			String strNotification = "";
			
			strA = JOptionPane.showInputDialog(null, 
					"Please input a: ","Input a",
					JOptionPane.INFORMATION_MESSAGE);
			a = Double.parseDouble(strA);
			
			strB = JOptionPane.showInputDialog(null, 
					"Please input b: ","Input b",
					JOptionPane.INFORMATION_MESSAGE);
			b = Double.parseDouble(strB);
			
			strC = JOptionPane.showInputDialog(null, 
					"Please input c: ","Input c",
					JOptionPane.INFORMATION_MESSAGE);
			c = Double.parseDouble(strC);
			
			if (a==0) {
				if (b==0) {
					if (c==0) strNotification = "Infinite solutions";
					else strNotification = "No solutions";
				}
				else strNotification = "One solution: x = " + (-c/b);
			}
			else {
				double D=b*b-4*a*c;
				if (D<0) strNotification = "No solutions";
				else {
					double sD=Math.sqrt(D);
					if (sD==0) strNotification = "One solution: x = " + (-b/2/a);
					else strNotification = "Two solutions: x = " + (-b-sD)/2/a 
							+ " and x = " + (-b+sD)/2/a;
				}
			}
			JOptionPane.showMessageDialog(null, strNotification,
					"Show Result", JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null, "Invalid mode number", "Error", 0);
		}
	}

}
