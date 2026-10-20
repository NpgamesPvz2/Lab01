import java.util.Scanner;

public class DisplayNumberOfDaysOfMonth {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int year=0;
		while (true) {
			System.out.print("Enter year" + ((year==0)?": ":" again: "));
			String strYear = keyboard.nextLine();
			boolean isNumeric = true;
			for (int i=0;i<strYear.length();++i) 
				if (!Character.isDigit(strYear.charAt(i))) {
					isNumeric = false;
					break;
				}
			if (isNumeric) {
				year = Integer.parseInt(strYear);
				break;
			}
			else year = -1;
		}
		
		int day=0;
		while (true) {
			System.out.print("Enter month" + ((day==0)?": ":" again: "));
			String strMonth = keyboard.nextLine();
			if (strMonth.equals("January")||strMonth.equals("Jan.")||
					strMonth.equals("Jan")||strMonth.equals("1")) day=31;
			if (strMonth.equals("February")||strMonth.equals("Feb.")||
					strMonth.equals("Feb")||strMonth.equals("2")) {
				if (year%4==0&&year%100!=0) day=29;
				else day=28;
			}
			if (strMonth.equals("March")||strMonth.equals("Mar.")||
					strMonth.equals("Mar")||strMonth.equals("3")) day=31;
			if (strMonth.equals("April")||strMonth.equals("Apr.")||
					strMonth.equals("Apr")||strMonth.equals("4")) day=30;
			if (strMonth.equals("May")||strMonth.equals("May.")||
					strMonth.equals("5")) day=31;
			if (strMonth.equals("June")||strMonth.equals("Jun")||
					strMonth.equals("6")) day=30;
			if (strMonth.equals("July")||strMonth.equals("Jul")||
					strMonth.equals("7")) day=31;
			if (strMonth.equals("August")||strMonth.equals("Aug.")||
					strMonth.equals("Aug")||strMonth.equals("8")) day=31;
			if (strMonth.equals("September")||strMonth.equals("Sept.")||
					strMonth.equals("Sep")||strMonth.equals("9")) day=30;
			if (strMonth.equals("October")||strMonth.equals("Oct.")||
					strMonth.equals("Oct")||strMonth.equals("10")) day=31;
			if (strMonth.equals("November")||strMonth.equals("Nov.")||
					strMonth.equals("Nov")||strMonth.equals("11")) day=30;
			if (strMonth.equals("December")||strMonth.equals("Dec.")||
					strMonth.equals("Dec")||strMonth.equals("12")) day=31;
			if (day<=0) day=-1;
			else break;
		}
		
		System.out.println("The number of days: " + day);
		
		keyboard.close();
	}

}
