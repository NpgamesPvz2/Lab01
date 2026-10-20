import javax.swing.JOptionPane;

public class DoubleNumOps {

	public static void main(String[] args) {
		String strNum1,strNum2,strMode;
		double num1,num2;
		String strNotification = "Operation: ";
		
		strNum1 = JOptionPane.showInputDialog(null, 
				"Please input the first number: ","Input the first number",
				JOptionPane.INFORMATION_MESSAGE);
		num1 = Double.parseDouble(strNum1);
		
		strNum2 = JOptionPane.showInputDialog(null, 
				"Please input the second number: ","Input the second number",
				JOptionPane.INFORMATION_MESSAGE);
		num2 = Double.parseDouble(strNum2);
		
		strMode = JOptionPane.showInputDialog(null, 
				"Please input the symbol (+,-,*,/): ","Choose an operation",
				JOptionPane.INFORMATION_MESSAGE);
		
		strNotification += strNum1 + " " + strMode + " " + strNum2 + " = ";
		
		double result = 0;
		if (strMode.equals("+")) result = num1 + num2;
		else if (strMode.equals("-")) result = num1 - num2;
		else if (strMode.equals("*")) result = num1 * num2;
		else if (strMode.equals("/"))  {
			if (num2 != 0) result = num1 / num2;
			else {
				JOptionPane.showMessageDialog(null,"Can't divide by zero",
					"Error", 0);
				System.exit(0);
			}
		}
		else {
			JOptionPane.showMessageDialog(null,"Invalid symbol",
				"Error", 0);
			System.exit(0);
		}
		JOptionPane.showMessageDialog(null, strNotification + result,
			"Show Result", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}

}
